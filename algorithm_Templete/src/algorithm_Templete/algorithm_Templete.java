package algorithm_Templete;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class algorithm_Templete<T extends Number> {
    private long start;
    private long end;
    protected int cnt;
    protected int bound;


    public void print_target(List list) {
        for (Object a : list) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    protected void print_templete(String name) {
        System.out.println(">>>> " + name + " (ascending order)");
    }

    public ArrayList<Object> make_list(int cnt, int bound) {

        ArrayList<Object> tmp = new ArrayList<Object>();
        Random random = new Random();

        for (int a = 0; a < cnt; a++) {
            tmp.add((Object) random.nextInt(bound));
        }
        System.out.println("Before sort");
        print_target(tmp);
        return tmp;
    }

    public void run() {
        start_time();
        algorithm();
        end_time();
    }
    public void algorithm(){
        //algorithm here
    }

    private void start_time() {
        start = System.currentTimeMillis();  //시작시간
    }
    private void end_time() {
        end = System.currentTimeMillis();  //종료시간
        System.out.println("running time: " + (long) (end - start) / 1000.0 + "s");
    }


}
