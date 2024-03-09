/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author refil
 */
public class conectorDB {
    private String url = "jdbc:mysql://sql5.freesqldatabase.com:3306/sql5688754?zeroDateTimeBehavior=CONVERT_TO_NULL";
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
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("¡Se produjo una excepción!");
        }
    }

    public void selectData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(url, user, psw)) {
                String selectQuery = "SELECT * FROM usuario";
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(selectQuery);
                
                while (resultSet.next()) {
                    int id = resultSet.getInt("usuario_id");
                    String firstName = resultSet.getString("nombre_usuario");
                    String email = resultSet.getString("email");
                    String contra = resultSet.getString("contrasena");
                    int tv = resultSet.getInt("total_video");
                    String image_user = resultSet.getString("imagen_usuario");
                    System.out.println("ID: " + id + ", Nombre: " + firstName + ", Email: " + email +
                            ", Contraseña: " + contra + ", Total de videos: " + tv + ", Imagen de usuario: " + image_user);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("¡Se produjo una excepción!");
        }
    }

    public void insertData(String nombre, String email, String contrasena, int total_video, String imagen_usuario) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(url, user, psw)) {
                String insertQuery = "INSERT INTO usuarios (nombre_usuario, email, contrasena, total_video, imagen_usuario) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);
                preparedStatement.setString(1, nombre);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, contrasena);
                preparedStatement.setInt(4, total_video);
                preparedStatement.setString(5, imagen_usuario);
                preparedStatement.executeUpdate();
            }
            System.out.println("Datos insertados correctamente.");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("¡Se produjo una excepción al insertar datos!");
            System.err.println(ex.getMessage());
        }
    }
}
