//https://codelearn.io/learning/java-co-ban/712375

import java.util.Scanner;

public class Method {
	public static double circumference(double r) {
		return 2 * r * 3.14;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.print(circumference(r));
	}
}