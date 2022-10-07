package logicadenegocios;


public class Libro {
    private String nombre;
    private String editorial;
    private int aNoPublicacion;
    private int identificador;
    private int cantidadEjemplares = 1;
    private Autor autores;
    
    public Libro(String pNombre, int pIdentificador, Autor pAutor){
        setNombre(pNombre);
        setIdentificador(pIdentificador);
        setAutor(pAutor);
    }
    
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setEditorial(String pEditorial){
        editorial = pEditorial;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public void setAnoPublicacion(int pAnoPublicacion){
        aNoPublicacion = pAnoPublicacion;
    }
    
    public int getAnoPublicacion(){
        return aNoPublicacion;
    }
    
    public void setIdentificador(int pIdentificador){
        identificador = pIdentificador;
    }
    
    public int getIdentificador(){
        return identificador;
    }
    
    public void setCantidadEjemplares(int pCantEjemplares){
        cantidadEjemplares = pCantEjemplares;
    }
    
    public int getCantidadEjemplares(){
        return cantidadEjemplares;
    }
    
    public void setAutor(Autor pAutor){
        autores = pAutor;
    }
    
    public Autor getAutor(){
        return autores;
    }
}
