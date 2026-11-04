package Ejercicio5;

public class Estudiante implements Comparable<Estudiante>{

    private String nombre;
    private int promedio;


    public String getNombre(){
        return nombre;
    }

    @Override public int compareTo(Estudiante otro){
        return otro.promedio - this.promedio;
    }

    @Override public String toString(){
        return nombre;
    }

    public Estudiante(String nombre, int promedio){
        this.nombre = nombre;
        this.promedio = promedio;
    }

}