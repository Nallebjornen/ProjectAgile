package content;
import java.util.ArrayList;
import people.Actors;
public class Movies extends Media{

  String title,genre,language,plot,director,scriptwriter;
  String  release_dates;
  byte age_limit;
  short year;
  int id_nr;
  ArrayList<Actors> cast;

    public Movies(String title,String genre,String language,String plot,
                  String director,String scriptwriter,String release_dates,
                  byte age_limit,short year){
        super(title,genre,language,plot,director,scriptwriter,release_dates,age_limit,year);

    }
    @Override
    public String toString(){
      return "Title: " + title + "\n" + "Production year: " + year + "\n" + "Genre: " + genre + "\n" +
      "Language: " + language + "\n" + "Plot: " + plot + "\n" + "Directed by: " + director + "\n"
      + "Written by: " + scriptwriter + "\n" + "Release: " + release_dates +
       "\n" + "Age Limit: " + age_limit;
    }
}
