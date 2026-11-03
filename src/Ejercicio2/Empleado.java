package Ejercicio2;

public abstract class Empleado {

    //atributos.
    private String nombre;
    private int mesesTrabajados;

    //métodos.
    public int calcularSueldo(){
        return mesesTrabajados;
    }

    public Empleado(String nombre, int mesesTrabajados){
        this.nombre = nombre;
        this.mesesTrabajados = mesesTrabajados;
    }
}