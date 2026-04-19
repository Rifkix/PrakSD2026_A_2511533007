package pekan3_2511533007;

import java.util.Stack;
import java.util.Scanner;

public class Browser_2511533007 {
	
	//menampilkan pilihan yang bisa dipilih user
	public static void tampilkanInput_3007() {
		System.out.println("=== Browser History ===");
		System.out.println("1. Kunjungi Website");
		System.out.println("2. Tombol Back");
		System.out.println("3. Lihat Halaman Aktif");
		System.out.println("4. Cek Status History");
		System.out.println("5. Keluar");
	}
	// memasukkan data history kedalam stack(push)
	public static void tambahHistory_3007(Stack<Website_2511533007> stack_3007, Scanner input_3007) {
		System.out.println("Masukkan Judul: ");
		String judul_3007 = input_3007.nextLine();
		System.out.println("Masukkan URL: ");
		String URL_3007 = input_3007.nextLine();
		stack_3007.push(new Website_2511533007(judul_3007, URL_3007));
		System.out.println("Berhasil mengunjungi halaman");
	}
	// menampilkan halaman saat ini(peek)
	public static void tampilkanHalaman_3007(Stack<Website_2511533007> stack_3007 ) {
		if (stack_3007.isEmpty()) {
			System.out.println("Browser history kosong.");	
		} else {
			System.out.println("Halaman saat ini: \n" + stack_3007.peek());
		}
	}
	// menghapus history teratas(pop)
	public static void hapusHistory_3007(Stack<Website_2511533007> stack_3007, Scanner input_3007) {
	    if (stack_3007.isEmpty()) {
	    	System.out.println("History kosong");
	    } else {
	    	System.out.println("History yang dihapus: " + stack_3007.pop());
	    }
	}
	//memberi tahu jumlah history user
	public static void tampilkanJumlahHistory_3007(Stack<Website_2511533007> stack_3007) {
		if (stack_3007.isEmpty()) {
			System.out.println("History kosong");
		} else {
			System.out.println("Total history: " + stack_3007.size());
		}
	}
	
	
	public static void main (String[] args) {
		Stack<Website_2511533007> stacking_3007 = new Stack<>();
		Scanner input_3007 = new Scanner(System.in);
		int choice_3007;
		do {
		    tampilkanInput_3007();
		    System.out.print("Pilih menu: ");
		    choice_3007 = input_3007.nextInt();
		    input_3007.nextLine(); 

		    switch (choice_3007) {
		        case 1:
		            tambahHistory_3007(stacking_3007, input_3007);
		            break;
		        case 2:
		        	hapusHistory_3007(stacking_3007, input_3007);
		            break;
		        case 3:
		        	tampilkanHalaman_3007(stacking_3007);
		            break;
		        case 4:
		            tampilkanJumlahHistory_3007(stacking_3007);
		            break;
		        case 5:
		            System.out.println("Keluar dari program.");
		            break;
		        default:
		            System.out.println("Pilihan tidak valid.");
		    }
		} while (choice_3007 != 5);

		input_3007.close();
	}

}
