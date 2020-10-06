import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a<1) {
            System.out.print("no army");
        } else if(a>=1 && a<=19) {
            System.out.print("pack");
        } else if(a>=20 && a<=249) {
            System.out.print("throng");
        } else if (a>=250 && a<=999) {
            System.out.print("zounds");
        } else if (a>=1000){
            System.out.print("legion");
        }
    }
}