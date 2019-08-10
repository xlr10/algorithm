package insert_sort;

import algorithm_Templete.algorithm_Templete;


import java.util.Collections;
import java.util.List;

public class insert_sort<T> extends algorithm_Templete{

    public insert_sort(int cnt, int bound){
        print_templete("Insert Sort");
        this.cnt=cnt;
        this.bound=bound;
    }

    @Override
    public void algorithm() {
        List<T> target=make_list(cnt,bound);

        insert_sort_algorithm(target);

        System.out.println("Atfer sort");
        print_target(target);
    }

    public void insert_sort_algorithm(List target){
        for(int a=1;a<target.size();a++){
            for(int b=0;b<a;b++){
                if((Integer)target.get(b) > (Integer)target.get(a)){
                    Collections.swap(target,b,a);
                }
            }
        }
    }
}
