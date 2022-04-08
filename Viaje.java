/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.clientemain;

import java.util.Date;



public abstract class Viaje {

   

   
    private String origen;
    private String destino;
    private int costo;
    private Date fechaSalida;
    private Date fechaLlegada;
    
    //Cliente Main
    
    
    // Constructores, getters y setters
    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }
     /**
     * @param origen the origen to set
     */
    
    
     
    public abstract String descripcion();
    
    public String cualquierMetodo(){
        return "Cualquier método implementado en la clase base";
    }
    
    public String cualquierMetodo2() {
        return "Cualquier método2 implementado en la clase base";
    }

    
     public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    
    
}

