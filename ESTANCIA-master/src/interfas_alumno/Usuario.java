/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfas_alumno;

/**
 *
 * @author xcheko51x
 */
public class Usuario {
    private String Id;
    private String TipoUsuario;
    private String Nombre;
    private String Contraseña;
    private String Estado;

    public Usuario(String Id, String TipoUsuario, String Nombre, String Contraseña, String Estado) {
        this.Id = Id;
        this.TipoUsuario = TipoUsuario;
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
        this.Estado = Estado;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    

   

   
    
    
}
