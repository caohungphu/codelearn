//https://codelearn.io/learning/java-co-ban/64174

import java.util.Scanner;

public class Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if (a.equals(b)) {
			System.out.println("two people have the same name");
		} else {
			System.out.println("two people don't have the same name");
		}
	}
}