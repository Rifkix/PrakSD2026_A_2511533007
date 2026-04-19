package pekan2_2511533007;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533007 {
	
	//menampilkan input lagu yang akan dimasukkan user
	public static void tampilkanInput_3007() {
		System.out.println("=== Playlist Musik ===");
		System.out.println("1. Tambah Lagu");
		System.out.println("2. Lihat Playlist");
		System.out.println("3. Hapus Lagu");
		System.out.println("4. Cek Kapasitas");
		System.out.println("5. Keluar");
	}
	//menambahkan lagu kedalam arraylist
	public static void tambahLagu_3007(ArrayList<Musik_2511533007> list_3007, Scanner input_3007) {
		System.out.println("Masukkan Judul: ");
		String judul_3007 = input_3007.nextLine();
		System.out.println("Masukkan Penyanyi: ");
		String penyanyi_3007 = input_3007.nextLine();
		System.out.println("Masukkan Durasi (Detik): ");
		int durasi_3007 = Integer.parseInt(input_3007.nextLine());
		list_3007.add(new Musik_2511533007(judul_3007, penyanyi_3007, durasi_3007));
		System.out.println("Lagu berhasil ditambahkan.");
	}
	//menampilkan playlist yang telah dibuat
	public static void tampilkanPlaylist_3007(ArrayList<Musik_2511533007> list_3007 ) {
		if (list_3007.isEmpty()) {
			System.out.println("Daftar playlist kosong.");	
		} else {
			System.out.println("Daftar Playlist:");
			for (Musik_2511533007 msk_3007 : list_3007) {
				System.out.println(msk_3007);
			}
		}
	}
	//menghapus lagu pada playlist yang telah dibuat, index dimulai dari 1
	public static void hapusLagu_3007(ArrayList<Musik_2511533007> list_3007, Scanner input_3007) {
	    System.out.print("Masukkan index lagu yang ingin dihapus: ");
	    int index_3007 = input_3007.nextInt() -1;  

	    if (index_3007 >= 0 && index_3007 < list_3007.size()) {
	    	Musik_2511533007 laguTerhapus_3007 = list_3007.remove(index_3007);
	        System.out.println("Lagu yang berhasil dihapus: \n" + laguTerhapus_3007);
	    } else {
	        System.out.println("Index tidak valid");
	    }
	}
	//mengetahui seberapa banyak arraylist yang telah dibuat
	public static void kapasitasPlaylist_3007(ArrayList<Musik_2511533007> list_3007) {
		System.out.println("Jumlah lagu: " + list_3007.size());
	}

	public static void main (String[] args) {
		ArrayList<Musik_2511533007> playlistList_3007 = new ArrayList<>();
		Scanner input_3007 = new Scanner(System.in);
		int choice_3007;
		do {
		    tampilkanInput_3007();
		    System.out.print("Pilih menu: ");
		    choice_3007 = input_3007.nextInt();
		    input_3007.nextLine();

		    switch (choice_3007) {
		        case 1:
		            tambahLagu_3007(playlistList_3007, input_3007);
		            break;
		        case 2:
		            tampilkanPlaylist_3007(playlistList_3007);
		            break;
		        case 3:
		            hapusLagu_3007(playlistList_3007, input_3007);
		            break;
		        case 4:
		            kapasitasPlaylist_3007(playlistList_3007);
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