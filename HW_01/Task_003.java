// 3) (Дополнительно) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

package HW_01;

import java.util.Arrays;
import java.util.Random;

public class Task_003 {
  static Random random = new Random();
  public static void main(String[] args) {
    System.out.println();
    int[] array01 = createArray();
    int[] array02 = createArray();
    System.out.println(Arrays.toString(array01));
    System.out.println(Arrays.toString(array02));

    int[] result = divide(array01, array02);
    if (result != null) {
      System.out.println("Result:");
      System.out.println(Arrays.toString(result));
    }
  
  }

  public static int[] createArray() {
    int[] arr = new int[random.nextInt(2,4)];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(4);
    }
    return arr;
  }

  public static int[] divide(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length];
    if (arr1.length != arr2.length) {
      System.out.println("Длины массивов не равны.");
      result = null;
    }else {
      for (int i = 0; i < arr1.length; i++) {
        if (arr2[i] == 0) {
          System. out.println("Элемент в массива-делителе равен 0.");
          result = null;
          break;
        }else {
          result[i] = arr1[i] / arr2[i];
        }
      }
    }
    return result;
  }
}
