// 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package HW_02;

import java.util.Scanner;

public class Task_004 {
  public static void main(String[] args) throws Exception {
    inputString();
  }

  public static void inputString() throws Exception{
    System.out.println("Введите строку (пустые строки вводить нельзя)");
    Scanner scanner = new Scanner(System.in);
    String input;

    while (true) {
      input = scanner.nextLine();
      if (input.isEmpty() || input == null) {
        throw new Exception("Пустые строки вводить нельзя");
      }
      else {
        System.out.println("Введенная строка: " + input);
        break;
      }
    }
    
    scanner.close();
  } 
}
