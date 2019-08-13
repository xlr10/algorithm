package basic_01;

import java.util.Scanner;

public class n_11721 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String tmp = scanner.nextLine();

        for(int a=0;a<tmp.length();a++){
            if(a%10 == 0 && a!=0) System.out.println();
            System.out.print(tmp.charAt(a));
        }
    }
}
