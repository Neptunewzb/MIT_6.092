import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {
  public static void main(String[] args) throws IOException{
    // Path names are relative to project directory (Eclipse Quirk )
    FileReader fr = new FileReader("1.txt");
    BufferedReader br = new BufferedReader(fr);
    String line = null;
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }
    br.close();
  }
}