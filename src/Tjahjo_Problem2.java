//A number gets generated a number between 0 and 10000, using the object Random, and the user would have to guess the number. The loop doesn't end until the user guesses the number so a while loop is needed to be used then an if else runs to tell the user whether the number is higher or lower.
import java.util.*;
class Tjahjo_Problem2 {
  public static void main(String[] args) {  
    Scanner scrn = new Scanner(System.in);
    int guess;
    Random rand = new Random();
    int correct = 1 + rand.nextInt(10000);
    System.out.println("Guess my number");
    guess = scrn.nextInt();
    while(guess != correct){
      if(guess < correct){
        System.out.println("Higher!");
        guess = scrn.nextInt();
      }else{
        System.out.println("Lower!");
        guess = scrn.nextInt();
      }
    }
    System.out.println("CORRECT!!! the answer is " + correct);
  }
}