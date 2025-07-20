package Practica.Ejercicio2;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx){
        x += dx;
    }

    public void desplazaY(double dy){
        y += dy;
    }

    public void desplaza(double dx, double dy){
        desplazaX(dx);
        desplazaY(dy);
    }

    public double distanciaEuclidea(Punto otro){
        double restaX = Math.pow(this.x - otro.x, 2);
        double restaY = Math.pow(this.y - otro.y, 2);
        double dEuclidea = Math.sqrt(restaX + restaY);
        return dEuclidea >= 0 ? dEuclidea : 0;
    }

    public void muestra(){
        System.out.println("X = " + this.x + " Y = " + this.y);
    }
}
