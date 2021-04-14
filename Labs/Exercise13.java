import java.util.Scanner;
public class Exercise13 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Please enter the word \"wombat\": ");
    String wombat = kb.nextLine();
    boolean isWombat = (wombat == "wombat");
    //This will always be false. You should use .equals() instead!
    System.out.println("You successfully entered the word \"wombat\": " + isWombat + "\n");

    System.out.print("Please DO NOT enter the word \"wombat\": ");
    String notWombat = kb.nextLine();
    boolean isNotWombat = !(notWombat.equals("wombat"));
    System.out.println("You successfully DID NOT enter the word \"wombat\": " + isNotWombat);

  }


}
