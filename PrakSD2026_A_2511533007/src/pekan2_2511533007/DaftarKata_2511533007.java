package pekan2_2511533007;
import java.util.ArrayList;

public class DaftarKata_2511533007 {
	private final ArrayList<String> data;
	// Konstruktor: inisialisasi list kosong
	public DaftarKata_2511533007() {
		this.data = new ArrayList<>();
	}
	/** Menambahkan elemen di akhir list. */
	public void tambah_2511533007(String elemen) {
		data.add(elemen);
	}
	/** Menambahkan elemen pada index tertentu (menyisipkan). */
	public void tambahPada_2511533007(int index, String elemen) {
		data.add(index, elemen);
		
	}
	/**
	 * Mengubahelemen pada posisi 'index' menjadi'nilai baru'
	 * Bertindak sebagai "setter" untuk elemen tertentu.
	 */
	public void ubahElemen_2511533007(int index, String nilaiBaru) {
		data.set(index,  nilaiBaru);
		
	}
	/**
	 * Mengahpus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus.
	 */
	public String hapusElemen_2511533007(int index) {
		return data.remove(index);
		
	}
	public void iterasiCetak_2511533007() {
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i) + " ");
		}
	}
	/** Mengambil elemen berdasarkan indeks. */
	public String get(int index) {
		return data.get(index);
		
	}
	@Override
	public String toString () {
		return data.toString();
	}

}
