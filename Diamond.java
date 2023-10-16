import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int diamondSize = scanner.nextInt();
    if (diamondSize % 2 == 0) {
      for (int i = 0; i < diamondSize; i++) {
        System.out.print(" ");
      }
      System.out.print("*\n");
      for (int i = 1; i < diamondSize / 2; i++) {
        for (int j = diamondSize - (i * 2); j >= 0; j--) {
          System.out.print(" ");
        }
        for (int j = 0; j < i * 2; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
      for (int i = diamondSize / 2; i > 0; i--) {
        for (int j = diamondSize - (i * 2); j >= 0; j--) {
          System.out.print(" ");
        }
        for (int j = 0; j < i * 2; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    } else {
      for (int i = 0; i < diamondSize / 2; i++) {
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
