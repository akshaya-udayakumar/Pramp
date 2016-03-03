import java.util.HashMap;
import java.util.Map;

public class Solution {
	private static String minStr(char[] arr, String str) {
		Map<Character, Integer> dic = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			dic.put(arr[i], 0);
		}
		int start = 0;
		int end = 0;
		int count = 0;
		int minLength = str.length();
		String result = "";
		
		while (end < str.length()) {	
			while (dic.containsValue(0)) {
				char h = str.charAt(end++);
				dic.put(h, dic.get(h) + 1);
				count++;
			}
			
			if (count < minLength) {
				minLength = count;
				result = str.substring(start, end);
			}
			
			int c = ((dic.get(str.charAt(start)) - 1) >= 0) ? (dic.get(str.charAt(start)) - 1) : 0;
			dic.put(str.charAt(start), c);
			start++;
			count--;		
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		char[] arr = {'x', 'y', 'z', 'r'};
		String str = "xyyrrryrxxyrryzyyyyyyx";
		
		System.out.println(minStr(arr, str));
	}
}
