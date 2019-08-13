package basic_02;

import java.util.Scanner;
import java.util.Stack;

public class n_10799 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String ps=scanner.nextLine();
        Stack<Integer> stack=new Stack<>();
        int cnt=0;

        for(int a=0;a<ps.length();a++){
            if(ps.charAt(a)=='('){
                stack.push(a);
            }else{
                if(stack.peek()+1==a){
                    stack.pop();
                    cnt+=stack.size();
                }else{
                    stack.pop();
                    cnt+=1;
                }
            }
        }
        System.out.println(cnt);
    }
}
