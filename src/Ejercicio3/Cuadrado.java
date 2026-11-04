package Ejercicio3;

public class Cuadrado extends Figura {
    private final double base;
    private final double altura;

    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public void describirse(){
        System.out.printf("El area del cuadrado es de %.2f%n",calcularArea());
    }

    public Cuadrado(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

}
