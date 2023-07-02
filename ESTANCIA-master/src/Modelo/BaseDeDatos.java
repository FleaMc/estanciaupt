package Modelo;

import Clase.Computadora;
import Clase.Estado;
import Clase.Horario;
import Clase.Periodo;
import Clase.Salon;
import Clase.TipoDeUsuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Geovanni
 */
public class BaseDeDatos {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String RUTA = "jdbc:mysql://localhost/administracion_de_laboratorios_2";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "12345";
        
    private Connection connection;
    
    public static Connection getConnection() {
        Connection c = null;
        try {
            Class.forName(DRIVER);
            c = DriverManager.getConnection(RUTA, USUARIO, PASSWORD);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos");
        }
        return c;
    }
    
    public void abrirConexion() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(RUTA, USUARIO, PASSWORD);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudó cerrar la conexión a la base de datos");
        }
    }
    
    public void cerrarConexion() {
        try {
            connection.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudó cerrar la conexión a la base de datos");
        }
    }
    
    private ResultSet consultar(String instruccionSql, String entidadConsultada) {
        ResultSet rs = null;
        try {
            connection = getConnection();
            
            Statement st;
            st = connection.createStatement();
            
            rs = st.executeQuery(instruccionSql);
            
            //No se cierra la conexión aquí por que el result set que devuelve ya no se podría usar
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: No se pudó realizar la consulta de " + entidadConsultada);
        }
        return rs;
    }
    
    // Consulta de alumnos activos
    public ResultSet consultarAlumnos() {
        String instruccion = "SELECT pkId, Nombre, Contrasena, fkEstatus FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Alumno + "' AND fkEstado = '" + Estado.Activo + "';";
        return consultar(instruccion, TipoDeUsuario.Alumno+"s");
    }
    
    public ResultSet consultarAlumnosPorMatricula() {
        String instruccion = "SELECT pkId, Nombre, Contrasena, fkEstatus FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Alumno + "' AND fkEstado = '" + Estado.Activo + "' ORDER BY pkId;";
        return consultar(instruccion, TipoDeUsuario.Alumno+"s");
    }
    
    public ResultSet consultarAlumnosPorNombre() {
        String instruccion = "SELECT pkId, Nombre, Contrasena, fkEstatus FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Alumno + "' AND fkEstado = '" + Estado.Activo + "' ORDER BY Nombre;";
        return consultar(instruccion, TipoDeUsuario.Alumno+"s");
    }
    
    public ResultSet buscarAlumnos(String criterio, String textoBuscado) {
        String instruccion = "SELECT pkId, Nombre, Contrasena, fkEstatus FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Alumno + "' AND fkEstado = '" + Estado.Activo + "' AND " + criterio + " LIKE '" + textoBuscado + "'";
        return consultar(instruccion, TipoDeUsuario.Alumno+"s");
    }
    
    // Consulta de alumnos eliminados
    public ResultSet consultarAlumnosEliminados() {
        String instruccion = "SELECT pkId, Nombre, Contrasena, fkEstatus, fkEstado FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Alumno + "' AND fkEstado = '" + Estado.Eliminado + "';";
        return consultar(instruccion, TipoDeUsuario.Alumno+"s");
    }
    
    public ResultSet buscarAlumnosEliminados(String criterio, String textoBuscado) {
        String instruccion = "SELECT pkId, Nombre, Contrasena, fkEstatus, fkEstado FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Alumno + "' AND fkEstado = '" + Estado.Eliminado + "' AND " + criterio + " LIKE '" + textoBuscado + "'";
        return consultar(instruccion, TipoDeUsuario.Alumno+"s");
    }
    
    // Consulta de docentes
    public ResultSet consultarDocentes() {
        String instruccion = "SELECT pkId, Nombre, Contrasena FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Docente + "' AND fkEstado = '" + Estado.Activo + "';";
        return consultar(instruccion, TipoDeUsuario.Docente+"s");
    }
    
    public ResultSet consultarDocentesPkidYNombre() {
        String instruccion = "SELECT pkId, Nombre, Contrasena FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Docente + "' AND fkEstado = '" + Estado.Activo + "';";
        return consultar(instruccion, TipoDeUsuario.Docente+"s");
    }
    
    public ResultSet consultarDocentesPorId() {
        String instruccion = "SELECT pkId, Nombre, Contrasena FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Docente + "' AND fkEstado = '" + Estado.Activo + "' ORDER BY pkId;";
        return consultar(instruccion, TipoDeUsuario.Docente+"s");
    }
    
    public ResultSet consultarDocentesPorNombre() {
        String instruccion = "SELECT pkId, Nombre, Contrasena FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Docente + "' AND fkEstado = '" + Estado.Activo + "' ORDER BY Nombre;";
        return consultar(instruccion, TipoDeUsuario.Docente+"s");
    }
    
    public ResultSet buscarDocentes(String criterio, String textoBuscado) {
        String instruccion = "SELECT pkId, Nombre, Contrasena FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Docente + "' AND fkEstado = '" + Estado.Activo + "' AND " + criterio + " LIKE '" + textoBuscado + "'";
        return consultar(instruccion, TipoDeUsuario.Docente+"s");
    }
    
    // Consulta de alumnos eliminados
    public ResultSet consultarDocentesEliminados() {
        String instruccion = "SELECT pkId, Nombre, Contrasena, fkEstado FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Docente + "' AND fkEstado = '" + Estado.Eliminado + "';";
        return consultar(instruccion, TipoDeUsuario.Docente+"s");
    }
    
    public ResultSet buscarDocentesEliminados(String criterio, String textoBuscado) {
        String instruccion = "SELECT pkId, Nombre, Contrasena, fkEstado FROM Usuarios WHERE fkTipo = '" + TipoDeUsuario.Docente + "' AND fkEstado = '" + Estado.Eliminado + "' AND " + criterio + " LIKE '" + textoBuscado + "'";
        return consultar(instruccion, TipoDeUsuario.Docente+"s");
    }
    
    // Consulta de Materias
    public ResultSet consultarMaterias() {
        String instruccion = "SELECT Nombre, ColorRed, ColorGreen, ColorBlue FROM Materias;";
        return consultar(instruccion, "Materias");
    }
    
    public ResultSet consultarMateriasNombre() {
        String instruccion = "SELECT Nombre FROM Materias;";
        return consultar(instruccion, "Materias");
    }
    
    // Consulta de Horario
    public ResultSet consultarHorario(Salon salon, Periodo periodo, int ano) {
        String instruccion = "SELECT Horario.fkDia, Usuarios.Nombre, Horario.fkMateria, Materias.ColorRed, Materias.ColorGreen, Materias.ColorBlue, Horario.HoraInicio, Horario.HoraFin FROM Horario INNER JOIN Materias ON Horario.fkMateria = Materias.Nombre INNER JOIN Usuarios ON Horario.fkDocente = Usuarios.pkId WHERE Horario.fkSalon = '" + salon + "' AND Horario.fkPeriodo = '"+periodo+"' AND Ano = "+ ano +";";
        return consultar(instruccion, "Horario");
    }
    
    public ResultSet consultarSiMateriaEnHorarioSeCruzaConOtra(Horario horario) {
        String instruccion = "SELECT COUNT(*) FROM Horario WHERE fkSalon = '"+horario.getFkSalon()+"' AND fkDia = '"+horario.getFkDia()+"' AND fkPeriodo = '"+horario.getFkPeriodo()+"' AND Ano = "+horario.getAno()+" AND (HoraInicio BETWEEN "+horario.getHoraInicio()+" AND "+(horario.getHoraFin()-0.99)+" OR HoraFin BETWEEN "+(horario.getHoraInicio()+0.01)+" AND "+horario.getHoraFin()+");";
        System.out.println(instruccion);
        return consultar(instruccion, "Horario");
    }
    
    // Consulta de Invetario
    public ResultSet consultarInventario(Salon salon) {
        String instruccion = "SELECT pkId, fkEstatusPc, MouseDescripcion, MouseNumSerie, TecladoDescripcion, TecladoNumSerie, MonitorDescripcion, MonitorNumSerie, ProcesadorDescripcion, ProcesadorNumSerie, RamDescripcion, RamNumSerie, AlmacenamientoDescripcion, AlmacenamientoNumSerie FROM Computadoras WHERE fkSalon = '" + salon + "';";
        return consultar(instruccion, "Inventario");
    }
    
    // Consulta de software
    public ResultSet consultarSoftware() {
        String instruccion = "SELECT Software FROM Software";
        return consultar(instruccion, "Software");
    }
    
    public ResultSet consultarSoftwareDePc(Computadora computadora) {
        String instruccion = "SELECT Software FROM Computador_Software WHERE Computadora = '" + computadora.getPkId() + "';";
        return consultar(instruccion, "Software");
    }
}
