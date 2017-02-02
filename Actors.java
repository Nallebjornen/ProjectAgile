public class Actors{

    String name, birthplace, date_of_birth, participating_in_movies;
    int unique_ID;

    public Actors(String name, String birthplace, String date_of_birth, String participating_in_movies, int unique_ID){
        this.name = name;
        this.birthplace = birthplace;
        this.date_of_birth = date_of_birth;
        this.participating_in_movies = participating_in_movies;
        this.unique_ID = unique_ID;
    }

    public String name(){
      return name;
    }
    public String birthplace(){
      return birthplace;
    }
    public String date_of_birth(){
      return date_of_birth;
    }
    public String participating_in_movies(){
      return participating_in_movies;
    }
    public int unique_ID(){
      return unique_ID;
    }

}
