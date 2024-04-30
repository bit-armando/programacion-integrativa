/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.youtube;
import com.mycompany.youtube.utils.Videos;
import javax.swing.JOptionPane;
import java.awt.event.MouseListener;


/**
 *
 * @author jesus
 */
public class VideoView extends javax.swing.JFrame {
    
    String urlVideo;
    
    public VideoView() {
        initComponents();
    }
    
    public static void openVideoView(int videoId) {
        java.awt.EventQueue.invokeLater(() -> {
            VideoView videoView = new VideoView();
            videoView.setVideoId(videoId); // Establecer la ID del video
            videoView.setVisible(true);
        });
    }
    
    public void setVideoId(int videoId) {

        Videos video = new Videos();
        video.obtenerVideo(videoId);
        
        urlVideo=video.getRutaVideo();
        
        
        // Verificar si se encontró el video
        if (video != null) {
            // Imprimir los datos del video
            System.out.println("ID del video: " + video.getId());
            this.video_title1.setText(video.getTitulo());
            this.description_video.setText(video.getDescripcion());
            this.urlVideo=video.getRutaVideo();
            this.number_views.setText(video.getVistas()+" views");
            this.num_likes.setText(String.valueOf(video.getLikes()));
            this.num_dislikes.setText(String.valueOf(video.getDislikes()));
            this.num_sus.setText(String.valueOf(0));
            //Video con la id
            Reproductor reproductor = new Reproductor(video_view, urlVideo);
        } else {
            //video default al no tener id
            Reproductor reproductor = new Reproductor(video_view, "https://yutu-programacion-integrativa.s3.amazonaws.com/2.mp4");
            System.out.println("No se encontró el video con el ID especificado.");
        }
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
        video_view = new javax.swing.JLabel();
        video_title = new javax.swing.JLabel();
        btn_suscribe = new javax.swing.JButton();
        num_dislikes = new javax.swing.JLabel();
        num_likes = new javax.swing.JLabel();
        number_views = new javax.swing.JLabel();
        image_video = new javax.swing.JPanel();
        bg_description = new javax.swing.JPanel();
        description_video = new javax.swing.JLabel();
        number_coments = new javax.swing.JLabel();
        Lista_de_comentarios = new javax.swing.JTextField();
        date_coment = new javax.swing.JLabel();
        username_coments = new javax.swing.JLabel();
        icon_send_coment = new javax.swing.JLabel();
        video_title1 = new javax.swing.JLabel();
        image_video1 = new javax.swing.JPanel();
        video_title2 = new javax.swing.JLabel();
        image_video2 = new javax.swing.JPanel();
        video_title3 = new javax.swing.JLabel();
        image_video3 = new javax.swing.JPanel();
        video_title4 = new javax.swing.JLabel();
        image_video4 = new javax.swing.JPanel();
        video_title5 = new javax.swing.JLabel();
        image_video5 = new javax.swing.JPanel();
        video_title6 = new javax.swing.JLabel();
        num_sus = new javax.swing.JLabel();
        likes = new javax.swing.JButton();
        dislikes = new javax.swing.JButton();
        Enviar_comentario = new javax.swing.JButton();
        Comentario_enviado = new javax.swing.JTextField();
        nombre_canal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
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

        javax.swing.GroupLayout bg_cabeceraLayout = new javax.swing.GroupLayout(bg_cabecera);
        bg_cabecera.setLayout(bg_cabeceraLayout);
        bg_cabeceraLayout.setHorizontalGroup(
            bg_cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_cabeceraLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(label_title)
                .addGap(167, 167, 167)
                .addComponent(busqueda_history, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
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
                .addContainerGap(59, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(label_like1)
                .addGap(23, 23, 23))
        );

        background.add(bg_lateral_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 220, 730));

        video_view.setBackground(new java.awt.Color(255, 255, 255));
        video_view.setForeground(new java.awt.Color(255, 255, 255));
        video_view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        video_view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        background.add(video_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 500, 290));

