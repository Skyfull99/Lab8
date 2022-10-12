package logicadenegocios;

import java.io.*;

public class AuthorDoesExistsException extends Exception {
  private int identificador;

  public AuthorDoesExistsException(int pIndentificador){
    this.identificador = pIndentificador;
  }

  public int getIdentificador(){
    return this.identificador;
  }
}