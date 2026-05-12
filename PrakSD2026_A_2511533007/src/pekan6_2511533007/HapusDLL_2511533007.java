package pekan6_2511533007;

public class HapusDLL_2511533007 {
	// fungsi menghapus node awal
	public static NodeDLL_2511533007 delHead_3007(NodeDLL_2511533007 head_3007) {
		if (head_3007 == null) {
			return null;
		}
		NodeDLL_2511533007 temp_3007 = head_3007;
		head_3007 = head_3007.next_3007;
		if (head_3007 != null) {
			head_3007.prev_3007 = null;
		}
		return head_3007;
	}
	// fungsi menghapus di akhir
	public static NodeDLL_2511533007 delLast_3007(NodeDLL_2511533007 head_3007) {
		if (head_3007 == null) {
			return null;
		}
		if (head_3007.next_3007 == null) {
			return null;
		}
		NodeDLL_2511533007 curr_3007 = head_3007;
		while (curr_3007.next_3007 != null) {
			curr_3007 = curr_3007.next_3007;
		}
		// update pointer previous node
		if (curr_3007.prev_3007 != null) {
			curr_3007.prev_3007.next_3007 = null;
		}
		return head_3007;
	}
	// fungsi menghapus node posisi tertentu
	public static NodeDLL_2511533007 delPos_3007(NodeDLL_2511533007 head_3007, int pos_3007) {
		// jika DLL kosong
		if (head_3007 == null) {
			return head_3007;
		}
		NodeDLL_2511533007 curr_3007 = head_3007;
		// telusuri sampai ke node yang akan dihapus
		for (int i = 1; curr_3007 != null && i < pos_3007; ++i) {
			curr_3007 = curr_3007.next_3007;
		}
		//jika posisi tidak ditemukan
		if (curr_3007 == null) {
			return head_3007;
		}
		// update pointer
		if (curr_3007.prev_3007 != null) {
			curr_3007.prev_3007.next_3007 = curr_3007.next_3007;
		}
		if (curr_3007.next_3007 != null) {
			curr_3007.next_3007.prev_3007 = curr_3007.prev_3007;
		}
		//jika yang dihapus head
		if (head_3007 == curr_3007) {
			head_3007 = curr_3007.next_3007;
		}
		return head_3007;
	}
	// fungsi mencetak DLL
	public static void printList_3007 (NodeDLL_2511533007 head_3007) {
		NodeDLL_2511533007 curr_3007 = head_3007;
		while (curr_3007 != null) {
			System.out.print(curr_3007.data_3007 + " <-> ");
			curr_3007 = curr_3007.next_3007;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// buat sebuah DLL
		NodeDLL_2511533007 head_3007 = new NodeDLL_2511533007(1);
		head_3007.next_3007 = new NodeDLL_2511533007(2);
		head_3007.next_3007.prev_3007 = head_3007;
		head_3007.next_3007.next_3007 = new NodeDLL_2511533007(3);
		head_3007.next_3007.next_3007.prev_3007 = head_3007.next_3007;
		head_3007.next_3007.next_3007.next_3007 = new NodeDLL_2511533007(4);
		head_3007.next_3007.next_3007.next_3007.prev_3007 = head_3007.next_3007.next_3007;
		head_3007.next_3007.next_3007.next_3007.next_3007 = new NodeDLL_2511533007(5);
		head_3007.next_3007.next_3007.next_3007.next_3007.prev_3007 = head_3007.next_3007.next_3007.next_3007;
		
		System.out.print("DLL Awal: ");
		printList_3007(head_3007);
		
		System.out.print("Setelah head dihapus: ");
		head_3007 = delHead_3007(head_3007);
		printList_3007(head_3007);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_3007 = delLast_3007(head_3007);
		printList_3007(head_3007);
		
		System.out.print("menghapus node ke 2: ");
		head_3007 = delPos_3007(head_3007, 2);
		printList_3007(head_3007);
	}

}
