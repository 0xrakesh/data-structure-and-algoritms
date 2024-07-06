package utils;
public class BinaryTree {
    static class Node {
        int data;
        Node left,right;
        Node(int key) {
            data = key;
            right=left=null;
        }
    }
    Node root;
    public BinaryTree(int data) {
        root = new Node(data);
    }

    public void insert(int key) {
        root = insertRecursion(root, key);
    }

    Node insertRecursion(Node root, int key) {
        if(root==null) {
            root = new Node(key);
            return root;
        }
        if(root.data > key) {
            root.left = insertRecursion(root.left,key);
        }
        else {
            root.right = insertRecursion(root.right, key);
        }
        return root;
    }

    public void inorder() {
        System.out.print("Inorder : ");
        inorderRecursion(root);
        System.out.println();
    }

    void inorderRecursion(Node root) {
        if(root != null) {
            inorderRecursion(root.left);
            System.out.print(root.data+" ");
            inorderRecursion(root.right);
        }
    }

    public void preorder() {
        System.out.print("Preorder : ");
        preorderRecursion(root);
        System.out.println();
    }

    void preorderRecursion(Node root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            inorderRecursion(root.left);
            inorderRecursion(root.right);
        }
    }

    public void postorder() {
        System.out.print("Postorder : ");
        postorderRecursion(root);
        System.out.println();
    }

    void postorderRecursion(Node root) {
        if(root!=null) {
            postorderRecursion(root.left);
            postorderRecursion(root.right);
            System.out.print(root.data+" ");
        }
    }

    public void rootKey() {

    }

    int minValue(Node root) {
       int minValue = root.data;
       while(root.left != null) {
           minValue = root.left.data;
           root = root.left;
       }
       return minValue;
    }

    public void delete(int key) {
        root = deleteRecursion(root,key);
    }

    Node deleteRecursion(Node root,int key) {
        if(root==null) return null;
        else if(key < root.data) root.left = deleteRecursion(root.left,key);
        else if(key > root.data) root.right = deleteRecursion(root.right,key);
        else {
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            root.data = minValue(root.right);
            root.right = deleteRecursion(root.right,root.data);
        }
        return root;
    }
}