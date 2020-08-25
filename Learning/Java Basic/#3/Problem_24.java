//https://codelearn.io/learning/java-co-ban/47331

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lenght = sc.nextInt();
		int width = sc.nextInt();
		System.out.println("Area = " + (lenght * width));
	}
}