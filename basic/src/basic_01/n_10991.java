package basic_01;

import java.util.Scanner;

public class n_10991 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();
        char mark[]={'*',' '};

        for(int a=0;a<cnt;a++){
            for(int b=0,c=0;b<cnt+a;b++){
                if(b>=cnt-1-a)  System.out.print(mark[(c++)%2]);
                else            System.out.print(" ");
            }
            System.out.println();
        }
    }
}
