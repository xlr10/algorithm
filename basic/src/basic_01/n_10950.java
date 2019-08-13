package basic_01;

import java.util.Scanner;

public class n_10950 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();

        for (int a=0;a<cnt;a++){
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }
    }
}
