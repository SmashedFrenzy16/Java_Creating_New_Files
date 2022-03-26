import java.io.File; 
import java.io.IOException;


public class fileCreator {
  public static void main(String[] args) {
    try {
      File myObj = new File("textdoc1.txt");
      if (myObj.createNewFile()) {
        System.out.println("The following file was created: " + myObj.getName());
        } else {
        System.out.println("This file already exists on this device.");
        }
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace(); 
    }
  }
}
