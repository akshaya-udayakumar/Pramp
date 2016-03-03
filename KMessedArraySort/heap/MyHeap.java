package heap;

import java.util.*;

public class MyHeap {
	private List<Integer> arr;
	
	public MyHeap() {
		// TODO Auto-generated constructor stub
		this.arr = new ArrayList<Integer>();
	}
	
	public void insert(int i) {
		this.arr.add(i);
		siftUp();
	}
	
	public int extractMin() {
		int min = this.arr.get(0);
		this.arr.set(0, this.arr.get(arr.size() - 1));
		this.arr.remove(arr.size() - 1);
		siftDown();
		return min;
	}
	
	public void siftUp() {
		int k = this.arr.size() - 1;
		int p = (k - 1) / 2;
		
		while (p >= 0 && arr.get(k) < arr.get(p)) {
			swap(k, p);
			k = p;
			p = (k - 1) / 2;
		}				
	}
	
	public void siftDown() {
		int parentIndex = 0;
		int leftChildIndex = 2 * parentIndex + 1;
		int rightChildIndex = 2 * parentIndex + 2;
		
		int minChildIndex = leftChildIndex;
		if (rightChildIndex < this.arr.size() && arr.get(rightChildIndex) < arr.get(leftChildIndex)) {
			minChildIndex = rightChildIndex;
		}
		
		while (minChildIndex < arr.size() && arr.get(parentIndex) > arr.get(minChildIndex)) {
			swap(parentIndex, minChildIndex);
			parentIndex = minChildIndex;
			leftChildIndex = 2 * parentIndex + 1;
			rightChildIndex = 2 * parentIndex + 2;
			
			minChildIndex = leftChildIndex;
			if (rightChildIndex < this.arr.size() && arr.get(rightChildIndex) < arr.get(leftChildIndex)) {
				minChildIndex = rightChildIndex;
			}
		}
		
	}
	
	private void swap(int k, int p) {
		int temp = this.arr.get(k);
		this.arr.set(k, this.arr.get(p));
		this.arr.set(p, temp);
	}
	
	public int size() {
		return this.arr.size();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "";
		for (int i = 0; i < this.arr.size(); i++) {
			s += this.arr.get(i) + " ";
		}
		return s;
	}
}
