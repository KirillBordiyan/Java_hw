package kirill.helper;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueueHw4<T> {
    LinkedList<T> newQueList = new LinkedList<T>();
    public void enqueue(T element) {
        //помещает элемент в конец очереди
        newQueList.add(element);
    }

    public T dequeue() {
        // возвращает первый элемент из очереди и удаляет его
        return newQueList.remove();
    }

    public T first() {
        //возвращает первый элемент из очереди, не удаляя
        return newQueList.getFirst();

    }

    public LinkedList<T> getElements() {
        //возвращает все элементы в очереди
        return newQueList;
    }
}