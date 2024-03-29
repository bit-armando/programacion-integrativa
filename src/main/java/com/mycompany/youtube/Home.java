/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author refil
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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
        bg_lateral_view = new javax.swing.JPanel();
        label_suscriptions = new javax.swing.JLabel();
        label_history = new javax.swing.JLabel();
        label_like = new javax.swing.JLabel();
        label_inicio3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        icon_arrow_bl = new javax.swing.JLabel();
        label_like1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
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
        label_title.setIcon(new javax.swing.ImageIcon("C:\\Users\\brand\\OneDrive\\Documentos\\NetBeansProjects\\programacion-integrativa\\src\\main\\java\\icons\\youtube.png")); // NOI18N
        label_title.setText("YUTU2");
        label_title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_titleMouseClicked(evt);
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
                .addContainerGap(275, Short.MAX_VALUE))
        );
        bg_cabeceraLayout.setVerticalGroup(
            bg_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_cabeceraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(busqueda_history, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(bg_cabeceraLayout.createSequentialGroup()
                .addComponent(label_title)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(bg_cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 70));

        bg_lateral_view.setBackground(new java.awt.Color(8, 63, 55));

        label_suscriptions.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        label_suscriptions.setForeground(new java.awt.Color(255, 255, 255));
        label_suscriptions.setIcon(new javax.swing.ImageIcon("C:\\Users\\brand\\OneDrive\\Documentos\\NetBeansProjects\\programacion-integrativa\\src\\main\\java\\icons\\suscripcion.png")); // NOI18N
        label_suscriptions.setText("Suscripciones");
        label_suscriptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_suscriptionsMouseClicked(evt);
            }
        });

        label_history.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        label_history.setForeground(new java.awt.Color(255, 255, 255));
        label_history.setIcon(new javax.swing.ImageIcon("C:\\Users\\brand\\OneDrive\\Documentos\\NetBeansProjects\\programacion-integrativa\\src\\main\\java\\icons\\historia.png")); // NOI18N
        label_history.setText("Historial");
        label_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_historyMouseClicked(evt);
            }
        });

        label_like.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        label_like.setForeground(new java.awt.Color(255, 255, 255));
        label_like.setIcon(new javax.swing.ImageIcon("C:\\Users\\brand\\OneDrive\\Documentos\\NetBeansProjects\\programacion-integrativa\\src\\main\\java\\icons\\like.png")); // NOI18N
        label_like.setText("Me gusta");
        label_like.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_likeMouseClicked(evt);
            }
        });

        label_inicio3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        label_inicio3.setForeground(new java.awt.Color(255, 255, 255));
        label_inicio3.setIcon(new javax.swing.ImageIcon("C:\\Users\\brand\\OneDrive\\Documentos\\NetBeansProjects\\programacion-integrativa\\src\\main\\java\\icons\\casa (1).png")); // NOI18N
        label_inicio3.setText("Inicio");
        label_inicio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_inicio3MouseClicked(evt);
            }
        });

        icon_arrow_bl.setIcon(new javax.swing.ImageIcon("C:\\Users\\brand\\OneDrive\\Documentos\\NetBeansProjects\\programacion-integrativa\\src\\main\\java\\icons\\flecha.png")); // NOI18N

        label_like1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        label_like1.setForeground(new java.awt.Color(255, 255, 255));
        label_like1.setIcon(new javax.swing.ImageIcon("C:\\Users\\brand\\OneDrive\\Documentos\\NetBeansProjects\\programacion-integrativa\\src\\main\\java\\icons\\cerrar-sesion.png")); // NOI18N
        label_like1.setText("Cerrar sesion");
        label_like1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_like1MouseClicked(evt);
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
                .addContainerGap(25, Short.MAX_VALUE)
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
                .addGap(33, 33, 33)
                .addComponent(label_suscriptions)
                .addGap(27, 27, 27)
                .addComponent(label_history)
                .addGap(29, 29, 29)
                .addComponent(label_like)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(label_like1)
                .addGap(85, 85, 85))
        );

        background.add(bg_lateral_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 220, 730));

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
        new History().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_label_historyMouseClicked

    private void label_suscriptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_suscriptionsMouseClicked
        // TODO add your handling code here:
        new Suscripcioness().setVisible(true);
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel bg_cabecera;
    private javax.swing.JPanel bg_lateral_view;
    private javax.swing.JTextField busqueda_history;
    private javax.swing.JLabel icon_arrow_bl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_history;
    private javax.swing.JLabel label_inicio3;
    private javax.swing.JLabel label_like;
    private javax.swing.JLabel label_like1;
    private javax.swing.JLabel label_suscriptions;
    private javax.swing.JLabel label_title;
    // End of variables declaration//GEN-END:variables
}
