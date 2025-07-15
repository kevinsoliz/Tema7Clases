package Actividades;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Texto {
    private final byte LONG_MAX;
    private String texto;
    private String vocales = "aeiouAEIOU";
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

    public Texto(byte LONG_MAX) {
        this.LONG_MAX = LONG_MAX;
        fechaCreacion = LocalDateTime.now();
        texto = "";
        fechaActualizacion = null;
    }

    public void addPrincipio(char c) {
        if (texto.length() <= LONG_MAX)
            texto = c + texto;
        fechaActualizacion = LocalDateTime.now();
    }

    public void addFinal(char c) {
        if (texto.length() <= LONG_MAX)
            texto = c + texto;
        fechaActualizacion = LocalDateTime.now();
    }

    public void addPrincipio(String cadena) {
        if (texto.length() + cadena.length() <= LONG_MAX )
            texto = cadena + texto;
        fechaActualizacion = LocalDateTime.now();
    }

    public void addFinal(String cadena) {
        if (texto.length() + cadena.length() <= LONG_MAX)
            texto = cadena + texto;
        fechaActualizacion = LocalDateTime.now();
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public byte contarVocales() {
        byte vocales = 0;
        for(int i = 0; i < texto.length(); i++) {
            if (esVocal(texto.charAt(i)))
                vocales++;
        }
        return vocales;
    }

    private boolean esVocal(char c) {
        boolean esVocal = false;
        for (int i = 0; i < vocales.length(); i++) {
            if(vocales.charAt(i) == c)
                esVocal = true;
        }
        return esVocal;
    }

    public void mostrarInfo(){
        System.out.println("Texto: " + texto
                            + "\nFecha creacion: " + getFechaCreacion()
                            + "\nFecha actualizacion: " + getFechaActualizacion());
    }
}
