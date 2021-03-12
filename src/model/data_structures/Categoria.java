package model.data_structures;

public class Categoria {
  private int id;

  private String cat;

  public Categoria(int pId, String pCategoria) {
    id = pId;
    cat = pCategoria;
  }

  public int darId() {
    return id;
  }

  public String darCategoria() {
    return cat;
  }
}