package Ejercicio5;

import java.util.Comparator;

public class PorNombre implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante a, Estudiante b){
        return a.getNombre().compareTo(b.getNombre());
    }
}