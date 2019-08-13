package basic_02;

import java.util.*;

public class n_1158 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int people=scanner.nextInt();
        int cnt=scanner.nextInt();

        List<Integer> output=new ArrayList<>();
        Queue<Integer>queue=new ArrayDeque<>();
        for(int a=0;a<people;a++)   queue.offer(a+1);


        for (int i=1;queue.size()!=1;i++){
            if(i%cnt == 0)  output.add(queue.poll());
            else            queue.offer(queue.poll());
        }
        output.add(queue.poll());

        StringBuilder tmp=new StringBuilder();
        tmp.append("<");
        for(int a=0;a<output.size();a++){
            tmp.append(output.get(a));
            if(a!=output.size()-1)   tmp.append(", ");
        }
        tmp.append(">");

        System.out.println(tmp);
    }
}
