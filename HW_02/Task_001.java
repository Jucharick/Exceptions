// 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.


package HW_02;

import java.util.Scanner;

public class Task_001 {
  public static void main(String[] args) {
    inputFloat();
  }

  public static void inputFloat(){
    System.out.println("Введите дробное число (float): ");
    Scanner scanner = new Scanner(System.in);
    float number;

    while (true) {
      try {
        number = scanner.nextFloat();
        break;
      } catch (Exception e) {
      System.out.println("Вы ввели некоррекное значение, попробуйте еще раз, формат \"0, 00\": ");
        scanner.nextLine(); 
      }
    }
    System.out.println("Ваше число: " + number);

    scanner.close();
  }
}
