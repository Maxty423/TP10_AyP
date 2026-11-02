package Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = new Auto("Adui", 350, 3);
        vehiculos[1] = new Moto("Ducatti", 310, 937);

        for(Vehiculo a : vehiculos){
            a.describirse();
        }
    }

}