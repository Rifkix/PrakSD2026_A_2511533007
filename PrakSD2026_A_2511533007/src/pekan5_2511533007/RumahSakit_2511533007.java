package pekan5_2511533007;

import java.util.Scanner;

public class RumahSakit_2511533007 {

	// head linked list dan counter nomor antrian
	static Pasien_2511533007 head_3007 = null;
	static int counterAntrian_3007 = 0;

	// fungsi mendaftarkan pasien baru di akhir list (insert at tail)
	public static void daftarkanPasien_3007(String nama_3007, String keluhan_3007) {
		counterAntrian_3007++;
		Pasien_2511533007 newPasien_3007 = new Pasien_2511533007(nama_3007, keluhan_3007, counterAntrian_3007);

		// jika list kosong, langsung jadi head
		if (head_3007 == null) {
			head_3007 = newPasien_3007;
		} else {
			// telusuri ke node paling akhir lalu sambungkan
			Pasien_2511533007 last_3007 = head_3007;
			while (last_3007.next_3007 != null) {
				last_3007 = last_3007.next_3007;
			}
			last_3007.next_3007 = newPasien_3007;
		}
		System.out.println("\nPasien berhasil didaftarkan");
		System.out.println("Nomor Antrian: " + counterAntrian_3007);
	}

	// fungsi memanggil pasien terdepan (delete head)
	public static void panggilPasien_3007() {
		if (head_3007 == null) {
			System.out.println("\nAntrian kosong, tidak ada pasien yang bisa dipanggil.");
			return;
		}
		// tampilkan data lalu geser head ke node berikutnya
		System.out.println("\nMemanggil pasien: ");
		cetakDataPasien_3007(head_3007);
		head_3007 = head_3007.next_3007;
	}

	// fungsi menampilkan seluruh antrian (display)
	public static void tampilkanAntrian_3007() {
		if (head_3007 == null) {
			System.out.println("\nAntrian kosong.");
			return;
		}
		System.out.println("\nDAFTAR ANTRIAN PASIEN");
		Pasien_2511533007 curr_3007 = head_3007;
		int posisi_3007 = 1;

		// telusuri dari head hingga null
		while (curr_3007 != null) {
			System.out.println("Posisi ke " + posisi_3007);
			cetakDataPasien_3007(curr_3007);
			curr_3007 = curr_3007.next_3007;
			posisi_3007++;
		}
		System.out.println("");
	}

	// fungsi mencari pasien berdasarkan nama
	public static void cariPasien_3007(String namaCari_3007) {
		Pasien_2511533007 curr_3007 = head_3007;
		boolean ditemukan_3007 = false;

		// telusuri seluruh list
		while (curr_3007 != null) {
			if (curr_3007.getNamaPasien_3007().equalsIgnoreCase(namaCari_3007)) {
				if (!ditemukan_3007)
					System.out.println("\nHasil pencarian:");
				cetakDataPasien_3007(curr_3007);
				ditemukan_3007 = true;
			}
			curr_3007 = curr_3007.next_3007;
		}

		if (!ditemukan_3007)
			System.out.println("\nPasien dengan nama \"" + namaCari_3007 + "\" tidak ditemukan.");
	}

	// fungsi mengecek status antrian
	public static void cekStatusAntrian_3007() {
		if (head_3007 == null) {
			System.out.println("\nAntrian kosong, tidak ada pasien saat ini.");
			return;
		}
		// hitung total pasien dengan menelusuri list
		int total_3007 = 0;
		Pasien_2511533007 curr_3007 = head_3007;
		while (curr_3007 != null) {
			total_3007++;
			curr_3007 = curr_3007.next_3007;
		}
		System.out.println("\nSTATUS ANTRIAN ");
		System.out.println("Total pasien dalam antrian:" + total_3007);
		System.out.println("Pasien terdepan: ");
		cetakDataPasien_3007(head_3007);
		System.out.println("");
	}

	// helper mencetak data satu node pasien
	private static void cetakDataPasien_3007(Pasien_2511533007 p_3007) {
		System.out.println("No. Antrian: " + p_3007.getNomorAntrian_3007());
		System.out.println("Nama: " + p_3007.getNamaPasien_3007());
		System.out.println("Penyakit: " + p_3007.getPenyakit_3007());
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner scanner_3007 = new Scanner(System.in);
		int pilihan_3007;

		do {
			System.out.println("SISTEM ANTRIAN RUMAH SAKIT");
			System.out.println("");
			System.out.println("1. Daftarkan Pasien (Insert)");
			System.out.println("2. Panggil Pasien (Delete Head)");
			System.out.println("3. Tampilkan Antrian (Display)");
			System.out.println("4. Cari Pasien (Search)");
			System.out.println("5. Cek Status Antrian ");
			System.out.println("6. Keluar ");
			System.out.println("");
			System.out.print("Pilih menu (1-6): ");
			pilihan_3007 = scanner_3007.nextInt();
			scanner_3007.nextLine();

			switch (pilihan_3007) {
			case 1:
				System.out.print("Masukkan Nama Pasien : ");
				String nama_3007 = scanner_3007.nextLine();
				System.out.print("Masukkan Keluhan     : ");
				String keluhan_3007 = scanner_3007.nextLine();
				daftarkanPasien_3007(nama_3007, keluhan_3007);
				break;

			case 2:
				panggilPasien_3007();
				break;

			case 3:
				tampilkanAntrian_3007();
				break;

			case 4:
				System.out.print("Nama yang dicari: ");
				String namaCari_3007 = scanner_3007.nextLine();
				cariPasien_3007(namaCari_3007);
				break;

			case 5:
				cekStatusAntrian_3007();
				break;

			case 6:
				System.out.println("\nSistem antrian ditutup. Terima kasih.");
				break;

			default:
				System.out.println("\nPilihan tidak valid, masukkan angka 1-6.");
			}
		} while (pilihan_3007 != 6);

		scanner_3007.close();
	}
}