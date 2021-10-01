/*Un Alumno tiene un nro de legajo, un apellido, un nombre y una lista de materias en las que está inscripto; 
para ello tiene un método agregarMateria que permite inscribir al Alumno en una materia determinada (
implementar de manera tal que no deje inscribir un alumno en dos materias iguales.)
y otro método cantidadMaterias que devuelve la cantidad de materias a las que está inscripto el alumno.*/
package inscripcion;

import java.util.*;

public class Alumno {
    private int legajo;
    private String nombre, apellido;
    private List <Materia> materias = new ArrayList<>();
    
    public Alumno(int legajo, String nombre, String apellido){
        this.legajo=legajo;
        this.nombre=nombre;
        this.apellido=apellido;
    }
    
    public List<Materia> getMaterias(){
        return materias;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //método agregarMateria que permite inscribir al Alumno en una materia determinada }
    //(implementar de manera tal que no deje inscribir un alumno en dos materias iguales.)
    public boolean agregarMateria(Materia mat){
        boolean seEncuentra=false;
        if(!materias.isEmpty()){
            for (Materia materia : materias) {
                if(materia.getIdMateria()==mat.getIdMateria()){
                    seEncuentra=true;
                }
            }
        }
        if(seEncuentra){
            System.out.println("EL ALUMNO NO PUEDE INSCRIBIRSE A LA MISMA MATERIA");
            return false;
        }else{
            materias.add(mat);
            System.out.println("Materia agregada");
            return true;
        }
    }
    //cantidadMaterias que devuelve la cantidad de materias a las que está inscripto el alumno
    
    int cantidadMaterias(){
        return materias.size();
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj == null) {
            return false;
        }
        
        Alumno otro = (Alumno) obj;
        if (this.legajo == otro.legajo) {
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}