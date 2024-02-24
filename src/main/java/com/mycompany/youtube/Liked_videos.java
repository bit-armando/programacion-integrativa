/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author refil
 */
public class Liked_videos extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Liked_videos() {
        initComponents();
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
        bg_cabecera = new javax.swing.JPanel();
        busqueda_history = new javax.swing.JTextField();
        label_title = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bg_lateral_view = new javax.swing.JPanel();
        label_suscriptions = new javax.swing.JLabel();
        label_history = new javax.swing.JLabel();
        label_like = new javax.swing.JLabel();
        label_inicio3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        icon_arrow_bl = new javax.swing.JLabel();
        label_like1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/youtube.png"))); // NOI18N

        javax.swing.GroupLayout bg_cabeceraLayout = new javax.swing.GroupLayout(bg_cabecera);
        bg_cabecera.setLayout(bg_cabeceraLayout);
        bg_cabeceraLayout.setHorizontalGroup(
            bg_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_cabeceraLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_title)
                .addGap(94, 94, 94)
                .addComponent(busqueda_history, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        bg_cabeceraLayout.setVerticalGroup(
            bg_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_cabeceraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(bg_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_title)
                    .addComponent(busqueda_history, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bg_cabeceraLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        background.add(bg_cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 70));

        bg_lateral_view.setBackground(new java.awt.Color(8, 63, 55));

        label_suscriptions.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        label_suscriptions.setForeground(new java.awt.Color(255, 255, 255));
        label_suscriptions.setText("Suscripciones");
        label_suscriptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_suscriptionsMouseClicked(evt);
            }
        });

        label_history.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        label_history.setForeground(new java.awt.Color(255, 255, 255));
        label_history.setText("Historial");
        label_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_historyMouseClicked(evt);
            }
        });

        label_like.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        label_like.setForeground(new java.awt.Color(255, 255, 255));
        label_like.setText("Me gusta");
        label_like.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_likeMouseClicked(evt);
            }
        });

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/casa (1).png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/suscripcion.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/historia.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/like.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/flecha.png"))); // NOI18N

        javax.swing.GroupLayout bg_lateral_viewLayout = new javax.swing.GroupLayout(bg_lateral_view);
        bg_lateral_view.setLayout(bg_lateral_viewLayout);
        bg_lateral_viewLayout.setHorizontalGroup(
            bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_lateral_viewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(icon_arrow_bl))
                .addGap(22, 22, 22))
            .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_lateral_viewLayout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_like1)
                            .addComponent(label_history)
                            .addComponent(label_inicio3)
                            .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                                    .addComponent(label_like)
                                    .addGap(61, 61, 61))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_lateral_viewLayout.createSequentialGroup()
                                    .addComponent(label_suscriptions)
                                    .addGap(14, 14, 14)))))
                    .addComponent(jSeparator1)))
        );
        bg_lateral_viewLayout.setVerticalGroup(
            bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(icon_arrow_bl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_lateral_viewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                        .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                                .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_inicio3)
                                    .addComponent(jLabel1))
                                .addGap(33, 33, 33)
                                .addComponent(label_suscriptions))
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_history)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addComponent(label_like))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(label_like1)
                .addGap(44, 44, 44))
        );

        background.add(bg_lateral_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 220, 730));

        jLabel25.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("000k views");
        background.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 540, -1, -1));

        jLabel32.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Videos que me gustan");
        background.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel34.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Titulo del video");
        background.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        jLabel35.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Nombre del canal/username");
        background.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, -1));

        jLabel36.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Resto del titulo");
        background.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, -1));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        background.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 240, 130));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        background.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 240, 130));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        background.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 240, 130));

        jLabel40.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Titulo del video");
        background.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel41.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Titulo del video");
        background.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jLabel42.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Resto del titulo");
        background.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        jLabel43.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Resto del titulo");
        background.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        jLabel44.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Nombre del canal/username");
        background.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        jLabel45.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Nombre del canal/username");
        background.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        jLabel27.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("000k views");
        background.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, -1, -1));

        jLabel29.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("000k views");
        background.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, -1, -1));

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

    private void label_likeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_likeMouseClicked
        // TODO add your handling code here:
        new Liked_videos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_label_likeMouseClicked

    private void label_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_historyMouseClicked
        // TODO add your handling code here:
        new Liked_videos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_label_historyMouseClicked

    private void label_suscriptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_suscriptionsMouseClicked
        // TODO add your handling code here:
        new SUSCRIPCIONES().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_label_suscriptionsMouseClicked

    private void label_inicio3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_inicio3MouseClicked
        // TODO add your handling code here:
        this.setVisible(true);
    }//GEN-LAST:event_label_inicio3MouseClicked

    private void label_titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_titleMouseClicked
        // TODO add your handling code here:
        this.setVisible(true);
    }//GEN-LAST:event_label_titleMouseClicked

    private void label_like1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_like1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_like1MouseClicked

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
            java.util.logging.Logger.getLogger(Liked_videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Liked_videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Liked_videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Liked_videos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Liked_videos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel bg_cabecera;
    private javax.swing.JPanel bg_lateral_view;
    private javax.swing.JTextField busqueda_history;
    private javax.swing.JLabel icon_arrow_bl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_history;
    private javax.swing.JLabel label_inicio3;
    private javax.swing.JLabel label_like;
    private javax.swing.JLabel label_like1;
    private javax.swing.JLabel label_suscriptions;
    private javax.swing.JLabel label_title;
    // End of variables declaration//GEN-END:variables
}
