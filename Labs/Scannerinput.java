public class Objective4Lab1.java{
  public static void main(String[] args) {

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    //nextInt() for an Int
    System.out.println("You said your age is " + age);
    scanner.close();

  }
}
