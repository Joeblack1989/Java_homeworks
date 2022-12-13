package seminar_6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class cat {
    String name;
    int number;
    double weight;
    ArrayList<String> therapy;
    String colour;
    Float length;
    String[] colours = {"черный", "белый", "рыжий"};
    String[] alfas = {"B", "V", "K", "M"};
    
    cat(String input_name, int i, double d){
        therapy = new ArrayList<String>();
        name = input_name;
        number = i;
        weight = d;
        Random random = new Random();
        colour = colours[random.nextInt(0, 3)];
    }

    @Override
    public String toString() {
        return (name + " " + number + " "+ weight + " " + colour);
    }

    // 1 Прием в карту кота
    public void create_note(String input_note){
        therapy.add(input_note);
    }

    // Вывод истории приема
    public void print_notes(){
        for (int index = 0; index < therapy.size(); index++) {
            System.out.println(therapy.get(index));
        }
    }

    // Сравнение котиков
    public boolean equals(cat o){
        if (name.equals(o.name) && number == o.number && weight == o.weight && colour.equals(o.colour)){
            return true;
        }   
        else{
            return false;
        }
        
    }

    public int  hashCode(){
        
        int hash = Arrays.asList(alfas).indexOf(name.substring(0, 1));
        
        return hash;
    }


    

    


}
