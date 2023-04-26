public class Main {
    public static void main(String[] args) {
        // Tree (Root)
        // Node(value, leftChild, rightChild)
        // insert(value)
        // find(value) boolean
        // root.value > item


        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println(tree.find(11));

        System.out.println("Done");
    }
}