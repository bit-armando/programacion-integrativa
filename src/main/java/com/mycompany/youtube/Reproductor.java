package com.mycompany.youtube;

import java.awt.BorderLayout;
import java.io.File;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JLabel;

public class Reproductor extends javax.swing.JFrame{
    private final JFXPanel jfxPanel = new JFXPanel();
    private MediaPlayer mediaPlayer;
    
    public Reproductor(JLabel video, String videoUrl) {
        createScene(videoUrl);
        
        setTitle("Video JAVA");
        
        setResizable(true);
        setLocationRelativeTo(null);
        
        video.setLayout(new BorderLayout());
        video.add(jfxPanel, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
    }
    
    private void createScene(String videoUrl){
        Platform.runLater(() -> {
            MediaPlayer mediaPlayer = new MediaPlayer(new Media(videoUrl));
            
//            Image scaledImage = img.getScaledInstance(video.getWidth(), video.getHeight(), Image.SCALE_SMOOTH);
//            ImageIcon resizedIcon = new ImageIcon(scaledImage);
            
            jfxPanel.setScene(new Scene(new Group(new MediaView(mediaPlayer))));
            mediaPlayer.setVolume(0.3);
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
            mediaPlayer.play();
        });
    }
    
    // Metodo para pausar o reproducir el video
    public void togglePlayPause() {
        if (mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            mediaPlayer.pause();
        } else {
            mediaPlayer.play();
        }
    }
}
