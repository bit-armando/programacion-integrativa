package com.mycompany.youtube.utils;

import com.mycompany.youtube.Imagen;
import com.mycompany.youtube.VideoView;
import com.mycompany.youtube.utils.Videos;
import com.mycompany.youtube.utils.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class VideosLabels {
    public static void createGrid(JFrame frame, int startX, int startY, int labelWidth, int labelHeight, int spacex, int spacey, int tamx, int tamy) {
        // Obtener el JPanel del JFrame
        JPanel panel = (JPanel) frame.getContentPane();

        Videos videos = new Videos();
        ArrayList<Videos> primerosVideos = videos.obtenerPrimerosVideos(tamx * tamy);

        int index = 0;
        for (Videos video : primerosVideos) {
            if (index >= tamx * tamy) {
                break; // Salir del bucle si ya se han obtenido los primeros 12 videos
            }

            // Calcular posición en la cuadrícula
            int row = index / tamx;
            int col = index % tamx;
            int x = startX + (labelWidth + spacex) * col;
            int y = startY + (labelHeight + spacey) * row;

            // Obtener la ruta de la imagen del video
            String imageUrl = video.getRutaImagen();

            // Verificar si se encontró la ruta de la imagen
            if (!imageUrl.isEmpty()) {
                // Crear un nuevo JLabel para la imagen del video
                JLabel labelVideo = new JLabel();
                labelVideo.setBounds(x, y, labelWidth, labelHeight);
                new Imagen(labelVideo, imageUrl);
                panel.add(labelVideo);
                panel.setComponentZOrder(labelVideo, 0);

                // Agregar un MouseListener para manejar los clics en el JLabel
                labelVideo.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // Obtener la ID del video al que se hizo clic
                        int videoId = video.getId();
                        // Abrir la vista VideoView y pasar la ID del video como parámetro
                        VideoView.openVideoView(videoId);
                        frame.setVisible(false);
                    }
                });
                
                User user = new User();
                user.obtenerUser(video.getIdUsuario());
                
                // Verificar si se encontró la ruta de la imagen del usuario
                String userImageUrl = user.getImg();
                if (!userImageUrl.isEmpty()) {
                    // Crear un nuevo JLabel para la imagen del usuario
                    JLabel labelUser = new JLabel();
                    labelUser.setBounds(x, y + labelHeight, 30, 30);  // Colocar a la derecha del video
                    new Imagen(labelUser, userImageUrl);
                    panel.add(labelUser);
                    panel.setComponentZOrder(labelUser, 0);
                }else{
                    userImageUrl = "https://t3.ftcdn.net/jpg/05/14/18/46/360_F_514184651_W5rVCabKKRH6H3mVb62jYWfuXio8c8si.jpg";
                    JLabel labelUser = new JLabel();
                    labelUser.setBounds(x, y + labelHeight, 30, 30);  // Colocar a la derecha del video
                    new Imagen(labelUser, userImageUrl);
                    panel.add(labelUser);
                    panel.setComponentZOrder(labelUser, 0);
                }

                // Crear un nuevo JLabel para el nombre del video
                JLabel labelVideoName = new JLabel(video.getTitulo());
                labelVideoName.setBounds(x + 35, y + labelHeight, labelWidth + 30, 20); // Colocar debajo del video
                labelVideoName.setHorizontalAlignment(SwingConstants.LEFT); // Alinear a la izquierda
                labelVideoName.setForeground(Color.WHITE); // Color blanco
                Font font = labelVideoName.getFont();
                labelVideoName.setFont(new Font(font.getName(), Font.BOLD, 14)); // Aumentar tamaño de la tipografía
                panel.add(labelVideoName);
                panel.setComponentZOrder(labelVideoName, 0);
                
                
                // Crear un nuevo JLabel para el nombre del usuario
                
                
                
                
                
                
                JLabel labelUserName = new JLabel(user.getUsername() ); // Cambia obtenerNombreUsuario(userId) por el método real que obtiene el nombre de usuario
                labelUserName.setBounds(x + 35, y + labelHeight + 15, labelWidth + 30, 20); // Colocar debajo del nombre del video
                labelUserName.setHorizontalAlignment(SwingConstants.LEFT); // Alinear a la izquierda
                labelUserName.setForeground(Color.GRAY); // Color blanco
                labelUserName.setFont(new Font(font.getName(), Font.BOLD, 10)); // Aumentar tamaño de la tipografía
                panel.add(labelUserName);
                panel.setComponentZOrder(labelUserName, 0);
                
                
                // Crear un nuevo JLabel para la fecha de creacion de video.
                
                
                
                
                
                
                JLabel labelDateVideo = new JLabel(video.getFechaCarga() ); // Cambia obtenerNombreUsuario(userId) por el método real que obtiene el nombre de usuario
                labelDateVideo.setBounds(x + 35, y + labelHeight + 30, labelWidth + 30, 20); // Colocar debajo del nombre del video
                labelDateVideo.setHorizontalAlignment(SwingConstants.LEFT); // Alinear a la izquierda
                labelDateVideo.setForeground(Color.WHITE); // Color blanco
                labelDateVideo.setFont(new Font(font.getName(), Font.BOLD, 12)); // Aumentar tamaño de la tipografía
                panel.add(labelDateVideo);
                panel.setComponentZOrder(labelDateVideo, 0);
                
            } else {
                System.out.println("No se encontró el video con el ID especificado.");
            }

            index++;
        }

        // Actualizar el JFrame para mostrar los cambios
        frame.validate();
        frame.repaint();
    }
    
    public static void createGridVertical(JFrame frame, int startX, int startY, int labelWidth, int labelHeight, int spacex, int spacey, int tamx, int tamy) {
        // Obtener el JPanel del JFrame
        JPanel panel = (JPanel) frame.getContentPane();

        Videos videos = new Videos();
        ArrayList<Videos> primerosVideos = videos.obtenerVideosAleatorios(tamx * tamy);

        int index = 0;
        for (Videos video : primerosVideos) {
            if (index >= tamx * tamy) {
                break; // Salir del bucle si ya se han obtenido los primeros 12 videos
            }

            // Calcular posición en la cuadrícula
            int row = index / tamx;
            int col = index % tamx;
            int x = startX + (labelWidth + spacex) * col;
            int y = startY + (labelHeight + spacey) * row;

            // Obtener la ruta de la imagen del video
            String imageUrl = video.getRutaImagen();

            // Verificar si se encontró la ruta de la imagen
            if (!imageUrl.isEmpty()) {
                // Crear un nuevo JLabel para la imagen del video
                JLabel labelVideo = new JLabel();
                labelVideo.setBounds(x, y, labelWidth, labelHeight);
                new Imagen(labelVideo, imageUrl);
                panel.add(labelVideo);
                panel.setComponentZOrder(labelVideo, 0);

                // Agregar un MouseListener para manejar los clics en el JLabel
                labelVideo.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // Obtener la ID del video al que se hizo clic
                        int videoId = video.getId();
                        // Abrir la vista VideoView y pasar la ID del video como parámetro
                        VideoView.openVideoView(videoId);
                        frame.setVisible(false);
                    }
                });
                
                User user = new User();
                user.obtenerUser(video.getIdUsuario());
                
                // Verificar si se encontró la ruta de la imagen del usuario
                String userImageUrl = user.getImg();
                if (!userImageUrl.isEmpty()) {
                    // Crear un nuevo JLabel para la imagen del usuario
                    JLabel labelUser = new JLabel();
                    labelUser.setBounds(x+labelWidth, y+labelHeight -30, 30, 30);  // Colocar a la derecha del video
                    new Imagen(labelUser, userImageUrl);
                    panel.add(labelUser);
                    panel.setComponentZOrder(labelUser, 0);
                }else{
                    userImageUrl = "https://t3.ftcdn.net/jpg/05/14/18/46/360_F_514184651_W5rVCabKKRH6H3mVb62jYWfuXio8c8si.jpg";
                    JLabel labelUser = new JLabel();
                    labelUser.setBounds(x + labelWidth, y + labelHeight, 30, 30);  // Colocar a la derecha del video
                    new Imagen(labelUser, userImageUrl);
                    panel.add(labelUser);
                    panel.setComponentZOrder(labelUser, 0);
                }

                // Crear un nuevo JLabel para el nombre del video
                JLabel labelVideoName = new JLabel(video.getTitulo());
                labelVideoName.setBounds(x + labelWidth+5, y, labelWidth + 30, 20); // Colocar debajo del video
                labelVideoName.setHorizontalAlignment(SwingConstants.LEFT); // Alinear a la izquierda
                labelVideoName.setForeground(Color.WHITE); // Color blanco
                Font font = labelVideoName.getFont();
                labelVideoName.setFont(new Font(font.getName(), Font.BOLD, 14)); // Aumentar tamaño de la tipografía
                panel.add(labelVideoName);
                panel.setComponentZOrder(labelVideoName, 0);
                
                
                // Crear un nuevo JLabel para el nombre del usuario
                
                
                
                
                
                
                JLabel labelUserName = new JLabel(user.getUsername() ); // Cambia obtenerNombreUsuario(userId) por el método real que obtiene el nombre de usuario
                labelUserName.setBounds(x + 5 + labelWidth, y + 18, labelWidth + 30, 20); // Colocar debajo del nombre del video
                labelUserName.setHorizontalAlignment(SwingConstants.LEFT); // Alinear a la izquierda
                labelUserName.setForeground(Color.GRAY); // Color blanco
                labelUserName.setFont(new Font(font.getName(), Font.BOLD, 10)); // Aumentar tamaño de la tipografía
                panel.add(labelUserName);
                panel.setComponentZOrder(labelUserName, 0);
                
                
                // Crear un nuevo JLabel para la fecha de creacion de video.
                
                
                
                
                
                
                JLabel labelDateVideo = new JLabel(video.getFechaCarga() ); // Cambia obtenerNombreUsuario(userId) por el método real que obtiene el nombre de usuario
                labelDateVideo.setBounds(x + 5 + labelWidth, y + 33, labelWidth + 30, 20); // Colocar debajo del nombre del video
                labelDateVideo.setHorizontalAlignment(SwingConstants.LEFT); // Alinear a la izquierda
                labelDateVideo.setForeground(Color.WHITE); // Color blanco
                labelDateVideo.setFont(new Font(font.getName(), Font.BOLD, 12)); // Aumentar tamaño de la tipografía
                panel.add(labelDateVideo);
                panel.setComponentZOrder(labelDateVideo, 0);
                
            } else {
                System.out.println("No se encontró el video con el ID especificado.");
            }

            index++;
        }

        // Actualizar el JFrame para mostrar los cambios
        frame.validate();
        frame.repaint();
    }

}
