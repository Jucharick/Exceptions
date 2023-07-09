package HW_03;

import java.util.Scanner;

public class View {
  public static String getUserSurname() {
    System.out.println("Введите фамилию");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    scanner.close();
    return input;
  }

  public static String getUserName() {
    System.out.println("Введите имя");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    scanner.close();
    return input;
  }

  public static String getUserMiddleName() {
    System.out.println("Введите отчетсво");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    scanner.close();
    return input;
  }
}
