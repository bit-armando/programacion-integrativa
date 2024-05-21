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
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Date;


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
    
    public boolean estaSuscrito(int usuarioId, int ownUserId) {
        String checkQuery = "SELECT COUNT(*) FROM subscription WHERE fk_usuario_id = ? AND fk_own_user = ?";
        conectorDB data = new conectorDB();

        try (Connection conn = data.conectar();
             PreparedStatement checkStatement = conn.prepareStatement(checkQuery)) {

            checkStatement.setInt(1, usuarioId);
            checkStatement.setInt(2, ownUserId);

            try (ResultSet resultSet = checkStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt(1) > 0;
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al verificar la suscripción: " + ex.getMessage());
        }
        return false;
    }
    
    public void agregarSuscripcion(int usuarioId, int ownUserId) {
        String checkQuery = "SELECT COUNT(*) FROM subscription WHERE fk_usuario_id = ? AND fk_own_user = ?";
        String insertQuery = "INSERT INTO subscription (fk_usuario_id, fk_own_user) VALUES (?, ?)";
        conectorDB data = new conectorDB();

        try (Connection conn = data.conectar();
             PreparedStatement checkStatement = conn.prepareStatement(checkQuery);
             PreparedStatement insertStatement = conn.prepareStatement(insertQuery)) {

            // Verificar si la suscripción ya existe
            checkStatement.setInt(1, usuarioId);
            checkStatement.setInt(2, ownUserId);
            try (ResultSet resultSet = checkStatement.executeQuery()) {
                if (resultSet.next() && resultSet.getInt(1) > 0) {
                    System.out.println("La suscripción ya existe.");
                    return;
                }
            }

            // Si no existe, agregar la suscripción
            insertStatement.setInt(1, usuarioId);
            insertStatement.setInt(2, ownUserId);
            insertStatement.executeUpdate();
            System.out.println("Suscripción agregada correctamente.");
        } catch (SQLException ex) {
            System.err.println("Error al agregar la suscripción: " + ex.getMessage());
        }
    }

    public void eliminarSuscripcion(int usuarioId, int ownUserId) {
        String deleteQuery = "DELETE FROM subscription WHERE fk_usuario_id = ? AND fk_own_user = ?";
        conectorDB data = new conectorDB();

        try (Connection conn = data.conectar();
             PreparedStatement preparedStatement = conn.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, usuarioId);
            preparedStatement.setInt(2, ownUserId);
            preparedStatement.executeUpdate();
            System.out.println("Suscripción eliminada correctamente.");
        } catch (SQLException ex) {
            System.err.println("Error al eliminar la suscripción: " + ex.getMessage());
        }
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
    
     public ArrayList<Videos> obtenerPrimerosVideos(int cantidad) {
        ArrayList<Videos> primerosVideos = new ArrayList<>();
        String query = "SELECT * FROM videos ORDER BY video_id LIMIT "+cantidad;
        conectorDB data = new conectorDB();

        try (Connection conn = data.conectar();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
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
                System.out.println(idUsuario);
                
                Videos video = new Videos(id, titulo, descripcion, rutaVideo, fechaCarga, vistas, likes, dislikes, rutaImagen, idUsuario);
                primerosVideos.add(video);
            }
        } catch (SQLException ex) {
            System.err.println("Error al obtener los primeros videos: " + ex.getMessage());
        }

        return primerosVideos;
    }
    
    public ArrayList<Videos> obtenerUsuarioVideos(int cantidad, int id_user) {
        ArrayList<Videos> usuariovideo = new ArrayList<>();
        String query = "SELECT * FROM videos WHERE fk_usuario_id = "+id_user+" ORDER BY video_id LIMIT "+cantidad;
        conectorDB data = new conectorDB();

        try (Connection conn = data.conectar();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
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
                
                Videos video = new Videos(id, titulo, descripcion, rutaVideo, fechaCarga, vistas, likes, dislikes, rutaImagen, idUsuario);
                usuariovideo.add(video);
            }
        } catch (SQLException ex) {
            System.err.println("Error al obtener los primeros videos: " + ex.getMessage());
        }

        return usuariovideo;
    }
    
     
    public ArrayList<Videos> obtenerVideosAleatorios(int cantidad) {
        ArrayList<Videos> videoaleatorio = new ArrayList<>();
        String query = "SELECT * FROM videos ORDER BY RAND() LIMIT "+ cantidad;
        conectorDB data = new conectorDB();

        try (Connection conn = data.conectar();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
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
                
                Videos video = new Videos(id, titulo, descripcion, rutaVideo, fechaCarga, vistas, likes, dislikes, rutaImagen, idUsuario);
                videoaleatorio.add(video);
            }
        } catch (SQLException ex) {
            System.err.println("Error al obtener los primeros videos: " + ex.getMessage());
        }

        return videoaleatorio;
    }
    
    
    public ArrayList<Videos> obtenerPrimerosVideosVistosPorUsuario(int cantidad, int idUsuario) {
        ArrayList<Videos> historial = new ArrayList<>();
        String query = "SELECT v.* FROM videos v " +
                       "INNER JOIN historyUser hu ON v.video_id = hu.fk_video_id " +
                       "WHERE hu.fk_usuario_id = ? " +
                       "ORDER BY v.video_id DESC " + // Ordenar por ID de video en orden descendente
                       "LIMIT ?";
        conectorDB data = new conectorDB();

        try (Connection conn = data.conectar();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setInt(1, idUsuario);
            statement.setInt(2, cantidad);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("video_id");
                    String titulo = resultSet.getString("titulo");
                    String descripcion = resultSet.getString("descripcion");
                    String rutaVideo = resultSet.getString("ruta_video");
                    String fechaCarga = resultSet.getString("fecha_carga");
                    int vistas = resultSet.getInt("vistas");
                    int likes = resultSet.getInt("likes");
                    int dislikes = resultSet.getInt("dislikes");
                    String rutaImagen = resultSet.getString("ruta_imagen");

                    Videos video = new Videos(id, titulo, descripcion, rutaVideo, fechaCarga, vistas, likes, dislikes, rutaImagen, idUsuario);
                    historial.add(video);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al obtener los primeros videos vistos por el usuario: " + ex.getMessage());
        }

        return historial;
    }
        public class VideoDAO {

     public void actualizarVista(int videoId, int vista, String usuario) {
         // Consulta para actualizar las vistas del video
         String updateQuery = "UPDATE videos SET vista = ? WHERE video_id = ?";
         // Consulta para insertar un registro de auditoría
         String auditQuery = "INSERT INTO auditoria_videos (video_id, usuario, fecha_actualizacion) VALUES (?, ?, ?)";

         conectorDB data = new conectorDB(); 
         try (Connection conn = data.conectar();
              PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
              PreparedStatement auditStatement = conn.prepareStatement(auditQuery)) {

             // Validar si el video existe
             if (!videoExists(conn, videoId)) {
                 System.out.println("No se encontró ningún video con el ID proporcionado.");
                 return;
             }

             // Actualizar las vistas del video
             updateStatement.setInt(1, vista);
             updateStatement.setInt(2, videoId);
             int rowsAffected = updateStatement.executeUpdate();

             // Si se actualizan filas, registrar auditoría
             if (rowsAffected > 0) {
                 System.out.println("El video se actualizó correctamente.");

                 // Registrar auditoría
                 auditStatement.setInt(1, videoId);
                 auditStatement.setString(2, usuario);
                 auditStatement.setTimestamp(3, new Timestamp(new Date().getTime()));
                 auditStatement.executeUpdate();
             } else {
                 System.out.println("No se encontró ningún video con el ID proporcionado.");
             }
         } catch (SQLException ex) {
             System.err.println("Error al actualizar la vista del video: " + ex.getMessage());
         }
     }

 
        
        public void likesactualizar(int videoId, int likes, int dislikes, String usuario) {
        // Consulta para actualizar los likes y dislikes del video
        String updateQuery = "UPDATE videos SET likes = ?, dislikes = ? WHERE video_id = ?";
        // Consulta para insertar un registro de auditoría
        String auditQuery = "INSERT INTO auditoria_videos (video_id, usuario, fecha_actualizacion) VALUES (?, ?, ?)";

        conectorDB data = new conectorDB();  // Cambia 'conectorDB' por el nombre de tu clase de conexión a la base de datos

        try (Connection conn = data.conectar();
             PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
             PreparedStatement auditStatement = conn.prepareStatement(auditQuery)) {

            // Validar si el video existe
            if (!videoExists(conn, videoId)) {
                System.out.println("No se encontró ningún video con el ID proporcionado.");
                return;
            }

            // Actualizar los likes y dislikes del video
            updateStatement.setInt(1, likes);
            updateStatement.setInt(2, dislikes);
            updateStatement.setInt(3, videoId);
            int rowsAffected = updateStatement.executeUpdate();

            // Si se actualizan filas, registrar auditoría
            if (rowsAffected > 0) {
                System.out.println("Los likes y dislikes del video se actualizaron correctamente.");

                // Registrar auditoría
                auditStatement.setInt(1, videoId);
                auditStatement.setString(2, usuario);
                auditStatement.setTimestamp(3, new Timestamp(new Date().getTime()));
                auditStatement.executeUpdate();
            } else {
                System.out.println("No se encontró ningún video con el ID proporcionado.");
            }
        } catch (SQLException ex) {
            System.err.println("Error al actualizar los likes y dislikes del video: " + ex.getMessage());
        }
    }
    private boolean videoExists(Connection conn, int videoId) throws SQLException {
         String query = "SELECT COUNT(*) AS count FROM videos WHERE video_id = ?";
         try (PreparedStatement statement = conn.prepareStatement(query)) {
             statement.setInt(1, videoId);
             ResultSet resultSet = statement.executeQuery();
             if (resultSet.next()) {
                 int count = resultSet.getInt("count");
                 return count > 0;
             }
         }
         return false;
     }

        }
}

