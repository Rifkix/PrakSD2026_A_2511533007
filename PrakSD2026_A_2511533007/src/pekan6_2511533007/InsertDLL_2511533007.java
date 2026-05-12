package pekan6_2511533007;

public class InsertDLL_2511533007 {
	//menambahkan node di awal DLL
	static NodeDLL_2511533007 insertBegin_3007(NodeDLL_2511533007 head_3007, int data_3007) {
		// buat node baru
		NodeDLL_2511533007 new_node_3007 = new NodeDLL_2511533007(data_3007);
		// jadikan pointer nextnya head
		new_node_3007.next_3007 = head_3007;
		// jadikan pointer prev head ke new_node
		if (head_3007 != null) {
			head_3007.prev_3007 = new_node_3007;
		}
		return new_node_3007;
	}
	// fungsi menambahkan node di akhir
	public static NodeDLL_2511533007 insertEnd_3007(NodeDLL_2511533007 head_3007, int newData_3007) {
		// buat node baru
		NodeDLL_2511533007 newNode_3007 = new NodeDLL_2511533007 (newData_3007);
		// jika dll null jadikan head
		if (head_3007 == null) {
			head_3007 = newNode_3007;
		}
		else {
			NodeDLL_2511533007 curr_3007 = head_3007;
			while (curr_3007.next_3007 != null) {
				curr_3007 = curr_3007.next_3007;
			}
			curr_3007.next_3007 = newNode_3007;
			newNode_3007.prev_3007 = curr_3007;
		}
		return head_3007;
	}
	// fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511533007 insertAtPosition_3007(NodeDLL_2511533007 head_3007, int pos_3007, int new_data_3007) {
		// buat node baru
		NodeDLL_2511533007 new_node_3007 = new NodeDLL_2511533007(new_data_3007);
		if (pos_3007 == 1) {
			new_node_3007.next_3007 = head_3007;
			if (head_3007 != null) {
				head_3007.prev_3007 = new_node_3007;
			}
			head_3007 = new_node_3007;
			return head_3007;
		}
		NodeDLL_2511533007 curr_3007 = head_3007;
		for (int i = 1; i < pos_3007 - 1 && curr_3007 != null; ++i ) {
			curr_3007 = curr_3007.next_3007;
		} if (curr_3007 == null) {
			System.out.println("posisi tidak ada");
			return head_3007;
		}
		new_node_3007.prev_3007 = curr_3007;
		new_node_3007.next_3007 = curr_3007.next_3007;
		curr_3007.next_3007 = new_node_3007;
		if (new_node_3007.next_3007 != null) {
			new_node_3007.next_3007.prev_3007 = new_node_3007;
		}
		return head_3007;
	}
	public static void printList_3007(NodeDLL_2511533007 head_3007) {
		NodeDLL_2511533007 curr_3007 = head_3007;
		while (curr_3007 != null) {
			System.out.print(curr_3007.data_3007 + " <-> ");
			curr_3007 = curr_3007.next_3007;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511533007 head_3007 = new NodeDLL_2511533007(2);
		head_3007.next_3007 = new NodeDLL_2511533007(3);
		head_3007.next_3007.prev_3007 = head_3007;
		head_3007.next_3007.next_3007 = new NodeDLL_2511533007(5);
		head_3007.next_3007.next_3007.prev_3007 = head_3007.next_3007;
		// cetak DLL awal
		System.out.print("DLL Awal: ");
		printList_3007(head_3007);
		// tambah 1 di awal
		head_3007 = insertBegin_3007(head_3007, 1);
		System.out.print("simpul 1 ditambah di awal: ");
		printList_3007(head_3007);
		// tambah 6 di akhir
		System.out.print("simpul 6 ditambah di akhir: ");
		int data_3007 = 6;
		head_3007 = insertEnd_3007(head_3007, data_3007);
		printList_3007(head_3007);
		// menambahkan node 4 di posisi 4
		System.out.print("tambah node 4 di posisi 4: ");
		int data2_3007 = 4;
		int pos_3007 = 4;
		head_3007 = insertAtPosition_3007(head_3007, pos_3007, data2_3007);
		printList_3007(head_3007);
	}

}
