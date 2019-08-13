package basic_01;

import java.util.Scanner;

public class n_10951 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNextInt()){
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }
    }
}
