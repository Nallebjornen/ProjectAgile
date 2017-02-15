package content;
import java.util.ArrayList;
import people.Actors;
import random.*;
public class Movies{ //extends Media

  String title,genre,language,plot,director,scriptwriter;
  String  release_dates;
  byte age_limit;
  short year;
  int id_nr;
  ArrayList<Actors> cast;

    public Movies(String title, String genre, String language, String plot,
                  String director, String scriptwriter, String release_dates,
                  byte age_limit, short year){
        //super(title,genre,language,plot,director,scriptwriter,release_dates,age_limit,year);

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
    @Override
    public String toString(){
      return "Title: " + title + "\n" + "Production year: " + year + "\n" + "Genre: " + genre + "\n" +
      "Language: " + language + "\n" + "Plot: " + plot + "\n" + "Directed by: " + director + "\n"
      + "Written by: " + scriptwriter + "\n" + "Release: " + release_dates +
       "\n" + "Age Limit: " + age_limit + "\n" + "ID Nr.: " + id_nr;
    }
}
