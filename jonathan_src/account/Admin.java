package account;
public class Admin extends Account{

  int id_nr;
  String username, password, email;

/*
  public Account login(String username, String password){

  }
*/
  private Admin(String username, String password, String email){
    super(username, password, email);
  }

  public void manageAccount(){

  }

  private void changePassword(){

  }
  private void changeEmail(){

  }

  public int getID(){
    return id_nr;
  }

  public String getUsername(){
    return username;
  }

  private String getPassword(){
    return password;
  }

  private String getEmail(){
    return email;
  }
  /*
  private String enterAccountPassword(){
    super.enterAccountPassword();
  }
  */
}
