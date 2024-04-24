/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planeta;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres Astudillo
 */
public class Planeta {
    
public String nombre;
public int satelites;
public double volumen;
public double masa;
public double densidad;
public double diametro;
public double distanciaSol;
public boolean observable;

    public Planeta(String nombre, int satelites, double volumen, double masa, double densidad, double diametro, double distanciaSol, boolean observable) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.volumen = volumen;
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.observable = observable;
    }

    public String getNombre() {
        return nombre;
    }

   

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public int getSatelites() {
        return satelites;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getMasa() {
        return masa;
    }

    public double getDensidad() {
        return densidad;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public boolean isObservable() {
        return observable;
    }
    
    


    public void calcularDensidad(){   
           setDensidad(this.masa / this.volumen);
    }
    
public void imprimirCaracteristicas() {
    JOptionPane.showMessageDialog(null,
        "El planeta: " + getNombre() + "\n" +
        "Tiene " + getSatelites() + " Satelites\n" +
        "Tiene un volumen de: " + getVolumen() + "\n" +
        "Una Masa de: " + getMasa() + "\n" +
        "Una Densidad de " + getDensidad() + "\n" +
        "Una Diamtetro de " + getDiametro() + "\n" +
        "y Esta a " + getDistanciaSol() + " del Sol"
    );
}

}
