import utils.BinaryTree;
public class Tree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(5);

        // Insertion
        binaryTree.insert(3);
        binaryTree.insert(2);
        binaryTree.insert(4);

        binaryTree.insert(7);
        binaryTree.insert(8);
        binaryTree.insert(6);

        binaryTree.inorder();
        binaryTree.preorder();
        binaryTree.postorder();

        binaryTree.delete(3);
        binaryTree.inorder();
    }
}
