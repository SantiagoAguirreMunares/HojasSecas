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
public class Empleado extends Persona {
    private String cargo;
    private Date fechaInicio;
    private double calificacionServicio;

    public Empleado(String nombre, String id, String email, String celular, String cargo, Date fechaInicio, double calificacionServicio) {
        super(nombre, id, email, celular);
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
        this.calificacionServicio = calificacionServicio;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public double getCalificacionServicio() {
        return calificacionServicio;
    }

    public void setCalificacionServicio(double calificacionServicio) {
        this.calificacionServicio = calificacionServicio;
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
}
