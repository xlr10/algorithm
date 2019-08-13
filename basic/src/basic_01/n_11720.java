package basic_01;

import java.util.Scanner;

public class n_11720 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();
        scanner.nextLine();
        String num=scanner.nextLine();
        int tmp=0;

        for(int a=0;a<cnt;a++){
            tmp+=num.charAt(a)-'0';
        }
        System.out.println(tmp);
    }
}
