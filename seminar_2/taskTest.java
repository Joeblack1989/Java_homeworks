import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class taskTest {
    public static void main(String[] args) throws Exception {
        String st = "TEST".repeat(100);
        try (FileWriter fw = new FileWriter("file.txt", false)) {
        fw.write(st);
        fw.flush();
        
        } catch (IOException ex) {
        System.out.println(ex.getMessage());
        }
        
        
        
        };

    }

