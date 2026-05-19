package pekan7_2511533007;

public class InsertionSort_2511533007 {
	public static void insertionSort_3007 (int[] arr_3007) {
		int n_3007 = arr_3007.length;
		for (int i = 1; i < n_3007; i++) {
			int key_3007 = arr_3007[i];
			int j = i - 1;
			while (j >= 0 && arr_3007[j] > key_3007) {
				arr_3007[j + 1] = arr_3007[j];
				j--;
			}
			arr_3007[j + 1] = key_3007;
		}
	}
	public static void main(String[] args) {
		int arr_3007[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_3007 = arr_3007.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n_3007; i++) 
			System.out.print(arr_3007[i] + " ");
		System.out.println("");
		insertionSort_3007(arr_3007);
		System.out.printf("array yang terurut:\n");
		for (int i = 0; i < n_3007; i++)
			System.out.print(arr_3007[i] + " ");
		System.out.println("");
	}

}
