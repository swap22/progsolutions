//https://www.hackerrank.com/challenges/java-substring

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();

		System.out.println(S.substring(start, end));//print the string between start and end

		sc.close();
	}
}
