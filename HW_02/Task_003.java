package HW_02;

import java.io.FileNotFoundException;

public class Task_003 {
  public static void main(String[] args) throws Throwable { // исправлено на класс - родитель (является суперклассом всех ошибок и исключений), т.к. класс Exception - предок Throwable

    try {
      int a = 90;
      int b = 3;
      System.out.println(a / b);
      printSum(23, 234);

      int[] abc = { 1, 2 };
      abc[3] = 9;
    } catch (NullPointerException ex) {
      System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) { // перемещено в конец, т.к. ловит все возможные ошибки и исключения
    System.out.println("Что-то пошло не так...");
    }
  }
  public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    System.out.println(a + b);
  }
}
