package basic_01;

import java.util.Scanner;

public class n_2444 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();

        for(int a=0;a<cnt;a++){
            for(int b=0;b<cnt+a;b++){
                if(b<cnt-a-1) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        for(int a=1;a<cnt;a++){
            for(int b=0;b<(cnt*2-1)-a;b++){
                if(b<a) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
