/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube.utils;
import com.mycompany.youtube.conectorDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author brand
 */
public class User {

    private int id;
    private String username;
    private String email;
    private String pass;
    private int tot_vid;
    private String url_img;

    // Constructor
    public User(int id, String username, String email, String pass, int tot_vid, String url_img) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.pass = pass;
        this.tot_vid = tot_vid;
        this.url_img = url_img;
    }
    
    public User() {
        this.id = 0;
        this.username = "";
        this.email = "";
        this.pass = "";
        this.tot_vid = 0;
        this.url_img = "";
    }
    
    public void obtenerUser(int userId) {
        String query = "SELECT * FROM usuario WHERE usuario_id = ?";
        User user = null;
        conectorDB conexion = new conectorDB();
        try (Connection conn = conexion.conectar(); PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, userId);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("usuario_id");
                String username = resultSet.getString("nombre_usuario");
                String email = resultSet.getString("email");
                String pass = resultSet.getString("contrasena");
                int tot_vid = resultSet.getInt("total_video");
                String img_user = resultSet.getString("imagen_usuario");

                this.id=id;
                this.username=username;
                this.email=email;
                this.pass=pass;
                this.tot_vid=tot_vid;
                this.url_img=img_user;
            } else {
                // Retorna un objeto user vacío si no se encuentra ningún user con el ID proporcionado
                this.id=0;
                this.username="";
                this.email="";
                this.pass="";
                this.tot_vid=0;
                this.url_img="";
            }
        } catch (SQLException ex) {
            System.err.println("Error al obtener el usuario: " + ex.getMessage());
        }
    }

    public User login(String username, String password) {
        String query = "SELECT * FROM usuario WHERE nombre_usuario = ? AND contrasena = ?";
        User user = null;
        conectorDB conexion = new conectorDB();
        try (Connection conn = conexion.conectar(); PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("usuario_id");
                String rUsername = resultSet.getString("nombre_usuario");
                String rPass = resultSet.getString("contrasena");
                String email = resultSet.getString("email");
                int tot_vid = resultSet.getInt("total_video");
                String img_user = resultSet.getString("imagen_usuario");

                user = new User(id, rUsername, email, rPass, tot_vid, img_user);
            } else {
                // Retorna un objeto user vacío si no se encuentra ningún user con el username y password proporcionados
                user = new User(0, "", "", "", 0, "");
            }
        } catch (SQLException ex) {
            System.err.println("Error al iniciar sesión: " + ex.getMessage());
        }

        return user;
    }

    // Métodos getter para acceder a los datos del usuario
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public int getTotal_videos() {
        return tot_vid;
    }

    public String getImg() {
        return url_img;
    }
}
