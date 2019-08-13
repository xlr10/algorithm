package basic_01;

import java.util.Scanner;

public class n_2445 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();

        for(int a=0;a<cnt;a++){
            for(int b=0;b<(cnt*2);b++){
                if(b>a && b<(cnt*2-1)-a) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        for(int a=1;a<cnt;a++){
            for(int b=0;b<(cnt*2);b++){
                if(b>=cnt-a && b<cnt+a) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
