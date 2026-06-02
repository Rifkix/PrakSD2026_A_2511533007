package pekan8_2511533007;

public class ShellSort_2511533007 {
	public static void shellSort_3007 (int[] A_3007) {
		int n_3007 = A_3007.length;
		int gap_3007 = n_3007 / 2;
		while (gap_3007 > 0) {
			for (int i_3007 = gap_3007; i_3007 < n_3007; i_3007++) {
				int temp_3007 = A_3007[i_3007];
				int j_3007 = i_3007;
				while (j_3007 >= gap_3007 && A_3007[j_3007 - gap_3007] > temp_3007) {
					A_3007[j_3007] = A_3007[j_3007-gap_3007];
					j_3007 = j_3007 - gap_3007;
				}
				A_3007[j_3007] = temp_3007;
			}
			gap_3007 = gap_3007 / 2;
		}
	}

	public static void main(String[] args) {
		int[] data_3007 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray_3007(data_3007);
		
		shellSort_3007(data_3007);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray_3007(data_3007);
	}
	
	public static void printArray_3007 (int[] arr_3007) {
		for (int i_3007 : arr_3007) System.out.print(i_3007 + " ");
		System.out.println();
	}

}
