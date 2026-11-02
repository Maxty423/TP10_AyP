package Ejercicio1;

public class Auto extends Vehiculo{

    private int puertas;

    @Override
    public void describirse() {
        System.out.println("Soy un "+getMarca()+", mi velocidad maxima es de "+getVelocidadMaxima()+", y tengo "+puertas+" puertas.");
    }

    public Auto(String marca, int velocidadMaxima, int puertas){
        super(marca, velocidadMaxima);
        this.puertas = puertas;
    }
}
