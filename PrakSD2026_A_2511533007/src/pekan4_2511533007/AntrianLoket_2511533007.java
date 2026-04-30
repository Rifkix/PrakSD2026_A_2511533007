package pekan4_2511533007;

import java.util.*;

public class AntrianLoket_2511533007 {

    static void tampilkanMenu_3007() {
        System.out.println("=== PROGRAM ANTRIAN LOKET ===");
        System.out.println("");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Hapus Antrian");
        System.out.println("3. Tampilkan Antrian");
        System.out.println("4. Reverse Antrian");
        System.out.println("5. Keluar");
        System.out.println("");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc_3007 = new Scanner(System.in);
        Queue_2511533007 antrian_3007 = new Queue_2511533007(10);
        int choice_3007;

        do {
            tampilkanMenu_3007();
            choice_3007 = sc_3007.nextInt();
            sc_3007.nextLine(); 

            switch (choice_3007) {
                case 1: //tambah antrian
                    if (antrian_3007.isFull_3007()) {
                        System.out.println("Antrian penuh, tidak bisa menambah pelanggan");
                    } else {
                        System.out.print("Masukkan nama pelanggan: ");
                        String nama_3007 = sc_3007.nextLine();
                        antrian_3007.enqueue_3007(nama_3007);
                    }
                    break;
                case 2: //hapus antrian
                    String hapus_3007 = antrian_3007.dequeue_3007();
                    if (hapus_3007 != null) {
                        System.out.println(hapus_3007 + "telah dihapus");
                    }
                    break;
                case 3: //tampilkan antrian
                    antrian_3007.display_3007();
                    break;

                case 4: //reverse antrian
                    System.out.println("Sebelum reverse: ");
                    antrian_3007.display_3007();
                    antrian_3007.reverse_3007();
                    System.out.println("Sesudah reverse: ");
                    antrian_3007.display_3007();
                    break;
                case 5: // keluar
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }

        } while (choice_3007 != 5);

        sc_3007.close();
    }
}