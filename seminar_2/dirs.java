import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
 
public class dirs {
    public static void main(String[] args) throws IOException {
        FileWriter fileLog = new FileWriter("sample.log", true);
        
        try {
                //Instantiating the File class
                // File.createNewFile("sample.txt"));
                File file = new File("k:/sample.txt");
                file.createNewFile();
                //Instantiating the PrintStream class
                PrintStream stream = new PrintStream(file);
                System.setOut(stream);

                // определяем объект для каталога
                File dir = new File("../");
                // если объект представляет каталог
                if(dir.isDirectory())
                {
                    // получаем все вложенные объекты в каталоге
                    for(File item : dir.listFiles()){
                    
                        if(item.isDirectory()){
                            
                            System.out.println(item.getName() + "  \t folder");
                        }
                        else{
                            
                            System.out.println(item.getName() + "\t file");
                        }
                    }
            
                    }
        } 
        catch (Exception e) {
                fileLog.append("\n"+e.toString());
                fileLog.flush();    
            }
        fileLog.close();
    }
    
}
