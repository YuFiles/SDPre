import java.util.Scanner;
public class Exercise13 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Please enter the word \"wombat\": ");
    String wombat = kb.nextLine();
    boolean isWombat = (wombat == "wombat");
    System.out.println("You successfully entered the word \"wombat\": " + isWombat + "\n");

  }


}
