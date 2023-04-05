package programmingChallenges;

public class Challenge45 {
	/**
	 * Without typing any digits in your code (eg: 1 2 3 4 5 6 7 8 9 0) output the numbers from 1 - 100:
	 *   > 1 2 3 ... 98 99 100
	 * 
	 * Your output should not spell out the names of the numbers ❌:
	 *   > one two three ... ninety-eight ninety-nine one-hundred
	 * 
	 * You can use integers in your solution, but you cannot assign them using digits. Spelling out
	 * a number's name or getting a number as a return value from a method are OK:
	 *   int num = 1; //❌ not allowed
	 *   char num = '1'; //❌ not allowed
	 *   String num = "1"; //❌ not allowed
	 *   int num = method(1); //❌ not allowed
	 *  
	 *   String num = "one"; //✅ allowed!
	 *   int num = method(); //✅ allowed!
	 * 
	 * There are at least 3 different methods of doing this, so see how many you can find!
	 */
	
	public static void methodOne() {
		// TODO implement the method
		
		//Here's some code to get you started!
		for (int i = ?; i < ?; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static void methodTwo() {
		// TODO find a second method
	}
	
	public static void methodThree() {
		// TODO and a third!
	}

	public static void main(String[] args) {
		methodOne();
		methodTwo();
		methodThree();
	}
}
