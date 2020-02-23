/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbmhs.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sultonexe
 */
public class konfigLogin {
    
    private static Connection konfigLogin;
    
    public static Connection getKonfig(){
        if(konfigLogin == null) {
            try{
                String url;
                url = "jdbc:mysql://localhost:3306/dbs_mahasiswa";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konfigLogin = DriverManager.getConnection(url , user , pass);
            } catch(SQLException t){
                JOptionPane.showMessageDialog(null, "Connection Error");
            }
        } return konfigLogin;
    } static Object getConnection(){
            throw new UnsupportedOperationException("Not Yet Implemented"); 
        }    
}
