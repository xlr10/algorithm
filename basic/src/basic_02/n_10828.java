package basic_02;

import java.util.Scanner;
import java.util.Stack;

public class n_10828 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();
        scanner.nextLine();

        for(int a=0;a<cnt;a++){
            String tmp[]=scanner.nextLine().split(" ");

            switch (tmp[0]){
                case "push":
                    stack.push(Integer.valueOf(tmp[1]));
                    break;
                case "pop":
                    if (stack.empty()) System.out.println(-1);
                    else System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.empty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "top":
                    if(stack.empty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                    break;
            }
        }
    }
}
