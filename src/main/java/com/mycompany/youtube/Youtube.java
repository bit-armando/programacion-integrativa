/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.ImageIcon;


/**
 *
 * @author refil
 */
public class Youtube {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Hello World!");
        conectorDB sel = new conectorDB("SELECT * FROM usuariotest;");
    }
}
//        S3.Upload("perrito.jpg", "C:\\Users\\refil\\Downloads\\perrito.jpg");
//    String url = "jdbc:mysql://sql5.freesqldatabase.com:3306/sql5688754?zeroDateTimeBehavior=CONVERT_TO_NULL [sql5688754 on Default schema]"; //El signo de interrogacion indica que inserta un archivo
//    String user = "sql5688754";
//    String psw = "ZcL2VkdI5s";
//    
////    try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(url, user, psw);
//            Statement stm = conn.createStatement();
//            String query = "INSERT INTO usuariotest (usuario_id, nombre_usuario, email, contrasena, total_video, imagen_usuario) VALUES (valor1, 'valor2', 'valor3', 'valor4', valor5, 'valor6');";
//            ResultSet rs = stm.executeQuery(query);
//            if(rs.next()){
//                byte[] img = rs.getBytes("foto");
//                ImageIcon ramgen_db = new ImageIcon(img);
//                Image im_db = ramgen_db.getImage();
//                Image im_escala = im_db.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
//                ImageIcon im_out = new ImageIcon(im_escala);
//                this.jLabel1.setIcon(im_out);
//            }
            /*
            FileInputStream fileinput = new FileInputStream(this.file);
            long size = this.file.length();
            p_stm.setBinaryStream(1, fileinput, size);
            p_stm.executeUpdate();
            System.out.print("Imagen insertada");
            */
//        } catch (SQLException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        }
        // hacer un select *
        /*
        String query2 = "SELECT * FROM Perfil"; //ejemplo de query a una tabla
        ResultSet rs = stm.executeQuery(query2);
        if(rs.next()){
            byte[] img = rs.getBytes("Imagen");
            ImageIcon imagen_bd = new ImageIcon(img);
            Image im_bd = imagen_bd.getImage();
            Image im_escala = im_bd.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
            ImageIcon im_out = ImageIcon(im_escala);
            this.jLabel1.setIcon(im_out);
        }
        */
//    }

