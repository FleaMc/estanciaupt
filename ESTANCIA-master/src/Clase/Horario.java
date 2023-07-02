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
public class Horario {
    private int ano;
    private Periodo fkPeriodo;
    private Dia fkDia;
    private Salon fkSalon;
    private Docente fkDocente;
    private Materia fkMateria;
    private int horaInicio;
    private int horaFin;

    // Para el modelo CRUD
    
    // Registrar
    public Horario(int ano, Periodo fkPeriodo, Dia fkDia, Salon fkSalon, Docente fkDocente, Materia fkMateria, int horaInicio, int horaFin) {
        this.ano = ano;
        this.fkPeriodo = fkPeriodo;
        this.fkDia = fkDia;
        this.fkSalon = fkSalon;
        this.fkDocente = fkDocente;
        this.fkMateria = fkMateria;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    // Para pintar el horario
    public Horario(Dia fkDia, Docente fkDocente, Materia fkMateria, int horaInicio, int horaFin) {
        this.fkDia = fkDia;
        this.fkDocente = fkDocente;
        this.fkMateria = fkMateria;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Periodo getFkPeriodo() {
        return fkPeriodo;
    }

    public void setFkPeriodo(Periodo fkPeriodo) {
        this.fkPeriodo = fkPeriodo;
    }

    public Dia getFkDia() {
        return fkDia;
    }

    public void setFkDia(Dia fkDia) {
        this.fkDia = fkDia;
    }

    public Salon getFkSalon() {
        return fkSalon;
    }

    public void setFkSalon(Salon fkSalon) {
        this.fkSalon = fkSalon;
    }

    public Docente getFkDocente() {
        return fkDocente;
    }

    public void setFkDocente(Docente fkDocente) {
        this.fkDocente = fkDocente;
    }

    public Materia getFkMateria() {
        return fkMateria;
    }

    public void setFkMateria(Materia fkMateria) {
        this.fkMateria = fkMateria;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }
}
