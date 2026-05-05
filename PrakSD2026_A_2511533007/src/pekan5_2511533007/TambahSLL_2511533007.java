package pekan5_2511533007;

public class TambahSLL_2511533007 {
	public static NodeSLL_2511533007 insertAtFront (NodeSLL_2511533007 head_3007, int value_3007) {
		NodeSLL_2511533007 new_node_3007 = new NodeSLL_2511533007(value_3007);
		new_node_3007.next_3007 = head_3007;
		return new_node_3007;
	}
	// fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511533007 insertAtEnd(NodeSLL_2511533007 head_3007, int value_3007) {
		// buat sebuah node dengan sebuah nilai
		NodeSLL_2511533007 newNode_3007 = new NodeSLL_2511533007(value_3007);
		//jika list kosong maka node jadi head
		if (head_3007 == null) {
			return newNode_3007;
		}
		// simpan head ke variable sementara
		NodeSLL_2511533007 last_3007 = head_3007;
		//telusuri ke node akhir
		while (last_3007.next_3007 != null) {
			last_3007 = last_3007.next_3007;
		}
		//ubah pointer 
		last_3007.next_3007 = newNode_3007;
		return head_3007;
	}
	static NodeSLL_2511533007 GetNode_3007(int data_3007) {
		return new NodeSLL_2511533007(data_3007);
	}
	static NodeSLL_2511533007 insertPos_3007(NodeSLL_2511533007 headNode_3007, int position_3007, int value_3007) {
		NodeSLL_2511533007 head_3007 = headNode_3007;
		if (position_3007 < 1)
			System.out.println("Invalid position");
		if (position_3007 == 1) {
			NodeSLL_2511533007 new_node_3007 = new NodeSLL_2511533007(value_3007);
			new_node_3007.next_3007 = head_3007;
			return new_node_3007;
		} else {
			while (position_3007-- != 0) {
				if (position_3007 == 1) {
					NodeSLL_2511533007 newNode_3007 = GetNode_3007(value_3007);
					newNode_3007.next_3007 = headNode_3007.next_3007;
					headNode_3007.next_3007 = newNode_3007;
					break;
				}
				headNode_3007 = headNode_3007.next_3007;
			}
			if (position_3007 != 1)
				System.out.println("Posisi di luar jangkauan");
		}return head_3007;
		}
		public static void printList_3007(NodeSLL_2511533007 head_3007) {
			NodeSLL_2511533007 curr_3007 = head_3007;
			while (curr_3007.next_3007 != null) {
				System.out.print(curr_3007.data_3007+"-->");
				curr_3007 = curr_3007.next_3007;
			}
			if (curr_3007.next_3007 == null) {
				System.out.print(curr_3007.data_3007);  }
				System.out.println();
			}
	
		public static void main(String[] args) {
			// buat linked list 2->3->5->6
			NodeSLL_2511533007 head_3007 = new NodeSLL_2511533007 (2);
			head_3007.next_3007 = new NodeSLL_2511533007(3);
			head_3007.next_3007.next_3007 = new NodeSLL_2511533007(5);
			head_3007.next_3007.next_3007.next_3007 = new NodeSLL_2511533007(6);
			// cetak list asli
			System.out.print("Senarai berantai awal:");
			printList_3007(head_3007);
			// tambahkan node baru di depan
			System.out.print("tambah 1 simpul di depan: ");
			int data = 1;
			head_3007 = insertAtFront(head_3007, data);
			// cetak update list
			printList_3007(head_3007);
			// tambahkan node baru di belakang
			System.out.print("tambah 1 simpul di belakang: ");
			int data2 = 7;
			head_3007 = insertAtEnd(head_3007, data2);
			// cetak update list
			printList_3007(head_3007);
			System.out.print("tambah 1 simpul ke data 4: ");
			int data3 = 4;
			int pos = 4;
			head_3007 = insertPos_3007(head_3007, pos, data3);
			// cetak update list
			printList_3007(head_3007);
		
	}

}
