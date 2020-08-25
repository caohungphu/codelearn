//https://codelearn.io/learning/java-co-ban/64587

import java.util.Scanner;

public class SelectionStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > 0 && y > 0)
            System.out.println("This point lies in the First quadrant");
        else if (x < 0 && y > 0)
            System.out.println("This point lies in the Second quadrant");
        else if (x < 0 && y < 0)
            System.out.println("This point lies in the Third quadrant");
        else
            System.out.println("This point lies in the Fourth quadrant");
    }
}