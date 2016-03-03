import java.util.Stack;

public class S1 {
	private static boolean isValidBrackets(String str) {
		Stack<Character> s = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (c == '{' || c == '(' || c == '[') {
				s.push(c);		
			} else if (s.isEmpty()) {
				return false;
			} else if (c == '}') {
				if (s.pop() != '{') {
					return false;
				}
			} else if (c == ')') {
				if (s.pop() != '(') {
					return false;
				}
			} else if (c == ']') {
				if (s.pop() != '[') {
					return false;
				}
			}	
		}
		
		return s.isEmpty();
	}
	
	public static void main(String[] args) {
		String str = "}{}{()()}";
		
		System.out.println(isValidBrackets(str));
	}
}
