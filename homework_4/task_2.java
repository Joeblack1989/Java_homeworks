package homework_4;

import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue()
//  - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

public class task_2<E> {

    private LinkedList<E> array;

    public task_2 (int i) { //queue
        array = (LinkedList<E>) new LinkedList<>(); 
        //LinkedList<E> array = new LinkedList<>();  //не пойму, что ему тут не хватает 
    } 

    // помещает элемент в конец очереди     
    public LinkedList<E> enqueue(E item){
        array.addLast(item);
        return array;
    }

    // возвращает первый элемент из очереди и удаляет его
    public E dequeue(){
        E element = array.get(0);
        array.remove(0);
        return element;
    }


    // возвращает первый элемент из очереди, не удаляя
    public E  first(){
        E element = array.get(0);
        return element;
    }

    // Возвращает размер 
    public Integer size(){
        int count = 0;
        for (E item : array) {
            if(item != null){
            count++;
            }

        }
        return count;
    }
}