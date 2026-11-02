package Ejercicio1;

public abstract class Vehiculo {

    //Atributos.
    private String marca;
    private int velocidadMaxima;

    //Métodos a heredar.
    public void describirse(){
        System.out.println("Soy un vehiculo.");
    };
    public String getMarca(){return marca;}
    public int getVelocidadMaxima(){return velocidadMaxima;}

    //Constructor.
    public Vehiculo(String marca, int velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
}
