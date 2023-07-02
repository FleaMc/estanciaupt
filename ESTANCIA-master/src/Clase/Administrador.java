/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import Modelo.BaseDeDatos;
import Vista.VAdmAdministrarHorarios;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovanni
 */
public class Administrador extends Usuario{

    public Administrador(int pkId, String nombre, String contrasena) {
        super(pkId, nombre, contrasena, TipoDeUsuario.Administrador, Estatus.Activo);
    }
    
    public static void registrarMateria(Materia materia){
        try {
            Connection conexion = BaseDeDatos.getConnection();
            
            PreparedStatement prStmt = conexion.prepareStatement("INSERT INTO Materias(Nombre, ColorRed, ColorGreen, ColorBlue) VALUES(?, ?, ?, ?);");
            prStmt.setString(1, materia.getNombre());
            prStmt.setInt(2, materia.getColor().getRed());
            prStmt.setInt(3, materia.getColor().getGreen());
            prStmt.setInt(4, materia.getColor().getBlue());
            
            prStmt.executeUpdate();
            
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar el registro");
        }
    }
    
    public static void modificarMateria(Materia materiaModificada){
        try {
            Connection conexion = BaseDeDatos.getConnection();
            
            PreparedStatement prStmt = conexion.prepareStatement("UPDATE Materias SET ColorRed = ?, ColorGreen = ?, ColorBlue = ? WHERE Nombre = ?;");
            prStmt.setInt(1, materiaModificada.getColor().getRed());
            prStmt.setInt(2, materiaModificada.getColor().getGreen());
            prStmt.setInt(3, materiaModificada.getColor().getBlue());
            prStmt.setString(4, materiaModificada.getNombre());
            
            prStmt.executeUpdate();
            
            conexion.close();
            JOptionPane.showMessageDialog(null, "Modificación realizada con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la modificación");
        }
    }
    
    public static void eliminarMateria(Materia materia){
        try {
            Connection conexion = BaseDeDatos.getConnection();
            
            PreparedStatement prStmt = conexion.prepareStatement("DELETE FROM Materias WHERE Nombre = ?;");
            prStmt.setString(1, materia.getNombre());
            
            prStmt.executeUpdate();
            
            conexion.close();
            JOptionPane.showMessageDialog(null, "Baja exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la baja");
        }
    }
    
    public static void registrarUsuario(Usuario usuario){
        try {
            Connection conexion = BaseDeDatos.getConnection();
            
            PreparedStatement prStmt = conexion.prepareStatement("INSERT INTO Usuarios(pkId, Nombre, Contrasena, fkTipo, fkEstatus, fkEstado) VALUES(?, ?, ?, ?, ?, ?);");
            prStmt.setInt(1, usuario.getPkId());
            prStmt.setString(2, usuario.getNombre());
            prStmt.setString(3, usuario.getContrasena());
            prStmt.setString(4, usuario.getFkTipo()+"");
            prStmt.setString(5, usuario.getFkEstatus()+"");
            prStmt.setString(6, Estado.Activo+"");
            
            prStmt.executeUpdate();
            
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo realizar el registro");
        }
    }
    
    public static void modificarUsuario(Usuario usuarioModificado){
        try {
            Connection conexion = BaseDeDatos.getConnection();
            
            PreparedStatement prStmt = conexion.prepareStatement("UPDATE Usuarios SET Nombre = ?, Contrasena = ? WHERE pkId = ?;");
            prStmt.setString(1, usuarioModificado.getNombre());
            prStmt.setString(2, usuarioModificado.getContrasena());
            prStmt.setInt(3, usuarioModificado.getPkId());
            
            prStmt.executeUpdate();
            
            conexion.close();
            JOptionPane.showMessageDialog(null, "Modificación realizada con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la modificación");
        }
    }
    
    public static void establecerEstatusDeUsuario(Alumno alumno){
        try {
            Connection conexion = BaseDeDatos.getConnection();
            
            PreparedStatement prStmt = conexion.prepareStatement("UPDATE Usuarios SET fkEstatus = ? WHERE pkId = ?;");
            prStmt.setString(1, alumno.getFkEstatus()+"");
            prStmt.setString(2, alumno.getPkId()+"");
            
            prStmt.executeUpdate();
            
            conexion.close();
            String mensaje = alumno.getFkEstatus() == Estatus.Activo ? "Suspensión retirada" : "Alumno suspendido";
            JOptionPane.showMessageDialog(null, mensaje);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo suspender al alumno");
        }
    }  
    
