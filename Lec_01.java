// Исключения — это специальный тип объектов, которые создаются при
// возникновении ошибочной ситуации и выбрасываются Java-машиной.

// Код ошибки — целочисленный код, указывающий на причину ошибки. Для
// разных приложений — разные коды ошибок.

// Откуда берутся ошибки:
// 1. Разработчик не учёл ситуацию, которая привела к ошибке.
// 2. При работе приложения внешняя среда так изменила состояние,
// что программа не может дальше корректно выполнять операцию.
// 3. В используемых библиотеках есть баги, которые не позволяют
// корректно выполнять задачу.

// бросить исключение - используется ключевое слово throw («бросить»)

import java.io.File;

public class Lec_01 {
  public static void main(String[] args) {

    // ArithmeticException  -  / by zero
    int a = 0;
    int b = 10;

    int c=b/a;
    System.out.println(c);

    // NullPointerException
    String str = null;
    //System.out.println(str.length());

    // ArrayIndexOutOfBoundsException
    int[] array = new int[10];
    // array[100] = 5;

  }

  public static long getFileLength (String path) {
    File file = new File(path);
    if (!file.exists()) {
      return -1;
    }
    return file.length();
  }

  public static int div(int a, int b) {
    if (b == 0) {
      return -1;
    }
    return a / b;
  }
}