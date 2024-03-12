/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author brand
 */
public class sesion {
    
    private static String currentUser;

    public static void startSession(String username) {
        currentUser = username;
    }

    public static String getCurrentUser() {
        return currentUser;
    }
    
}
