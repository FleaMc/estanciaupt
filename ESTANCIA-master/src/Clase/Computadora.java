/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author LPG-04
 */
public class Computadora {
    private String pkId;
    private Salon fkSalon;
    private EstatusPc fkEstatus;
    private Componente mouse;
    private Componente teclado;
    private Componente monitor;
    private Componente procesador;
    private Componente ram;
    private Componente almacenamiento;

    public Computadora(String pkId, Salon fkSalon, EstatusPc fkEstatus, Componente mouse, Componente teclado, Componente monitor, Componente procesador, Componente ram, Componente almacenamiento) {
        this.pkId = pkId;
        this.fkSalon = fkSalon;
        this.fkEstatus = fkEstatus;
        this.mouse = mouse;
        this.teclado = teclado;
        this.monitor = monitor;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    public Salon getFkSalon() {
        return fkSalon;
    }

    public void setFkSalon(Salon fkSalon) {
        this.fkSalon = fkSalon;
    }

    public EstatusPc getfkEstatus() {
        return fkEstatus;
    }

    public void setfkEstatus(EstatusPc estatus) {
        this.fkEstatus = estatus;
    }

    public Componente getMouse() {
        return mouse;
    }

    public void setMouse(Componente mouse) {
        this.mouse = mouse;
    }

    public Componente getTeclado() {
        return teclado;
    }

    public void setTeclado(Componente teclado) {
        this.teclado = teclado;
    }

    public Componente getMonitor() {
        return monitor;
    }

    public void setMonitor(Componente monitor) {
        this.monitor = monitor;
    }

    public Componente getProcesador() {
        return procesador;
    }

    public void setProcesador(Componente procesador) {
        this.procesador = procesador;
    }

    public Componente getRam() {
        return ram;
    }

    public void setRam(Componente ram) {
        this.ram = ram;
    }

    public Componente getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(Componente almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}
