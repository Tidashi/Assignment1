//There is an if statemt to check if the previous statment came back true. The program uses a for loop for most of them to check each charachter of a string whether to check for spaces, length size, uppercase, special charachters, and consecutive digits.
import java.util.Scanner;

class Tjahjo_ProblemBonus {
  public static void main(String[] args) {
    Scanner scrn = new Scanner(System.in);
    String GamerPassword = scrn.nextLine();
    Boolean isValid = true;
    if(isValid){
    for(int i = 0; i < GamerPassword.length();i++ ){ //checks if it has spaces
      if(GamerPassword.contains(" ")){
        System.out.println("password contains space");
        isValid = false;
        break;
      }
    }
    }
    
    if(isValid){
       isValid = false;
    if(GamerPassword.length() >= 6 && GamerPassword.length() <= 9){ //checks the length of the password 
      isValid = true;
    }
     }
     if(isValid){
    for(int j = 0; j < GamerPassword.length(); j++){ //checks for upercase
      isValid = false;
      if (Character.isUpperCase(GamerPassword.charAt(j))){
        isValid = true;
        break;
      }
      System.out.println("no uppercase");
    }
     }
     if(isValid){ //checks for special character
       for(int p = 0; p < GamerPassword.length(); p++){
         if(!Character.isDigit(GamerPassword.charAt(p)) && !Character.isLetter(GamerPassword.charAt(p))){
           isValid = false;
           System.out.println("has special charachter" + GamerPassword.charAt(p));
           break;
         }
       }
     }
    if(isValid){ //checks if password has digits and has cosecutive digit
        for(int v = 0; v < GamerPassword.length() -1; v++){
          if(Character.isDigit(GamerPassword.charAt(v)) && Character.isDigit(GamerPassword.charAt(v+1))){
            int first = GamerPassword.charAt(v);
            int second = GamerPassword.charAt(v+1);
            if(first - second == -1 || first-second == 1){
              isValid = false;
              System.out.println("no number or consecutive");
              break;
            }
          }
        } 
       }
    
    if(isValid){
      System.out.println("Password is valid");
    }else{
      System.out.println("Password is inValid");
    }
  }
}