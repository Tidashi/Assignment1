//The program takes number from the user as a string then is put through a checker to check if each charachter is a digit. If the string is a number it will then run a for loop based on the string length to print each charachter from the end to the begining otherwise it will print "Not a number". 
import java.util.*;
class Tjahjo_Problem4 {
  public static void main(String[] args) {  
    Scanner scrn = new Scanner(System.in);
    boolean isNumber = true;
    System.out.println("Enter a number");
    String straight = scrn.nextLine();
    for(int p = 0; p < straight.length(); p++){
      if(!Character.isDigit(straight.charAt(p))){
        isNumber = false;
        break;
      }
    }
    if(isNumber){
    for(int i = straight.length()-1; i >= 0; i--){
      System.out.print(straight.charAt(i));
    }
    }else{
      System.out.println("Not a  number");
    }
    
  }
  
}