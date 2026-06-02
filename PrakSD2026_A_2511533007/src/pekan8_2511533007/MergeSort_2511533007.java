package pekan8_2511533007;

public class MergeSort_2511533007 {
	void merge_3007(int arr_3007[], int l_3007, int m_3007, int r_3007) {
		// Find sizes of two subarrays to be merged
		int n1_3007 = m_3007 - l_3007 + 1;
		int n2_3007 = r_3007 - m_3007;
		/* Create temp arrays */
		int L[] = new int[n1_3007];
		int R[] = new int[n2_3007];
		/* Copy data to temp arrays */
		for (int i_3007 = 0; i_3007 < n1_3007; ++i_3007)
			L[i_3007] = arr_3007[l_3007 + i_3007];
		for (int j_3007 = 0; j_3007 < n2_3007; ++j_3007)
			R[j_3007] = arr_3007[m_3007 + 1 + j_3007];
		int i_3007 = 0, j_3007 = 0;
		// Initial index of merged subarrays array
		int k_3007 = l_3007;
		while (i_3007 < n1_3007 && j_3007 < n2_3007) {
			if (L[i_3007] <= R[j_3007]) {
				arr_3007[k_3007] = L[i_3007];
				i_3007++;
			} else {
				arr_3007[k_3007] = R[j_3007];
				j_3007++;
			}
			k_3007++;
		}
		/* Copy remaining elements of L[] if any */
		while (i_3007 < n1_3007) {
			arr_3007[k_3007] = L[i_3007];
			i_3007++;
			k_3007++;
		}
		/* Copy remaining elements of R[] if any */
		while (j_3007 < n2_3007) {
			 arr_3007[k_3007] = R[j_3007];
			 j_3007++;
			 k_3007++;
		}
		 
	}
	void sort_3007(int arr_3007[], int l_3007, int r_3007) {
		if (l_3007 < r_3007) {
			// Find teh middle point
			int m_3007 = (l_3007 + r_3007) / 2;
			// Sort first and second halves
			sort_3007(arr_3007, l_3007, m_3007);
			sort_3007(arr_3007, m_3007 + 1, r_3007);
			// merge the sorted halves
			merge_3007(arr_3007, l_3007, m_3007, r_3007);
		}
	}
	/* A utility function to print array of size n */
	static void printArray_3007 (int arr_3007[]) {
		int n_3007 = arr_3007. length;
		 for (int i_3007 = 0; i_3007 < n_3007; ++i_3007)
			 System.out.print(arr_3007[i_3007] + " ");
		 System.out.println();
	}
	public static void main (String args []) {
		int arr_3007[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Sebelum terurut");
		printArray_3007(arr_3007);
		MergeSort_2511533007 ob_3007  = new MergeSort_2511533007();
		ob_3007.sort_3007(arr_3007, 0, arr_3007.length - 1);
		System.out.println("\nSesudah Terurut menggunakan merge Sort");
		printArray_3007(arr_3007);
	}
	
}
