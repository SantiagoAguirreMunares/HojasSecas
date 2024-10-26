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
public class Factura {
    private String numFactura;
    private Date fechaFactura;
    private Propiedad propiedad;
    private Propietario propietario;
    private double valorAPagar;
    private Date fechaMaxPago;
    private String infoPago;

    public Factura(String numFactura, Date fechaFactura, Propiedad propiedad, double valorAPagar, Date fechaMaxPago, String infoPago) {
        this.numFactura = numFactura;
        this.fechaFactura = fechaFactura;
        this.propiedad = propiedad;
        this.propietario = propietario;
        this.valorAPagar = valorAPagar;
        this.fechaMaxPago = fechaMaxPago;
        this.infoPago = infoPago;
    }

    public void generarFactura() {
        System.out.println("Factura generada con número: " + numFactura);
    }

    public void actualizarDeuda(double nuevaDeuda) {
        this.valorAPagar = nuevaDeuda;
    }

    public boolean verificarPago() {
        return valorAPagar == 0;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
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

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public Date getFechaMaxPago() {
        return fechaMaxPago;
    }

    public void setFechaMaxPago(Date fechaMaxPago) {
        this.fechaMaxPago = fechaMaxPago;
    }

    public String getInfoPago() {
        return infoPago;
    }

    public void setInfoPago(String infoPago) {
        this.infoPago = infoPago;
    }

}

