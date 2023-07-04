// Отказоустойчивые приложения — приложения, которые при
// возникновении некритичных ошибок могут продолжать свою работу

// Тип исключения:
// # ArithmeticException Арифметическая ошибка
// # ArrayIndexOutOfВoundsException Выход индекса за пределы массива
// # ClassCastException Неверное приведение типов
// # IllegalArgumentException Употребление недопустимого аргумента при вызове метода
// # IndexOutOfВoundsException Выход индекса некоторого типа за допустимые пределы
// # NullPointerException Обращение к несуществующему объекту
// # NumberFormatException Неверное преобразование символьной строки в числовой формат
// # IOException Ошибка при работе с потоками ввода/вывода
// # FileNotFoundException Файл не найден
// # ClassNotFoundException Класс не найден
// # UnsupportedOperationException Попытка выполнения нереализованного метода

// 1. Exception — это ошибка, которую можно «на лету» перехватит и
// исправить.
// 2. Error — это критическая (непоправимая) ошибка, которую невозможно
// обработать, и которая приведёт к завершению работы JVM.


public class Lec_02 {
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

  // NumberFormatException
  // int value = Integer.parseInt (“100a0") ;

  // ClassCastException
  // Animal animal = new Cat();
  // Dog dog = (Dog) animal;

  }
}
