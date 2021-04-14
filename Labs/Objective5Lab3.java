import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");

      //Your solution goes here

      userNum = scanner.nextInt();
      //userNum records the number input by the user


      if (userNum > 0){
        System.out.println(userNum + " is positive");
      }

      else if(userNum < 0){
        System.out.println(userNum + " is negative");
      }

      else{
        System.out.println(userNum + " is neither positive or negative");
      }

      scanner.close();
  }
}
