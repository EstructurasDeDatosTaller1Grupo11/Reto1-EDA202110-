package model.logic;

public class YoutubeVideo implements Comparable<YoutubeVideo>
{
	private int tendencia;
	
	public int darTendencia()
	{
		return tendencia;
	}

	public int compareTo(YoutubeVideo otro) 
	{
		if(this.darTendencia() < otro.darTendencia())
			return -1;
		if(this.darTendencia() == otro.darTendencia())
		    return 0;
		else
			return 1;
	}

}
