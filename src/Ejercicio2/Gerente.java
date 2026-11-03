package Ejercicio2;

public class Gerente extends Empleado{

    private int sueldoBase;

    @Override
    public int calcularSueldo() {
        return sueldoBase * super.calcularSueldo();
    }

    public Gerente(String nombre, int sueldoBase, int mesesTrabajados){
        super(nombre, mesesTrabajados);
        this.sueldoBase = sueldoBase;
    }
}
