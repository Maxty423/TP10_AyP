package Ejercicio3;

public class Circulo extends Figura{

    private final double radio;

    @Override
    public double calcularArea(){
        return (Math.PI * radio * radio);
    }

    @Override
    public void describirse(){
        System.out.printf("El area del circulo es de %.2f%n",calcularArea());
    }

    public Circulo(double radio){
        this.radio = radio;
    }

}
