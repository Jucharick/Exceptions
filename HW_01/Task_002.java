// 2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый 
// массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

package HW_01;

import java.util.Random;

public class Task_002 {
  static Random random = new Random();
  public static void main(String[] args) {
    int[] array01 = createArray();
    int[] array02 = createArray();

    subtraction(array01, array02);
  }

  public static int[] createArray() {
    int[] arr = new int[random.nextInt(2,4)];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(10);
      System.out.printf("%d\t", arr[i]);
    }
    System.out.println();
    return arr;
  }

  public static int[] subtraction(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
        throw new RuntimeException("Длины массивов не равны.");
    }
    else {
      System.out.println("\nResult: ");
      int[] result = new int[arr1.length];
      for (int i = 0; i < arr1.length; i++) {
        result[i] = arr1[i] - arr2[i];
        System.out.printf("%d\t", result[i]);
      }
      return result;
    }
  }
}
