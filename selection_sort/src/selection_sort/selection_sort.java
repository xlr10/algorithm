package selection_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class selection_sort {
    public static void main(String[] args) {
        System.out.println();

        List<Integer> target = make_list(10, 100);
        print_target(target);

        Collections.sort(target);
        print_target(target);

        Collections.reverse(target);
        print_target(target);
        System.out.println("target's Maximum num: " + Collections.max(target));


        long start=System.currentTimeMillis();  //실행시간 시작

        System.out.println();
        System.out.println(">>>> Selection Sort (ascending order)");
        List<Integer> target2 = make_list(1000, 100);
        System.out.print("before: ");
        print_target(target2);


        for (int a = 0; a < target2.size(); a++) {
            for (int b = a; b < target2.size(); b++) {
                if(target2.get(a)>target2.get(b))   Collections.swap(target2,a,b);
            }
        }

        System.out.print("after:  ");
        print_target(target2);

        long end = System.currentTimeMillis();
        System.out.println("running time: "+ (long)(end-start)/1000.0+"s");


    }




    public static void print_target(List<Integer> list) {
        for (int a : list) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> make_list(int cnt, int bound) {

        ArrayList<Integer> tmp = new ArrayList<Integer>();
        Random random = new Random();

        for (int a = 0; a < cnt; a++) {
            tmp.add(random.nextInt(bound));
        }
        return tmp;
    }

}