        video_title.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        video_title.setForeground(new java.awt.Color(255, 255, 255));
        video_title.setText("Titulo del Video...");
        background.add(video_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, -1, -1));

        btn_suscribe.setBackground(new java.awt.Color(0, 94, 93));
        btn_suscribe.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        btn_suscribe.setForeground(new java.awt.Color(255, 255, 255));
        btn_suscribe.setText("Suscribirse");
        btn_suscribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suscribeActionPerformed(evt);
            }
        });
        background.add(btn_suscribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, -1));

        num_dislikes.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 10)); // NOI18N
        num_dislikes.setForeground(new java.awt.Color(255, 255, 255));
        num_dislikes.setText("0");
        background.add(num_dislikes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, -1, -1));

        num_likes.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 10)); // NOI18N
        num_likes.setForeground(new java.awt.Color(255, 255, 255));
        num_likes.setText("0");
        background.add(num_likes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        number_views.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        number_views.setForeground(new java.awt.Color(255, 255, 255));
        number_views.setText("000k views");
        background.add(number_views, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        javax.swing.GroupLayout image_videoLayout = new javax.swing.GroupLayout(image_video);
        image_video.setLayout(image_videoLayout);
        image_videoLayout.setHorizontalGroup(
            image_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        image_videoLayout.setVerticalGroup(
            image_videoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        background.add(image_video, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 130, 80));

        bg_description.setBackground(new java.awt.Color(0, 94, 93));

        description_video.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        description_video.setForeground(new java.awt.Color(255, 255, 255));
        description_video.setText("Descripcion.");

        javax.swing.GroupLayout bg_descriptionLayout = new javax.swing.GroupLayout(bg_description);
        bg_description.setLayout(bg_descriptionLayout);
        bg_descriptionLayout.setHorizontalGroup(
            bg_descriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_descriptionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(description_video)
                .addContainerGap(407, Short.MAX_VALUE))
        );
        bg_descriptionLayout.setVerticalGroup(
            bg_descriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_descriptionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(description_video)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        background.add(bg_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 500, 50));

        number_coments.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        number_coments.setForeground(new java.awt.Color(255, 255, 255));
        number_coments.setText("0 comentarios");
        background.add(number_coments, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, -1, -1));

        Lista_de_comentarios.setBackground(new java.awt.Color(0, 94, 93));
        Lista_de_comentarios.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        Lista_de_comentarios.setForeground(new java.awt.Color(255, 255, 255));
        Lista_de_comentarios.setBorder(null);
        Lista_de_comentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_de_comentariosActionPerformed(evt);
            }
        });
        background.add(Lista_de_comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 390, 30));

        date_coment.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        date_coment.setForeground(new java.awt.Color(255, 255, 255));
        date_coment.setText("Fecha");
        background.add(date_coment, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, -1, -1));

        username_coments.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        username_coments.setForeground(new java.awt.Color(255, 255, 255));
        username_coments.setText("Nombre Usuario");
        background.add(username_coments, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, -1, -1));
        background.add(icon_send_coment, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 640, -1, -1));

        video_title1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        video_title1.setForeground(new java.awt.Color(255, 255, 255));
        video_title1.setText("Titulo del Video.");
        background.add(video_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        javax.swing.GroupLayout image_video1Layout = new javax.swing.GroupLayout(image_video1);
        image_video1.setLayout(image_video1Layout);
        image_video1Layout.setHorizontalGroup(
            image_video1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        image_video1Layout.setVerticalGroup(
            image_video1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        background.add(image_video1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, -1, -1));

        video_title2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        video_title2.setForeground(new java.awt.Color(255, 255, 255));
        video_title2.setText("Titulo del Video...");
        background.add(video_title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, -1, -1));

        javax.swing.GroupLayout image_video2Layout = new javax.swing.GroupLayout(image_video2);
        image_video2.setLayout(image_video2Layout);
        image_video2Layout.setHorizontalGroup(
            image_video2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        image_video2Layout.setVerticalGroup(
            image_video2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        background.add(image_video2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, -1, -1));

        video_title3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        video_title3.setForeground(new java.awt.Color(255, 255, 255));
        video_title3.setText("Titulo del Video...");
        background.add(video_title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 590, -1, -1));

        javax.swing.GroupLayout image_video3Layout = new javax.swing.GroupLayout(image_video3);
        image_video3.setLayout(image_video3Layout);
        image_video3Layout.setHorizontalGroup(
            image_video3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        image_video3Layout.setVerticalGroup(
            image_video3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        background.add(image_video3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, -1));

        video_title4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        video_title4.setForeground(new java.awt.Color(255, 255, 255));
        video_title4.setText("Titulo del Video...");
        background.add(video_title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, -1, -1));

        javax.swing.GroupLayout image_video4Layout = new javax.swing.GroupLayout(image_video4);
        image_video4.setLayout(image_video4Layout);
        image_video4Layout.setHorizontalGroup(
            image_video4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        image_video4Layout.setVerticalGroup(
            image_video4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        background.add(image_video4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, -1, -1));

        video_title5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        video_title5.setForeground(new java.awt.Color(255, 255, 255));
        video_title5.setText("Titulo del Video...");
        background.add(video_title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, -1, -1));

        javax.swing.GroupLayout image_video5Layout = new javax.swing.GroupLayout(image_video5);
        image_video5.setLayout(image_video5Layout);
        image_video5Layout.setHorizontalGroup(
            image_video5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        image_video5Layout.setVerticalGroup(
            image_video5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        background.add(image_video5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, -1, -1));

        video_title6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        video_title6.setForeground(new java.awt.Color(255, 255, 255));
        video_title6.setText("Titulo del Video...");
        background.add(video_title6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, -1, -1));

        num_sus.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        num_sus.setForeground(new java.awt.Color(204, 204, 204));
        num_sus.setText("0 Suscriptores");
        background.add(num_sus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, 10));

        likes.setForeground(new java.awt.Color(255, 0, 51));
        likes.setText("likes");
        likes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likesActionPerformed(evt);
            }
        });
        background.add(likes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 30, 20));

        dislikes.setForeground(new java.awt.Color(255, 0, 51));
        dislikes.setText("likes");
        dislikes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dislikesActionPerformed(evt);
            }
        });
        background.add(dislikes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 30, 20));

        Enviar_comentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enviar_comentarioActionPerformed(evt);
            }
        });
        background.add(Enviar_comentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, 30, 30));

        Comentario_enviado.setBackground(new java.awt.Color(0, 94, 93));
        Comentario_enviado.setForeground(new java.awt.Color(255, 255, 255));
        Comentario_enviado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comentario_enviadoActionPerformed(evt);
            }
        });
        background.add(Comentario_enviado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 680, 460, 30));

        nombre_canal.setText("nombre del cnal");
        background.add(nombre_canal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busqueda_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busqueda_historyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busqueda_historyActionPerformed

    private void label_titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_titleMouseClicked
        // TODO add your handling code here:
        this.setVisible(true);
    }//GEN-LAST:event_label_titleMouseClicked

    private void label_suscriptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_suscriptionsMouseClicked
        // TODO add your handling code here:
        sesion Sesion = sesion.getInstance(null);
        if(Sesion != null) {
            String username = Sesion.getUsername();
            new Suscripcioness(username).setVisible(true);
            this.setVisible(false);
        } else {
            // Caso en que no hay una sesión iniciada
            JOptionPane.showMessageDialog(null, "Inicio de sesion requerido!");
        }
    }//GEN-LAST:event_label_suscriptionsMouseClicked

    private void label_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_historyMouseClicked
        // TODO add your handling code here:
        sesion Sesion = sesion.getInstance(null);
        if(Sesion != null) {
            String username = Sesion.getUsername();
            new History(username).setVisible(true);
            this.setVisible(false);
        } else {
            // Caso en que no hay una sesión iniciada
            JOptionPane.showMessageDialog(null, "Inicio de sesion requerido!");
        }
    }//GEN-LAST:event_label_historyMouseClicked

    private void label_likeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_likeMouseClicked
        // TODO add your handling code here:
        sesion Sesion = sesion.getInstance(null);
        if(Sesion != null) {
            String username = Sesion.getUsername();
            new Liked_videos(username).setVisible(true);
            this.setVisible(false);
        } else {
            // Caso en que no hay una sesión iniciada
            JOptionPane.showMessageDialog(null, "Inicio de sesion requerido!");
        }
    }//GEN-LAST:event_label_likeMouseClicked

    private void label_inicio3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_inicio3MouseClicked
        System.out.println("Cargando Datos...");
        Home home=new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_label_inicio3MouseClicked

    private void label_like1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_like1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_like1MouseClicked

    
  private boolean isSubscribed = false;
