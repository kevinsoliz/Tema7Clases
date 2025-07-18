package Ejercicio10.Personal;

import java.util.Date;

public class JefeDeEstacion {
    private String nombre;
    final private String DNI;
    private Date fechaNombramiento;

    public JefeDeEstacion(String nombre, String DNI, Date fechaNombramiento) {
        setNombre(nombre);
        this.DNI = DNI;
        setFechaNombramiento(fechaNombramiento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public Date getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(Date fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }
}
