package HW_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GetUserData {
  private static void getUserData(User user){
    try {
      validStr(View.getUserSurname());
      validStr(View.getUserSurname());
      validStr(View.getUserSurname());
      
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

  private static boolean validStr(String str) throws UserInputException {
    if (str.trim().isEmpty()) {
      throw new UserInputException("Пустой ввод данных.");
    }

    for (int i=0; i < str.length(); i++){
      if (Character.isDigit(str.charAt(i))){
        throw new UserInputException("Пустой ввод данных.");
      }
    }
    
     return true;
  }

  private void writeUserDataToFile(User user) throws IOException {
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

class MyFileNotFoundException extends Exception{
    private String fileName;

    public MyFileNotFoundException(String mess, String fileName){
      super(mess);
      this.fileName = fileName;
    }

    public String getFileName() {
      return fileName;
    }
}
