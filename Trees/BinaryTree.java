package Trees;

public class BinaryTree {
    private int idx = -1;

    public Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrder(Node root) {
        if (root == null) return;
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
        System.out.println();
    }

    public int height(Node root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public int countnodes(Node root) {
        if (root == null) return 0;
        return 1 + countnodes(root.left) + countnodes(root.right);
    }

    public int sumofnodes(Node root) {
        if (root == null) return 0;
        return root.data + sumofnodes(root.left) + sumofnodes(root.right);
    }

    public int diameteroftree(Node root) {
        if (root == null) return 0;
        int leftdiam = diameteroftree(root.left);
        int rightdiam = diameteroftree(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfdiam = lh + rh + 1;
        return Math.max(selfdiam, Math.max(leftdiam, rightdiam));
    }

    
}