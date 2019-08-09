package merge_sort;

import algorithm_Templete.algorithm_Templete;

import java.util.*;

public class merge_sort extends algorithm_Templete{

    //1. 재귀
    //2. 링크드 리스트

    public merge_sort() {
        print_templete("Merge Sort");
    }

    private void devide_list(List<Integer> list, int left, int right){
        if(left < right ){
            int mid= (left+right)/2;

            devide_list(list,left,mid);

            devide_list(list,mid+1, right);

            conquer_list(list,left,mid,right);
        }
    }

    private void conquer_list(List<Integer> list, int left, int mid, int right){
        //Collection으로 구현

        //sublist()사용으로 파라미터 조정
        Queue<Integer> tmp_left=new ArrayDeque<Integer>(list.subList(left,mid+1));
        Queue<Integer> tmp_right=new ArrayDeque<Integer>(list.subList(mid+1,right+1));
        ArrayList<Integer> tmp=new ArrayList<Integer>();

        while (!tmp_left.isEmpty() && !tmp_right.isEmpty()){
            if(tmp_left.peek() < tmp_right.peek()){
                tmp.add(tmp_left.poll());
            }else {
                tmp.add(tmp_right.poll());
            }
            //print_arrlist(tmp);
        }

        //나머지 array 추가
        if(tmp_left.isEmpty())  tmp.addAll(tmp_right);
        else                    tmp.addAll(tmp_left);

        //print_arrlist(tmp);
        for (int a = left; a <= right; a++) {
            list.set(a, tmp.get(a - left));
        }
        //System.out.println();
    }

    private void print_arrlist(ArrayList<Integer> tmp){
        Iterator iterator=tmp.iterator();
        System.out.print("tmp>>");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }


    @Override
    public void run(int cnt, int bound) {
        List<Integer> target = make_list(cnt, bound);
        System.out.println("Before sort");
        print_target(target);

        devide_list(target, 0, target.size()-1);

        System.out.println("Atfer sort");
        print_target(target);
        System.out.println();
    }
}
