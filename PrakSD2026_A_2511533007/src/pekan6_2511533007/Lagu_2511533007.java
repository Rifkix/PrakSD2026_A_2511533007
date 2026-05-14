package pekan6_2511533007;

public class Lagu_2511533007 {

	// Atribut
	private String judul_3007;
	private String penyanyi_3007;

	// Pointer
	Lagu_2511533007 next_3007;
	Lagu_2511533007 prev_3007;

	// Konstruktor
	public Lagu_2511533007(String judul_3007, String penyanyi_3007) {
		this.judul_3007 = judul_3007;
		this.penyanyi_3007 = penyanyi_3007;
		this.next_3007 = null;
		this.prev_3007 = null;
	}

	// Getter
	public String getJudul_3007() {
		return judul_3007;
	}

	public String getPenyanyi_3007() {
		return penyanyi_3007;
	}

	public Lagu_2511533007 getNext_3007() {
		return next_3007;
	}

	public Lagu_2511533007 getPrev_3007() {
		return prev_3007;
	}

	// Setter
	public void setJudul_3007(String judul_3007) {
		this.judul_3007 = judul_3007;
	}

	public void setPenyanyi_3007(String penyanyi_3007) {
		this.penyanyi_3007 = penyanyi_3007;
	}

	public void setNext_3007(Lagu_2511533007 next_3007) {
		this.next_3007 = next_3007;
	}

	public void setPrev_3007(Lagu_2511533007 prev_3007) {
		this.prev_3007 = prev_3007;
	}
}