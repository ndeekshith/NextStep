package Trees;

public class sumofnode {
    public static int sumofnodes(Node root){
            if (root == null) return 0;
            return sumofnodes(root.left) + sumofnodes(root.right ) + root.data;
        }

}
