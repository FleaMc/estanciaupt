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
public class Docente extends Usuario{    

    public Docente(int pkId, String nombre, String contrasena) {
        super(pkId, nombre, contrasena, TipoDeUsuario.Docente, Estatus.Activo);
    }

    public Docente(String nombre) {
        super(nombre);
    }
    
    public Docente(int pkId) {
        super(pkId);
    }
}
