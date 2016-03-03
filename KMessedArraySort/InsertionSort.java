import java.util.Arrays;

public class InsertionSort {
	
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 1, 5, 4, 8, 6, 10, 7, 9};
		
		for (int j = 1; j < arr.length; j++) {
			int i;
			int key = arr[j];
			
			for (i = j - 1; i >= 0 && arr[i] > key; i--) {
				arr[i + 1] = arr[i];
			}
			arr[i + 1] = key;
		}
		
		System.out.print(Arrays.toString(arr));
	}
}
