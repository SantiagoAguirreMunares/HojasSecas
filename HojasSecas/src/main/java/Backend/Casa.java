/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
/**
 *
 * @author santi
 */
public class Casa extends Propiedad {
    private String estado; 
    private double precio;
    private String idCasa;
    private String propietario;
    private int metrosCuad;

    public Casa(String urbanizacion, String estado, double precio, String idCasa, String propietario, int metrosCuad) {
        super(urbanizacion);
        this.estado = estado;
        this.precio = precio;
        this.idCasa = idCasa;
        this.propietario = propietario;
        this.metrosCuad = metrosCuad;
    }

    @Override
    public double calcularCostoMant() {
        return metrosCuad * 10000;
    }

    @Override
    public boolean verificarDisponibilidad() {
        return estado.equals("disponible");
    }

    public void rentarCasa() {
        if (verificarDisponibilidad()) {
            estado = "rentada";
            System.out.println("Casa rentada exitosamente.");
        } else {
            System.out.println("La casa no está disponible para renta.");
        }
    }
}