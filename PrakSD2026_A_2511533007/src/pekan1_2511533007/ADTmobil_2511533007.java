package tugasADT;

import java.util.ArrayList;

public class ADTmobil_2511533007 {
    private String nama;
    private int tahun;
    private int cc;
    private int harga;
    private String merk;
    private ArrayList<ADTmobil_2511533007> daftarMobil;

    public ADTmobil_2511533007() {
        this.daftarMobil = new ArrayList<>();
    }

    public ADTmobil_2511533007(String nama, int tahun, int cc, int harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    public String getNama() {
    	return nama;
    }
    public int getTahun() {
    	return tahun;
    }
    public int getCc() {
    	return cc;
    }
    public int getHarga() {
    	return harga;
    }
    public String getMerk() {
    	return merk;
    }
    
    public ArrayList<ADTmobil_2511533007> getDaftarMobil() {
    	return daftarMobil;
    }

    public void setNama(String nama) {
    	this.nama = nama;
    }
    public void setTahun(int tahun) {
    	this.tahun = tahun;
    }
    public void setCc(int cc) {
    	this.cc = cc;
    }
    public void setHarga(int harga) {
    	this.harga = harga;
    }
    public void setMerk(String merk) {
    	this.merk = merk;
    }

    public void tambahMobil(ADTmobil_2511533007 m) {
        daftarMobil.add(m);
        System.out.println("Daftar mobil : " + this.getDaftarMobil());
    }

    public void hapusMobil(ADTmobil_2511533007 m) {
        daftarMobil.remove(m);
        System.out.println("Daftar mobil setelah dihapus : " + this.getDaftarMobil());
    }

    public String toString() {
        return nama + ", " + tahun + ", " +cc + ", " + harga + ", " + merk;
    }
}
