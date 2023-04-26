public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int item) {
        var node = new Node(item);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if (item < root.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int item) {
        var current = root;
        boolean isAvailable = false;
        while (current!= null) {
            if (item == current.value) {
                isAvailable = true;
                break;
            } else if (item > current.value)
                current = current.rightChild;
            else
                current = current.leftChild;
        }
        return isAvailable;
    }

}
