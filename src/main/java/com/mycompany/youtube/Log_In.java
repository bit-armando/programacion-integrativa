/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author refil
 */
public class Log_In extends javax.swing.JFrame {

    /**
     * Creates new form Log_In
     */
    public Log_In() {
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        field_username = new javax.swing.JTextField();
        label_username = new javax.swing.JLabel();
        field_password = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        label_fcontr = new javax.swing.JLabel();
        label_registrarse = new javax.swing.JLabel();
        btn_inicio_sesion = new javax.swing.JButton();
        icon_home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setSize(new java.awt.Dimension(1080, 720));

        background.setBackground(new java.awt.Color(2, 30, 26));
        background.setMaximumSize(new java.awt.Dimension(1080, 720));
        background.setMinimumSize(new java.awt.Dimension(1080, 720));
        background.setPreferredSize(new java.awt.Dimension(1080, 720));

        jPanel1.setBackground(new java.awt.Color(8, 63, 55));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 94, 93));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar Sesion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(160, 160, 160))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 110));

        field_username.setBackground(new java.awt.Color(6, 137, 137));
        field_username.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        field_username.setForeground(new java.awt.Color(203, 203, 203));
        field_username.setText("Username");
        field_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        field_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(field_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 380, 60));

        label_username.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        label_username.setForeground(new java.awt.Color(203, 203, 203));
        label_username.setText("Username");
        jPanel1.add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 70, 10));

        field_password.setBackground(new java.awt.Color(6, 137, 137));
        field_password.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        field_password.setForeground(new java.awt.Color(203, 203, 203));
        field_password.setText("Contrasena");
        field_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        field_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(field_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 380, 60));

        label_password.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        label_password.setForeground(new java.awt.Color(203, 203, 203));
        label_password.setText("Contrasena");
        jPanel1.add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 80, 10));

        label_fcontr.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        label_fcontr.setForeground(new java.awt.Color(63, 225, 176));
        label_fcontr.setText("Olvidaste contrasena?");
        label_fcontr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redirect_forg_password(evt);
            }
        });
        jPanel1.add(label_fcontr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        label_registrarse.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        label_registrarse.setForeground(new java.awt.Color(63, 225, 176));
        label_registrarse.setText("Registrarse");
        label_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redirect_register(evt);
            }
        });
        jPanel1.add(label_registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        btn_inicio_sesion.setBackground(new java.awt.Color(63, 225, 176));
        btn_inicio_sesion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        btn_inicio_sesion.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio_sesion.setText("Iniciar Sesion");
        btn_inicio_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_sesionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_inicio_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 230, 60));

        icon_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\brand\\OneDrive\\Documentos\\NetBeansProjects\\programacion-integrativa\\src\\main\\java\\icons\\casa.png")); // NOI18N
        icon_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redirect_icon_home(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(icon_home, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(icon_home))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_usernameActionPerformed

    private void field_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_passwordActionPerformed

    private void redirect_icon_home(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redirect_icon_home
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_redirect_icon_home

    private void redirect_register(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redirect_register
        // TODO add your handling code here:
        new Register().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_redirect_register

    private void redirect_forg_password(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redirect_forg_password
        // TODO add your handling code here:
    }//GEN-LAST:event_redirect_forg_password

    private void btn_inicio_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_sesionActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_inicio_sesionActionPerformed

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
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_In().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_inicio_sesion;
    private javax.swing.JTextField field_password;
    private javax.swing.JTextField field_username;
    private javax.swing.JLabel icon_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_fcontr;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_registrarse;
    private javax.swing.JLabel label_username;
    // End of variables declaration//GEN-END:variables
}
