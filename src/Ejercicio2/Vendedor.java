package Ejercicio2;

public class Vendedor extends Empleado{

    private int comision;
    private int sueldoBasico;

    @Override
    public int calcularSueldo() {
        return (comision + sueldoBasico) * super.calcularSueldo();
    }

    public Vendedor(String nombre, int sueldoBasico, int mensesTrabajados, int comision){
        super(nombre,mensesTrabajados);
        this.comision = comision;
        this.sueldoBasico = sueldoBasico;
    }
}
