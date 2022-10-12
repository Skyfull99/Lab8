package excepciones;

import java.io.*;

public class AuthorAlreadyExistException extends Exception {
  private int identificador;

  public AuthorAlreadyExistException(int pIndentificador){
    this.identificador = pIndentificador;
  }

  public int getIdentificador(){
    return this.identificador;
  }
}
