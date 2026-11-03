package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[4];

        empleados[0] = new Vendedor("Juan", 500000, 12,2000);
        empleados[1] = new Gerente("Pedro",1500000,6);
        empleados[2] = new Vendedor("Ana",500000,24,2000);
        empleados[3] = new Gerente("Pancho", 1500000,24);

        int totalDeSueldos = 0;

        for(Empleado e : empleados){
            totalDeSueldos += e.calcularSueldo();
        }

        System.out.println("El total de los sueldos es de: "+ totalDeSueldos);

    }
}
