package Ejercicio3;

public class Main {
    static void main(String[] args) {

        Figura[] figuras = new Figura[2];

        figuras[0] = new Cuadrado(20,20);
        figuras[1] = new Circulo(20);

        for(Figura a: figuras){
            a.describirse();
        }
    }
}