package basic_01;

import java.util.Scanner;

public class n_2440 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();
        for(int a=0;a<cnt;a++){
            for(int b=cnt-a;b>0;b--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
