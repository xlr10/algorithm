package insert_sort;

import algorithm_Templete.algorithm_Templete;


import java.util.List;

public class insert_sort<T> extends algorithm_Templete{

    public insert_sort(){
        print_templete("Insert Sort");
    }

    @Override
    public void run(int cnt, int bound) {
        List<T> target=make_list(10,100);
        System.out.println("Before sort");
        print_target(target);


        for(int a=1;a<target.size();a++){
            for(int b=0;b<a;b++){
                if((Integer)target.get(b) > (Integer)target.get(a)){
                    Object tmp = target.get(a);
                    target.remove(a);
                    target.add(b,(T)tmp);
                }
            }
        }

        System.out.println("Atfer sort");
        print_target(target);
        System.out.println();
    }
}
