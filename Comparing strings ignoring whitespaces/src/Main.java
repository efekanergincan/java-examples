import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String kelime1= scanner.nextLine();
        String kelime2=scanner.nextLine();

        String kelime12=kelime1.replace(" ","");
        String kelime22=kelime2.replace(" ","");

        System.out.println(kelime12.equals(kelime22));

    }
}