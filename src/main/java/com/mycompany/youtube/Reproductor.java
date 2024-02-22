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
    
    public Reproductor(JLabel video) {
        createScene();
        
        setTitle("Video JAVA");
        
        setResizable(false);
        setLocationRelativeTo(null);
        
        video.setLayout(new BorderLayout());
        video.add(jfxPanel, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
    }
    
    private void createScene(){
        Platform.runLater(new Runnable(){
            
            @Override
            
            public void run(){
//                File file = new File("https://yutu-programacion-integrativa.s3.amazonaws.com/Video+Test+2K+Samsung.mp4");
                File file = new File("C:\\Users\\refil\\Downloads\\2.mp4");       
                MediaPlayer oracleVid = new MediaPlayer(
                    new Media(file.toURI().toString())
                );
                
                jfxPanel.setScene(new Scene(new Group(new MediaView(oracleVid))));
                oracleVid.setVolume(0.3);
                oracleVid.setCycleCount(MediaPlayer.INDEFINITE);
                oracleVid.play();
            }
        });
    }
}
