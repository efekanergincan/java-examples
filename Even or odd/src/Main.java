import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        while (a!=0){
            if (a % 2 == 0) {
                System.out.println("even");
                a=scanner.nextInt();
            }
            if(a%2!=0){
                System.out.println("odd");
                a=scanner.nextInt();
            }


        }
    }
}