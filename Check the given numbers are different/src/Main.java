import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first=scanner.nextInt();
        int second=scanner.nextInt();
        int third=scanner.nextInt();

        boolean a=first!=second && second!=third && first!=third;
        System.out.print(a);
    }
}