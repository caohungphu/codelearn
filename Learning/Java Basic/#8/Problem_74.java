//https://codelearn.io/learning/java-co-ban/62172

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int answer = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				answer++;
		System.out.print(answer);
	}
}