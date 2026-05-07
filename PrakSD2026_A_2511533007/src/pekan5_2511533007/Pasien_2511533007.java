package pekan5_2511533007;

public class Pasien_2511533007 {

	// Atribut data pasien
	private String namaPasien_3007;
	private String penyakit_3007;
	private int nomorAntrian_3007;
	Pasien_2511533007 next_3007;

	// Constructor menginisialisasi semua atribut
	public Pasien_2511533007(String namaPasien_3007, String penyakit_3007, int nomorAntrian_3007) {
		this.namaPasien_3007 = namaPasien_3007;
		this.penyakit_3007 = penyakit_3007;
		this.nomorAntrian_3007 = nomorAntrian_3007;
		this.next_3007 = null;
	}

	// Getter untuk setiap atribut
	public String getNamaPasien_3007() {
		return namaPasien_3007;
	}
	public String getPenyakit_3007() {
		return penyakit_3007;
	}
	public int getNomorAntrian_3007() {
		return nomorAntrian_3007;
	}
	public Pasien_2511533007 getNext_3007() {
		return next_3007;
	}

	// Setter untuk setiap atribut
	public void setNamaPasien_3007(String namaPasien_3007) {
		this.namaPasien_3007 = namaPasien_3007;
	}
	public void setPenyakit_3007(String penyakit_3007) {
		this.penyakit_3007 = penyakit_3007;
	}
	public void setNomorAntrian_3007(int nomorAntrian_3007) {
		this.nomorAntrian_3007 = nomorAntrian_3007;
	}
	public void setNext_3007(Pasien_2511533007 next_3007) {
		this.next_3007 = next_3007;
	}
}