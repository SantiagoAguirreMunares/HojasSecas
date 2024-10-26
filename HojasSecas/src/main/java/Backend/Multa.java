/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
import java.util.Date;
/**
 *
 * @author santi
 */
public class Multa {
    private String numMulta;
    private Date fechaMulta;
    private EspacioComun espacioComun;
    private Propiedad propiedad;
    private Propietario propietario;
    private String evento;
    private String descripcion;
    private double valorAPagar;
    private Date fechaLimite;
    private String observacion;
    private String evidencia;

    public Multa(String numMulta, Date fechaMulta, Propiedad propiedad, Propietario propietario, double valorAPagar, Date fechaLimite, String descripcion) {
        this.numMulta = numMulta;
        this.fechaMulta = fechaMulta;
        this.propiedad = propiedad;
        this.propietario = propietario;
        this.valorAPagar = valorAPagar;
        this.fechaLimite = fechaLimite;
        this.descripcion = descripcion;
    }

    public void generarMulta() {
        System.out.println("Multa generada: " + numMulta + " con monto: " + valorAPagar);
    }

    public boolean verificarMulta() {
        Date ahora = new Date();
        return ahora.before(fechaLimite);
    }

    public String getNumMulta() {
        return numMulta;
    }

    public void setNumMulta(String numMulta) {
        this.numMulta = numMulta;
    }

    public Date getFechaMulta() {
        return fechaMulta;
    }

    public void setFechaMulta(Date fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    public EspacioComun getEspacioComun() {
        return espacioComun;
    }

    public void setEspacioComun(EspacioComun espacioComun) {
        this.espacioComun = espacioComun;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
    }

}

