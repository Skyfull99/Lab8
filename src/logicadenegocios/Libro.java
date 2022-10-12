package logicadenegocios;


public class Libro {
    private String nombre;
    private String editorial;
    private int aNoPublicacion;
    private int identificador;
    private int cantidadEjemplares = 1;

    public Libro(String nombre, String editorial, int aNoPublicacion, int identificador) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.aNoPublicacion = aNoPublicacion;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getaNoPublicacion() {
        return aNoPublicacion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }
  
    public String toString(){
        String msg;
        msg = "\nNombre: " + getNombre();
        msg += "\nEditorial: " + getEditorial();
        msg += "\nAño de publicación: " + getaNoPublicacion();
        msg += "\nIdefntificador: " + getIdentificador();
        msg += "\nCantidad de ejemplares: " + getCantidadEjemplares();
        return msg;
    }
}
