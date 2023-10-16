import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int diamondSize = scanner.nextInt();
    if (diamondSize % 2 == 0) {
      for (int i = 0; i < diamondSize; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
    }
  }
}
