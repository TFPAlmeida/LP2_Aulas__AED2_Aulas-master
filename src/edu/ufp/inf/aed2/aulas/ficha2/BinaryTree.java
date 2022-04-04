package edu.ufp.inf.aed2.aulas.ficha2;

public class BinaryTree {
    //Root of the Binary Tree
    static Node root;

    /* Function to get the count of leaf nodes in a binary tree*/
    int getLeafCount()
    {
        return getLeafCount(root);
    }

    int getLeafCount(Node node)
    {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }
    /*---------------------------------------------------------------------------------------------*/
    // Function to get the left height of
// the binary tree
    public static int left_height(Node node)
    {
        int ht = 0;
        while (node!=null) {
            ht++;
            node = node.left;
        }

        // Return the left height obtained
        return ht;
    }

    // Function to get the right height
// of the binary tree
    public static int right_height(Node node)
    {
        int ht = 0;
        while (node!=null) {
            ht++;
            node = node.right;
        }

        // Return the right height obtained
        return ht;
    }

    // Function to get the count of nodes
// in complete binary tree
    public static int TotalNodes(Node root)
    {
        // Base Case
        if (root == null)
            return 0;

        // Find the left height and the
        // right heights
        int lh = left_height(root);
        int rh = right_height(root);

        // If left and right heights are
        // equal return 2^height(1<<height) -1
        if (lh == rh)
            return (1 << lh) - 1;

        // Otherwise, recursive call
        return 1 + TotalNodes(root.left)
                + TotalNodes(root.right);
    }

    // Helper function to allocate a new node
// with the given data
    public static Node newNode(int data)
    {
        Node node = new Node(0);
        node.data = data;
        node.left = null;
        node.right = null;
        return (node);
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {
        /* create a tree */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        /* get leaf count of the above tree */
        System.out.println("The leaf count of binary tree is : "
                + tree.getLeafCount());

        System.out.print(TotalNodes(root));
    }
}
