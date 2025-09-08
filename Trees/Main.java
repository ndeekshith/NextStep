package Trees;

public class Main {
        public static void main(String[] args) {
        // valid preorder input with -1 as null
       int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,8,6,12,-1,-1,-1,-1,-1};;
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Root: " + root.data);

        System.out.println("Preorder:");
        tree.preorder(root);
        System.out.println();

        System.out.println("Inorder:");
        tree.inorder(root);
        System.out.println();

        System.out.println("Postorder:");
        tree.postorder(root);
        System.out.println();

        System.out.println("Levelorder:");
        tree.levelOrder(root);

        System.out.println("Height of tree: " + tree.height(root));
        System.out.println("Total nodes: " + tree.countnodes(root));
        System.out.println("Sum of all nodes: " + tree.sumofnodes(root));
        System.out.println("diameter of tree:" + tree.diameteroftree(root));
    }
}



