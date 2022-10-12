package logicadenegocios;

import java.util.Date;


public class Prestamo {
    private Libro libro;
    private Cliente cliente;
    private Date fechaPrestamo;
    private Date fechaEntraga;
    
    public Prestamo(Libro pLibro, Cliente pCliente){
        this.libro = pLibro;
        this.cliente = pCliente;
    }
    
    public String getNombre(){
        return this.cliente.getNombre();
    }
  
    public int getIdentificador(){
        return this.libro.getIdentificador();  
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaEntraga() {
        return fechaEntraga;
    }
    
    public String toString(){
        String msg;
        msg = "\nLibro: " + getIdentificador();
        msg += "\nCliente: " + getNombre();
        msg += "\nFecha de prestamo: " + getFechaPrestamo();
        msg += "\nFecha de entrega: " + getFechaEntraga();
        return msg;
  }
}
