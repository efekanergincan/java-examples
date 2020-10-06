import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int a=scanner.nextInt();
       int b=scanner.nextInt();
       int[] c=new int[100];
       int i;
       int count=0;

       for(i=0;i<b;i++){
           c[i]=scanner.nextInt();
       }

       for(int d=0;d<b;d++){
           if(a<c[d]){
               count++;
           } else if(a>=c[d]){
               d++;
               System.out.println("Will crash on bridge"+" "+d);
               break;
           }
       }
        if(count==b){
            System.out.println("Will not crash");
        }
    }
}