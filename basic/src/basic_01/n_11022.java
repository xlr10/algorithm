package basic_01;

import java.util.Scanner;

public class n_11022 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();

        for(int i=0;i<cnt;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b));
        }
    }
}
