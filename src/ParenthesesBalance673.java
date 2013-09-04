import java.util.Scanner;
import java.util.Stack;

//Problem link: http://uva.onlinejudge.org/external/6/673.html
public class ParenthesesBalance673 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//Read cases
		int cases = Integer.parseInt(in.nextLine());

		for (int i = 0; i < cases; i++) {
			String line = in.nextLine();
			//This is a common approach to brackets and parenthesis matching, we
			//use a stack...
			Stack<Character> stack = new Stack<Character>();
			//Start assuming is all good
			String answer = "Yes";

			//Go trough the line checking each character
			for (int j = 0; j < line.length(); j++) {
				char c = line.charAt(j);

				boolean goodChar = true;

				//Check if valid char
				switch (c) {
				case '(':
				case ')':
				case '[':
				case ']':
					break;
				default:
					goodChar = false;
					break;
				}

				if (goodChar) {
					//Its good char, OK, lets keep going...
					if (c == '(' || c == '[') { //Opening means pushing
						stack.push(c);
					} else {
						if (!stack.isEmpty()) { //Closing means popping
							//Check if we pop opening partner, if not, its bad string
							if (c == ')' && stack.peek() == '(') {
								stack.pop();
							} else if (c == ']' && stack.peek() == '[') {
								stack.pop();
							} else {
								answer = "No";
							}
						} else {
							answer = "No";
						}
					}
				} else { //Not good char, fails test
					answer = "No";
					break;
				}
			}

			//Stack is not empty, that means missing partner, not good
			if (stack.size() > 0) {
				answer = "No";
			}

			System.out.println(answer);
		}

	}

}
