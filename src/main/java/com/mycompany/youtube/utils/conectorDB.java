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
    private String url = "jdbc:mysql://database-yutu.cdzn2vruxaki.us-east-1.rds.amazonaws.com:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [admin on Default schema]";
    private String user = "admin";
    private String psw = "yutunofake10";

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
       
        //Metodo para consultar suscripciones por ID de usuario
        public void selectSubscriptions(int usuarioId) {
            String query = "SELECT * FROM subscription WHERE fk_usuario_id = ?";

            try (Connection conn = conectar();
                 PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, usuarioId);

                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    int suscripcionId = resultSet.getInt("suscripcion_id");
                    String canalNombre = resultSet.getString("canal_nombre");
                    int totalSuscripcion = resultSet.getInt("total_suscripcion");

                    System.out.println("Suscripcion ID: " + suscripcionId);
                    System.out.println("Canal Nombre: " + canalNombre);
                    System.out.println("Total Suscripcion: " + totalSuscripcion);
                }
            } catch (SQLException ex) {
                System.err.println("Error al consultar suscripciones: " + ex.getMessage());
            }
        }
        
        //Metodo para consultar comentarios por ID de video
        public void selectComments(int videoId) {
            String query = "SELECT * FROM comments WHERE fk_video_id = ?";

            try (Connection conn = conectar();
                 PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, videoId);

                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    String comentarioId = resultSet.getString("comentario_id");
                    String nombreUsuario = resultSet.getString("nombre_usuario");
                    String fechaHoraComentario = resultSet.getString("fecha_hora_comentario");
                    String comentario = resultSet.getString("comentario");

                    System.out.println("Comentario ID: " + comentarioId);
                    System.out.println("Nombre Usuario: " + nombreUsuario);
                    System.out.println("Fecha y Hora del Comentario: " + fechaHoraComentario);
                    System.out.println("Comentario: " + comentario);
                }
            } catch (SQLException ex) {
                System.err.println("Error al consultar comentarios: " + ex.getMessage());
            }
        }
        
        //metodo para insertar suscripciones
        public void insertSubscription(int usuarioId, String canalNombre, int totalSuscripcion) {
            String query = "INSERT INTO subscription (fk_usuario_id, canal_nombre, total_suscripcion) VALUES (?, ?, ?)";

            try (Connection conn = conectar();
                 PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, usuarioId);
                statement.setString(2, canalNombre);
                statement.setInt(3, totalSuscripcion);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Nueva suscripcion insertada exitosamente.");
                }
            } catch (SQLException ex) {
                System.err.println("Error al insertar suscripcion: " + ex.getMessage());
            }
        }

        //metodo para insertar comentarios
        public void insertComment(int videoId, String nombreUsuario, String fechaHoraComentario, String comentario) {
            String query = "INSERT INTO comments (fk_video_id, nombre_usuario, fecha_hora_comentario, comentario) VALUES (?, ?, ?, ?)";

            try (Connection conn = conectar();
                 PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, videoId);
                statement.setString(2, nombreUsuario);
                statement.setString(3, fechaHoraComentario);
                statement.setString(4, comentario);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Nuevo comentario insertado exitosamente.");
                }
            } catch (SQLException ex) {
                System.err.println("Error al insertar comentario: " + ex.getMessage());
            }
        }
        
        //Metodo para consultar contenido por ID de usuario y ID de video
        public void selectContentUser(int usuarioId, int videoId) {
            String query = "SELECT * FROM contentUser WHERE fk_usuario_id = ? AND fk_video_id = ?";

            try (Connection conn = conectar();
                 PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, usuarioId);
                statement.setInt(2, videoId);

                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    int contentUserId = resultSet.getInt("contentUser_id");
                    // Si deseas obtener más columnas, puedes añadirlas aquí

                    System.out.println("ContentUser ID: " + contentUserId);
                    // Imprime otras columnas si es necesario
                } else {
                    System.out.println("No se encontro contenido para el usuario y el video especificados.");
                }
            } catch (SQLException ex) {
                System.err.println("Error al consultar contenido del usuario: " + ex.getMessage());
            }
        }

        //Metodo para insertar una nueva relacion usuario-video
        public void insertContentUser(int usuarioId, int videoId) {
            String query = "INSERT INTO contentUser (fk_usuario_id, fk_video_id) VALUES (?, ?)";

            try (Connection conn = conectar();
                 PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, usuarioId);
                statement.setInt(2, videoId);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Se ha agregado con exito");
                }
            } catch (SQLException ex) {
                System.err.println("Error al insertar: " + ex.getMessage());
            }
        }
        
        //Metodo para consultar el historial del usuario por ID de usuario y ID de video
        public void selectHistoryUser(int usuarioId, int videoId) {
            String query = "SELECT * FROM historyUser WHERE fk_usuario_id = ? AND fk_video_id = ?";

            try (Connection conn = conectar();
                 PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, usuarioId);
                statement.setInt(2, videoId);

                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    int historyUserUserId = resultSet.getInt("historyUserUser_id");    
                    System.out.println("HistoryUser ID: " + historyUserUserId);
                } else {
                    System.out.println("No se encontro historial para el usuario y el video especificados.");
                }
            } catch (SQLException ex) {
                System.err.println("Error al consultar historial del usuario: " + ex.getMessage());
            }
        }

        //Metodo para insertar una nueva entrada en el historial del usuario
        public void insertHistoryUser(int usuarioId, int videoId) {
            String query = "INSERT INTO historyUser (fk_usuario_id, fk_video_id) VALUES (?, ?)";

            try (Connection conn = conectar();
                 PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, usuarioId);
                statement.setInt(2, videoId);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Nueva entrada de historial del usuario insertada exitosamente");
                }
            } catch (SQLException ex) {
                System.err.println("Error al insertar entrada de historial del usuario: " + ex.getMessage());
            }
        }
            //Metodo para consultar videos que le gustaron al usuario por ID de usuario y ID de video
        public void selectLikedVideosList(int usuarioId, int videoId) {
            String query = "SELECT * FROM likedVideosList WHERE fk_usuario_id = ? AND fk_video_id = ?";

            try (Connection conn = conectar();
                 PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, usuarioId);
                statement.setInt(2, videoId);

                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    int likedVideoListId = resultSet.getInt("likedVideoList_id");
                    System.out.println("LikedVideosList ID: " + likedVideoListId);
                } else {
                    System.out.println("No se encontraron videos que le gustaron al usuario.");
                }
            } catch (SQLException ex) {
                System.err.println("Error al consultar videos que le gustaron al usuario: " + ex.getMessage());
            }
        }

        //Metodo para insertar un nuevo video que le gusto al usuario
        public void insertLikedVideosList(int usuarioId, int videoId) {
            String query = "INSERT INTO likedVideosList (fk_usuario_id, fk_video_id) VALUES (?, ?)";

            try (Connection conn = conectar();
                 PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setInt(1, usuarioId);
                statement.setInt(2, videoId);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Nuevo video que le gusto al usuario insertado exitosamente.");
                }
            } catch (SQLException ex) {
                System.err.println("Error al insertar video que le gusto al usuario: " + ex.getMessage());
            }
        }
    }
