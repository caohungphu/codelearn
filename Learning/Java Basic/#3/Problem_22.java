//https://codelearn.io/learning/java-co-ban/47272

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		String name, address;
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		address = sc.next();
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
	}
}