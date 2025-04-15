package assignment_2;

public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public void add(T element) {
        heap.add(element);
        heapifyUp(heap.size() - 1);
    }

    public T peek() {
        if (isEmpty()) return null;
        return heap.get(0);
    }

    public T poll() {
        if (isEmpty()) return null;

        T root = heap.get(0);
        T last = heap.get(heap.size() - 1);

        // Replace root with last element
        heap.set(0, last);
        heap.remove(heap.size() - 1);

        // Heapify down from root
        heapifyDown(0);

        return root;
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T current = heap.get(index);
            T parent = heap.get(parentIndex);

            if (current.compareTo(parent) >= 0) break;

            // Swap
            heap.set(index, parent);
            heap.set(parentIndex, current);
            index = parentIndex;
        }
    }

    private void heapifyDown(int index) {
        int size = heap.size();

        while (index < size) {
            int leftIndex = 2 * index + 1;
            int rightIndex = 2 * index + 2;
            int smallest = index;

            if (leftIndex < size && heap.get(leftIndex).compareTo(heap.get(smallest)) < 0) {
                smallest = leftIndex;
            }

            if (rightIndex < size && heap.get(rightIndex).compareTo(heap.get(smallest)) < 0) {
                smallest = rightIndex;
            }

            if (smallest == index) break;

            // Swap
            T temp = heap.get(index);
            heap.set(index, heap.get(smallest));
            heap.set(smallest, temp);

            index = smallest;
        }
    }
}
