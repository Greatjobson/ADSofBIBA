package assignment_2;

public class MyStack<T> {
    private final MyArrayList<T> list = new MyArrayList<>();

    public boolean empty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public T peek() {
        if (empty()) throw new RuntimeException("Stack is empty");
        return list.get(list.size() - 1);
    }

    public T push(T item) {
        list.add(item);
        return item;
    }

    public T pop() {
        if (empty()) throw new RuntimeException("Stack is empty");
        return list.remove(list.size() - 1);
    }
}