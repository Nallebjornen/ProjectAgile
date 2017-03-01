package content;
import java.util.ArrayList;
import people.Actors;
import random.*;
import review.Review;
public class Movies extends Media{ //extends Media

  /*
  String title,genre,language,plot,director,scriptwriter;
  String release_dates;
  byte age_limit;
  short year;
  int id_nr;
  ArrayList<Actors> cast;
  ArrayList<Review> reviews;
  */
    public Movies(String title, String genre, String language, String plot,
                  String director, String scriptwriter, String release_dates,
                  byte age_limit, short year){
        super(title,genre,language,plot,director,scriptwriter,release_dates,age_limit,year);
        //System.out.println("super called");
        /*
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
        reviews = new ArrayList<Review>();
        */
    }
    public String title(){
      return super.title();
    }
    public String genre(){
      return super.genre();
    }
    public String language(){
      return super.language();
    }
    public String plot(){
      return super.plot();
    }
    public String director(){
      return super.director();
    }
    public String scriptwriter(){
      return super.scriptwriter();
    }
    public int id_nr(){
      return super.id_nr();
    }
    public String release_dates(){
      return super.release_dates();
    }
    public byte age_limit(){
      return super.age_limit();
    }
    public short year(){
      return super.year();
    }
    public ArrayList<Review> reviews(){
      return super.reviews();
    }
    public void addReview(Review review){
      super.addReview(review);
    }
    public void addActorToCast(Actors a){
      super.addActorToCast(a);
    }
    @Override
    public String toString(){
      return super.toString();
/*
      return "Title: " + title + "\n" + "Production year: " + year + "\n" + "Genre: " + genre + "\n" +
      "Language: " + language + "\n" + "Plot: " + plot + "\n" + "Directed by: " + director + "\n"
      + "Written by: " + scriptwriter + "\n" + "Release: " + release_dates +
       "\n" + "Age Limit: " + age_limit + "\n" + "ID Nr.: " + id_nr + "\n"
        + "------";
        */
    }
}
