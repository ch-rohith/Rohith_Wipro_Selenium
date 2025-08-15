package day_8_assignment;
import java.util.Stack;
public class balanced_parentheses {
	
	 public static void main(String[] args)
	 {
	  String exp = "(a+b) * (c-d)";
	  Stack<Character> st = new Stack<>();
	  for (char c : exp.toCharArray()) {
	  if (c == '(') st.push(c);
	  if (c == ')') st.pop();
	  }
	  System.out.println(st.isEmpty() ? "Valid" : "Invalid");
	  }
	 }

