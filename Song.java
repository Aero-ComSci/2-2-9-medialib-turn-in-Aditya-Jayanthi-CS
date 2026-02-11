public class Song
{
  private String title;
  private int rating;


  /*** Constructor ***/
  public Song(String t)
  {
    title = t;
    rating = 0;
  }

  /*** Accessors ***/
  public String getTitle()
  {
    return title;
  }

  public int getRating()
  {
    return rating;
  }

  /*** Mutators ***/
  public void setTitle(String t)
  {
    title = t;
  }

  public void setRating(int r)
  {
    rating = r;
  }

  public void adjustRating(int change)
  {
    int newRating = rating + change;
    if (newRating >= 0 && newRating <= 10)
    {
      rating = newRating;
    }
  }

  /*** equals method ***/
  public boolean equals(Song s){
    return this.title.equals(s.title) && this.rating == s.rating;
  }

  /*** toString method ***/
  public String toString(){
    String info = "\"" + title + "\", rating " + rating;
    if (rating != 0){
      info += ", rating is " + rating;
    }
    return info;
  }
}
