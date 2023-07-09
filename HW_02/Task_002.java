package HW_02;

public class Task_002 {
  public static void main(String[] args) {
    int[] intArray = new int[9]; // не был инициализирован массив

    try {
    int d = 0;
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
      System.out.println("Catching exception: " + e);
    }

  }
}
