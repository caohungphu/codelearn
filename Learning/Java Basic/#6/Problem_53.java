//https://codelearn.io/learning/java-co-ban/1195069

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 1;
		while (b > 0) {
			answer *= a;
			b--;
		}
		System.out.print(answer);
	}
}