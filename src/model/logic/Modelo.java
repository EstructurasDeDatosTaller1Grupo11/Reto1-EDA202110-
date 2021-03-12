package model.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.data_structures.ArregloDinamico;
import model.data_structures.Categoria;
import model.data_structures.IArregloDinamico;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
  int tamanioMaxCategorias = 0;
  int tamanioMaxVideos = 0;
  ArregloDinamico<Categoria> categorias = new ArregloDinamico<Categoria>(tamanioMaxCategorias);
  ArregloDinamico<YoutubeVideo> videos = new ArregloDinamico<YoutubeVideo>(tamanioMaxVideos);

  public Modelo(String pRutaVideos, String pRutaCategorias) throws FileNotFoundException, IOException, ParseException {
    cargarVids(pRutaVideos);
    cargarCategorias(pRutaCategorias);
  }

  public ArregloDinamico darMasVistos(String catNombre, String country, int numVids) {
    ordenarPorTendencia();
    ArregloDinamico<YoutubeVideo> resp = new ArregloDinamico<YoutubeVideo>(0);
    Categoria cat = buscarCategoria(catNombre);
    for (int i = 0; i < tamanioMaxVideos && i < numVids; i++) {
      YoutubeVideo videoActual = (YoutubeVideo) videos.darElemento(i);
      if (videoActual.darCategoria() == cat.darId()) {
        if (videoActual.darPais().equals(country))
          resp.agregar(videoActual);
      }
    }
    return resp;
  }

  public void cargarVids(String pRuta) throws FileNotFoundException, IOException, ParseException {
    File f = new File(pRuta);
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
      videos.agregar(vid);
      tamanioMaxVideos++;
      linea = br.readLine();
    }
  }

  public void cargarCategorias(String pRuta) throws IOException, FileNotFoundException {
    File f = new File(pRuta);
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    String linea = br.readLine();
    while (linea != null) {
      String[] info = linea.split(" ");
      Categoria cat = new Categoria(Integer.parseInt(info[0]), info[1]);
      categorias.agregar(cat);
      tamanioMaxCategorias++;
      linea = br.readLine();
    }
  }

  public Categoria buscarCategoria(String catNombre) {
    for (int i = 0; i < tamanioMaxCategorias; i++) {
      Categoria catActual = (Categoria) categorias.darElemento(i);
      if (catActual.darCategoria().equals(catNombre)) {
        return catActual;
      }
    }
    return null;
  }

  public void ordenarPorTendencia() {
    for (int i = 0; i < tamanioMaxVideos - 1; i++) {
      for (int j = 0; j < tamanioMaxVideos - i - 1; j++) {
        if (videos.darElemento(j).darViews() < videos.darElemento(1 + j).darViews()) {
          videos.exchange(j, 1 + j);
        }
      }
    }
  }

  public void darTrendingPorPais(String pPais) {
    Date mejorTrend = null;
    YoutubeVideo videoTrend = null;
    for (int i = 0; i < tamanioMaxVideos; i++) {
      YoutubeVideo actual = (YoutubeVideo) videos.darElemento(i);
      if (actual.darPais() == pPais) {
        if (actual.darTrending().compareTo(mejorTrend) == 1) {
          mejorTrend = actual.darTrending();
          videoTrend = actual;
        }
      }
      System.out.println(videoTrend.darTitle());
      System.out.println(videoTrend.darChannel());
      System.out.println(videoTrend.darPais());
      System.out.println(videoTrend.darTrending());
    }
  }
}
