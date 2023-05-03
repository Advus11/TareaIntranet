public class Alumno { //clase alumno
    private String nombre; //inicializacion de atributos del objeto alumno
    private String apellido;
    private int run;
    private long matri;
    public Alumno() { //constructor vacio
    }

    public Alumno(String nombre, String apellido, int run, long matri) { //constructor con parametros
        setNombre(nombre);
        setApellido(apellido);
        setRun(run);
        setMatri(matri);
    }
                                //setters y getters para el objeto alumno
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

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public long getMatri() {
        return matri;
    }

    public void setMatri(long matri) {
        this.matri = matri;
    }

    public String toString() { //metodo toString para poder mostrar
        return  getNombre() + "-" + getApellido() + "-" + getRun() + "-" + getMatri();
    }
}


