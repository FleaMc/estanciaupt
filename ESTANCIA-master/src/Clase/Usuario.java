/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import Modelo.BaseDeDatos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovanni
 */
public abstract class Usuario {
    private int pkId;
    private String nombre;
    private String contrasena;
    private TipoDeUsuario fkTipo;
    private Estatus fkEstatus;
    private Estado fkEstado;

    public Usuario(int pkId, String nombre, String contrasena, TipoDeUsuario fkTipo, Estatus fkEstatus) {
        this.pkId = pkId;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.fkTipo = fkTipo;
        this.fkEstatus = fkEstatus;
        this.fkEstado = Estado.Activo;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    public Usuario(int pkId) {
        this.pkId = pkId;
    }

    // Getters
    public int getPkId() {
        return pkId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public TipoDeUsuario getFkTipo() {
        return fkTipo;
    }

    public Estatus getFkEstatus() {
        return fkEstatus;
    }

    public Estado getFkEstado() {
        return fkEstado;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setFkEstatus(Estatus fkEstatus) {
        this.fkEstatus = fkEstatus;
    }

    public void setFkEstado(Estado fkEstado) {
        this.fkEstado = fkEstado;
    }
}
