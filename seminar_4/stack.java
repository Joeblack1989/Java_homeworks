package seminar_4;

public class stack<E> {
    private E[] massive;
    public stack (int i){
        massive = (E[]) new Object[i];
    } 
    public Integer size(){
        int count = 0;
        for (E item : massive) {
            if(item != null){
            count++;
            }
            
        }
        return count;
    }
    public boolean empty(){
        Boolean flag = true;
        if(massive[0] != null){
            flag = false;
        }
        return flag;
    }

    public void push(E item){
        for (int i = 0; i < massive.length; i++) {
            if(massive[i] == null){
                massive[i] = item; 
                return; // Прерывание для void
            }
        }
    }

    public E peek(){
        return massive[this.size() - 1];  // this - вызываем функцию size конкретно этого объекта
    }

    public E pop(){
        E element = massive[this.size() - 1];
        massive[this.size() - 1] = null;
        return element;
    }
}
