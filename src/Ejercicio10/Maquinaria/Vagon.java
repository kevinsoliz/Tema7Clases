package Ejercicio10.Maquinaria;

public class Vagon {
    private final int ID;
    private double cargaMax;
    private double cargaActual;
    private String mercancia;

    public Vagon(int id, double cargaMax, double cargaActual, String mercancia) {
        this.ID = id;
        setCargaMax(cargaMax);
        setCargaActual(cargaActual);
        setMercancia(mercancia);
    }

    public int getID() {
        return ID;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }
}
