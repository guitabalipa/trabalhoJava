/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignTapetes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class MaterialDAO {
    //  private final String stmtInserir = "INSERT INTO material(nomeMaterial, valor) VALUES(?,?)";
    private final String stmtAtualizar = "UPDATE material SET valor = ? WHERE nomeMaterial = ?";
   // private final String stmtExcluir = "DELETE from material WHERE id = ?";
    private final String stmtListar = "SELECT * FROM material";    
    

   /*
    public List<Material> listaMateriais(){
       ResultSet rs = null;
        try {
            Connection con=null;
        PreparedStatement stmt=null;
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtListar);
            rs = stmt.executeQuery();
            List<Material> materiais = new ArrayList();
            while (rs.next()) {
                // criando o objeto Contato
                Cliente cliente = new Cliente(rs.getString("nome"), rs.getString("sobrenome"), rs.getString("cpf"));
                material.add(cliente);
            }
            
            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{rs.close();}catch(Exception ex){System.out.println("Erro ao fechar result set. Ex="+ex.getMessage());};
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
   }*/
    
    public Material getMaterial(String m){
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
        con = ConnectionFactory.getConnection();
        String sql = "select * from material where nomeMaterial = ?";
        stmt = con.prepareStatement(sql);
        stmt.setString(1, m);
        rs = stmt.executeQuery();
        rs.next();
        Material material = new Material(rs.getDouble("valor"), rs.getString("nomeMaterial"));
        return material;
        } catch(Exception e){
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }
    /*public List<Material> listaMateriais(){
        
    }
>>>>>>> origin/master
    */
    public void atualizaMaterial(Material material){
        Connection con=null;
        PreparedStatement stmt = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement(stmtAtualizar);
            
            
            stmt.setDouble(1, material.getPrecoMetroQuadrado());
            stmt.setString(2, material.getModelo());
            stmt.executeUpdate();
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{stmt.close();}catch(Exception ex){System.out.println("Erro ao fechar stmt. Ex="+ex.getMessage());};
            try{con.close();}catch(Exception ex){System.out.println("Erro ao fechar conexão. Ex="+ex.getMessage());};
        }
    }

        
    }


