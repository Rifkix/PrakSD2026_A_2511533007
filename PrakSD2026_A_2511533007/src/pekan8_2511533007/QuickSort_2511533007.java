package pekan8_2511533007;

public class QuickSort_2511533007 {
	static void swap_3007 (int[] arr_3007, int i_3007, int j_3007) {
		int temp_3007 = arr_3007[i_3007];
		arr_3007[i_3007] = arr_3007[j_3007];
		arr_3007[j_3007] = temp_3007;
	}
	// Metode tambahan untuk mengatur pivot menggubakan Median of three
	static void medianOfThree_3007 (int[] arr_3007, int low_3007, int high_3007) {
		int mid_3007 = low_3007 + (high_3007 - low_3007) / 2;
		
		// Urutkan elemen low, mid, dan high
		if (arr_3007[low_3007] > arr_3007[mid_3007]) {
			swap_3007(arr_3007, low_3007, mid_3007);
		}
		if (arr_3007[low_3007] > arr_3007[high_3007]) {
			swap_3007(arr_3007, low_3007, high_3007);
		}
		if (arr_3007[mid_3007] > arr_3007[high_3007]) {
			swap_3007(arr_3007, mid_3007, high_3007);
		}
		swap_3007 (arr_3007, mid_3007,high_3007);
	}
	static int partition_3007 (int[] arr_3007, int low_3007, int high_3007) {
		// Panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree_3007(arr_3007, low_3007, high_3007);
		
		int pivot_3007 = arr_3007[high_3007]; // Sekarang arr[high] sudah berisi nilai median
		int i_3007 = (low_3007 - 1);
		
		for (int j_3007 = low_3007; j_3007 <= high_3007 - 1; j_3007++) {
			// Jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr_3007[j_3007] < pivot_3007) {
				// Increment indeks elemen yang lebih kecil
				i_3007++;
				swap_3007(arr_3007, i_3007, j_3007);
			}
		}
		swap_3007 (arr_3007, i_3007 + 1, high_3007);
		return (i_3007 + 1);
	}
	static void quickSort_3007(int[] arr_3007, int low_3007, int high_3007) {
		if (low_3007 < high_3007) {
			int pi_3007 = partition_3007 (arr_3007, low_3007, high_3007);
			quickSort_3007(arr_3007, low_3007, pi_3007 - 1);
			quickSort_3007(arr_3007, pi_3007 + 1, high_3007);
		}
	}
	
	public static void printArr_3007(int[] arr_3007) {
		for (int i_3007 = 0; i_3007 < arr_3007.length; i_3007++) {
			System.out.print(arr_3007[i_3007] + " ");
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		int[] arr_3007 = { 10, 7, 8, 9, 1, 5 };
		int N_3007 = arr_3007.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_3007(arr_3007);
		
		quickSort_3007(arr_3007, 0, N_3007 - 1);
		
		System.out.print("Data Terurut quicksort: ");
		printArr_3007(arr_3007);
	}

}
