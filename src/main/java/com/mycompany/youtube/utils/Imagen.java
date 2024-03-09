package com.mycompany.youtube;

import javax.swing.*;
import java.awt.*;

public class Imagen {
    public Imagen(JLabel imagen, String url) {
        try {
            // Carga la imagen desde la URL
            ImageIcon icon = new ImageIcon(new java.net.URL(url));
            imagen.setIcon(icon);
            imagen.setIcon(new ImageIcon(icon.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        } catch (Exception e) {
            // Maneja cualquier excepción (por ejemplo, URL inválida o imagen no encontrada)
            e.printStackTrace();
            // Puedes mostrar un mensaje de error en lugar de imprimir la excepción
            // JOptionPane.showMessageDialog(null, "Error al cargar la imagen: " + e.getMessage());
        }
    }
}
