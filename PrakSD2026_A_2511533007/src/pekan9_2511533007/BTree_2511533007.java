package pekan9_2511533007;

public class BTree_2511533007 {
    private Node_2511533007 root_3007;
    private Node_2511533007 currentNode_3007;
    public BTree_2511533007() {
        root_3007 = null;
    }
    public boolean search_3007(int data_3007) {
        return search_3007(root_3007, data_3007);
    }
    private boolean search_3007(Node_2511533007 node_3007, int data_3007) {
        if (node_3007.getData_3007() == data_3007)
            return true;
        if (node_3007.getLeft_3007() != null)
            if (search_3007(node_3007.getLeft_3007(), data_3007))
                return true;
        if (node_3007.getRight_3007() != null)
            if (search_3007(node_3007.getRight_3007(), data_3007))
                return true;
        return false;
    }
    public void printInorder_3007() {
        root_3007.printInorder_3007(root_3007);
    }
    public void printPreOrder_3007() {
        root_3007.printPreorder_3007(root_3007);
    }
    public void printPostOrder_3007() {
        root_3007.printPostorder_3007(root_3007);
    }
    public Node_2511533007 getRoot_3007() {
        return root_3007;
    }
    public boolean isEmpty_3007() {
        return root_3007 == null;
    }
    public int countNodes_3007() {
        return countNodes_3007(root_3007);
    }

    private int countNodes_3007(Node_2511533007 node_3007) {
        int count_3007 = 1;
        if (node_3007 == null) {
            return 0;
        } else {
            count_3007 += countNodes_3007(node_3007.getLeft_3007());
            count_3007 += countNodes_3007(node_3007.getRight_3007());
            return count_3007;
        }
    }

    public void print_3007() {
        root_3007.print_3007();
    }

    public Node_2511533007 getCurrent_3007() {
        return currentNode_3007;
    }

    public void setCurrent_3007(Node_2511533007 node_3007) {
        this.currentNode_3007 = node_3007;
    }

    public void setRoot_3007(Node_2511533007 root_3007) {
        this.root_3007 = root_3007;
    }
}
