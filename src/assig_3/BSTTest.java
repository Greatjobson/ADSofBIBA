package assig_3;

public class BSTTest {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();
        tree.put(50, "50");
        tree.put(30, "30");
        tree.put(70, "70");
        tree.put(10, "10");
        tree.put(9, "9");
        tree.put(2, "2");
        tree.put(8, "8");
        tree.put(5, "5");
        tree.put(12, "12");
        tree.put(70, "70");
        tree.put(180, "180");
        tree.put(90, "90");
        tree.put(2, "2");
        tree.put(80, "80");

        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        System.out.println("Size of tree: " + tree.size());

        for (var elem : tree) {
            System.out.print(elem.getKey() + " ");
        }
    }
}