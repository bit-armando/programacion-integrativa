/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author bylet
 */
public class Liked_videos extends javax.swing.JFrame {

    /**
     * Creates new form Subscriptions
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        yt_liked = new javax.swing.JLabel();
        acc_liked = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        busqueda_liked = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        options_liked = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        home_liked = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        history_liked = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        subs_liked = new javax.swing.JButton();
        like_liked = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollBar_history = new javax.swing.JScrollBar();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        yt_liked.setIcon(new javax.swing.ImageIcon("D:\\png-clipart-youtube-computer-icons-logo-youtube-angle-rectangle-removebg-preview.png")); // NOI18N

        acc_liked.setIcon(new javax.swing.ImageIcon("D:\\a.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("YUTU2");

        busqueda_liked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busqueda_likedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(yt_liked)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(312, 312, 312)
                .addComponent(busqueda_liked, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(acc_liked)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(yt_liked, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(acc_liked)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(busqueda_liked, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(72, 72, 72))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 80));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        options_liked.setIcon(new javax.swing.ImageIcon("D:\\pngtree-menu-vector-icon-png-image_964006-removebg-preview (1).png")); // NOI18N
        options_liked.setDisabledIcon(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\6583566-removebg-preview__1_-removebg-preview.png")); // NOI18N

        home_liked.setBackground(new java.awt.Color(0, 102, 102));
        home_liked.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        home_liked.setForeground(new java.awt.Color(255, 255, 255));
        home_liked.setText("Inicio");
        home_liked.setBorder(null);
        home_liked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_likedActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\pngtree-vector-like-icon-png-image_695769-removebg-preview.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\109613-removebg-preview.png")); // NOI18N

        history_liked.setBackground(new java.awt.Color(0, 102, 102));
        history_liked.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        history_liked.setForeground(new java.awt.Color(255, 255, 255));
        history_liked.setText("Historial");
        history_liked.setBorder(null);
        history_liked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history_likedActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\team-icon-outline-131313__1_-removebg-preview.png")); // NOI18N

        subs_liked.setBackground(new java.awt.Color(0, 102, 102));
        subs_liked.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        subs_liked.setForeground(new java.awt.Color(255, 255, 255));
        subs_liked.setText("Subscripciones");
        subs_liked.setBorder(null);
        subs_liked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subs_likedActionPerformed(evt);
            }
        });

        like_liked.setBackground(new java.awt.Color(0, 102, 102));
        like_liked.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        like_liked.setForeground(new java.awt.Color(255, 255, 255));
        like_liked.setText("Me gusta");
        like_liked.setBorder(null);
        like_liked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                like_likedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(options_liked)
                .addGap(19, 19, 19))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(home_liked))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(subs_liked, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(history_liked))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(like_liked)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(options_liked)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(home_liked)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(subs_liked)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel8))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(history_liked)))
                        .addGap(52, 52, 52)
                        .addComponent(like_liked)
                        .addGap(15, 15, 15)))
                .addContainerGap(349, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 243, 870));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Videos que me gustan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jScrollBar_history.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.add(jScrollBar_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 80, -1, 870));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\bylet\\OneDrive\\Pictures\\Screenshots\\Captura de pantalla (32).png")); // NOI18N
        jLabel9.setText("Nombre del canal/username");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 690, -1, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Titulo del video");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, -1, 30));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Resto del titulo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, -1, 30));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("000k views");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 690, -1, 30));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Titulo del video");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 240, 30));

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Titulo del video");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, 30));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Resto del titulo");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, 30));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Resto del titulo");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, 30));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\bylet\\OneDrive\\Pictures\\Screenshots\\Captura de pantalla (32).png")); // NOI18N
        jLabel19.setText("Nombre del canal/username");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\bylet\\OneDrive\\Pictures\\Screenshots\\Captura de pantalla (32).png")); // NOI18N
        jLabel20.setText("Nombre del canal/username");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("000k views");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, -1, 30));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("000k views");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, -1, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 350, 180));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 350, 180));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 350, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_likedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_likedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_home_likedActionPerformed

    private void history_likedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history_likedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_history_likedActionPerformed

    private void subs_likedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subs_likedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subs_likedActionPerformed

    private void like_likedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_like_likedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_like_likedActionPerformed

    private void busqueda_likedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busqueda_likedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busqueda_likedActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Liked_videos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_liked;
    private javax.swing.JTextField busqueda_liked;
    private javax.swing.JButton history_liked;
    private javax.swing.JButton home_liked;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollBar jScrollBar_history;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton like_liked;
    private javax.swing.JLabel options_liked;
    private javax.swing.JButton subs_liked;
    private javax.swing.JLabel yt_liked;
    // End of variables declaration//GEN-END:variables
}