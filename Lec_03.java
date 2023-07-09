import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec_03 {
  public static void main(String args[]) {
    // FileReader reader = null;
    // try {
    //   reader = new FileReader(new File("file.txt"));
    // } catch (IOException e) {
    // e.printStackTrace();
    // } finally {
    //   try {
    //     if (reader != null) {
    //       reader.close() ;  // сами закрываем ридер
    //     }
    //   } catch (IOException e) {
    //     e.printStackTrace() ;
    //   }
    // }


    // используем Блок try-with-resources, закрывать ридер при таком способе не нужно, закроется сам
    try (FileReader reader = new FileReader(new File("file.txt"))) {
    } catch (IOException e) {
      e.printStackTrace () ;
    }
  }
}
