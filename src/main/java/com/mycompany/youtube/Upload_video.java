/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.youtube;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
public class Upload_video extends javax.swing.JFrame {
    private String superpath_img;
    private String superpath_video;
    private static int id;
    /**
     * Creates new form Register
     */
    public Upload_video(int id) {
        initComponents();
        JOptionPane.showMessageDialog(null, "ID usuario " + id);
        this.id = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        icon_home = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        field_name_video = new javax.swing.JTextField();
        label_name_video = new javax.swing.JLabel();
        btn_upload_video = new javax.swing.JButton();
        label_description = new javax.swing.JLabel();
        btn_upload_finish_video = new javax.swing.JButton();
        btn_upload_image_video = new javax.swing.JButton();
        label_description1 = new javax.swing.JLabel();
        label_description2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        field_description_video = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1080, 720));

        background.setBackground(new java.awt.Color(2, 30, 26));
        background.setMaximumSize(new java.awt.Dimension(1080, 720));
        background.setMinimumSize(new java.awt.Dimension(1080, 720));

        icon_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redirect_icon_home(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(8, 63, 55));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 94, 93));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Subir Video");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 110));

        field_name_video.setBackground(new java.awt.Color(6, 137, 137));
        field_name_video.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        field_name_video.setForeground(new java.awt.Color(203, 203, 203));
        field_name_video.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        field_name_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_name_videoActionPerformed(evt);
            }
        });
        jPanel1.add(field_name_video, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 380, 60));

        label_name_video.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        label_name_video.setForeground(new java.awt.Color(203, 203, 203));
        label_name_video.setText("Titulo");
        jPanel1.add(label_name_video, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 70, 10));

        btn_upload_video.setBackground(new java.awt.Color(63, 225, 176));
        btn_upload_video.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        btn_upload_video.setForeground(new java.awt.Color(255, 255, 255));
        btn_upload_video.setText("Cargar Video");
        btn_upload_video.setMaximumSize(new java.awt.Dimension(151, 35));
        btn_upload_video.setMinimumSize(new java.awt.Dimension(151, 35));
        btn_upload_video.setPreferredSize(new java.awt.Dimension(151, 35));
        btn_upload_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_acc(evt);
            }
        });
        jPanel1.add(btn_upload_video, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 151, 35));

        label_description.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        label_description.setForeground(new java.awt.Color(203, 203, 203));
        label_description.setText("Video");
        jPanel1.add(label_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 80, 20));

        btn_upload_finish_video.setBackground(new java.awt.Color(63, 225, 176));
        btn_upload_finish_video.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        btn_upload_finish_video.setForeground(new java.awt.Color(255, 255, 255));
        btn_upload_finish_video.setText("Subir");
        btn_upload_finish_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upload_finish_videobtn_create_acc(evt);
            }
        });
        jPanel1.add(btn_upload_finish_video, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 230, 60));

        btn_upload_image_video.setBackground(new java.awt.Color(63, 225, 176));
        btn_upload_image_video.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        btn_upload_image_video.setForeground(new java.awt.Color(255, 255, 255));
        btn_upload_image_video.setText("Cargar Imagen");
        btn_upload_image_video.setMaximumSize(new java.awt.Dimension(151, 35));
        btn_upload_image_video.setMinimumSize(new java.awt.Dimension(151, 35));
        btn_upload_image_video.setPreferredSize(new java.awt.Dimension(151, 35));
        btn_upload_image_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upload_image_videobtn_create_acc(evt);
            }
        });
        jPanel1.add(btn_upload_image_video, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 151, 35));

        label_description1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        label_description1.setForeground(new java.awt.Color(203, 203, 203));
        label_description1.setText("Descripción");
        jPanel1.add(label_description1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 80, 20));

        label_description2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        label_description2.setForeground(new java.awt.Color(203, 203, 203));
        label_description2.setText("Imagen");
        jPanel1.add(label_description2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 80, 20));

        jScrollPane1.setBackground(new java.awt.Color(6, 137, 137));
        jScrollPane1.setForeground(new java.awt.Color(203, 203, 203));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);

        field_description_video.setBackground(new java.awt.Color(6, 137, 137));
        field_description_video.setColumns(20);
        field_description_video.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        field_description_video.setForeground(new java.awt.Color(203, 203, 203));
        field_description_video.setLineWrap(true);
        field_description_video.setRows(5);
        field_description_video.setToolTipText("");
        field_description_video.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(field_description_video);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 380, 140));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(icon_home, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(icon_home))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_name_videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_name_videoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_name_videoActionPerformed
    
    private void btn_create_acc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_acc
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

        // Configurar el filtro de archivos
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos MP4", "mp4");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            superpath_video = selectedFile.getAbsolutePath(); // Obtiene la ruta del archivo
            String nombre = selectedFile.getName(); //
            
        }
    }//GEN-LAST:event_btn_create_acc

    private void redirect_icon_home(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redirect_icon_home
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_redirect_icon_home

    private void btn_upload_finish_videobtn_create_acc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upload_finish_videobtn_create_acc
        // TODO add your handling code here:
        
        // datos para subir imagen en aws
        String titulo_img = field_name_video.getText() + ".jpg";
        titulo_img = titulo_img.replace(" ", "+");
        String titulo_vid = field_name_video.getText() + ".mp4";
        titulo_vid = titulo_vid.replace(" ", "+");
        String titulo = field_name_video.getText();
        String path_img = superpath_img;
        try{
            S3 subir = new S3();
            subir.Upload(titulo_img, path_img);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "fallo al subir imagen al s3");
        }
        
        // datos para subir video en aws
        String path_video = superpath_video;
        
        try{
            S3 subir = new S3();
            subir.Upload(titulo_vid, path_video);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "fallo al subir video al s3");
        }
        
        //Datos para hacer el insert de video a la db
        int id_usuario = this.id; // hay que cambiar la variable para que se actualice segun cada usuario
        String descripcion = field_description_video.getText();
        JOptionPane.showMessageDialog(null, "Tu path imagen! " + path_img + " Tu path video! " + path_video);
        String url_video = "https://yutu-programacion-integrativa.s3.amazonaws.com/" + titulo_vid;
        String url_img = "https://yutu-programacion-integrativa.s3.amazonaws.com/" + titulo_img;
        
        conectorDB conn = new conectorDB();
        conn.insertVideo(titulo, id_usuario, descripcion, url_video, url_img);
        
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_upload_finish_videobtn_create_acc

    private void btn_upload_image_videobtn_create_acc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upload_image_videobtn_create_acc
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

        // Configurar el filtro de archivos
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos JPG", "jpg");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            superpath_img = selectedFile.getAbsolutePath(); // Obtiene la ruta del archivo
            String nombre = selectedFile.getName(); //
        }
    }//GEN-LAST:event_btn_upload_image_videobtn_create_acc

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
            java.util.logging.Logger.getLogger(Upload_video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Upload_video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Upload_video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Upload_video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upload_video(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_upload_finish_video;
    private javax.swing.JButton btn_upload_image_video;
    private javax.swing.JButton btn_upload_video;
    private javax.swing.JTextArea field_description_video;
    private javax.swing.JTextField field_name_video;
    private javax.swing.JLabel icon_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_description;
    private javax.swing.JLabel label_description1;
    private javax.swing.JLabel label_description2;
    private javax.swing.JLabel label_name_video;
    // End of variables declaration//GEN-END:variables
}
