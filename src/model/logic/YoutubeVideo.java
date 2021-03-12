package model.logic;

import java.util.Date;

public class YoutubeVideo implements Comparable<YoutubeVideo>
{
	private String id;
	
	private Date trending;
	
	private String title;
	
	private String channel;
	
	private int categoria;
	
	private Date published;
	
	private String tags;
	
	private long views;
	
	private long likes;
	
	private long dislikes;
	
	private long comments;
	
	private String link;
	
	private String comEnabled;
	
	private String ratEnabled;
	
	private String errorRemoved;
	
	private String description;
	
	private String pais;
	
	public YoutubeVideo(String pId, Date pTrending, String pTitle, String pChannel,int pCategoria, Date pPublished, String pTags, long pViews, long pLikes, long pDislikes, long pComments, String pLink, String pComEnabled, String pRatEnabled, String pErrorRemoved, String pDescription, String pPais)
	{
		id = pId;
		trending = pTrending;
		title = pTitle;
		channel = pChannel;
		categoria = pCategoria;
		published = pPublished;
		tags = pTags;
		views = pViews;
		likes = pLikes;
		dislikes = pDislikes;
		comments = pComments;
		link = pLink;
		comEnabled = pComEnabled;
		ratEnabled = pRatEnabled;
		errorRemoved = pErrorRemoved;
		description = pDescription;
		pais = pPais;
	}
	
	public Date darTrending()
	{
		return trending;
	}
	
	public int compareTo(YoutubeVideo otro)
	{
		return trending.compareTo(otro.darTrending());
	}	

  public String darId()
  {
    return id;
  }

  public String darTitle()
  {
    return title;
  }

  public String darChannel()
  {
    return channel;
  }

  public int darCategoria()
  {
    return categoria;
  }

  public Date darPublished()
  {
    return published;
  }

  public String datTags()
  {
    return tags;
  }

  public long darViews()
  {
    return views;
  }

  public long darLikes()
  {
    return likes;
  }

  public long darDislikes()
  {
    return dislikes;
  }

  public long darComments()
  {
    return comments;
  }

  public String darLink()
  {
    return link;
  }

  public String darComEnabled()
  {
    return comEnabled;
  }

  public String darRatEnabled()
  {
    return ratEnabled;
  }

  public String darErrorRemoved()
  {
    return errorRemoved;
  }

  public String darDescription()
  {
    return description;
  }

  public String darPais()
  {
    return pais;
  }
}
