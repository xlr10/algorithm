package basic_01;

import java.util.Scanner;

public class n_11021 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();

        for(int a=0;a<cnt;a++){
            System.out.println("Case #"+(a+1)+": "+(scanner.nextInt() + scanner.nextInt()));
        }
    }
}
