package pekan7_2511533007;

public class BubleSort {
	public static void bubbleSort_3007(int[] arr_3007) {
		int n_3007 = arr_3007.length;
		for (int i = 0; i < n_3007; i++) {
			for (int j = 0; j < n_3007 - i - 1; j++) {
				if (arr_3007[j] > arr_3007[j + 1]) {
					int temp_3007 = arr_3007[j];
					arr_3007[j] = arr_3007[j];
					arr_3007[j + 1] = temp_3007;
				//	System.out.println("data:" + arr[j] + " " + arr[j + 1]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr_3007[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_3007 = arr_3007.length;
		System.out.print("array yang belum terurut:");
		for (int i = 0; i < n_3007; i++)
			System.out.print(arr_3007[i] + " ");
		System.out.println("");
		bubbleSort_3007(arr_3007);
		System.out.print("array yang terurut menggunakan BubleSort:");
		for (int i = 0; i < n_3007; i++)
			System.out.print(arr_3007[i] + " ");
		System.out.println("");

	}

}
