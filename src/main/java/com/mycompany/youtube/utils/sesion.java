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
    
    private static sesion instance;
    private String username;

    private sesion(String username) {
        this.username = username;
    }

    public static sesion getInstance(String username) {
        if(instance == null && username != null) {
            instance = new sesion(username);
        }
        return instance;
    }

    public String getUsername() {
        return this.username;
    }
    
}
