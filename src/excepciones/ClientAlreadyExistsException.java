package excepciones;

import java.io.*;

public class ClientAlreadyExistsException extends Exception{
  private int cedula;

  public ClientAlreadyExistsException(int pCedula){
    this.cedula = pCedula;
  }

  public int getCedula(){
    return this.cedula;
  }
}
