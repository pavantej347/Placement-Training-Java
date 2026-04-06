public class tree1 {
    static int indx = 0;

    static Node Build(int[] ar) {
        if (indx == ar.length)
            return null;
        if (ar[indx] == -1) {
            indx++;
            return null;
        }
        Node root = new Node(ar[indx]);
        indx++;
        root.left = Build(ar);
        root.right = Build(ar);
        return root;
    }

    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static int count_leaf_Nodes(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int left = count_leaf_Nodes(root.left);
        int right = count_leaf_Nodes(root.right);
        return left + right;
    }

    public static void main(String[] args) {

        int ar[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = Build(ar);
        inOrder(root);
        System.out.println(count_leaf_Nodes(root));
    }
}
