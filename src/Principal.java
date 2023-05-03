public class Principal {
    public static void main(String[] args) {
        Curso ufici = crearCurso(); // crea el curso llamado ufici
        agregarAlumno(crearALumno("gustavo", "soto", 207815678, 1), ufici); // alumnos que se quieren ingresar
        agregarAlumno(crearALumno("adonis", "subiabre", 205285830, 2), ufici);
        agregarAlumno(crearALumno("erick", "soto", 206578934, 3), ufici);
        agregarAlumno(crearALumno("paolo", "paredes", 207784459, 4), ufici);
        System.out.println(ufici.buscarAlumno(205285830)); // busca al alumno por su rut
        mostrarCurso(ufici); // muestra el curso
        eliminarAlumno(3, ufici); // funcion que elimina un alumno
        mostrarCurso(ufici); // para mostrar si se elimino
        agregarAlumno(crearALumno("tomasito", "de las mercedes", 207784459, 5), ufici); //validacion de rut (repetido)
    }

    public static void mostrarCurso(Curso ufici) { // funcion que muestra el curso
        for (int i = 0; i < ufici.getListaAlumnos().size(); i++) {
            System.out.println(ufici.getListaAlumnos().get(i));
        }
    }

    public static Curso crearCurso() { //funcion que crea el curso
        Curso ufici = new Curso();
        return ufici;
    }

    public static Alumno crearALumno(String nombre, String apellido, int rut, long matri) { // funcion que te crea el alumno
        Alumno alumno1 = new Alumno(nombre, apellido, rut, matri);
        return alumno1;
    }

    public static boolean validar(Alumno alumno1, Curso curso) { // funcion que te valida si un rut es repetido o no
        for (int i = 0; i < curso.getListaAlumnos().size(); i++) {
            if (curso.getListaAlumnos().get(i).getRun() == alumno1.getRun()) {
                return true;
            }
        }
        return false;
    }

    public static void agregarAlumno(Alumno alumno, Curso curso) { // funcion que agrega un alumno ya creado a un curso
        if (validar(alumno, curso)) {
            System.out.println("Un alumno con este rut ya esta registrado");
        } else {
            curso.getListaAlumnos().add(alumno);
        }
    }

    public static void eliminarAlumno(int i, Curso curso) { //funcion que elimina un alumno de un curso
        curso.getListaAlumnos().remove(i);
    }
}