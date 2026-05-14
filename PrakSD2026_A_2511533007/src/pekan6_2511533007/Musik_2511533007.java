package pekan6_2511533007;

import java.util.Scanner;

public class Musik_2511533007 {

	static Lagu_2511533007 head_3007 = null;
	static Lagu_2511533007 tail_3007 = null;
	static int counterLagu_3007 = 0;

	// method tambah lagu di tail / di akhir playlist
	public static void tambahLagu_3007(String judul_3007, String penyanyi_3007) {
		counterLagu_3007++;
		Lagu_2511533007 newLagu_3007 = new Lagu_2511533007(judul_3007, penyanyi_3007);

		// jika playlist masih kosong, node baru langsung jadi head sekaligus tail
		if (head_3007 == null) {
			head_3007 = newLagu_3007;
			tail_3007 = newLagu_3007;
		} else {
			// sambungkan node baru ke tail saat ini
			newLagu_3007.prev_3007 = tail_3007;
			tail_3007.next_3007 = newLagu_3007;
			tail_3007 = newLagu_3007; 
		}

		System.out.println("\nLagu berhasil ditambahkan");
		System.out.println("Posisi: " + counterLagu_3007);
		System.out.println("Judul: " + judul_3007);
		System.out.println("Penyanyi: " + penyanyi_3007);
	}

	// method hapus lagu di head / di awal
	public static void hapusLaguAwal_3007() {
		if (head_3007 == null) {
			System.out.println("\nPlaylist kosong, tidak ada lagu yang bisa dihapus");
			return;
		}

		// tampilkan lagu yang akan dihapus
		System.out.println("\nLagu pertama dihapus:");
		cetakDataLagu_3007(head_3007);

		// jika hanya ada satu lagu, playlist jadi kosong
		if (head_3007 == tail_3007) {
			head_3007 = null;
			tail_3007 = null;
		} else {
			// geser head ke node berikutnya lalu putuskan pointer backnya
			head_3007 = head_3007.next_3007;
			head_3007.prev_3007 = null;
		}
		counterLagu_3007--;
	}

	// method untuk menampilkan semua lagu dari awal hingga akhir
	public static void tampilMaju_3007() {
		if (head_3007 == null) {
			System.out.println("\nPlaylist kosong");
			return;
		}
		System.out.println("\n=== PLAYLIST ===");
		System.out.println("");

		Lagu_2511533007 curr_3007 = head_3007;
		int posisi_3007 = 1;

		// telusuri dari head hingga null
		while (curr_3007 != null) {
			System.out.println("Posisi " + posisi_3007);
			cetakDataLagu_3007(curr_3007);
			curr_3007 = curr_3007.next_3007;
			posisi_3007++;
		}
	}

	// menampilkan semua lagu dari akhir ke awal
	public static void tampilMundur_3007() {
		if (tail_3007 == null) {
			System.out.println("\nPlaylist kosong");
			return;
		}

		System.out.println("\n=== PLAYLIST ===");
		System.out.println("");

		Lagu_2511533007 curr_3007 = tail_3007;
		int posisi_3007 = counterLagu_3007;

		// telusuri dari tail mundur menggunakan pointer prev hingga null
		while (curr_3007 != null) {
			System.out.println("Posisi "+ posisi_3007);
			cetakDataLagu_3007(curr_3007);
			curr_3007 = curr_3007.prev_3007;
			posisi_3007--;
		}
	}

	// mencari lagu dengan judul dan tidak case sensitive
	public static void cariLagu_3007(String judulCari_3007) {
		if (head_3007 == null) {
			System.out.println("\nPlaylist kosong, pencarian tidak dapat dilakukan");
			return;
		}

		Lagu_2511533007 curr_3007 = head_3007;
		boolean ditemukan_3007 = false;
		int posisi_3007 = 1;

		// telusuri seluruh list dan cocokkan judul dengan ignoreCase
		while (curr_3007 != null) {
			if (curr_3007.getJudul_3007().equalsIgnoreCase(judulCari_3007)) {
				if (!ditemukan_3007)
					System.out.println("\nHasil pencarian untuk " + judulCari_3007 + ":");
				System.out.println("Posisi ke " + posisi_3007 + " dalam playlist");
				cetakDataLagu_3007(curr_3007);
				ditemukan_3007 = true;
			}
			curr_3007 = curr_3007.next_3007;
			posisi_3007++;
		}

		if (!ditemukan_3007)
			System.out.println("\nLagu dengan judul " + judulCari_3007 + " tidak ditemukan");
	}


	// mencetak data satu node lagu
	private static void cetakDataLagu_3007(Lagu_2511533007 l_3007) {
		System.out.println("Judul    : " + l_3007.getJudul_3007());
		System.out.println("Penyanyi : " + l_3007.getPenyanyi_3007());
		System.out.println("");
	}

	// main
	public static void main(String[] args) {
		Scanner scanner_3007 = new Scanner(System.in);
		int pilihan_3007;

		do {
			System.out.println("=== Playlist Musik  NIM: 2511533007 ===");
			System.out.println("");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Hapus Lagu Pertama");
			System.out.println("3. Lihat Playlist (Maju)");
			System.out.println("4. Lihat Playlist (Mundur)");
			System.out.println("5. Cari Lagu");
			System.out.println("6. Keluar");
			System.out.println("");
			System.out.print("Pilihan: ");
			pilihan_3007 = scanner_3007.nextInt();
			scanner_3007.nextLine();

			switch (pilihan_3007) {
			case 1:
				System.out.print("Judul    : ");
				String judul_3007 = scanner_3007.nextLine();
				System.out.print("Penyanyi : ");
				String penyanyi_3007 = scanner_3007.nextLine();
				tambahLagu_3007(judul_3007, penyanyi_3007);
				break;

			case 2:
				hapusLaguAwal_3007();
				break;

			case 3:
				tampilMaju_3007();
				break;

			case 4:
				tampilMundur_3007();
				break;

			case 5:
				System.out.print("Masukkan judul yang dicari: ");
				String judulCari_3007 = scanner_3007.nextLine();
				cariLagu_3007(judulCari_3007);
				break;

			case 6:
				System.out.println("\nPlaylist berakhir");
				break;

			default:
				System.out.println("\nPilihan tidak valid, masukkan angka 1-6");
			}

			System.out.println("");
		} while (pilihan_3007 != 6);

		scanner_3007.close();
	}
}