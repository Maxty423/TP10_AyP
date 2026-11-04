package Ejercicio5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante("Juan", 10);
        estudiantes[1] = new Estudiante("Ana", 9);
        estudiantes[2] = new Estudiante("Pedro", 7);

        System.out.println("PorNombre");
        Arrays.sort(estudiantes, new PorNombre());
        System.out.println(Arrays.toString(estudiantes));
        System.out.println();

        System.out.println("Por promedio:");
        Arrays.sort(estudiantes);
        System.out.println(Arrays.toString(estudiantes));
        System.out.println();

    }


}