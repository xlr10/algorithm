package basic_01;

import java.util.Scanner;

public class n_10953 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<cnt;i++){
            String tmp=scanner.next();
            int a=tmp.charAt(0)-'0';
            int b=tmp.charAt(2)-'0';

            System.out.println(a+b);
        }
    }
}
