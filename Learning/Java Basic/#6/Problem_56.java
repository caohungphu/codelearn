//https://codelearn.io/learning/java-co-ban/1195557

public class Loop {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) continue;
			System.out.print(i + " ");
		}
	}
}
