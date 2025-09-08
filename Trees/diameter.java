package Trees;

public class diameter {
            public static int height(Node root) {
            if (root == null) return 0;
           
            return Math.max(height(root.left), height(root.right)) + 1;
        
            }
    public static int diameteroftree(Node root){
            if (root == null){
                return 0;
            }

            int leftdiam = diameteroftree(root.left);
            int rightdiam = diameteroftree(root.left);
            int lh = height(root.left);
            int  rh = height(root.right);
            int selfdiam = lh + rh + 1;

            return Math.max(selfdiam ,Math.max( rightdiam , leftdiam));

        }

}