    public static void establecerEstadoDeUsuario(Usuario usuario){
        try {
            Connection conexion = BaseDeDatos.getConnection();
            
            PreparedStatement prStmt = conexion.prepareStatement("UPDATE Usuarios SET fkEstado = ? WHERE pkId = ?;");
            prStmt.setString(1, usuario.getFkEstado()+"");
            prStmt.setInt(2, usuario.getPkId());
            
            prStmt.executeUpdate();
            
            conexion.close();
            String mensaje = usuario.getFkEstado() == Estado.Activo ? "Usuario restaurado" : "Baja exitosa";
            JOptionPane.showMessageDialog(null, mensaje);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la baja");
        }
    }
    
    public static void registrarHorario(Horario horario){
        try {
            BaseDeDatos bd = new BaseDeDatos();
            bd.abrirConexion();
            ResultSet rs = bd.consultarSiMateriaEnHorarioSeCruzaConOtra(horario);
            rs.next();
            int numMateriasCruzadas = rs.getInt(1);
            System.out.println(numMateriasCruzadas);
            bd.cerrarConexion();
            Connection conexion = BaseDeDatos.getConnection();
            PreparedStatement prStmt;
            boolean continuarConRegistro = true;
            
            if (numMateriasCruzadas > 0) {
                int confirmacion = JOptionPane.showConfirmDialog(null, "La materia que intenta registrar se cruza con " + numMateriasCruzadas + " materia(s) ¿Desea borrar la(s) otra(s) materias para registrar la nueva materia?", "Materias cruzadas", JOptionPane.OK_CANCEL_OPTION);
                if (confirmacion == 0) {
                    // Se borrar con las que se cruza
                    prStmt = conexion.prepareStatement("DELETE FROM Horario WHERE fkSalon = ? AND fkDia = ? AND fkPeriodo = ? AND Ano = ? AND (HoraInicio BETWEEN ? AND ? OR HoraFin BETWEEN ? AND ?);");
                    prStmt.setString(1, horario.getFkSalon() + "");
                    prStmt.setString(2, horario.getFkDia() + "");
                    prStmt.setString(3, horario.getFkPeriodo() + "");
                    prStmt.setInt(4, horario.getAno());
                    prStmt.setInt(5, horario.getHoraInicio());
                    prStmt.setDouble(6, horario.getHoraFin() - 0.99);
                    prStmt.setDouble(7, (horario.getHoraInicio() + 0.1));
                    prStmt.setDouble(8, horario.getHoraFin());

                    prStmt.executeUpdate();
                } else {
                    continuarConRegistro = false;
                }
            }

            if (continuarConRegistro) {
                prStmt = conexion.prepareStatement("INSERT INTO Horario(Ano, fkPeriodo, fkDia, fkSalon, fkDocente, fkMateria, HoraInicio, HoraFin) VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
                prStmt.setInt(1, horario.getAno());
                prStmt.setString(2, horario.getFkPeriodo() + "");
                prStmt.setString(3, horario.getFkDia() + "");
                prStmt.setString(4, horario.getFkSalon() + "");
                prStmt.setString(5, horario.getFkDocente().getPkId() + "");
                prStmt.setString(6, horario.getFkMateria().getNombre() + "");
                prStmt.setInt(7, horario.getHoraInicio());
                prStmt.setInt(8, horario.getHoraFin());

                prStmt.executeUpdate();

                conexion.close();

                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo realizar el registro");
        }
    }
    
    public static void vaciarHorario(Horario horario) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de elminiar el horario del salon " + horario.getFkSalon() + " periodo " + horario.getFkPeriodo() + " del año " + horario.getAno() + "?", "Vaciar horario", JOptionPane.OK_CANCEL_OPTION);
        if (confirmacion == 0) {
            try {
                Connection conexion = BaseDeDatos.getConnection();
                PreparedStatement prStmt = conexion.prepareStatement("DELETE FROM Horario WHERE fkSalon = ? AND fkPeriodo = ? AND Ano = ?;");
                prStmt.setString(1, horario.getFkSalon() + "");
                prStmt.setString(2, horario.getFkPeriodo() + "");
                prStmt.setInt(3, horario.getAno());

                prStmt.executeUpdate();
                
                conexion.close();

                JOptionPane.showMessageDialog(null, "Horario vaciado con exito");
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "No se pudo vacíar el horario");
            }
        }
    }
    
