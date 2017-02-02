public class Media{

  String title,genre,language,plot,director,scriptwriter,cast;
  int  release_dates, unique_ID;
  byte age_limit;
  short year;

  public Media(String title,String genre,String language,String plot,
  String director,String scriptwriter, String cast,
  int release_dates,int unique_ID,byte age_limit,short year){
      this.title = title;
      this.genre = genre;
      this.language = language;
      this.plot = plot;
      this.director = director;
      this.scriptwriter = scriptwriter;
      this.cast = cast;
      this.release_dates = release_dates;
      this.unique_ID = unique_ID;
      this.age_limit = age_limit;
      this.year = year;
  }

  public String title(){
    return title;
  }
  public String genre(){
    return genre;
  }
  public String language(){
    return language;
  }
  public String plot(){
    return plot;
  }
  public String director(){
    return director;
  }
  public String scriptwriter(){
    return scriptwriter;
  }
  public String cast(){
    return cast;
  }
  public int release_dates(){
    return release_dates;
  }
  public int unique_ID(){
    return unique_ID;
  }
  public byte age_limit(){
    return age_limit;
  }
  public short year(){
    return year;
  }
}
