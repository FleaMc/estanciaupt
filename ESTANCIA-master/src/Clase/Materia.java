/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.awt.Color;

/**
 *
 * @author Geovanni
 */
public class Materia {
    private String nombre;
    private Color color;

    public Materia(String nombre, Color color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
