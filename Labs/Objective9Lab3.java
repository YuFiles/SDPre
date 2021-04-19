import java.util.Scanner;
public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection = 0;

    while(selection != 3){
      /*
      Your solution goes here
      */
			printMenu();
			//prompts the user to type a selection
			selection = scanner.nextInt();
			//saves the selection to a variable "selection"
			switch (selection){
				case 1:
					System.out.println("Hello \n");
					break;
				case 2:
					System.out.println("Apples, Bananas, Coconut \n");
					break;
				case 3:
					System.out.println("Goodbye \n");
					break;
			}

		
		}

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }

}

