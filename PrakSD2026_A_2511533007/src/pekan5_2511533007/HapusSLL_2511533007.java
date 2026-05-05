package pekan5_2511533007;

public class HapusSLL_2511533007 {
    //fungsi untuk menghapus head
    public static NodeSLL_2511533007 deleteHead_3007 (NodeSLL_2511533007 head_3007) {
        //jika SLL kosong
        if (head_3007 == null)
            return null;
        //pindahkan head ke node berikutnya
        head_3007 = head_3007.next_3007;
        //return head baru
        return head_3007;    
    }

    //fungsi menghapus node terakhir SLL
    public static NodeSLL_2511533007 removeLastNode_3007 (NodeSLL_2511533007 head_3007) {
        //jika list kosong, return null
        if (head_3007 == null) {
            return null;
        }
        //jika list satu node, hapus node dan return null
        if (head_3007.next_3007 == null) {
            return null;
        }
        //temukan node terakhir ke dua
        NodeSLL_2511533007 secondLast_3007 = head_3007;
        while (secondLast_3007.next_3007.next_3007 != null) {
            secondLast_3007 = secondLast_3007.next_3007;
        }
        //hapus node terakhir
        secondLast_3007.next_3007 = null;
        return head_3007;    
    }

    //fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511533007 deleteNode_3007 (NodeSLL_2511533007 head_3007, int position_3007) {
        NodeSLL_2511533007 temp_3007 = head_3007;
        NodeSLL_2511533007 prev_3007 = null;
        //jika linked list null
        if (temp_3007 == null)
            return head_3007;
        //kasus 1 : head di hapus
        if (position_3007 == 1) {
            head_3007 = temp_3007.next_3007;
            return head_3007;   
        }
        //kasus 2: menghapus node di tengah
        //telusuri ke node yang di hapus
        for (int i = 1 ; temp_3007 != null && i < position_3007; i++) {
            prev_3007 = temp_3007;
            temp_3007 = temp_3007.next_3007;    
        }
        //jika ditemukan, hapus node 
        if (temp_3007 != null) {
            prev_3007.next_3007 = temp_3007.next_3007;   
        } else {
            System.out.println("Data tidak ada");   
        }
        return head_3007;   
    }

    //fungsi mencetak SLL
    public static void printList_3007 (NodeSLL_2511533007 head_3007) {
        NodeSLL_2511533007 curr_3007 = head_3007;
        while (curr_3007.next_3007 != null) {
            System.out.print(curr_3007.data_3007 + "-->");
            curr_3007 = curr_3007.next_3007;  
        }
        if (curr_3007.next_3007 == null) {
            System.out.print(curr_3007.data_3007);   
        }
        System.out.println();  
    }
    
    //kelas main
    public static void main(String[] args) {
        //buat SLL 1->2->3->4->5->6->null
        NodeSLL_2511533007 head_3007 = new NodeSLL_2511533007 (1);
        head_3007.next_3007 = new NodeSLL_2511533007 (2);
        head_3007.next_3007.next_3007 = new NodeSLL_2511533007 (3);
        head_3007.next_3007.next_3007.next_3007 = new NodeSLL_2511533007 (4);
        head_3007.next_3007.next_3007.next_3007.next_3007 = new NodeSLL_2511533007 (5);
        head_3007.next_3007.next_3007.next_3007.next_3007.next_3007 = new NodeSLL_2511533007 (6);
        
        //cetak list awal
        System.out.println ("list awal: ");
        printList_3007(head_3007);
        
        //hapus head
        head_3007 = deleteHead_3007 (head_3007);
        System.out.println ("list setelah head dihapus: ");
        printList_3007(head_3007);
        
        //hapus node terakhir 
        head_3007 = removeLastNode_3007 (head_3007);
        System.out.println ("list setelah simpul terakhir di hapus: ");
        printList_3007(head_3007);
        
        //Deleting node at position 2
        int position_3007 = 2;
        head_3007 = deleteNode_3007 (head_3007, position_3007);
        //print list after deletion
        System.out.println ("list setelah posisi 2 dihapus: ");
        printList_3007(head_3007);
    }
}