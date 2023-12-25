import java.util.Arrays;

class Node<T> {
    T data;
    double weight;
    Node<T> left, right;

    Node(T data, double weight) {
        this.data = data;
        this.weight = weight;
        left = null;
        right = null;
    }
}

class HuffmanTree<T> {
    private Node<T> root;

    public HuffmanTree(double[] weights) {
        buildTree(weights);
    }

    private void buildTree(double[] weights) {
        Node<T>[] nodes = new Node[weights.length];

        for (int i = 0; i < weights.length; i++) {
            nodes[i] = new Node<>(null, weights[i]);
        }

        int iN = nodes.length;

        while (iN > 1) {
            Arrays.sort(nodes, 0, iN, (a, b) -> Double.compare(a.weight, b.weight));

            Node<T> leftChild = nodes[iN - 2];
            Node<T> rightChild = nodes[iN - 1];

            Node<T> parent = new Node<>(null, leftChild.weight + rightChild.weight);
            parent.left = leftChild;
            parent.right = rightChild;

            nodes[iN - 2] = parent;
            iN--;

            // Shift the array to remove the rightChild
            System.arraycopy(nodes, 0, nodes, 0, iN);
        }

        root = nodes[0];
    }

    public void printCodes() {
        generateCodes(root, "");
    }

    private void generateCodes(Node<T> node, String code) {
        if (node == null)
            return;

        if (node.data != null) {
            System.out.println("Weight: " + node.weight + ", Code: " + code);
            return;
        }

        generateCodes(node.left, code + "0");
        generateCodes(node.right, code + "1");
    }
}

public class Main {
    public static void main(String[] args) {
        double[] weights = {5, 9, 12, 13, 16, 45};

        HuffmanTree<Integer> huffmanTree = new HuffmanTree<>(weights);
        huffmanTree.printCodes();
    }
}
