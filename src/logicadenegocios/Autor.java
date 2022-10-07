package logicadenegocios;


public class Autor {
    private int identificador;
    private String nombre;
    private String nacionalidad;
    
    public Autor(int pIdentificador, String pNombre){
        setIdentificador(pIdentificador);
        setNombre(pNombre);
    }
    
    public void setIdentificador(int pIdentificador){
        identificador = pIdentificador;
    }
    
    public int getIdentificador(){
        return identificador;
    }
    
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNacionalidad(String pNacionalidad){
        nacionalidad = pNacionalidad;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
}
