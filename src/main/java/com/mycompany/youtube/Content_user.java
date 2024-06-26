/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.youtube;
import com.mycompany.youtube.utils.VideosLabels;
import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
public class Content_user extends javax.swing.JFrame {
    static private int id_content;
    static private String username_content;
    static private String user_img_content;
    
    int id_loged;
    String username_loged;
    String user_img_loged;
    
    /**
     * Creates new form Content_user
     */
    public Content_user() {
        initComponents();
        JOptionPane.showMessageDialog(null, this.id_content + " 1");
        VideosLabels.createGridContentUser(this,260,200,180,120,20,90,4,3,this.id_content,this.id_loged,username_loged,this.user_img_loged);
    }
    
    public Content_user(int id_content, String username_content, String user_img) {
        initComponents();
        this.id_content = id_content;
        this.username_content = username_content;
        this.user_img_content = user_img;
        JOptionPane.showMessageDialog(null, this.id_content + " 1");
        VideosLabels.createGridContentUser(this,260,260,180,120,20,90,4,3,this.id_content,this.id_loged,username_loged,this.user_img_loged);
        new Imagen(contentImg, this.user_img_content);
        label_content_user.setText(this.username_content);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     public static void openVideoView(int id_content, String user_img, String username_content) {
        java.awt.EventQueue.invokeLater(() -> {
            JOptionPane.showMessageDialog(null, id_content + " 2");
            Content_user content_user = new Content_user(id_content, username_content, user_img);
            content_user.id_content = id_content;
            content_user.username_content = username_content;
            content_user.user_img_content = user_img;
//            content_user.id_content = content_user.user_content(id_content,user_img,username_content); // Establecer la ID del video
            content_user.setVisible(true);
        });
    }
    
    public void user_loged(int id_loged, String user_img, String username_loged){
        this.id_loged = id_loged;
        this.user_img_loged = username_loged;
        this.user_img_loged = user_img;
    }
    
    private void updateUsernameLabel(){
        if (username_loged != ""){
            label_username.setText("");
        } else {
            label_username.setText(username_loged);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        bg_cabecera = new javax.swing.JPanel();
        busqueda_history = new javax.swing.JTextField();
        label_title = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        bg_lateral_view = new javax.swing.JPanel();
        label_inicio3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        icon_arrow_bl = new javax.swing.JLabel();
        label_like1 = new javax.swing.JLabel();
        upload_video = new javax.swing.JLabel();
        label_login = new javax.swing.JLabel();
        contentImg = new javax.swing.JLabel();
        label_content_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(2, 30, 26));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_cabecera.setBackground(new java.awt.Color(6, 137, 137));

        busqueda_history.setText("Buscar");
        busqueda_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busqueda_historyActionPerformed(evt);
            }
        });

        label_title.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        label_title.setForeground(new java.awt.Color(255, 255, 255));
        label_title.setText("YUTU2");
        label_title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_titleMouseClicked(evt);
            }
        });

        label_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_usernameprint_user(evt);
            }
        });

        javax.swing.GroupLayout bg_cabeceraLayout = new javax.swing.GroupLayout(bg_cabecera);
        bg_cabecera.setLayout(bg_cabeceraLayout);
        bg_cabeceraLayout.setHorizontalGroup(
            bg_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_cabeceraLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(label_title)
                .addGap(167, 167, 167)
                .addComponent(busqueda_history, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(label_username, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        bg_cabeceraLayout.setVerticalGroup(
            bg_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_cabeceraLayout.createSequentialGroup()
                .addComponent(label_title)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bg_cabeceraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(bg_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busqueda_history, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        background.add(bg_cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 70));

        bg_lateral_view.setBackground(new java.awt.Color(8, 63, 55));

        label_inicio3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        label_inicio3.setForeground(new java.awt.Color(255, 255, 255));
        label_inicio3.setText("Inicio");
        label_inicio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_inicio3MouseClicked(evt);
            }
        });

        label_like1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        label_like1.setForeground(new java.awt.Color(255, 255, 255));
        label_like1.setText("Cerrar sesion");
        label_like1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_like1MouseClicked(evt);
            }
        });

        upload_video.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        upload_video.setForeground(new java.awt.Color(255, 255, 255));
        upload_video.setText("Subir video");
        upload_video.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upload_videoMouseClicked(evt);
            }
        });

        label_login.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        label_login.setForeground(new java.awt.Color(255, 255, 255));
        label_login.setText("Iniciar sesion");
        label_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_lateral_viewLayout = new javax.swing.GroupLayout(bg_lateral_view);
        bg_lateral_view.setLayout(bg_lateral_viewLayout);
        bg_lateral_viewLayout.setHorizontalGroup(
            bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_lateral_viewLayout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_lateral_viewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(icon_arrow_bl)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_lateral_viewLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_like1)
                    .addComponent(label_inicio3))
                .addGap(22, 22, 22))
            .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_login)
                        .addComponent(upload_video))
                    .addContainerGap(41, Short.MAX_VALUE)))
        );
        bg_lateral_viewLayout.setVerticalGroup(
            bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(icon_arrow_bl)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_inicio3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 462, Short.MAX_VALUE)
                .addComponent(label_like1)
                .addGap(85, 85, 85))
            .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                    .addGap(321, 321, 321)
                    .addComponent(label_login)
                    .addGap(31, 31, 31)
                    .addComponent(upload_video)
                    .addContainerGap(322, Short.MAX_VALUE)))
        );

        background.add(bg_lateral_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 220, 730));
        background.add(contentImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 100, 100));

        label_content_user.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        label_content_user.setForeground(new java.awt.Color(255, 255, 255));
        label_content_user.setText("Username");
        background.add(label_content_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 420, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busqueda_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busqueda_historyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busqueda_historyActionPerformed

    private void label_titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_titleMouseClicked
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_label_titleMouseClicked

    private void label_usernameprint_user(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_usernameprint_user
        if(username_loged != null) {
            this.setVisible(false);
            new Edit_user(id_loged).setVisible(true);
        } else {
            // Caso en que no hay una sesión iniciada
            JOptionPane.showMessageDialog(null, "Inicio de sesion requerido!");
        }
    }//GEN-LAST:event_label_usernameprint_user

    private void label_inicio3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_inicio3MouseClicked
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_label_inicio3MouseClicked

    private void label_like1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_like1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_like1MouseClicked

    private void upload_videoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upload_videoMouseClicked
        // TODO add your handling code here:
        if(id_loged != 0) {
            this.setVisible(false);
            new Upload_video(id_loged).setVisible(true);
        } else {
            // Caso en que no hay una sesión iniciada
            JOptionPane.showMessageDialog(null, "Inicio de sesion requerido!");
        }
    }//GEN-LAST:event_upload_videoMouseClicked

    private void label_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_loginMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Log_In().setVisible(true);
    }//GEN-LAST:event_label_loginMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Content_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Content_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Content_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Content_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Content_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel bg_cabecera;
    private javax.swing.JPanel bg_lateral_view;
    private javax.swing.JTextField busqueda_history;
    private javax.swing.JLabel contentImg;
    private javax.swing.JLabel icon_arrow_bl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_content_user;
    private javax.swing.JLabel label_inicio3;
    private javax.swing.JLabel label_like1;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel label_username;
    private javax.swing.JLabel upload_video;
    // End of variables declaration//GEN-END:variables
}
