public class BST {
    static class TreeNode {
        int value;
        TreeNode leftChild, rightChild;

        public TreeNode(int data) {
            this.value = data;
            this.leftChild = this.rightChild = null;
        }
    }

    static class BinarySearchTree {
        static TreeNode addNode(TreeNode root, int value) {
            if (root == null)
                return new TreeNode(value);

            if (value < root.value)
                root.leftChild = addNode(root.leftChild, value);
            else if (value > root.value)
                root.rightChild = addNode(root.rightChild, value);

            return root;
        }

        static int findMin(TreeNode root) {
            if (root == null) {
                System.out.println("Tree is empty!");
                return -1; // Returning -1 for an empty tree
            }
            while (root.leftChild != null) {
                root = root.leftChild;
            }
            return root.value;
        }

        
        public static void main(String[] args) {
            TreeNode root = null;

            // Constructing BST
            //      50
            //     /  \
            //    30   70
            //   / \   / \
            //  20 40 60 80
            root = addNode(root, 50);
            root = addNode(root, 30);
            root = addNode(root, 20);
            root = addNode(root, 40);
            root = addNode(root, 70);
            root = addNode(root, 60);
            root = addNode(root, 80);

            System.out.println("Smallest Value: " + findMin(root));
        }
    }
}
