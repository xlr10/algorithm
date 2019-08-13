package basic_01;

import java.util.Scanner;

public class n_2522 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();

        for(int a=0;a<cnt;a++){
            for (int b=0;b<cnt;b++){
                if(cnt-a-1 <= b) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int a=0;a<cnt-1;a++){
            for (int b=0;b<cnt;b++){
                if(a+1 <= b) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
