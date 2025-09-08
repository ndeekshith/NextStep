package Trees;

public class countofnodeintree {
    public static int countnodes(Node root){
            if (root == null) return 0;
            return countnodes(root.left) + countnodes(root.right) +1;

        }

}
