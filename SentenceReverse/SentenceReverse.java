import java.util.Arrays;

public class SentenceReverse {
	
	private static void reverse(String[] arr, int p, int q) {
		
		for (int i = 0; (p + i) < (q - i); i++) {
			swap(arr, p + i, q - i);	
		}	
		
	}
	
	private static void swap(String[] arr, int p, int q) {
		String temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
	}
	
	public static void main(String[] args) {
		String[] arr = {"p", "e", "r", "f", "e", "c", "t", " ", "m", "a", "k", "e", "s", " ", "p", "r", "a", "c", "t", "i", "c", "e"};
		
		System.out.println(Arrays.toString(arr));
		
		reverse(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));
		
		int p = 0;
		int q = p;
		
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(" ")) {
				reverse(arr, p, q - 1);
				p = i + 1;
				q = p;
			} else {
				q++;
			}
			
		}
		
		reverse(arr, p, q - 1);
		
		System.out.println(Arrays.toString(arr));
				
	}

}
