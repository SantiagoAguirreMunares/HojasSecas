/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Backend.Empleado;
import Backend.Factura;
import Backend.Multa;
import Backend.Persona;
import Backend.Propietario;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author santi
 */
public class Control {

    private List<Propietario> propietarios;
    private List<Empleado> empleados;
    private List<Factura> facturas;
    private List<Multa> multas;

    public Control() {
        propietarios = new ArrayList<>();
        empleados = new ArrayList<>();
        facturas = new ArrayList<>();
        multas = new ArrayList<>();
        cargarDatosIniciales();  
    }

    private void cargarDatosIniciales() {
    }

    public Persona login(String id, String password) {
        for (Empleado e : empleados) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        for (Propietario p : propietarios) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null; 
    }

    public Propietario buscarPropietario(String id) {
        for (Propietario p : propietarios) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void agregarPropietario(Propietario propietario) {
        propietarios.add(propietario);
    }

    public void eliminarPropietario(String id) {
        propietarios.removeIf(p -> p.getId().equals(id));
    }

    public List<Factura> obtenerFacturasPropietario(Propietario propietario) {
        List<Factura> facturasPropietario = new ArrayList<>();
        for (Factura factura : facturas) {
            if (factura.getPropiedad().getPropietario().equals(propietario.getId())) {
                facturasPropietario.add(factura);
            }
        }
        return facturasPropietario;
    }

    public List<Multa> obtenerMultasPropietario(Propietario propietario) {
        List<Multa> multasPropietario = new ArrayList<>();
        for (Multa multa : multas) {
            if (multa.getPropietario().equals(propietario.getId())) {
                multasPropietario.add(multa);
            }
        }
        return multasPropietario;
    }
}

