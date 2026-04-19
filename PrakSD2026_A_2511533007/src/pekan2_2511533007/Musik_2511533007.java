package pekan2_2511533007;

public class Musik_2511533007 {

	private String judul_3007;
	private String penyanyi_3007;
	private int durasi_3007;

	//constructor
	public Musik_2511533007(String judul_3007, String penyanyi_3007, int durasi_3007) {
		this.judul_3007 = judul_3007;
		this.penyanyi_3007 = penyanyi_3007;
		this.durasi_3007 = durasi_3007;
	}

	//selektor/getter
	public String getJudul_3007() {
		return judul_3007;
	}

	public String getPenyanyi_3007() {
		return penyanyi_3007;
	}

	public int getDurasi_3007() {
		return durasi_3007;
	}

	//mutator/setter
	public void setJudul_3007(String judul_3007) {
		this.judul_3007 = judul_3007;
	}

	public void setPenyanyi_3007(String penyanyi_3007) {
		this.penyanyi_3007 = penyanyi_3007;
	}

	public void setDurasi_3007(int durasi_3007) {
		this.durasi_3007 = durasi_3007;
	}

	@Override
	public String toString() {
		return "Judul: " + judul_3007 + "\nPenyanyi: " + penyanyi_3007 + "\nDurasi: " + durasi_3007 + " detik";
	}
}