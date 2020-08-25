//https://codelearn.io/learning/java-co-ban/64056

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping, a = " + a + ", b = " + b);
	}
}
