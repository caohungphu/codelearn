//https://codelearn.io/learning/java-co-ban/55204

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for (int i = 0; i <= n; i++)
			if (i % 2 != 0)
				answer = answer + i;
		System.out.println(answer);
	}
}