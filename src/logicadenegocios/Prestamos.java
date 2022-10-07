package logicadenegocios;
import java.util.Date;
import java.util.Calendar;

public class Prestamos {
    private Date fechaPrestamo;
    private Date fechaEntrega;
    private Libro libro;
    
    public Prestamos(Libro pLibro){
        Date fecha = new Date();  //Crea la fecha del día del prestamo
        Date fechaDevolucion = crearFechaEntrega(fecha);  //Suma 15 días a la fecha original.
        
        setLibro(pLibro);
        setFechaPrestamo(fecha);
        setFechaEntrega(fechaDevolucion);
    }
    
    private Date getFechaPrestamo(){
        return fechaPrestamo;
    }
    
    private void setFechaPrestamo(Date pFechaPrestamo){
        fechaPrestamo = pFechaPrestamo;
    }
    
    private Date getFechaEntrega(){
        return fechaEntrega;
    }
    
    private void setFechaEntrega(Date pFechaEntrega){
        fechaEntrega = pFechaEntrega;
    }
    
    private void setLibro(Libro pLibro){
        libro = pLibro;
    }
    
    private Libro getLibro(){
        return libro;
    }
    
    private Date crearFechaEntrega(Date pFecha){  //Método para sumar 15 días a una fecha.
        Calendar c = Calendar.getInstance();
        c.setTime(pFecha);
                
        c.add(Calendar.DATE, 15);
        
        Date fechaFinal = c.getTime();
        return fechaFinal;
    }
}