private int subscriberCount = 0;
    
    private void btn_suscribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suscribeActionPerformed
        if (isSubscribed) {
        // Si el usuario ya está suscrito, cambia el texto del botón y marca como no suscrito
        btn_suscribe.setText("Suscribirse");
        isSubscribed = false;
        subscriberCount = 0; // Actualiza el contador de suscriptores
    } else {
        // Si el usuario no está suscrito, cambia el texto del botón y marca como suscrito
        btn_suscribe.setText("Suscrito");
        isSubscribed = true;
        subscriberCount = 1; // Actualiza el contador de suscriptores
    }
    
    // Actualiza el texto del contador de suscriptores
    this.num_sus.setText(String.valueOf(subscriberCount)+ " suscriptores");
    }//GEN-LAST:event_btn_suscribeActionPerformed



private int likesCounter = 0;
private boolean likeGiven = false;
    
    private void likesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likesActionPerformed
     if (!likeGiven) { // Si el usuario aún no ha dado like
        // Incrementar el contador de likes en 1
        likesCounter++;
        // Actualizar el texto del contador de likes
        this.num_likes.setText(String.valueOf(likesCounter));
        // Marcar que el usuario ya ha dado like
        likeGiven = true;
        // Desactivar el botón de dislike
        dislikes.setEnabled(false);
        // Cambiar el texto del botón de likes a "Quitar Like"
        likes.setText("Quitar Like");
    } else { // Si el usuario ya ha dado like
        // Decrementar el contador de likes en 1
        likesCounter--;
        // Actualizar el texto del contador de likes
        this.num_likes.setText(String.valueOf(likesCounter));
        // Marcar que el usuario no ha dado like
        likeGiven = false;
        // Activar el botón de dislike
        dislikes.setEnabled(true);
        // Cambiar el texto del botón de likes a "Dar Like"
        likes.setText("Dar Like");
    }
    }//GEN-LAST:event_likesActionPerformed

