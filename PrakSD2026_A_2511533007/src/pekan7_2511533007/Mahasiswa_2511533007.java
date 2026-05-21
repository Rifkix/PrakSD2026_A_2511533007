package pekan7_2511533007;

public class Mahasiswa_2511533007 {
    // Atribut
    private String nama_3007;
    private String nim_3007;
    private String prodi_3007;

    // Konstruktor
    public Mahasiswa_2511533007(String nama_3007, String nim_3007, String prodi_3007) {
        this.nama_3007 = nama_3007;
        this.nim_3007 = nim_3007;
        this.prodi_3007 = prodi_3007;
    }

    // Getter
    public String getNama_3007() {
        return nama_3007;
    }

    public String getNim_3007() {
        return nim_3007;
    }

    public String getProdi_3007() {
        return prodi_3007;
    }

    // Setter
    public void setNama_3007(String nama_3007) {
        this.nama_3007 = nama_3007;
    }

    public void setNim_3007(String nim_3007) {
        this.nim_3007 = nim_3007;
    }

    public void setProdi_3007(String prodi_3007) {
        this.prodi_3007 = prodi_3007;
    }

    @Override
    public String toString() {
        return nama_3007;
    }
}