// 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package HW_01;

public class Task_001 {
  public static void main(String[] args) {
    
    // divZero();

    // int[] array = null;
    // nullPointer(array);

    // arrIndexOutOfBounds();

    strPparseInt("12fg");
  }

  // ArithmeticException  -  / by zero
  public static void divZero() {
    int a = 0;
    int b = 10;
    int c=b/a;
    System.out.println(c);
  }

  // NullPointerException
  public static int nullPointer(int[] array) {
    return array.length;
  }

  // ArrayIndexOutOfBoundsException
  public static void arrIndexOutOfBounds() {
    int[] array = new int[3];
    array [5] = 99;
  }

  // NumberFormatException
  public static void strPparseInt(String a) {
    int result = Integer.parseInt(a);
    System.out.println(result);
  }
}
