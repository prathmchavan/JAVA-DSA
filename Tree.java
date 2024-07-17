class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        // Base case: if the tree is empty, return a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Otherwise, recur down the tree
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    public void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }
    public Node getRoot() {
        return root;
    }
}

public class Tree {
    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();

        obj.insert(10);
        obj.insert(5);
        obj.insert(15);
        obj.insert(3);
        obj.insert(7);
        obj.insert(12);
        obj.insert(17);

        // Print in-order traversal of the binary tree
        System.out.println("In-order traversal:");
        obj.inOrderTraversal(obj.getRoot());

          // Print in-order traversal of the binary tree
        System.out.println("\nPre order traversal:");
        obj.preOrderTraversal(obj.getRoot());

              // Print in-order traversal of the binary tree
              System.out.println("\nPost order traversal:");
              obj.postOrderTraversal(obj.getRoot());
    }
}
