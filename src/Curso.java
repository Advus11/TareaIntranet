import java.util.ArrayList;

public class Curso { //clase curso
    private ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

    public Curso() { // constructor vacio (sin parametros)
    }

    public ArrayList<Alumno> getListaAlumnos() { //para obtener la lista de alumnos
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) { //setter para el atributo lista de alumnos
        this.listaAlumnos = listaAlumnos;
    }

    public boolean buscarAlumno(int run) { //busca si esta o no el alumno segun el rut
        for (int i = 0; i < getListaAlumnos().size(); i++) {
            if (getListaAlumnos().get(i).getRun() == run) {
                return true;
            }
        }
        return false;
    }
}