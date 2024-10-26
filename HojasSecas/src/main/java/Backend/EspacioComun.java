/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author santi
 */
import java.util.Date;

public class EspacioComun extends Propiedad {
    private String descripcion;
    private Date horaInicio;
    private Date horaFin;
    private double costoMant;
    private int capacidadMax;

    public EspacioComun(String urbanizacion, String descripcion, Date horaInicio, Date horaFin, double costoMant, int capacidadMax) {
        super(urbanizacion);
        this.descripcion = descripcion;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.costoMant = costoMant;
        this.capacidadMax = capacidadMax;
    }

    @Override
    public double calcularCostoMant() {
        return costoMant; // Devuelve el costo de mantenimiento fijo para el espacio común
    }

    @Override
    public boolean verificarDisponibilidad() {
        Date ahora = new Date();
        return ahora.after(horaInicio) && ahora.before(horaFin);
    }
}