private int dislikesCounter = 0;
private boolean dislikeGiven = false;
    
    private void dislikesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dislikesActionPerformed
        if (!dislikeGiven) { // Si el usuario aún no ha dado dislike
        // Incrementar el contador de dislikes en 1
        dislikesCounter++;
        // Actualizar el texto del contador de dislikes
        this.num_dislikes.setText(String.valueOf(dislikesCounter));
        // Marcar que el usuario ya ha dado dislike
        dislikeGiven = true;
        // Desactivar el botón de like
        likes.setEnabled(false);
        // Cambiar el texto del botón de dislikes a "Quitar Dislike"
        dislikes.setText("Quitar Dislike");
    } else { // Si el usuario ya ha dado dislike
        // Decrementar el contador de dislikes en 1
        dislikesCounter--;
        // Actualizar el texto del contador de dislikes
        this.num_dislikes.setText(String.valueOf(dislikesCounter));
        // Marcar que el usuario no ha dado dislike
        dislikeGiven = false;
        // Activar el botón de like
        likes.setEnabled(true);
        // Cambiar el texto del botón de dislikes a "Dar Dislike"
        dislikes.setText("Dar Dislike");
    }
    }//GEN-LAST:event_dislikesActionPerformed

    private String comentarioEnviado;
private int numeroComentarios = 0;
    
    private void Lista_de_comentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_de_comentariosActionPerformed
     // Este método se llama cuando se presiona Enter en el campo Lista_de_comentarios
    EnviarComentario(); // Llama al método para enviar el comentario
    }//GEN-LAST:event_Lista_de_comentariosActionPerformed

     private void EnviarComentario() {
    // Guardar el comentario en la variable comentarioEnviado
    comentarioEnviado = Lista_de_comentarios.getText();
    // Deshabilitar la edición del campo Comentario_enviado
    Comentario_enviado.setEditable(false);
    // Mostrar el comentario enviado en el campo Comentario_enviado
    Comentario_enviado.setText(comentarioEnviado);
    // Incrementar el número de comentarios
    numeroComentarios++;
    // Mostrar el número actualizado de comentarios
    this.number_coments.setText(String.valueOf(numeroComentarios) + " comentarios ");
    // Limpiar el campo de comentarios
    Lista_de_comentarios.setText("");
}
    
    
    private void Comentario_enviadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comentario_enviadoActionPerformed
          // Guardar el comentario en la variable comentarioEnviado
    comentarioEnviado = Lista_de_comentarios.getText();
    // Mostrar el comentario enviado en el campo Comentario_enviado
    Comentario_enviado.setText(comentarioEnviado);
    // Limpiar el campo de comentarios
    Lista_de_comentarios.setText("");

    // Deshabilitar la edición del campo Comentario_enviado
    Comentario_enviado.setEditable(false);
    // Deshabilitar el enfoque del campo Comentario_enviado
    Comentario_enviado.setFocusable(false);
    // Deshabilitar cualquier acción de ratón en el campo Comentario_enviado
    Comentario_enviado.setEnabled(false);
    // Eliminar cualquier oyente de ratón en el campo Comentario_enviado
    for (MouseListener listener : Comentario_enviado.getMouseListeners()) {
        Comentario_enviado.removeMouseListener(listener);
    }
    }//GEN-LAST:event_Comentario_enviadoActionPerformed

    private void Enviar_comentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enviar_comentarioActionPerformed
    // Guardar el comentario en la variable comentarioEnviado
    comentarioEnviado = Lista_de_comentarios.getText();
    // Deshabilitar la edición del campo Comentario_enviado
    Comentario_enviado.setEditable(false);
    // Mostrar el comentario enviado en el campo Comentario_enviado
    Comentario_enviado.setText(comentarioEnviado);
    // Incrementar el número de comentarios
    numeroComentarios++;
    // Mostrar el número actualizado de comentarios
    this.number_coments.setText(String.valueOf(numeroComentarios) + " comentarios ");
    // Agregar comentario automáticamente positivo
    String comentarioPositivo = "  ";
    Lista_de_comentarios.setText(comentarioPositivo);
    }//GEN-LAST:event_Enviar_comentarioActionPerformed

    
    
 
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
            java.util.logging.Logger.getLogger(VideoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Comentario_enviado;
    private javax.swing.JButton Enviar_comentario;
    private javax.swing.JTextField Lista_de_comentarios;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bg_cabecera;
    private javax.swing.JPanel bg_description;
    private javax.swing.JPanel bg_lateral_view;
    private javax.swing.JButton btn_suscribe;
    private javax.swing.JTextField busqueda_history;
    private javax.swing.JLabel date_coment;
    private javax.swing.JLabel description_video;
    private javax.swing.JButton dislikes;
    private javax.swing.JLabel icon_arrow_bl;
    private javax.swing.JLabel icon_send_coment;
    private javax.swing.JPanel image_video;
    private javax.swing.JPanel image_video1;
    private javax.swing.JPanel image_video2;
    private javax.swing.JPanel image_video3;
    private javax.swing.JPanel image_video4;
    private javax.swing.JPanel image_video5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_history;
    private javax.swing.JLabel label_inicio3;
    private javax.swing.JLabel label_like;
    private javax.swing.JLabel label_like1;
    private javax.swing.JLabel label_suscriptions;
    private javax.swing.JLabel label_title;
    private javax.swing.JButton likes;
    private javax.swing.JButton nombre_canal;
    private javax.swing.JLabel num_dislikes;
    private javax.swing.JLabel num_likes;
    private javax.swing.JLabel num_sus;
    private javax.swing.JLabel number_coments;
    private javax.swing.JLabel number_views;
    private javax.swing.JLabel username_coments;
    private javax.swing.JLabel video_title;
    private javax.swing.JLabel video_title1;
    private javax.swing.JLabel video_title2;
    private javax.swing.JLabel video_title3;
    private javax.swing.JLabel video_title4;
    private javax.swing.JLabel video_title5;
    private javax.swing.JLabel video_title6;
    private javax.swing.JLabel video_view;
    // End of variables declaration//GEN-END:variables
}
