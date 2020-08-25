//https://codelearn.io/learning/java-co-ban/1195637

public class Loop {
	public static void main(String[] args) {
	    int i = 1;
	    do {
	        if (i % 10 == 0)
	    		System.out.print(i + " ");
			i += 1;
	    } while (i <= 1000);
	}
}