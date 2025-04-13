package assignment_2;

public class MyQueue<T> {
    private MyArrayList<T> list;

    public MyQueue() {
        list = new MyArrayList<>();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.get(0); // Первый элемент в очереди (FIFO)
    }

    public T enqueue(T element) {
        list.add(element); // Добавляем в конец
        return element;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = list.get(0);      // Первый элемент
        list.remove(0);            // Удаляем его
        return item;
    }
    public T add(T element){
        list.add(element);
        return element;
    }
    public T remove() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        T item = list.get(0);
        list.remove(0);
        return item;
    }
    public T poll() {
        if (isEmpty()) return null;
        T item = list.get(0);
        list.remove(0);
        return item;
    }
}
