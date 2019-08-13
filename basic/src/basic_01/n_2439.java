package basic_01;

import java.util.Scanner;

public class n_2439 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();
        for(int a=0;a<cnt;a++){
            for(int b=cnt-1;b>=0;b--){
                if(b<=a) System.out.print("*");
                else     System.out.print(" ");
            }
            System.out.println();
        }
    }
}
