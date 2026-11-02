package Ejercicio1;

public class Moto extends Vehiculo{

    private int cilindrada;

    @Override
    public void describirse() {
        System.out.println("Soy una moto, marca "+getMarca()+", mi velocidad maxima es de: "+getVelocidadMaxima()+" la cilindrada es: "+cilindrada+"cc");
    }

    public Moto(String marca, int velocidadMaxima, int cilindrada){
        super(marca, velocidadMaxima);
        this.cilindrada = cilindrada;
    }

}
