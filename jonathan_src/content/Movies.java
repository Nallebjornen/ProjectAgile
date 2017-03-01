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

    //Returfunktioner
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
    public ArrayList<Actors> cast(){
      return super.cast();
    }
    //Tilläggsfunktioner
    public void addReview(Review review){
      super.addReview(review);
    }
    public void addActorToCast(Actors a){
      super.addActorToCast(a);
    }

    //Ändringsfunktioner
    public void changeTitle(String title){
      this.title = title;
    }
    public void changeYear(int year){
      short new_year = (short)year;
      this.year = new_year;
    }
    public void changePlot(String plot){
      this.plot = plot;
    }
    public void changeGenre(String genre){
      this.genre = genre;
    }
    public void changeLanguage(String language){
      this.language = language;
    }
    public void changeDirector(String director){
      this.director = director;
    }
    public void changeScriptwriter(String scriptwriter){
      this.scriptwriter = scriptwriter;
    }
    public void changeReleaseDate(String release_dates){
      this.release_dates = release_dates;
    }
    public void changeAgeLimit(int age_limit){
      byte new_age_limit = (byte)age_limit;
      this.age_limit = new_age_limit;
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
