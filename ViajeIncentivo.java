package mx.com.gm.clientemain;


import java.util.Date;

/**
 *
 * @author KAREN
 */
public class ViajeIncentivo extends Viaje {
 /**
 * Empresa que patrocina el viaje al empleado
 */
 private String empresa;

    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    
 //Constructor, getters and setters
 @Override
 public String descripcion() {
 return "Viaje incentivo que te envia la empresa " + empresa;
 }
 
    /**
     *
     * @return
     */
    @Override
 public String cualquierMetodo2() {
 return "Método implementado en la clase hija viaje de incentivo";
 }
}
