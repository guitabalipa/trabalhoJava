/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignTapetes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guilherme
 */
public class ConnectionFactory {
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost/javatrab", "root", "6657942fe");

    }
}
