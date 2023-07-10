package HW_03;

import java.util.Scanner;

public class View {
  public static String userInput() {
    System.out.println("Введите данные в формате: Фамилия Имя Отчество Телефон (тел без пробелов, 11 цифр)");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    scanner.close();
    return input;
  }
}
