package account;
import content.Movies;
import people.Actors;
import java.util.ArrayList;

import java.util.Scanner;

public class Account{

  int id_nr;
  String username, password, email;
  //Account login();
  protected Account(String username, String password, String email){
    this.username = username;
    this.password = password;
    this.email = email;
  }
  /*
  //Från Account START
  public Account createAccount(){
    Scanner sc = new Scanner(System.in);
    String email, username, password;
    System.out.println("Enter your username: ");
    username = sc.nextLine();
    System.out.println("Enter your email: ");
    email = sc.nextLine(); //Lägg till check för om addressen är rätt formaterad
    password = "";
    do{
      enterAccountPassword();
    }while (password == "");
    Account newAccount = new Account(username, password, email);
    sc.close();
    return newAccount;
  }
  //UPPREPAD I TestApplication; VÄLJ EN OCH TA BORT DEN ANDRA

  private String enterAccountPassword(){
      Scanner sc = new Scanner(System.in);
      String firstPW, secondPW;
      System.out.println("Enter your password: ");
      firstPW = sc.nextLine();
      System.out.println("Enter your password again for confirmation: ");
      secondPW = sc.nextLine();
      if (firstPW == secondPW){
        sc.close();
        return firstPW;
      }
      else{
        sc.reset();
        System.out.println("Passwords do not match. Please re-enter");
        enterAccountPassword();
      }
      return "";
  }
  */
  //Från Account SLUT

  private void manageAccount(){

  }

  private int getID(){
    return id_nr;
  }

  private String getUsername(){
    return username;
  }

  private String getPassword(){
    return password;
  }

  private String getEmail(){
    return email;
  }

  public Movies addMovie(){
    String title, genre, language, plot, director, scriptwriter, release_dates;
    byte age_limit;
    short year;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a title:");
    title = sc.next();
    System.out.println("Please choose a genre:");
    genre = sc.next();
    System.out.println("Please choose a language:");
    language = sc.next();
    System.out.println("Please provide a brief plot summary:");
    plot = sc.next();
    System.out.println("Please enter the name of the director:");
    director = sc.next();
    System.out.println("Please enter the name of the screenwriter:");
    scriptwriter = sc.next();
    //cast = sc.next;
    System.out.println("Please enter a release date (YYYY-MM-DD):");
    release_dates = sc.next();
    System.out.println("Please enter the movie's age limit:");
    age_limit = sc.nextByte();
    System.out.println("Please enter the movie's production year:");
    year = sc.nextShort();
    Movies m = new Movies(title, genre, language, plot, director, scriptwriter, release_dates, age_limit, year);
    return m;
    /*
    (String title,String genre,String language,String plot,
                  String director,String scriptwriter,String release_dates,
                  byte age_limit,short year)
    */
  }

  public Actors addActor(){
    String name, birthplace, date_of_birth;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the actor's name");
    name = sc.next();
    System.out.println("Please enter the actor's date of birth (YYYY-MM-DD):");
    date_of_birth = sc.next();
    System.out.println("Please enter the actor's place of birth:");
    birthplace = sc.next();
    Actors a = new Actors(name, birthplace, date_of_birth);
    return a;
  }
  @Override
  public String toString(){
    return "Username: " + getUsername() + "\n" +
          "Email: " + getEmail() + "\n" +
          "Password: " + getPassword();
  }
}
