package model.logic;

import model.data_structures.ArregloDinamico;
import model.data_structures.Categoria;
import model.data_structures.IArregloDinamico;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
  ArregloDinamico<Categoria> categorias[];
  ArregloDinamico<YoutubeVideo> videos[];

  public Modelo(String pRuta) {
    videos = new ArregloDinamico<YoutubeVideo>(0);
    categorias = new ArregloDinamico<Categoriaria>(0);
    cargarVids(pRuta);
    cargarCategorias(pRuta);
  }

  public ArregloDinamico darMasVistos(String catNombre, String country, int numVids) {
    ordenarPorTendencia();
    ArregloDinamico<YoutubeVideo> resp = new ArregloDinamico<YoutubeVideo>(0);
    Categoria cat = buscarCategoria(catNombre);
    for (int i = 0; i < videos.length && i < numVids; i++) {
      YoutubeVideo videoActual = videos[i].darElemento(i);
      if (videoActual.darCategoria() == cat.darId()) {
        if (videoActual.darPais().equals(country))
          resp.agregar(videoActual);
      }
    }
    return resp;
  }

  public void cargarVids(String pRuta) {
    File f = new File(ruta);
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    String linea = br.readLine();
    while (linea != null) {
      String[] info = linea.split(",");
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      YoutubeVideo vid = new YoutubeVideo(info[0], formatter.parse(info[1]), info[2], info[3],
          Integer.parseInt(info[4]), formatter.parse(info[5]), info[6], Long.parseLong(info[7]),
          Long.parseLong(info[8]), Long.parseLong(info[9]), Long.parseLong(info[10]), info[11], info[12], info[13],
          info[14], info[15], info[16]);
      videos[].class.agregar(vid);
      linea = linea.readLine();
    }
  }

  public void cargarCategorias(String pRuta) {
    File f = new File(ruta);
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    String linea = br.readLine();
    while (linea != null) {
      String[] info = linea.split(" ");
      Categoria cat = new Categoria(Integer.parseInt(info[0]), info[1]);
      categorias.class.agregar(cat);
      linea = linea.readLine();
    }
  }

  public Categoria buscarCategoria(String catNombre) {
    for (int i = 0; i < categorias.lenght; i++) {
      Categoria catActual = categorias[i].darElemento(i);
      if (catActual.darCategoria().equals(catNombre)) {
        return catActual;
      }
    }
    return null;
  }

  public void ordenarPorTendencia() {

  }
}
