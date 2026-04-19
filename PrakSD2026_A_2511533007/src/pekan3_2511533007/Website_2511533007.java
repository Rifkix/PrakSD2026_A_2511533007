package pekan3_2511533007;

public class Website_2511533007 {
	
	private String judul_3007;
	private String URL_3007;
	
	//constructor
	public Website_2511533007(String judul_3007, String URL_3007) {
		this.judul_3007 = judul_3007;
		this.URL_3007 = URL_3007;
	}
	
	//selektor/getter
	public String getJudul_3007() {
		return judul_3007;
	}
	public String getURL_3007() {
		return URL_3007;
	}
	
	//mutator/setter
	public void setJudul_3007(String judul_3007) {
		this.judul_3007 = judul_3007;
	}
	public void setURL_3007(String URL_3007) {
		this.URL_3007 = URL_3007;
	}
	
	@Override
	public String toString() {
		return "Judul: " + judul_3007 + "\nURL: " + URL_3007;
	}

}
