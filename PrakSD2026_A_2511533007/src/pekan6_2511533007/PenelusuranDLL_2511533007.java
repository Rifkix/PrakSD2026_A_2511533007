package pekan6_2511533007;

public class PenelusuranDLL_2511533007 {
	// fungsi penelusuran maju
	static void forwardTraversal_3007(NodeDLL_2511533007 head_3007) {
		// memulai penelusuran dari head
		NodeDLL_2511533007 curr_3007 = head_3007;
		// lanjutkan sampai akhir
		while (curr_3007 != null) {
			//print data
			System.out.print(curr_3007.data_3007 + " <-> ");
			//pindah ke node berikutnya
			curr_3007 = curr_3007.next_3007;
		}
		//print spasi
		System.out.println();
	}
	// fungsi penelususran mundur
	static void backwardTraversal_3007(NodeDLL_2511533007 tail_3007) {
		// mulai dari akhir
		NodeDLL_2511533007 curr_3007 = tail_3007;
		//lanjut sampai head
		while (curr_3007 != null) {
			//cetak data
			System.out.print(curr_3007.data_3007 + " <-> ");
			// pindah ke node sebelumnya
			curr_3007 = curr_3007.prev_3007;
		}
		//cetak spasi
		System.out.println();
	}
	public static void main(String[] args) {
		//cetak dll
		NodeDLL_2511533007 head_3007 = new NodeDLL_2511533007(1);
		NodeDLL_2511533007 second_3007 = new NodeDLL_2511533007(2);
		NodeDLL_2511533007 third_3007 = new NodeDLL_2511533007(3);
		
		head_3007.next_3007 = second_3007;
		second_3007.prev_3007 = head_3007;
		second_3007.next_3007 = third_3007;
		third_3007.prev_3007 = second_3007;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_3007(head_3007);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_3007(third_3007);
	}

}
