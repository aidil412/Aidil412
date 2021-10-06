package src;
import java.util.Scanner;
import java.util.Stack;
public class StackAidil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean value = true;
		System.out.print("masukkan nilai aljabar = ");
		String str = input.nextLine();
		int l = str.length();
		value = true;
		Stack<String> st = new Stack<String>();
			for (int i = 0; i < l; i++) {
				String test = str.substring(i, i + 1);
				if (test.equals("(")) {
					st.push(test);
				} else if (test.equals("{")) {
					st.push(test);
				} else if (test.equals("[")) {
						st.push(test);
					} else if (test.equals(")")) {
						if (st.empty()) {
							value = false;
							break;
						}
						else if (st.peek().equals("(")) {
							st.pop();
						} else {
							value = false;
							break;
						}
					} else if (test.equals("}")) {
						if (st.empty()) {
							value = false;
							break;
						}
						if (st.peek().equals("{")) {
							st.pop();
						} else {
							value = false;
							break;
						}
					} else if (test.equals("]")) {
						if (st.empty()) {
							value = false;
							break;
						}
						if (st.peek().equals("[")) {
							st.pop();
						} else {
							value = false;
							break;
						}
					}
				}
			System.out.print("nilai validasinya = ");
			if (value && st.empty())
				System.out.println("valid");
			else
				System.out.println("tidak valid");

		}
	}