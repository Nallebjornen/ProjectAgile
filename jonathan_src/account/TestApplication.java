package account;
import java.util.ArrayList;
import java.util.Scanner;

public class TestApplication {

  ArrayList<Account> accounts;
  public final String[] authorization_codes = {"ABCDEFG", "ZYXWVU", "A1B2C3D4"};
  public TestApplication(){
    accounts = new ArrayList<Account>();
  }

  public void runApplication(){
    boolean running = true;
    Scanner sc = new Scanner(System.in);
    while (running){
      System.out.println("Testing the account function");
      System.out.println("1. Create Account" + "\n" + "2. List Accounts" + "\n"
                          + "3. Quit");
      byte command = sc.nextByte();
      switch (command) {
        case 1: accounts.add(createAccount());
                break;
        case 2: listAccounts();
                break;
        case 3: sc.close();
                System.out.println("Quitting...");
                running = false;
                break;
        default: System.out.println("Invalid entry. Enter new command");
      }
    }
  }

  //Från Account START
  public Account createAccount(){
    Scanner sc = new Scanner(System.in);
    String email, username, password;
    System.out.println("Enter your username: ");
    //if (sc.hasNext()){
      username = sc.next();
    //}
    //else username = "Username fail";
    System.out.println("Enter your email: ");
/*
    do{
      email = sc.next();
      checkEmail(email);
    }while (checkEmail(email)==false);
    */
    //if (sc.hasNext()){
      email = sc.next(); //Lägg till check för om addressen är rätt formaterad
    //}
    //else email = "Email fail";
    //password = ""; //Se slutet av enterAccountPassword
    //do{
      password = enterAccountPassword();
    //}while (password == "");
    Account preAccount = new Account(username, password, email);
    Account newAccount = null;
    int createAccountChoice = 0;
    String attempted_authorization_code;
    boolean found_authorization_code = false;
    boolean accountFinished = false;
    do{
      System.out.println("What kind of account?" + "\n" + "1. User" + "\n" + "2. Admin"
                           + "\n" + "3. Cancel");
      createAccountChoice = sc.nextInt();
      switch (createAccountChoice){
        case 1: System.out.println("Enter authorization code:");
                attempted_authorization_code = sc.nextLine();
                for (int i = 0; i < authorization_codes.length; i++){
                  if (authorization_codes[i].equals(attempted_authorization_code)){
                    found_authorization_code = true;
                  }
                }
                if (found_authorization_code){
                  Admin newAdmin = new Admin(preAccount.getUsername(), preAccount.getPassword(),
                                              preAccount.getEmail());
                  newAccount = newAdmin;
                  return newAccount;
                }
                break;
        case 2: User newUser = new User(preAccount.getUsername(), preAccount.getPassword(),
                                    preAccount.getEmail());
                newAccount = newUser;
                return newAccount;
        case 3: System.out.println("Returning to main menu");
                accountFinished = true;
                break;
        default: System.out.println("Invalid entry");
                 break;
      }
      //sc.close();
    }while(accountFinished = false);
    return newAccount; //Det slutgiltiga kontot som returneras
  }

  //UNDANLAGD TILLS VIDARE
  private String enterAccountEmail(){
    Scanner sc = new Scanner(System.in);
    String email;
    boolean checked;
    email = sc.next();
    return email;
    /*
    checked = checkEmail(email);
    if (checked == true){
      return email;
    }
    else {
      System.out.println("Invalid email. Please re-enter:" + "\n");
      enterAccountEmail();
    }
    return "enterAccountEmail FAIL";
    */
  }
  //UPPREPAD I Account; VÄLJ EN OCH TA BORT DEN ANDRA
  private String enterAccountPassword(){
      Scanner sc = new Scanner(System.in);
      String firstPW, secondPW;
      System.out.println("Enter your password: ");
      if (sc.hasNext()){
        firstPW = sc.next();
      }
      else firstPW = "Password fail";
      System.out.println("Enter your password again for confirmation: ");
      if (sc.hasNext()){
        secondPW = sc.next();
      }
      else secondPW = "Password fail";
      if (firstPW.compareTo(secondPW) == 0){
        //sc.close();
        return firstPW;
      }
      else{
        //sc.reset();
        System.out.println("Passwords do not match. Please re-enter");
        enterAccountPassword();
      }
      return ""; //Kan vara anledningen till att intryckningen upprepas en gång för mycket vid felskrevning
  }
  //Från Account SLUT

  public Account logIn(Account active_account){
    //accounts
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the username you want to log in to:");
    String attempted_username = sc.nextLine();
    boolean found_username = false;
    Account dummy = null; //Försök till pekare ("pointer"); ej säkert att det fungerar
    //ERSÄTT SÖKNING MED EN MAP DÄR USERNAME ÄR KEY OCH VALUE ÄR ACCOUNT
      for (int i = 0; i<accounts.size(); i++){
        if (accounts.get(i).getUsername().equals(attempted_username)){ //Hittar ej inlagt användarnamn
          dummy = accounts.get(i);
          //Skrivs inte ut
          //System.out.println("Debug: username found: " + accounts.get(i) + " VS " + attempted_username);
          found_username = true;
        }
      }
      //System.out.println("Debug: found_username: " + found_username);
      if (found_username){
        System.out.println("Please enter your password:");
        int attempts = 0;
        do{
          String attempt_password = sc.nextLine();
          if (attempt_password.equals(dummy.getPassword())){
            return dummy;
          }
          attempts++;
          if (attempts>0){
            System.out.println((3 - attempts) + " attempts left");
          }
        }while (attempts<3);
      }
      System.out.println("Failed to log in.");
      return active_account;
  }

  public void listAccounts(){
    if (accounts.size()>0){
    int i = 1;
    for (Account a : accounts){
      System.out.println("Account " + i + ":" + "\n" + a + "\n");
      i++;
      }
    }
    else System.out.println("No accounts stored");
  }

  private boolean checkEmail(String email){
    boolean checkAt, checkDot;
    //START checkAt (kollar @)
    if (!email.contains("@")){
      return false;
    }

    System.out.println("debug: finns @:" + email);
    if (email.charAt(0) != '@' && email.charAt(email.length()-1) != '@'){
        ;
    } else {
      System.out.println("debug: uh oh");
      return false;
    }
    //SLUT checkAt
    //START checkDot (kollar punktens placering)
    if (email.contains(".")){
      System.out.println("debug: finns .");
      System.out.println("debug: .:" +email.charAt(0) );
      System.out.println("debug: .:" + email.indexOf('@') );
      System.out.println("debug: .:" +  email.lastIndexOf('.'));
      if (email.charAt(0) != '.' && email.indexOf('@')<email.lastIndexOf('.')){
        System.out.println("debug: TRUE");
        return true;
      }
    }
    System.out.println("debug: FALSE");

    return false;
  }

  public void addCreatedAccount(Account account){
    accounts.add(account);
  }
}
