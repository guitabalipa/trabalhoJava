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

/**
 *
 * @author Guilherme
 */
public class MaterialDAO {
    
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
    
    public void atualizaMaterial(Material material){
        
    }*/
}
