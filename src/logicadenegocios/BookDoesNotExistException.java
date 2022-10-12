package logicadenegocios;

import java.io.*;

public class BookDoesNotExistException extends Exception{
  private int identificador;

  public BookDoesNotExistException(int pIdentificador){
    this.identificador = pIdentificador;
  }

  public int getIdentificador(){
    return this.identificador;
  }
}
