package content;
import java.util.ArrayList;
import people.Actors;
import random.RandGen;
public class Media {

  String title,genre,language,plot,director,scriptwriter;
  String  release_dates;
  byte age_limit;
  short year;
  int id_nr;
  ArrayList<Actors> cast;

  public Media(String title,String genre,String language,String plot,
  String director,String scriptwriter,
  String release_dates,byte age_limit,short year){
      this.title = title;
      this.genre = genre;
      this.language = language;
      this.plot = plot;
      this.director = director;
      this.scriptwriter = scriptwriter;
      this.release_dates = release_dates;
      this.age_limit = age_limit;
      this.year = year;
      this.id_nr = RandGen.RandNum();
      cast = new ArrayList<Actors>();
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
  /*
  public String cast(){

  }
  */
  public String release_dates(){
    return release_dates;
  }
  public byte age_limit(){
    return age_limit;
  }
  public short year(){
    return year;
  }
}
