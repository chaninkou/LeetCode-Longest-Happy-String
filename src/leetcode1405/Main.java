package leetcode1405;

public class Main {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 7;
		
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		
		StoreLongestHappyString solution = new StoreLongestHappyString();
		
		System.out.println("Solution: " + solution.longestDiverseString(a, b, c));
	}
}
