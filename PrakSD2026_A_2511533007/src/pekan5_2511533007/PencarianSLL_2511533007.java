package pekan5_2511533007;

public class PencarianSLL_2511533007 {
	static boolean searchKey_3007(NodeSLL_2511533007 head_3007, int key_3007) {
		NodeSLL_2511533007 curr_3007 = head_3007;
		while (curr_3007 != null) {
			if (curr_3007.data_3007 == key_3007)
				return true;
			curr_3007 = curr_3007.next_3007;
		}
		return false;
	}
	public static void traversal_3007(NodeSLL_2511533007 head_3007) {
		//mulai dari head
		NodeSLL_2511533007 curr_3007 = head_3007;
		//telusuri sampai pointer null
		while (curr_3007 != null) {
			System.out.print(" " + curr_3007.data_3007);
			curr_3007 = curr_3007.next_3007;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		NodeSLL_2511533007 head_3007 = new NodeSLL_2511533007(14);
		head_3007.next_3007 = new NodeSLL_2511533007(21);
		head_3007.next_3007.next_3007 = new NodeSLL_2511533007(13);
		head_3007.next_3007.next_3007.next_3007 = new NodeSLL_2511533007(30);
		head_3007.next_3007.next_3007.next_3007.next_3007 = new NodeSLL_2511533007(10);
		System.out.print("Penulusuran SLL : ");
		traversal_3007(head_3007);
		//data yang akan dicari
		int key_3007 = 30;
		System.out.print("cari data " + key_3007 + " = ");
		if (searchKey_3007(head_3007, key_3007))
			System.out.println("ketemu");
		else
			System.out.println("tidak ada");
		
	}

}
