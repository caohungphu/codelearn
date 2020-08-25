//https://codelearn.io/learning/java-co-ban/7646

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long answer = 1;
		for (int i = 1; i <= n; i++)
			answer *= i;
		System.out.print(answer);
	}
}