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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author refil
 */
public class conectorDB {
    private String url = "jdbc:mysql://sql5.freesqldatabase.com:3306/sql5688754?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private String user = "sql5688754";
    private String psw = "ZcL2VkdI5s";

    public conectorDB() {
            // Constructor vacío
        }

        public Connection conectar() throws SQLException {
            return DriverManager.getConnection(url, user, psw);
        }

        public void cerrarConexion(Connection conn) {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.err.println("Error al cerrar la conexión: " + ex.getMessage());
                }
            }
        }

        public void selectData(String nombre, String contrasena) {
            String selectQuery = "SELECT * FROM usuario WHERE nombre_usuario = ?, contrasena = ?";
            String username = nombre;
            String password = contrasena;

            try (Connection conn = conectar();
                    PreparedStatement preparedStatement = conn.prepareStatement(selectQuery)){
                    preparedStatement.setString(1, username);
                    preparedStatement.setString(2, password);
                    
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
            } catch (SQLException ex) {
                System.err.println("¡Se produjo una excepción al ejecutar la consulta de selección de datos!");
                System.err.println(ex.getMessage());
            }
        }

        public void insertData(String nombre, String email, String contrasena) {
            int total_video = 0;
            String imagen_usuario = null;
            String insertQuery = "INSERT INTO usuario (nombre_usuario, email, contrasena, total_video, imagen_usuario) VALUES (?, ?, ?, ?, ?)";

            try (Connection conn = conectar(); 
                 PreparedStatement preparedStatement = conn.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, nombre);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, contrasena);
                preparedStatement.setInt(4, total_video);
                preparedStatement.setString(5, imagen_usuario);
                preparedStatement.executeUpdate();
                System.out.println("Datos insertados correctamente.");
            } catch (SQLException ex) {
                System.err.println("¡Se produjo una excepción al insertar datos!");
                System.err.println(ex.getMessage());
            }
        }
        
        public String datatime() {
            LocalDate now = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formatDate = now.format(formatter);

            return formatDate;
        }
        
       public void insertVideo(String titulo, int id_usuario, String descripcion, String url_video, String url_imagen){
           int vistas = 0;
           int likes = 0;
           int dislikes = 0;
           conectorDB data = new conectorDB();
           String date = data.datatime();
           String insertQuery = "INSERT INTO videos (titulo, descripcion, ruta_video, fecha_carga, vistas, likes, dislikes, ruta_imagen, fk_usuario_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
           try (Connection conn = conectar(); 
                 PreparedStatement preparedStatement = conn.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, titulo);
                preparedStatement.setString(2, descripcion);
                preparedStatement.setString(3, url_video);
                preparedStatement.setString(4, date);
                preparedStatement.setInt(5, vistas);
                preparedStatement.setInt(6, likes);
                preparedStatement.setInt(7, dislikes);
                preparedStatement.setString(8, url_imagen);
                preparedStatement.setInt(9, id_usuario);
                preparedStatement.executeUpdate();
                System.out.println("Datos insertados correctamente.");
            } catch (SQLException ex) {
                System.err.println("¡Se produjo una excepción al insertar datos!");
                System.err.println(ex.getMessage());
            }
       }
    }
