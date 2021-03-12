package model.data_structures;

import model.logic.YoutubeVideo;

public class Categoria implements Comparable<Categoria>
{
	private int id;

	private String cat;

	public Categoria(int pId, String pCategoria) 
	{
		id = pId;
		cat = pCategoria;
	}

	public int darId() 
	{
		return id;
	}

	public String darCategoria() 
	{
		return cat;
	}

	public int compareTo(Categoria o) 
	{
		return this.darCategoria().compareTo(o.darCategoria());
	}
}