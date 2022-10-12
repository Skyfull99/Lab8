package aplbiblioteca;

import java.util.*;
import java.util.Scanner;
import logicadenegocios.*;
import excepciones.*;

public class Aplicacion{
    
    public static void main(String args[]){
        boolean continuar = true;
        Scanner entrada = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("Biblioteca");
        while(continuar){
            try{
                System.out.println("***Bienvenido a la bibliteca.***");
                System.out.println("Selecciona alguna de las siguientes opciones:");
                System.out.println("1) Registrar libro.");
                System.out.println("2) Registrar cliente.");
                System.out.println("3) Registrar autor.");
                System.out.println("4) Realizar prestamo.");
                System.out.println("5) Buscar libro.");
                System.out.println("6) Buscar cliente.");
                System.out.println("7) Buscar autor.");
                System.out.println("8) Salir.");
                int opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        try{
                            System.out.println("Ingrese el identificador del libro:");
                            int identificador = entrada.nextInt();
                            
                            System.out.println("Ingrese el nombre del libro:");
                            String nombre = entrada.nextLine();
                            
                            System.out.println("Ingrese la editorial del libro:");
                            String editorial = entrada.nextLine();
                            
                            System.out.println("Ingrese el año de publicación:");
                            int aNoPublicacion = entrada.nextInt();
                            
                            biblioteca.registrarLibro(identificador, nombre, editorial, aNoPublicacion);
                        }
                        catch(InputMismatchException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Debe ingresar solamente números.");
                        }
                        catch(BookAlreadyExistException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Dicho libro ya se encuentra registrado.");
                        }   break;
                    case 2:
                        try{
                            System.out.println("Ingrese la cédula del cliente:");
                            int cedula = entrada.nextInt();
                            
                            System.out.println("Ingrese el nombre del cliente:");
                            String nombre = entrada.nextLine();
                            
                            System.out.println("Ingrese la nacionalidad del cliente:");
                            String nacionalidad = entrada.nextLine();
                            
                            biblioteca.registrarCliente(cedula, nombre, nacionalidad);
                        }
                        catch(InputMismatchException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Debe ingresar solamente números");
                        }
                        catch(ClientAlreadyExistsException e){
                            System.out.println("\nExcepción: " + e);
                            System.out.println("Dicho cliente ya se encuentra registrado");
                        }   break;
                    case 3:
                        try{
                            System.out.println("Ingrese el identificador del autor:");
                            int identificador = entrada.nextInt();
                            
                            System.out.println("Ingrese el nombre del autor:");
                            String nombre = entrada.nextLine();
                            
                            System.out.println("Ingrese la nacionalidad del autor:");
                            String nacionalidad = entrada.nextLine();
                            
                            biblioteca.registrarAutor(identificador, nombre, nacionalidad);
                        }
                        catch(InputMismatchException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Ingrese números");
                        }
                        catch(AuthorAlreadyExistException e){
                            System.out.println("\nExcepción: " + e);
                            System.out.println("Dicho autor ya se encuentra registrado");
                        }   break;
                    case 4:
                        try{
                            System.out.println("Ingrese la cédula del cliente:");
                            int cedula = entrada.nextInt();
                            
                            System.out.println("Ingrese el identificador del libro:");
                            int identificador = entrada.nextInt();
                            
                            biblioteca.prestarLibro(identificador, cedula);
                        }
                        catch(InputMismatchException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Debe ingresar solamente números");
                        }
                        catch(ClientDoesNotExistException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Dicho cliente no se encuentra registrado");
                        }
                        catch(BookDoesNotExistException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Dicho libro no se encuentra registrado");
                        }   break;
                    case 5:
                        try{
                            System.out.println("Ingrese el identificador del libro a buscar: ");
                            int identificador = entrada.nextInt();
                            biblioteca.buscarLibro(identificador);
                        }
                        catch(InputMismatchException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Debe ingresar solamente números");
                        }
                        catch(BookDoesNotExistException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Dicho libro no existe");
                        }   break;
                    case 6:
                        try{
                            System.out.println("Ingrese la cédula del cliente a buscar:");
                            int cedula = entrada.nextInt();
                            biblioteca.buscarCliente(cedula);
                        }
                        catch(InputMismatchException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Debe ingresar solamente números");
                        }
                        catch(ClientDoesNotExistException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Dicho cliente no existe");
                        }   break;
                    case 7:
                        try{
                            System.out.println("Ingrese el identificador del autor a buscar:");
                            int identificador = entrada.nextInt();
                            biblioteca.buscarAutor(identificador);
                        }
                        catch(InputMismatchException e){
                            System.out.println("\nExcepción: " + e);
                            entrada.nextLine();
                            System.out.println("Debe ingresar solamente números");
                        }   break;
                    default:
                        System.out.println("***Gracias por usar el sistema.****");
                        System.exit(0);
                        break;
                }
            }
            catch(InputMismatchException e){
                System.out.println("\nExcepción: " + e);
                entrada.nextLine();
                System.out.println("Opción inválida, ingrese una opción valida.");
            }
        }
    }
}
