//https://codelearn.io/learning/java-co-ban/1194779

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print(i * 5 + j + " ");
			System.out.println();
		}
	}
}
