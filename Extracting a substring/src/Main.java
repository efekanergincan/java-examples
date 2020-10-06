
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String kelime = scanner.next();
        int[] values = new int[2];
        for ( int i = 0; i <= 1; i++ ){
            values[i]=scanner.nextInt();

        }

        System.out.print(kelime.substring(values[0],values[1]+1));
    }
}
