class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class binary_search {
    static Node binary_search(int[] ar, int l, int r) {
        if (l > r)
            return null;
        int mid = (l + r) / 2;
        Node root = new Node(ar[mid]);
        root.left = binary_search(ar, l, mid - 1);
        root.right = binary_search(ar, mid + 1, r);
        return root;

    }

    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);

    }

    static boolean isValid(Node root) {
        if (root == null || root.left == null || root.right == null)
            return true;
        if (root.left.data >= root.data || root.right.data <= root.data)
            return false;
        return isValid(root.left) && isValid(root.right);

    }

    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 70, 9 };
        int N = ar.length - 1;
        Node root = binary_search(ar, 0, N);
        inOrder(root);
        System.out.println(isValid(root,));

    }
}
