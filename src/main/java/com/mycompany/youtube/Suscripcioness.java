/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author refil
 */
public class Suscripcioness extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Suscripcioness() {
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
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

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
        label_like1.setIcon(new javax.swing.ImageIcon("C:\\Users\\brand\\OneDrive\\Documentos\\NetBeansProjects\\programacion-integrativa\\src\\main\\java\\icons\\cerrar-sesion.png")); // NOI18N
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                                    .addComponent(label_like)
                                    .addGap(76, 76, 76))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_lateral_viewLayout.createSequentialGroup()
                                    .addComponent(label_suscriptions)
                                    .addGap(29, 29, 29)))
                            .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                                .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_history)
                                    .addComponent(label_inicio3))
                                .addGap(15, 15, 15))))
                    .addComponent(jSeparator1)
                    .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                        .addComponent(label_like1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        bg_lateral_viewLayout.setVerticalGroup(
            bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                .addGroup(bg_lateral_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_lateral_viewLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(icon_arrow_bl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
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
                .addGap(279, 279, 279)
                .addComponent(label_like1)
                .addGap(37, 37, 37))
        );

        background.add(bg_lateral_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 220, 730));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Suscripciones");
        background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 180, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, 180, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 180, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 180, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Titulo del video");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, -1, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("000k views");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre del canal/username");
        background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 180, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 180, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 180, -1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        background.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 180, -1));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Titulo del video");
        background.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Titulo del video");
        background.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Titulo del video");
        background.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Titulo del video");
        background.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Titulo del video");
        background.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, -1, -1));

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Titulo del video");
        background.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, -1));

        jLabel17.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Titulo del video");
        background.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, -1, -1));

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nombre del canal/username");
        background.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Nombre del canal/username");
        background.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel20.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nombre del canal/username");
        background.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        jLabel21.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nombre del canal/username");
        background.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, -1, -1));

        jLabel22.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nombre del canal/username");
        background.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        jLabel23.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Nombre del canal/username");
        background.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, -1, -1));

        jLabel24.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Nombre del canal/username");
        background.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, -1, -1));

        jLabel25.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("000k views");
        background.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        jLabel26.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("000k views");
        background.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        jLabel27.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("000k views");
        background.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, -1, -1));

        jLabel28.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("000k views");
        background.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, -1, -1));

        jLabel29.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("000k views");
        background.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 590, -1, -1));

        jLabel30.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("000k views");
        background.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, -1, -1));

        jLabel31.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("000k views");
        background.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, -1));

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
            java.util.logging.Logger.getLogger(Suscripcioness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suscripcioness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suscripcioness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suscripcioness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suscripcioness().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_history;
    private javax.swing.JLabel label_inicio3;
    private javax.swing.JLabel label_like;
    private javax.swing.JLabel label_like1;
    private javax.swing.JLabel label_suscriptions;
    private javax.swing.JLabel label_title;
    // End of variables declaration//GEN-END:variables
}
