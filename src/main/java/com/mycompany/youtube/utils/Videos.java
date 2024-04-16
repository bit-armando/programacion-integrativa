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
import java.sql.Statement;

/**
 *
 * @author Uriel
 */
public class Videos {
    private int id;
    private String titulo;
    private String descripcion;
    private String rutaVideo;
    private String fechaCarga;
    private int vistas;
    private int likes;
    private int dislikes;
    private String rutaImagen;
    private int idUsuario;

        // Constructor
    public Videos(int id, String titulo, String descripcion, String rutaVideo, String fechaCarga,
                 int vistas, int likes, int dislikes, String rutaImagen, int idUsuario) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.rutaVideo = rutaVideo;
        this.fechaCarga = fechaCarga;
        this.vistas = vistas;
        this.likes = likes;
        this.dislikes = dislikes;
        this.rutaImagen = rutaImagen;
        this.idUsuario = idUsuario;
    }
    public Videos() {
        this.id = 0;
        this.titulo = "";
        this.descripcion = "";
        this.rutaVideo = "";
        this.fechaCarga = "";
        this.vistas = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.rutaImagen = "";
        this.idUsuario = 0;
    }

    // Métodos getter para acceder a los datos del video
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRutaVideo() {
        return rutaVideo;
    }

    public String getFechaCarga() {
        return fechaCarga;
    }

    public int getVistas() {
        return vistas;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    
    
    public void insertVideo(String titulo, int id_usuario, String descripcion, String url_video, String url_imagen){
           int vistas = 0;
           int likes = 0;
           int dislikes = 0;
           conectorDB data = new conectorDB();
           String date = data.datatime();
           String insertQuery = "INSERT INTO videos (titulo, descripcion, ruta_video, fecha_carga, vistas, likes, dislikes, ruta_imagen, fk_usuario_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
           try (Connection conn = data.conectar(); 
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
       
       public void selectVideos() {
        String query = "SELECT * FROM videos";
        conectorDB data = new conectorDB();
        try (Connection conn = data.conectar();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int videoId = resultSet.getInt("video_id");
                String titulo = resultSet.getString("titulo");
                String descripcion = resultSet.getString("descripcion");
                String urlVideo = resultSet.getString("ruta_video");
                String urlImagen = resultSet.getString("ruta_imagen");
                int vistas = resultSet.getInt("vistas");
                int likes = resultSet.getInt("likes");
                int dislikes = resultSet.getInt("dislikes");
                int usuarioId = resultSet.getInt("fk_usuario_id");
                System.out.println("Video ID: " + videoId);
                System.out.println("Título: " + titulo);
                System.out.println("Descripción: " + descripcion);
                System.out.println("URL del video: " + urlVideo);
                System.out.println("URL de la imagen: " + urlImagen);
                System.out.println("Vistas: " + vistas);
                System.out.println("Likes: " + likes);
                System.out.println("Dislikes: " + dislikes);
                System.out.println("ID del usuario: " + usuarioId);
                System.out.println("----------------------");
            }
        } catch (SQLException ex) {
            System.err.println("Error al seleccionar videos: " + ex.getMessage());
        }
    }
    
    public void obtenerVideo(int videoId) {
        String query = "SELECT * FROM videos WHERE video_id = ?";
        conectorDB data = new conectorDB();

        try (Connection conn = data.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, videoId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("video_id");
                    String titulo = resultSet.getString("titulo");
                    String descripcion = resultSet.getString("descripcion");
                    String rutaVideo = resultSet.getString("ruta_video");
                    String fechaCarga = resultSet.getString("fecha_carga");
                    int vistas = resultSet.getInt("vistas");
                    int likes = resultSet.getInt("likes");
                    int dislikes = resultSet.getInt("dislikes");
                    String rutaImagen = resultSet.getString("ruta_imagen");
                    int idUsuario = resultSet.getInt("fk_usuario_id");

                    // Inicializar los datos de la clase conectorDB.video
                    this.id = id;
                    this.titulo = titulo;
                    this.descripcion = descripcion;
                    this.rutaVideo = rutaVideo;
                    this.fechaCarga = fechaCarga;
                    this.vistas = vistas;
                    this.likes = likes;
                    this.dislikes = dislikes;
                    this.rutaImagen = rutaImagen;
                    this.idUsuario = idUsuario;
                } else {
                    // Si no se encuentra el video, inicializar los datos con valores vacíos
                    this.id = 0;
                    this.titulo = "";
                    this.descripcion = "";
                    this.rutaVideo = "";
                    this.fechaCarga = "";
                    this.vistas = 0;
                    this.likes = 0;
                    this.dislikes = 0;
                    this.rutaImagen = "";
                    this.idUsuario = 0;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al obtener el video: " + ex.getMessage());
        }
    }
}  
