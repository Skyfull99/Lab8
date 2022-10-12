package logicadenegocios;

import excepciones.*;

import excepciones.BookAlreadyExistException;
import excepciones.BookDoesNotExistException;
import excepciones.ClientAlreadyExistsException;
import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Libro> libros;
    private ArrayList<Autor> autores;
   
     public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    
    public Biblioteca (String pNombre){
        this.nombre = pNombre;
        clientes = new ArrayList<Cliente>();
        libros = new ArrayList<Libro>();
        autores = new ArrayList<Autor>();
    }
    
    public void registrarLibro(int pIdentificador, String pNombre, String pEditorial, int pANoPublicacion) throws BookAlreadyExistException{
        for(Libro libro : libros){
            if(libro.getIdentificador() == pIdentificador){
                throw new BookAlreadyExistException(pIdentificador);
            }
        }
        Libro libro = new Libro(pNombre, pEditorial, pANoPublicacion, pIdentificador);
        libros.add(libro);
    }
    
    public void registrarAutor(int pIdentificador, String pNombre, String pNacionalidad) throws AuthorAlreadyExistException{
        for(Autor autor : autores){
            if(autor.getIdentificador() == pIdentificador){
                throw new AuthorAlreadyExistException(pIdentificador);
            }
        } 
        Autor autor = new Autor(pIdentificador, pNombre, pNacionalidad);
        autores.add(autor);
    }
  
    public void registrarCliente(int pCedula, String pNombre, String pNacionalidad) throws ClientAlreadyExistsException{
        for(Cliente cliente : clientes){
            if(cliente.getCedula() == pCedula){
                throw new ClientAlreadyExistsException(pCedula);
            }
        }
        Cliente cliente = new Cliente(pCedula, pNombre, pNacionalidad);
        clientes.add(cliente);
  }

    public void prestarLibro(int pIdentificador, int pCedula) throws ClientDoesNotExistException, BookDoesNotExistException{
        Libro testLibro = null;
        Cliente testCliente = null;
        for(Cliente cliente : clientes){ 
            for(Libro libro : libros){
                if(libro.getIdentificador() == pIdentificador && cliente.getCedula() == pCedula){
                    testLibro = libro;
                    testCliente = cliente;
                    cliente.registrarNuevoPrestamo(libro);
                }
            }
        }
        if(testLibro == null){
            throw new BookDoesNotExistException(pIdentificador);
        }
        if(testCliente == null){
            throw new ClientDoesNotExistException(pCedula);
        }
    }
  
    public void buscarLibro(int pIdentificador) throws BookDoesNotExistException{
        Libro test = null;
        for(Libro libro : libros){
            if(libro.getIdentificador() == pIdentificador){
                test = libro;
                System.out.println(libro.toString());
            }
        }
        if(test == null){
            throw new BookDoesNotExistException(pIdentificador);
        }
    }
  
    public void buscarCliente(int pCedula) throws ClientDoesNotExistException{
        Cliente test = null;
        for(Cliente cliente : clientes){
            if(cliente.getCedula() == pCedula){
                test = cliente;
                System.out.println(cliente.toString());
            }
        }
        if(test == null){
            throw new ClientDoesNotExistException(pCedula);
        }
    }
  
    public void buscarAutor(int pIdentificador){
        Autor test = null;
        for(Autor autor : autores){
            if(autor.getIdentificador() == pIdentificador){
                test = autor;
                System.out.println(autor.toString());
            }
        }
    }
}

