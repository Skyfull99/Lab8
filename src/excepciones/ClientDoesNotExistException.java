package excepciones;

import java.io.*;


public class ClientDoesNotExistException extends Exception{
  private int cedula;

  public ClientDoesNotExistException (int pCedula){
    this.cedula = pCedula;
  }

  public int getCedula() {
    return this.cedula;
  }
}
