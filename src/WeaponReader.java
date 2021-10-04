import java.io.*;

public class WeaponReader {
    BufferedReader br;

    {
        try {
            br = new BufferedReader(new FileReader("weapons"));
            String line = br.readLine();
            line.split(";");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
