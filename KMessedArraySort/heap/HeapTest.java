package heap;

import java.util.*;

public class HeapTest {
	private static MyHeap heap = new MyHeap();
	
	public static void main(String[] args) {
		int[] arr = {7, 34, 5656, 53, 3, 0, 88, 654, 5, 56, 77, 25};
		for (int i = 0; i < arr.length; i++) {
			heap.insert(arr[i]);
		}
		
		System.out.println(heap);
		
		List<Integer> hs = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(heap.extractMin());
		}
		
		System.out.println(hs);
		
	}
}
