package pekan9_2511533007;

public class BtreeDriver_2511533007 {
    public static void main(String[] args) {
        //Membuat Pohon
        BTree_2511533007 tree_3007 = new BTree_2511533007();
        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree_3007.countNodes_3007());
        //menambahkan simpul data 1
        Node_2511533007 root_3007 = new Node_2511533007(1);
        //menjadikan simpul 1 sebagai root
        tree_3007.setRoot_3007(root_3007);
        System.out.println("Jumlah simpul jika hanya ada root");
        System.out.println(tree_3007.countNodes_3007());
        Node_2511533007 node2_3007 = new Node_2511533007(2);
        Node_2511533007 node3_3007 = new Node_2511533007(3);
        Node_2511533007 node4_3007 = new Node_2511533007(4);
        Node_2511533007 node5_3007 = new Node_2511533007(5);
        Node_2511533007 node6_3007 = new Node_2511533007(6);
        Node_2511533007 node7_3007 = new Node_2511533007(7);
        Node_2511533007 node8_3007 = new Node_2511533007(8);
        Node_2511533007 node9_3007 = new Node_2511533007(9);
        root_3007.setLeft_3007(node2_3007);
        node2_3007.setLeft_3007(node4_3007);
        node2_3007.setRight_3007(node5_3007);
        node4_3007.setRight_3007(node8_3007);
        root_3007.setRight_3007(node3_3007);
        node3_3007.setLeft_3007(node6_3007);
        node3_3007.setRight_3007(node7_3007);
        node6_3007.setLeft_3007(node9_3007);
        //Set root
        tree_3007.setCurrent_3007(tree_3007.getRoot_3007());
        System.out.println("menampilkan simpul terakhir");
        System.out.println(tree_3007.getCurrent_3007().getData_3007());
        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
        System.out.println(tree_3007.countNodes_3007());
        System.out.println("InOreder: ");
        tree_3007.printInorder_3007();
        System.out.println("\nPreOrder: ");
        tree_3007.printPreOrder_3007();
        System.out.println("\nPostOrder");
        tree_3007.printPostOrder_3007();
        System.out.println("\nDmenampilkan simpul dalam bentuk pohon: ");
        tree_3007.print_3007();
        
    }        
}