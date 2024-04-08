package com.mycompany.youtube.utils;

import com.mycompany.youtube.Imagen;
import com.mycompany.youtube.VideoView;
import com.mycompany.youtube.conectorDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VideosLabels {
    public static void createGrid(JFrame frame) {
        // Obtener el JPanel del JFrame
        JPanel panel = (JPanel) frame.getContentPane();

        int startX = 260;
        int startY = 130;
        
        // Definir el tamaño deseado para los JLabels
        int labelWidth = 180;
        int labelHeight = 120;

        int spacex = 20;
        int spacey = 90;

        conectorDB db = new conectorDB();

        // Dibujar la cuadrícula de JLabels
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                int x = startX + (labelWidth + spacex) * j;
                int y = startY + (labelHeight + spacey) * i;

                int videoId = i * 4 + j + 1; // Calcula el ID del video

                conectorDB.video video = db.obtenerVideo(videoId);
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

                    // Obtener la ruta de la imagen del usuario del video
                    int userId = video.getIdUsuario();
                    //String userImageUrl = db.obtenerImagenUsuario(userId);
                    
                    String userImageUrl = "https://t3.ftcdn.net/jpg/05/14/18/46/360_F_514184651_W5rVCabKKRH6H3mVb62jYWfuXio8c8si.jpg";

                    // Verificar si se encontró la ruta de la imagen del usuario
                    if (!userImageUrl.isEmpty()) {
                        // Crear un nuevo JLabel para la imagen del usuario
                        JLabel labelUser = new JLabel();
                        labelUser.setBounds(x, y + labelHeight, 30, 30);  // Colocar a la derecha del video
                        new Imagen(labelUser, userImageUrl);
                        panel.add(labelUser);
                        panel.setComponentZOrder(labelUser, 0);
                    }

                    // Crear un nuevo JLabel para el nombre del video
                    JLabel labelVideoName = new JLabel(video.getTitulo());
                    labelVideoName.setBounds(x + 35, y + labelHeight + 5, labelWidth + 30, 20); // Colocar debajo del video
                    labelVideoName.setHorizontalAlignment(SwingConstants.LEFT); // Alinear a la izquierda
                    labelVideoName.setForeground(Color.WHITE); // Color blanco
                    Font font = labelVideoName.getFont();
                    labelVideoName.setFont(new Font(font.getName(), Font.BOLD, 14)); // Aumentar tamaño de la tipografía
                    panel.add(labelVideoName);
                    panel.setComponentZOrder(labelVideoName, 0);
                } else {
                    System.out.println("No se encontró el video con el ID especificado.");
                }
            }
        }

        // Actualizar el JFrame para mostrar los cambios
        frame.validate();
        frame.repaint();
    }
}
