import java.util.Hashtable;
import java.util.Map;

public class app {
    public static void main (String args[]) throws org.json.simple.parser.ParseException {
        
        Map<Integer,String> table = new Hashtable<>();

        table.put(123456, "Иванов");
        table.put(324546, "Васильев"); 
        table.put(876543, "Петрова");   
        table.put(654876, "Иванов");
        table.put(247886, "Сидоров");
        table.put(657898, "Иванов");

        for (int item : table.keySet()) {
            if(table.get(item) == "Иванов") {
                System.out.println(item +"      " + table.get(item));
            }
        } 

        
    }
}
