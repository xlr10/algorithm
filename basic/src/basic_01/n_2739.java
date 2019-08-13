package basic_01;

import java.util.Scanner;

public class n_2739 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int a=1;a<=9;a++){
            System.out.println(num+" * "+a+" = "+(a*num));
        }
    }
}
