package basic_01;

import java.util.Scanner;

public class n_10992 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();

        for(int a=0;a<cnt-1;a++){
            for(int b=0;b<cnt+a;b++){
                if(b==cnt-1-a || b==cnt+a-1)    System.out.print("*");
                else                            System.out.print(" ");
            }
            System.out.println();
        }
        for(int a=0;a<cnt*2-1;a++)  System.out.print("*");
        System.out.println();
    }
}
