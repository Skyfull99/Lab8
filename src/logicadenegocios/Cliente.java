package logicadenegocios;
import java.util.ArrayList;

public class Cliente {
    private int cedula;
    private String nombre;
    private String nacionalidad;
    private ArrayList<Prestamo> misPrestamos;

    public Cliente(int cedula, String nombre, String nacionalidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        misPrestamos = new ArrayList<Prestamo>();
    }
  
    public void registrarNuevoPrestamo(Libro pLibro){
        Prestamo pPrestamo = new Prestamo(pLibro, this);
        this.misPrestamos.add(pPrestamo);
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void getMisPrestamos() {
        for(Prestamo prestamo: misPrestamos){
            System.out.println(prestamo.toString());
        }
    }
  
    public String toString(){
        String msg;
        msg = "\nNombre: " + getNombre();
        msg += "\nCedula: " + getCedula();
        msg += "\nNacionalidad: " + getNacionalidad();
        return msg;
    }
}
