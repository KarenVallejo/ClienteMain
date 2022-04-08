package mx.com.gm.clientemain;


import java.util.Date;
import mx.com.gm.clientemain.Viaje;
/**
 *
 * @author KAREN
 */
public class ViajeFamiliar extends Viaje {
    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    
 /**
 * Cantidad de integrantes de la familia
 */
 //private int familia;

     
 //Constructor getters and setters
 @Override
 public String descripcion() {
 return "Viaje para disfrutar con toda tu familia";
 }
 @Override
 public String cualquierMetodo2() {
 return "Método implementado en la clase hija viaje familiar";
 }
}