
package escueladigit;

import alumnos.Alumno;
import docente.Docente;

/* @author estela */
public class EscuelaDigit {

    
    public static void main(String[] args) {
        Docente docente1 = new Docente(12,"Estela","Gallardo",15);
        Alumno alumno = new Alumno(14,"Agustina","gomez",25,10);
        Campus campus = new Campus(14,"Web");
        campus.setPassword("123456");
        Campus docente = new Campus(12,"Web");
        docente.setPassword("13579");
        System.out.println(docente.ingresar(12, "13579"));
    
    }
    
}
