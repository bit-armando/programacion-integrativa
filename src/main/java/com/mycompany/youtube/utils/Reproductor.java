package com.mycompany.youtube;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JLabel;
import org.gstreamer.swing.VideoComponent;

public class Reproductor extends javax.swing.JFrame{
    private final JFXPanel jfxPanel = new JFXPanel();
    private MediaPlayer mediaPlayer;
    
    public Reproductor(JLabel video, String videoUrl) {
        createScene(videoUrl);
        
        setTitle("Video JAVA");
        
        setResizable(true);
        setSize(100,100);
        setLocationRelativeTo(null);
        
        video.setLayout(new BorderLayout());
        video.add(jfxPanel, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
    }
    
    private void createScene(String videoUrl){
        Platform.runLater(() -> {
            this.mediaPlayer = new MediaPlayer(new Media(videoUrl));
            
            jfxPanel.setScene(new Scene(new Group(new MediaView(mediaPlayer))));
            this.mediaPlayer.setVolume(0.3);
            this.mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
            this.mediaPlayer.play();
        });
    }
    
    // Metodo para pausar o reproducir el video
    public void togglePlayPause() {
        if (this.mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            this.mediaPlayer.pause();
        } else {
            this.mediaPlayer.play();
        }
    }
}
