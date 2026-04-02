package tugasADT;

public class MobilDriver_2511533007 {
    public static void main(String[] args) {
        ADTmobil_2511533007 daftar = new ADTmobil_2511533007();

        ADTmobil_2511533007 m1 = new ADTmobil_2511533007("Avanza", 2020, 1300, 150000000, "Toyota");
        ADTmobil_2511533007 m2 = new ADTmobil_2511533007("Xpander", 2021, 999, 180000000, "Mitsubishi");

        daftar.tambahMobil(m1);
        daftar.tambahMobil(m2);

        daftar.hapusMobil(m1);
    }
}