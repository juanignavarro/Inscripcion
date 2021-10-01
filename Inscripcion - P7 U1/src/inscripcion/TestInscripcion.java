package inscripcion;


public class TestInscripcion {

  
    public static void main(String[] args) {
        Materia ingles = new Materia(5, "Ingles", 1);
        Materia mate = new Materia(2, "Matematica", 1);
        Materia lab = new Materia(4, "Laboratorio I", 1);
        
        Alumno a1 = new Alumno(1001, "Martin", "Lopez");
        Alumno a2 = new Alumno(1002, "Brenda", "Martinez");
        Alumno a3 = new Alumno(1001, "Pedro", "Funez");
        
        /*a1.agregarMateria(ingles);
        a1.agregarMateria(mate);
        a1.agregarMateria(lab);
        
        a2.agregarMateria(ingles);
        a2.agregarMateria(mate);
        a2.agregarMateria(lab);
        a2.agregarMateria(lab);
        
        System.out.print(a1.getNombre()+" "+a1.getApellido()+" esta insripto a: ");
        for (Materia mat : a1.getMaterias()) {
            System.out.print(mat.getNombre()+", ");
        }
        
        System.out.println("");
        
        System.out.print(a2.getNombre()+" "+a2.getApellido()+" esta insripto a: ");
        for (Materia mat : a2.getMaterias()) {
            System.out.print(mat.getNombre()+", ");
        }*/
        
        System.out.println(a1.equals(a3));
    }
    
}
