import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    /*
    Your solution goes here
    */
    birthYear = input.nextInt();

    System.out.println("You were born in " + (int)(2021 - birthYear));
    input.close();
  }
}
