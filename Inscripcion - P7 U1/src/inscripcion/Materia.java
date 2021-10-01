/*La Materia tiene un idMateria, un nombre de la materia y año al que pertenece, 
tiene además un constructor que inicializa sus propiedades y métodos get y set para cada uno de sus atributos.*/
package inscripcion;


public class Materia {
    private int idMateria, año;
    private String nombre;
    
    public Materia(int id, String nombre, int año){
        this.idMateria=id;
        this.nombre=nombre;
        this.año=año;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", a\u00f1o=" + año + ", nombre=" + nombre + '}';
    }
    
    
}
