/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author Geovanni
 */
public class Alumno extends Usuario{

    public Alumno(int pkId, String nombre, String contrasena, Estatus fkEstatus) {
        super(pkId, nombre, contrasena, TipoDeUsuario.Alumno, fkEstatus);
    }
    
}
