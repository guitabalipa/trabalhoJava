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
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class ClienteDAO {
    
    private final String stmtInserir = "INSERT INTO cliente(nome, sobrenome, cpf) VALUES(?,?,?)";
    private final String stmtConsultar = "SELECT * FROM autor WHERE id = ?";
    private final String stmtListar = "SELECT * FROM autor";
    private final String stmtInserirAutorLivro = "INSERT INTO livro_autor(idLivro, idAutor) VALUES (?, ?)";
    
    
    
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
    
    public void atualizaCliente(Cliente cliente){
        
    }
    
    public void excluiCliente(Cliente cliente){
        
    }
    
    public List<Cliente> listaClientes(){
        
    }
    
    public Cliente getCliente(String cpf){
        
    }
    
    public Cliente getClientePorPedido(int idPedido){
        
    }
    
    public Pedido getPedidoDoCliente(Cliente cliente){
        
    }
    
    public void atualizaPedido(Pedido pedido){
        
    }
    
    public void adicionaPedidoAoCliente(Pedido pedido, String cpfCliente){
        
    }
    
    public void excluiPedidoDoCliente(Pedido pedido, String cpfCliente){
        
    }
}