    public static void agregarSoftwareEnComputadora(Computadora computadora, String software) {
        try {
            // falta validar que no exista el software ya en la computadora
            Connection conexion = BaseDeDatos.getConnection();
            PreparedStatement prStmt = conexion.prepareStatement("INSERT INTO Computador_Software(Computadora, Software) VALUES(?, ?);");
            prStmt.setString(1, computadora.getPkId());
            prStmt.setString(2, software);

            prStmt.executeUpdate();

            conexion.close();

            JOptionPane.showMessageDialog(null, "Se registro correctamente la adición del software al PC");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    public static void retirarSoftwareEnComputadora(Computadora computadora, String software) {
        try {
            Connection conexion = BaseDeDatos.getConnection();
            PreparedStatement prStmt = conexion.prepareStatement("DELETE FROM Computador_Software WHERE Computadora = ? AND Software = ?;");
            prStmt.setString(1, computadora.getPkId());
            prStmt.setString(2, software);

            prStmt.executeUpdate();

            conexion.close();

            JOptionPane.showMessageDialog(null, "Se quitó correctamente el software al PC");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    public static void registrarSoftware(String software){
        try {
            Connection conexion = BaseDeDatos.getConnection();
            
            PreparedStatement prStmt = conexion.prepareStatement("INSERT INTO Software(Software) VALUES('"+software+"');");
            
            prStmt.executeUpdate();
            
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo realizar el registro");
        }
    }
    
    public static void eliminarSoftware(String software){
        try {
            Connection conexion = BaseDeDatos.getConnection();
            
            PreparedStatement prStmt = conexion.prepareStatement("DELETE FROM Software WHERE Software = '"+software+"';");
            
            prStmt.executeUpdate();
            
            conexion.close();
            JOptionPane.showMessageDialog(null, "Baja exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la baja");
        }
    }
    
    public static void modificarComputadora(Computadora computadoraModificada){
        try {
            Connection conexion = BaseDeDatos.getConnection();
            
            PreparedStatement prStmt = conexion.prepareStatement("UPDATE Computadoras SET MouseDescripcion = ?, MouseNumSerie = ?, TecladoDescripcion = ?, TecladoNumSerie = ?, MonitorDescripcion = ?, MonitorNumSerie = ?, ProcesadorDescripcion = ?, ProcesadorNumSerie = ?, RamDescripcion = ?, RamNumSerie = ?, AlmacenamientoDescripcion = ?, AlmacenamientoNumSerie = ? WHERE pkId = ?;");
            prStmt.setString(1, computadoraModificada.getMouse().getDescripcion());
            prStmt.setString(2, computadoraModificada.getMouse().getNumSerie());
            prStmt.setString(3, computadoraModificada.getTeclado().getDescripcion());
            prStmt.setString(4, computadoraModificada.getTeclado().getNumSerie());
            prStmt.setString(5, computadoraModificada.getMonitor().getDescripcion());
            prStmt.setString(6, computadoraModificada.getMonitor().getNumSerie());
            prStmt.setString(7, computadoraModificada.getProcesador().getDescripcion());
            prStmt.setString(8, computadoraModificada.getProcesador().getNumSerie());
            prStmt.setString(9, computadoraModificada.getRam().getDescripcion());
            prStmt.setString(10, computadoraModificada.getRam().getNumSerie());
            prStmt.setString(11, computadoraModificada.getAlmacenamiento().getDescripcion());
            prStmt.setString(12, computadoraModificada.getAlmacenamiento().getNumSerie());
            prStmt.setString(13, computadoraModificada.getPkId());
            
            prStmt.executeUpdate();
            
            conexion.close();
            JOptionPane.showMessageDialog(null, "Modificación realizada con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la modificación");
        }
    }
}
