package pekan2_2511533007;

public class DaftarKataDriver_2511533007 {
	public static void main(String[] args) {
		DaftarKata_2511533007 a1 = new DaftarKata_2511533007();
		
		//Menambah elemen (akhir)
		a1.tambah_2511533007("Kami");
		a1.tambah_2511533007("Informatika");
		
		//Menyisipkan elemen pada indeks 1
		a1.tambahPada_2511533007(1,  "Mahasiswa");
		
		//cetak isi awal
		System.out.println("Awal : " + a1);
		
		//Mengubah elemen (index 1)
		a1.ubahElemen_2511533007(1,  "Department");
		System.out.println("Setelah Ubah: " + a1);
		
		//menghapus elemen (hapus index 0)
		String terhapus = a1.hapusElemen_2511533007(0);
		System.out.println("Terhapus : " + terhapus);
		System.out.println("Setelah Dihapus : " + a1);
		
		// Iterasi pada Arraylist (cetal setiap elemen)
		System.out.println("iterasi ");
		a1.iterasiCetak_2511533007();
		System.out.println();
	}

}
