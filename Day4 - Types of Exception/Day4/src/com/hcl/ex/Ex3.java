package com.hcl.ex;

public class Ex3 {
  /**
 * The main entry point.
 * @param email has the email
 * @throws InvalidEmailException throws InvalidEmailException
 * @throws InvalidUserNameException throws InvalidUserNameException
 */
  public void checkemail(String email) throws InvalidEmailException, InvalidUserNameException {
    // boolean flag=true;
    if (email.indexOf("@") == -1) {
      // flag=false;
      throw new InvalidEmailException("Invalid Email@not found");
    }
    if (email.indexOf("@") > 12) {
      // flag=false;
      throw new InvalidUserNameException("Invalid user");
    }
    System.out.println("email " + email);
  }
  /**
 * The main entry point.
 * @param args has the args
 */
  
  public static void main(String[] args) { 
    String email = "hcl@gmail.com";
    try { 
      new Ex3().checkemail(email);
    } catch (Exception e) { 
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  } 
}
