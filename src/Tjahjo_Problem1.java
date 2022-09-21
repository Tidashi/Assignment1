// There is an if statement to check if minutes is greater than 10 or not to determine whether a 0 needed to be included for the print statemet. The program uses a while loop because the program is not sure exactly how many times the snippet of code needs to subtract from 60 before it can print.
import java.util.*;
class Tjahjo_Problem1 {
  public static void main(String[] args) {
    Scanner scrn = new Scanner(System.in);
    int hours = 0;
    System.out.println("Provide an integer of minutes");
    int min = scrn.nextInt();
    while(min > 60){
      min -=60;
      hours++;
    }
    if(min < 10){
      System.out.println(hours + ": 0" + min);
    }else{
    System.out.println(hours + ":" + min);
    }
  }
}