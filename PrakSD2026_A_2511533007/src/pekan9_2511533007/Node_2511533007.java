package pekan9_2511533007;

public class Node_2511533007 {
	    int data_3007;
	    Node_2511533007 left_3007;
	    Node_2511533007 right_3007;
	    public Node_2511533007(int data_3007) {
	        this.data_3007 = data_3007;
	        left_3007 = null;
	        right_3007 = null;
	    }
	    public void setLeft_3007(Node_2511533007 node_3007) {
	        if (left_3007 == null)
	            left_3007 = node_3007;
	    }
	    public void setRight_3007(Node_2511533007 node_3007) {
	        if (right_3007 == null)
	            right_3007 = node_3007;
	    }
	    public Node_2511533007 getLeft_3007() {
	        return left_3007;
	    }
	    public Node_2511533007 getRight_3007() {
	        return right_3007;
	    }
	    public int getData_3007() {
	        return data_3007;
	    }
	    public void setData_3007(int data_3007) {
	        this.data_3007 = data_3007;
	    }
	    void printPreorder_3007(Node_2511533007 node_3007) {
	        if (node_3007 == null)
	            return;
	        System.out.print(node_3007.data_3007 + " ");
	        printPreorder_3007(node_3007.left_3007);
	        printPreorder_3007(node_3007.right_3007);
	    }
	    void printPostorder_3007(Node_2511533007 node_3007) {
	        if (node_3007 == null)
	            return;
	        printPostorder_3007(node_3007.left_3007);
	        printPostorder_3007(node_3007.right_3007);
	        System.out.print(node_3007.data_3007 + " ");
	    }
	    void printInorder_3007(Node_2511533007 node_3007) {
	        if (node_3007 == null)
	            return;
	        printInorder_3007(node_3007.left_3007);
	        System.out.print(node_3007.data_3007 + " ");
	        printInorder_3007(node_3007.right_3007);
	    }
	    public String print_3007() {
	        return this.print_3007("",true,"");
	    }
	    public String print_3007(String prefix_3007, boolean isTail_3007, String sb_3007) {
	        if (right_3007 != null) {
	            right_3007.print_3007(prefix_3007 + (isTail_3007 ? "|   " : "    "), false, sb_3007);
	        }
	        System.out.println(prefix_3007+(isTail_3007 ? "\\\\-- " : "/-- ")+data_3007);
	        if (left_3007 != null) {
	            left_3007.print_3007(prefix_3007+(isTail_3007 ? "    " : "|   "), true, sb_3007);
	        }
	        return sb_3007;
	    }
	}