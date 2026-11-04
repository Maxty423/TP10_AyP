package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        Volador[] voladores = new Volador[2];
        voladores[0] = new Pajaro();
        voladores[1] = new Avion();

        for(Volador a: voladores){
            a.volar();
        }

    }
}