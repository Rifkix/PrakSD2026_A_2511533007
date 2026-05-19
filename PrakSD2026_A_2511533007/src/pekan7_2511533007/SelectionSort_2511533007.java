package pekan7_2511533007;

public class SelectionSort_2511533007 {
	public static void selectionSort_3007 (int[] arr_3007) {
		int n_3007 = arr_3007.length;
		for (int i = 0; i < n_3007; i++) {
			int  minIndex_3007 = i;
			for (int j = i + 1; j < n_3007; j++) {
				if (arr_3007[j] < arr_3007[minIndex_3007]) {
					minIndex_3007 = j;
				}
			}
			int temp_3007 = arr_3007[i];
			arr_3007[i] = arr_3007[minIndex_3007];
			arr_3007[minIndex_3007] = temp_3007;
		}
	}
	public static void main(String[] args) {
		int arr_3007[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_3007= arr_3007.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n_3007; i++)
			System.out.print(arr_3007[i] + " ");
		System.out.println("");
		selectionSort_3007(arr_3007);
		System.out.printf("array yang terurut:\n");
		for (int i = 0; i < n_3007; i++) 
			System.out.print(arr_3007[i] + " ");
		System.out.println("");
	}

}
