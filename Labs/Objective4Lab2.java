import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //TODO prompt the user to get input for all of the above int variables.
    System.out.println("Please enter the first whole number you would like to add.");
    num1 = input.nextInt();
    System.out.println("Please enter the second whole number you would like to add.");
    num2 = input.nextInt();
    System.out.println("Please enter the third whole number you would like to add.");
    num3 = input.nextInt();
    //TODO prompt the user to get input for all of the above double variables.
    System.out.println("Please enter the first decimal number you would like to add.");
    dub1 = input.nextDouble();
    System.out.println("Please enter the second decimal number you would like to add.");
    dub2 = input.nextDouble();
    System.out.println("Please enter the third decimal number you would like to add.");
    dub3 = input.nextDouble();
    //TODO print the three ints and their sum.
    System.out.println("The sum of "+ num1 +" + "+ num2 +" + "+ num3 +" = "+ (int)(num1+num2+num3) );
    //TODO print the three doubles and their sum.
    System.out.println("The sum of "+ dub1 +" + "+ dub2 +" + "+ dub3 +" = "+ (double)(dub1+dub2+dub3));

  }
}
