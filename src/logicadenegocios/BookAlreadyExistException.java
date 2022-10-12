package logicadenegocios;

import java.io.*;

public class BookAlreadyExistException extends Exception {
  private int identificador;

  public BookAlreadyExistException(int pIdentificador){
    this.identificador = pIdentificador;
  }

  public int getIdentificador(){
    return this.identificador;
  }
}
