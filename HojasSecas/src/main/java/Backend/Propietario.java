/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
import java.util.List;

public class Propietario extends Persona {
    private String profesion;
    private String oficio;
    private double salario;
    private List<Multa> multas;

    public Propietario(String nombre, String id, String email, String celular, String profesion, String oficio, double salario, List<Multa> multas) {
        super(nombre, id, email, celular);
        this.profesion = profesion;
        this.oficio = oficio;
        this.salario = salario;
        this.multas = multas;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Multa> getMultas() {
        return multas;
    }

    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public void pagarFactura(Factura factura) {
        if (factura.verificarPago()) {
            System.out.println("La factura ya ha sido pagada.");
        } else {
            factura.actualizarDeuda(0);
            System.out.println("Factura pagada exitosamente.");
        }
    }

    public void consultarFactura(Factura factura) {
        System.out.println(factura.getInfoPago());
    }
}
