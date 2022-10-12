package logicadenegocios;


public class Autor {
    private int identificador;
    private String nombre;
    private String nacionalidad;

    public Autor(int identificador, String nombre, String nacionalidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
  
    public String toString(){
        String msg;
        msg = "\nNombre: " + getNombre();
        msg += "\nNacionalidad: " + getNacionalidad();
        msg += "\nIdentificador: " + getIdentificador();
        return msg;
    }
}
