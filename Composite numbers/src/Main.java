import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        int count = 0;

        for (int i = 1; i < number; i++) {
            if (number % i != 0 && number != 1) {
                count++;
            }
        }
        if (count == number - 2 || number ==1) {
            return false;
        } else
            return true;

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}
