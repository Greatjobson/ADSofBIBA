package assignment_2;

public class MyStack<T> {
    private MyArrayList<T> list;

    public MyStack() {
        list = new MyArrayList<>();
    }

    public T push(T newItem) {
        list.add(newItem); // добавляем в конец
        return newItem;
    }

    public T peek() {
        if (Empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    public T pop() {
        if (Empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = peek(); // получить последний
        list.remove(list.size() - 1); // удалить последний
        return item;
    }

    public int size() {
        return list.size();
    }

    public boolean Empty() {
        return list.size() == 0;
    }
}
