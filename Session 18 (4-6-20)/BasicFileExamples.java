package Monday;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class BasicFileExamples {
  public static void main(String[] args){
    try{
      String path = "src/Monday/ExampleFile.txt";
      Path p = Paths.get(path);

      BasicFileAttributes fileAttributes = Files.readAttributes(p, BasicFileAttributes.class);
      //System.out.printf("Creation Time: %s\n", fileAttributes.creationTime());
      //System.out.printf("File Size: %s\n", fileAttributes.size());

      File input = new File(path); //path = "src/Monday/ExampleFile.txt"
      Scanner scanner = new Scanner(input);
      StringBuilder stringBuilder = new StringBuilder();
      while (scanner.hasNext()){
        String nextInput = scanner.nextLine();
        nextInput += "\n";
        //nextInput = nextInput.replaceAll("[.][\\s]", ".\n");
        String[] currentLine = nextInput.split("[.][\\s]");

        for (int i = 0; i<currentLine.length;i++){
          if (!currentLine[i].equals("\n")){
            currentLine[i] = currentLine[i] + ".\n";
          }
        }
        for (String s : currentLine) {
          stringBuilder.append(s);
        }
        //stringBuilder.append(nextInput);
        //stringBuilder.append(" ");
      }
      System.out.println(stringBuilder);
    }
    catch (Exception ex){
      System.out.println(ex);
      ex.printStackTrace();
    }
  }
}
