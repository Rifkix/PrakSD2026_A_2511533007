package pekan7_2511533007;

public class InsertionSort_2511533007 {
	public static void insertionSort_3007 (int[] arr_3007) {
		int n_3007 = arr_3007.length;
		for (int i_3007 = 1; i_3007 < n_3007; i_3007++) {
			int key_3007 = arr_3007[i_3007];
			int j_3007 = i_3007 - 1;
			while (j_3007 >= 0 && arr_3007[j_3007] > key_3007) {
				arr_3007[j_3007 + 1] = arr_3007[j_3007];
				j_3007--;
			}
			arr_3007[j_3007 + 1] = key_3007;
		}
	}
	public static void main(String[] args) {
		int arr_3007[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_3007 = arr_3007.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_3007 = 0; i_3007 < n_3007; i_3007++) 
			System.out.print(arr_3007[i_3007] + " ");
		System.out.println("");
		insertionSort_3007(arr_3007);
		System.out.printf("array yang terurut:\n");
		for (int i_3007 = 0; i_3007 < n_3007; i_3007++)
			System.out.print(arr_3007[i_3007] + " ");
		System.out.println("");
	}

}
