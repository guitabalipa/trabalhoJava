/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignTapetes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class ClienteDAO {
    
    private final String stmtInserir = "INSERT INTO cliente(nome, sobrenome, cpf) VALUES(?,?,?)";
    private final String stmtAtualizar = "UPDATE cliente SET nome = ?, sobrenome = ? WHERE cpf = ?";
    private final String stmtExcluir = "delete from cliente WHERE cpf = ?";
    private final String stmtListar = "SELECT * FROM cliente";    
    
    
    public void cadastraCliente(Cliente cliente){
        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtInserir);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getSobrenome());
            stmt.setString(3, cliente.getCpf());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir um cliente no banco de dados. Origem="+ex.getMessage());
        } finally{
            try{stmt.close();}catch(SQLException ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(SQLException ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }
    
    public void atualizaCliente(Cliente cliente) throws SQLException{
        Connection con=null;
        PreparedStatement stmt = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtAtualizar);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getSobrenome());
            stmt.setString(3, cliente.getCpf());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }

    }
    
    public void excluirCliente(Cliente cliente) throws SQLException {
        Connection con=null;
        PreparedStatement stmt = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtExcluir);
            
            //this.excluirClientePedido(cliente.getCpf(), con);
            stmt.setString(1, cliente.getCpf());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }

    }
    
    public void excluirClientePedido(String cpf, Connection con) throws SQLException{
        String selec = "select id from pedido where cliente = ?";
        PreparedStatement stmt;
        stmt = con.prepareStatement(selec);
        stmt.setString(1, cpf);
        ResultSet rs = stmt.executeQuery();
        excluirTapete(rs.getInt("id"), con);
        String sql = "delete from pedido WHERE cliente = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, cpf);
        stmt.executeUpdate();
    }
    
    public void excluirTapete(int id, Connection con) throws SQLException{
        String selec = "select idmaterial, idForma from tapete where idPedido = ?";
        PreparedStatement stmt;
        stmt = con.prepareStatement(selec);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        int idForma = rs.getInt("idForma");
        int idMaterial = rs.getInt("idmaterial");
        String sql = "delete from tapete where idPedido = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        excluirForma(idForma, con);
        excluirMaterial(idMaterial, con);
    }
    
    public void excluirForma(int id, Connection con) throws SQLException{
        String sql = "delete from forma where id = ?";
        PreparedStatement stmt;
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
    }
    
    public void excluirMaterial(int id, Connection con)throws SQLException{
        String sql = "delete from material where id = ?";
        PreparedStatement stmt;
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
    }
    
    public List<Cliente> listaClientes(){
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtListar);
            rs = stmt.executeQuery();
            List<Cliente> clientes = new ArrayList();
            while (rs.next()) {
                // criando o objeto Contato
                Cliente cliente = new Cliente(rs.getString("nome"), rs.getString("sobrenome"), rs.getString("cpf"));
                clientes.add(cliente);
            }
            
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar result set. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }
    
    public Cliente getCliente(String cpf){
        String sql = "select * from cliente where cpf = ?";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);
            rs = stmt.executeQuery();
            rs.next();
            Cliente cliente = new Cliente(rs.getString("nome"), rs.getString("sobrenome"), rs.getString("cpf"));
     
            return cliente;
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar Cliente no banco de dados. Origem="+ex.getMessage());
        } finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar rs. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();;}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};                
        }
    }
    
    public Pedido getPedidoDoCliente(Cliente cliente) throws Exception{
        String sql = "select * from pedido where cliente = ?";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf());
            rs = stmt.executeQuery();
            rs.next();
            List<Tapete> tapetes = getTapetes(rs.getInt("id"), con);
            Pedido pedido = new Pedido(tapetes);
     
            return pedido;
        } catch (Exception ex) {
            throw new PedidoNaoEncontradoException();
        } finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar rs. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();;}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};                
        }
    }
    
    public List<Tapete> getTapetes(int id, Connection con) throws SQLException{
        String sql = "select * from tapete"
                   + "inner join forma ON (tapete.idForma = forma.idforma)"
                   + "inner join material  ON (tapete.idMaterial = material.id) WHERE idPedido = ?";
        PreparedStatement stmt;
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        List<Tapete> tapetes = new ArrayList<Tapete>();
        while(rs.next()){
            Tapete tapete = new Tapete();
            if (rs.getString("nome").equalsIgnoreCase("Circulo")){
                Forma circulo = new Circulo(rs.getDouble("raio"), rs.getString("nome"));
                tapete.setForma(circulo);
            } else if(rs.getString("nome").equalsIgnoreCase("Retangulo")){
                Forma retangulo = new Retangulo(rs.getDouble("base"), rs.getDouble("altura"), rs.getString("nome"));
                tapete.setForma(retangulo);
            } else if(rs.getString("nome").equalsIgnoreCase("Triangulo")){
                Forma triangulo = new Triangulo(rs.getDouble("base"), rs.getDouble("altura"), rs.getString("nome"));
                tapete.setForma(triangulo);
            }
            Material material = new Material(rs.getDouble("valor"), rs.getString("nomeMaterial"));
            tapete.setMaterial(material);
            tapete.setPreco(rs.getDouble("preco"));
            tapetes.add(tapete);
        }
        
        return tapetes;
    }
    
    public void atualizaPedido(Pedido pedido){
        Connection con=null;
        PreparedStatement stmt = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtAtualizar);
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }
    
    public void adicionaPedidoAoCliente(Pedido pedido, String cpfCliente){
        String sql = "insert into pedido(cliente) values(?)";
        Connection con=null;
        PreparedStatement stmt=null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, cpfCliente);
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            pedido.setIdentificadorPedido(id);
            adicionaTapeteAoPedido(pedido);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }
    
    public void adicionaTapeteAoPedido(Pedido pedido){
        String sql = "insert into tapete(idPedido, idmaterial, idForma, preco) values(?,?,?,?)";
        Connection con=null;
        PreparedStatement stmt=null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            List<Tapete> lista = new ArrayList<Tapete>();
            lista = pedido.getTapetes();
            for(Tapete listar:lista){
                stmt.setInt(1, pedido.getIdentificadorPedido());
                stmt.setInt(2, selecionaMaterialDoTapete(listar.getMaterial()));
                stmt.setInt(3, adicionaFormaAoTapete(listar.getForma()));
                stmt.setDouble(4, pedido.getPreco());
                stmt.executeUpdate();
            }    
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();    
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }
    
    public int adicionaFormaAoTapete(Forma forma){
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
        con = ConnectionFactory.getConnection();    
        if(forma.getNome().equalsIgnoreCase("Triangulo")){
            Triangulo triangulo;
            triangulo = (Triangulo)forma;
            String sql = "insert into forma(base, altura, formanome) values(?,?,?)";
            stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setDouble(1, triangulo.getBase());
            stmt.setDouble(2, triangulo.getAltura());
            stmt.setString(3, triangulo.getNome());
            stmt.executeUpdate();
            rs = stmt.getGeneratedKeys();
        } else if(forma.getNome().equalsIgnoreCase("Retangulo")){
            Retangulo retangulo;
            retangulo = (Retangulo)forma;
            String sql = "insert into forma(base, altura, formanome) values(?,?,?)";
            stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setDouble(1, retangulo.getLadoA());
            stmt.setDouble(2, retangulo.getLadoB());
            stmt.setString(3, retangulo.getNome());
            stmt.executeUpdate();
            rs = stmt.getGeneratedKeys();
        } else if(forma.getNome().equalsIgnoreCase("Circulo")){
            Circulo circulo;
            circulo = (Circulo)forma;
            String sql = "insert into forma(raio, formanome) values(?,?)";
            stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setDouble(1, circulo.getRaio());
            stmt.setString(2, circulo.getNome());
            stmt.executeUpdate();
            rs = stmt.getGeneratedKeys();
        }
        rs.next();
        return rs.getInt(1);
        
        } catch(Exception e){
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }
    
    public int selecionaMaterialDoTapete(Material material){
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int id;
        try{
        con = ConnectionFactory.getConnection();
        String sql = "select * from material where nomeMaterial = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, material.getModelo());
        rs = stmt.executeQuery();
        rs.next();
        id = rs.getInt("id");
        return id;
        } catch(Exception e){
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }
}
