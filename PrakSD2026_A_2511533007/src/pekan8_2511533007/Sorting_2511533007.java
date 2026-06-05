package pekan8_2511533007;

import java.util.Scanner;

public class Sorting_2511533007 {
    // Array dataLagu untuk menyimpan maksimal 20 lagu
    Lagu_2511533007[] dataLagu_3007 = new Lagu_2511533007[20];
    int jumlah_3007 = 0;

    public void inputData_3007(Scanner scanner_3007) {
        // Validasi penentuan jumlah lagu sesuai batas maksimal tampungan array (20)
        while (true) {
            try {
                System.out.print("Masukkan jumlah lagu yang ingin diinput (min 7, maks 20): ");
                jumlah_3007 = Integer.parseInt(scanner_3007.nextLine());

                if (jumlah_3007 >= 7 && jumlah_3007 <= 20) {
                    break;
                } else {
                    System.out.println("Error, Jumlah lagu harus di antara 7 dan 20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error, Input tidak valid, Harap masukkan angka bulat");
            }
        }

        System.out.println("\n--- Silakan Masukkan Data Lagu ---");
        for (int i_3007 = 0; i_3007 < jumlah_3007; i_3007++) {
            System.out.println("Lagu ke" + (i_3007 + 1) + ":");

            // Input dan validasi Judul
            String judul_3007 = "";
            while (true) {
                System.out.print("  Judul    : ");
                judul_3007 = scanner_3007.nextLine().trim();
                if (!judul_3007.isEmpty()) {
                    break;
                }
                System.out.println("  Error, Judul lagu tidak boleh kosong");
            }

            // Input dan validasi Penyanyi
            String penyanyi_3007 = "";
            while (true) {
                System.out.print("  Penyanyi: ");
                penyanyi_3007 = scanner_3007.nextLine().trim();
                if (!penyanyi_3007.isEmpty()) {
                    break;
                }
                System.out.println("  Error, Nama penyanyi tidak boleh kosong");
            }

            // Input dan validasi Durasi
            int durasi_3007 = 0;
            while (true) {
                try {
                    System.out.print("  Durasi: ");
                    durasi_3007 = Integer.parseInt(scanner_3007.nextLine());
                    if (durasi_3007 > 0) {
                        break;
                    }
                    System.out.println("  Error,Durasi harus lebih besar dari 0 detik");
                } catch (NumberFormatException e) {
                    System.out.println("  Error, Input tidak valid, Harap masukkan angka bulat");
                }
            }

            // Membuat objek lagu baru berdasarkan input user ke dalam array
            dataLagu_3007[i_3007] = new Lagu_2511533007(judul_3007, penyanyi_3007, durasi_3007);
        }
    }

    // Method untuk menampilkan data sebelum dan sesudah sorting
    public void tampilData_3007() {
        for (int i_3007 = 0; i_3007 < jumlah_3007; ++i_3007) {
            System.out.println((i_3007 + 1) + ". " + dataLagu_3007[i_3007].toString_3007());
        }
    }
    
    // Swap dua elemen array Lagu
    static void swap_3007(Lagu_2511533007[] arr_3007, int i_3007, int j_3007) {
        Lagu_2511533007 temp_3007 = arr_3007[i_3007];
        arr_3007[i_3007] = arr_3007[j_3007];
        arr_3007[j_3007] = temp_3007;
    }

    // Metode tambahan untuk mengatur pivot menggunakan median-of-three
    static void medianOfThree_3007(Lagu_2511533007[] arr_3007, int low_3007, int high_3007) {
        int mid_3007 = low_3007 + (high_3007 - low_3007) / 2;

        // Urutkan berdasarkan durasi: low, mid, high
        if (arr_3007[low_3007].getDurasi_3007() > arr_3007[mid_3007].getDurasi_3007()) {
            swap_3007(arr_3007, low_3007, mid_3007);
        }
        if (arr_3007[low_3007].getDurasi_3007() > arr_3007[high_3007].getDurasi_3007()) {
            swap_3007(arr_3007, low_3007, high_3007);
        }
        if (arr_3007[mid_3007].getDurasi_3007() > arr_3007[high_3007].getDurasi_3007()) {
            swap_3007(arr_3007, mid_3007, high_3007);
        }
        // Pindahkan median ke posisi high sebagai pivot
        swap_3007(arr_3007, mid_3007, high_3007);
    }

    // Method partisi mendasarkan pada durasi lagu
    static int partition_3007(Lagu_2511533007[] arr_3007, int low_3007, int high_3007) {
        medianOfThree_3007(arr_3007, low_3007, high_3007);

        int pivot_3007 = arr_3007[high_3007].getDurasi_3007(); 
        int i_3007 = (low_3007 - 1);

        for (int j_3007 = low_3007; j_3007 <= high_3007 - 1; j_3007++) {
            if (arr_3007[j_3007].getDurasi_3007() < pivot_3007) {
                i_3007++;
                swap_3007(arr_3007, i_3007, j_3007);
            }
        }
        swap_3007(arr_3007, i_3007 + 1, high_3007);
        return (i_3007 + 1);
    }

    // Method utama Quick Sort secara rekursif
    static void quickSort_3007(Lagu_2511533007[] arr_3007, int low_3007, int high_3007) {
        if (low_3007 < high_3007) {
            int pi_3007 = partition_3007(arr_3007, low_3007, high_3007);
            quickSort_3007(arr_3007, low_3007, pi_3007 - 1);
            quickSort_3007(arr_3007, pi_3007 + 1, high_3007);
        }
    }

    public void quickSort_3007() {
        if (jumlah_3007 > 1) {
            quickSort_3007(dataLagu_3007, 0, jumlah_3007 - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner_3007 = new Scanner(System.in);
        Sorting_2511533007 playlist_3007 = new Sorting_2511533007();

        System.out.println("=== Sorting Playlist NIM: 2511533007 ===");
        playlist_3007.inputData_3007(scanner_3007);

        System.out.println("\nData Sebelum Sorting:");
        playlist_3007.tampilData_3007();

        playlist_3007.quickSort_3007();

        System.out.println("\nData Setelah Quick Sort:");
        playlist_3007.tampilData_3007();

        scanner_3007.close();
    }
}