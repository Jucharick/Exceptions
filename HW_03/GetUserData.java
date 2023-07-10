package HW_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GetUserData {

  public static void getUserData(){
    try {
      String userInput = View.userInput();
      if (userInput.trim().isEmpty()) {
        throw new UserInputException("Вы не ввели данные - пустой ввод");
      } else {
        String[] userArray = userInput.split(" ");
        if (userArray.length != 4) {
          throw new UserInputException("Введенные данные не соответствуют формату - Фамилия Имя Отчество Телефон.");
        } else {
          if (validStr(userArray[0]) && validStr(userArray[1]) && validStr(userArray[2]) && validNumberPhone(userArray[3])) {
            User user = new User(userArray[0], userArray[1], userArray[2], userArray[3]);
            writeUserDataToFile(user);
            System.out.println("Данные успешно записаны в файл: " + user.toString());
          }
        }
      }
      
    } catch (UserInputException e) {
      System.out.println("Ошибка ввода данных: " + e.getMessage());

    } catch (IOException e) {
        System.out.println("Ошибка при записи данных в файл: " + e.getMessage());
        e.printStackTrace();
    }
  }

  private static boolean validStr(String userStr) throws UserInputException {
    Boolean flag = true;
    for (int i=0; i < userStr.length(); i++){
      if (Character.isDigit(userStr.charAt(i))){
        flag = false;
        throw new UserInputException("Тип данных не соответствует - строка содержит цифры.");
      }
    }
     return flag;
  }

  private static boolean validNumberPhone(String numberPhone) throws UserInputException {
    Boolean flag = false;
    int count = 0;
    for (int i=0; i < numberPhone.length(); i++){
      if (Character.isDigit(numberPhone.charAt(i))){
        flag = true;
        count ++;
      } else {
        throw new UserInputException("Тип данных не соответствует - номер телефона содержит символы, отличные от цифр.");
      }
    }
    if (count != 11) {
      flag = false;
      throw new UserInputException("Номер телефона должен содержать 11 символов.");
    }
    return flag;
  }

  private static void writeUserDataToFile(User user) throws IOException {
    String fileName = user.getSurname() + ".txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
      writer.write(user.toString());
      writer.newLine();
    }
  }
}

class UserInputException extends Exception {
  public UserInputException(String message) {
    super(message);
  }
}