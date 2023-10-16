import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int diamondSize = scanner.nextInt(); // User enters diamond size
    scanner.close(); // Close scanner to save resources
    if (diamondSize % 2 == 0) {
      // Even diamond

      // Print top *
      for (int i = 0; i < diamondSize; i++) {
        System.out.print(" ");
      }
      System.out.print("*\n");

      // Print top half ("j" loops print spaces and asterisks, i loop is the row)
      for (int i = 1; i < diamondSize / 2; i++) {
        for (int j = diamondSize - (i * 2); j >= 0; j--) {
          System.out.print(" ");
        }
        for (int j = 0; j < i * 2; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }

      // Print bottom half
      for (int i = diamondSize / 2; i > 0; i--) {
        for (int j = diamondSize - (i * 2); j >= 0; j--) {
          System.out.print(" ");
        }
        for (int j = 0; j < i * 2; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }

      // Print bottom *
      for (int i = 0; i < diamondSize; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
    } else {
      // Odd diamond

      // Print top half
      for (int i = 0; i < diamondSize / 2; i++) {
        for (int j = diamondSize / 2 - i; j > 0; j--) {
          System.out.print(" ");
        }
        for (int j = 0; j <= i * 2; j++) {
          System.out.print("*");
        }
        System.out.println();
      }

      // Print bottom half
      for (int i = diamondSize / 2; i >= 0; i--) {
        for (int j = diamondSize / 2 - i; j > 0; j--) {
          System.out.print(" ");
        }
        for (int j = 0; j <= i * 2; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
