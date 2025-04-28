package assignment_2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(6);

        print(list);
        System.out.println("___________________________________________________");

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        print(linkedList);


        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("______________________________________");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());


        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(9);
        queue.add(6);
        queue.add(3);
        System.out.println("______________________________________");
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());
        System.out.println(queue.peek());


        MyMinHeap<Integer> minHeap = new MyMinHeap<>();
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(8);
        minHeap.add(1);
        System.out.println("______________________________________");
        System.out.println(minHeap.peek()); // 1
        System.out.println(minHeap.poll()); // 1
        System.out.println(minHeap.peek()); // 3
//git commit -m 'added all methods'


    }
    public static void print(MyList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}