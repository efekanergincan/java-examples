
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int count=0;
        int[] n;
        n= new int[a];
        for(int i=0;i<a;i++){
            n[i]=scanner.nextInt();
            count=i;

        }
        Arrays.sort(n);
for(;count>=0;count--){
    if(n[count]%4==0){
        System.out.print(n[count]);
        break;
    }
}

    }

}