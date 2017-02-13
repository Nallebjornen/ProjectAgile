package main;
import account.*;
import content.*;
import people.*;
import random.*;
import java.util.Scanner;
import java.util.ArrayList;

public class TestMovieDatabase{
  public static void main(String[] args) {
    boolean logged_in = false;
    boolean admin = false;
    boolean user = false;
    boolean running = true;
    ArrayList<Movies> movies = new ArrayList<Movies>();
    ArrayList<Actors> actors = new ArrayList<Actors>();
    TestApplication ta = new TestApplication();
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to IthsMDB!");
    System.out.println("Product of PUZZLE" + "\n" + "------");
    do{
      System.out.println("Select an action");
      System.out.println("1. My Account Information");
      System.out.println("2. Create Account");
      System.out.println("3. Log In");
      System.out.println("3. List Movies");
      System.out.println("4. List Actors");
      System.out.println("5. List Accounts");
      System.out.println("6. Add Movie");
      System.out.println("7. Add Actor");
      int choice = sc.nextInt();
      switch (choice){
        case 1:
          System.out.println("Work In Progress");
          break;
        case 2:
          if (logged_in == true){
            System.out.println("Already logged in");
          }
          else{
            Account temp = ta.createAccount();
            ta.addCreatedAccount(temp);
          }
        break;
        case 3:
          System.out.println("Movies:");
          for (int i = 0; i < movies.size(); i++){
            System.out.println(movies.get(i));
          }
          break;
        case 4:
        System.out.println("Actors:");
        for (int i = 0; i < actors.size(); i++){
          System.out.println(actors.get(i));
        }
          break;
        case 5:
          ta.listAccounts();
          break;
        case 6:
          System.out.println("Work In Progress");
          break;
        case 7:
          System.out.println("Work In Progress");
          break;
        default:
          System.out.println("Invalid entry");
          break;
      }
    }while (running);

  }
/*
  public static Movies createMovie(){

  }

  public static Actors createActor(){

  }
*/
}
