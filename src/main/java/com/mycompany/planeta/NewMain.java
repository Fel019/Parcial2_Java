/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.planeta;

/**
 *
 * @author Andres Astudillo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Planeta Tierra = new Planeta("Tierra", 1, 1.08321, 5.9736, 0, 12742, 150000000, true);
        
        Planeta Jupiter = new Planeta("Jupiter", 1, 1.4313, 1.899, 0, 139820, 750000000, true);
        
        Tierra.calcularDensidad();        
        Jupiter.calcularDensidad();
        
        Tierra.imprimirCaracteristicas();
        Jupiter.imprimirCaracteristicas();

    }
    
}
