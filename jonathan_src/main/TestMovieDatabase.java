package main;
import account.*;
import content.*;
import people.*;
import random.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class TestMovieDatabase{
  public static void main(String[] args) {
    boolean logged_in = false; //Avser inloggningsfunktion; läggs till i senare sprint
    boolean admin = false; //--""--
    boolean user = false; //--""--
    boolean running = true;
    int choice; //för menyn
    ArrayList<Movies> movies = new ArrayList<Movies>();
    ArrayList<Actors> actors = new ArrayList<Actors>();
    TestApplication ta = new TestApplication();
    Scanner sc = new Scanner(System.in);
    Account test_account = new Account("DemoAccount", "aaaeee", "who@cares.net");
    ta.addCreatedAccount(test_account);

    System.out.println("Welcome to IthsMDB!");
    System.out.println("Product of PUZZLE" + "\n" + "------");
    do{
      System.out.println("Select an action");
      System.out.println("1. My Account Information");
      System.out.println("2. Create Account");
      System.out.println("3. Log In");
      System.out.println("4. List Movies");
      System.out.println("5. List Actors");
      System.out.println("6. List Accounts");
      System.out.println("7. Add Movie");
      System.out.println("8. Add Actor");
      System.out.println("9. Delete Movie");
      System.out.println("10. Delete Actor");
      System.out.println("11. Exit");
      //try{
        choice = sc.nextInt();
/*
      }catch(InputMismatchException ime){ //försök till buggfixning; ska göra klart senare
        choice = 0;
      }
*/
      switch (choice){
        case 1: //My Account Information
          System.out.println("Work In Progress");
          break;
        case 2: //Create Account
          if (logged_in == true){
            System.out.println("Already logged in");
          }
          else{
            Account temp = ta.createAccount();
            ta.addCreatedAccount(temp);
          }
        break;
        case 3: //Log In
          System.out.println("Work In Progress");
          break;
        case 4: //List Movies
          System.out.println("Movies:");
          for (int i = 0; i < movies.size(); i++){
            System.out.println(movies.get(i));
          }
          break;
        case 5: //List Actors
        System.out.println("Actors:");
        for (int i = 0; i < actors.size(); i++){
          System.out.println(actors.get(i));
        }
          break;
        case 6: //List Accounts
          ta.listAccounts();
          break;
        case 7: //Add Movie
          //System.out.println("Work In Progress");
          Movies m = test_account.addMovie();
          movies.add(m);
          break;
        case 8: //Add Actor
          //System.out.println("Work In Progress");
          Actors a = test_account.addActor();
          actors.add(a);
          break;
        case 9: //Delete Movie
          for (int i = 0; i < movies.size(); i++){
            System.out.println(movies.get(i).title() + " (" + movies.get(i).year() + "). ID: " + movies.get(i).id_nr());
          }
          int remove_id_movie;
          boolean found_movie = false;
          System.out.println("Enter the ID of the movie to remove");
          remove_id_movie = sc.nextInt();
          for (int j = 0; j < movies.size(); j++){
            if (movies.get(j).id_nr() == remove_id_movie){
              found_movie = true;
              movies.remove(j);
            }
          }
          if (found_movie){
            System.out.println("Film removed");
          }
          else{
            System.out.println("No film with that ID");
          }
          break;
        case 10: //Delete Actor
          for (int i = 0; i < actors.size(); i++){
            System.out.println(actors.get(i).name() + ". ID: " + actors.get(i).id_nr());
          }
          int remove_id_actor;
          boolean found_actor = false;
          System.out.println("Enter the ID of the actor to remove");
          remove_id_actor = sc.nextInt();
          for (int j = 0; j < actors.size(); j++){
            if (actors.get(j).id_nr() == remove_id_actor){
              found_actor = true;
              actors.remove(j);
            }
          }
          if (found_actor){
            System.out.println("Actor removed");
          }
          else{
            System.out.println("No actor with that ID");
          }
          break;
        case 11:
          System.out.println("Bye-bye!");
          running = false;
          break;
        default:
          System.out.println("Invalid entry");
          break;
      }
    }while (running);

  }
  //(title,genre,language,plot,director,scriptwriter,cast,release_dates,age_limit,year)
/*
  public static Movies addMovie(){
    String title,genre,language,plot,director,scriptwriter,cast,release_dates;
    byte age_limit;
    short year;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a title");
    title = sc.next();
    genre = sc.next;
    language = sc.next;
    plot = sc.next;
    director = sc.next;
    scriptwriter = sc.next;
    cast = sc.next;
    release_dates = sc.next;
    age_limit = sc.nextByte();
    year = nextShort();
  }
*/
}
