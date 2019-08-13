package basic_02;

import java.util.Scanner;
import java.util.Stack;

public class n_9012 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int cnt=scanner.nextInt();
        scanner.nextLine();

        for(int a=0;a<cnt;a++){
            Stack<Character> stack=new Stack<>();
            String ps=scanner.nextLine();
            for(int b=0;b<ps.length();b++){
                if(stack.isEmpty()){
                    stack.push(ps.charAt(b));
                }else{
                    if(stack.peek()=='(' && ps.charAt(b)==')')  stack.pop();
                    else stack.push(ps.charAt(b));
                }
            }
            if(stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
