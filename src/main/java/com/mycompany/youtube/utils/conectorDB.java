/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author refil
 */
public class conectorDB {
    private String url = "jdbc:mysql://sql5.freesqldatabase.com:3306/sql5688754?zeroDateTimeBehavior=CONVERT_TO_NULL"; //El signo de interrogacion indica que inserta un archivo
    private String user = "sql5688754";
    private String psw = "ZcL2VkdI5s";
    
    public conectorDB(String query) throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, psw);
            
//            Statement statement = conn.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//            
//            while (resultSet.next()) {
//                int id = resultSet.getInt("usuario_id");
//                String firstName = resultSet.getString("nombre_usuario");
//                String email = resultSet.getString("email");
//                System.out.println("ID: " + id + ", Name: " + firstName + " " + email);
//            }
            
            conn.close();
        } catch (SQLException ex){
            System.err.println("¡Se produjo una excepción!");
            System.err.println(ex.getMessage());
        }
    }
 
    
}
