public class Movie
{
  private String title;
  private double duration;
  private int rating;


  /*** Constructor ***/
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }

  /*** Accessors ***/
  public String getTitle()
  {
    return title;
  }

  public double getDuration()
  {
    return duration;
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

  public void setDuration(double d)
  {
    duration = d;
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
  public boolean equals(Movie m){
    return this.title.equals(m.title) && this.duration == m.duration && this.rating == m.rating;
  }

  /*** toString method ***/
  public String toString(){
    String info = "\"" + title + "\", duration " + duration;
    if (rating != 0){
      info += ", rating is " + rating;
    }
    return info;
  }
}
