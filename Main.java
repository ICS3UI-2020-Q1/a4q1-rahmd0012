import java.util.Scanner;

/**
 * a program thats counts down by 5 from 100 until it reaches a user entered integer
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // create the max number for do while loop
    int start = 100;

    // declare the integer
    System.out.println("Please enter an integer to count down to");
    int randNum = input.nextInt();
    // start count down
      System.out.println("Count down:");
    // do while loop to count
    do{
      // print then number
      System.out.println(start);
      // increment the counter
      start = start - 5;
    }while(randNum <= start);
    
  }
}
