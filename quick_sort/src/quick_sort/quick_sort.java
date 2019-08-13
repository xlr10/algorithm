package quick_sort;

import algorithm_Templete.algorithm_Templete;

import java.util.*;

public class quick_sort<T> extends algorithm_Templete {


    public quick_sort(int cnt, int bound) {
        this.cnt = cnt;
        this.bound = bound;
        print_templete("Quick Sort");
    }

    @Override
    public void algorithm() {
        //1. 피벗값 설정 = 전체값중 3개 랜덤 후 그중 중간값 사용
        //2. 피벗 기준 좌우 부분 리스트
        //3. 재귀?
        //4. 피벗된 인덱스 체크 bool 배열?
        //전체 반 피벗-> 좌 우 재귀
        //선 배열로 구현/ 후 컬랙션

        List<Integer> target = make_list(cnt, bound);
        int tmp[] = new int[cnt];
        for (int a = 0; a < cnt; a++) {
            tmp[a] = target.get(a);
        }

        //재귀 알고리즘
        //here

        int rigth = cnt - 1;
        int left = 0;
        //Recursion_quick_sort(tmp, left, rigth);
        Recursion_quick_sort(tmp, left, rigth);

        System.out.println("Atfer sort");
        print_arr(tmp);

    }



    private void swap_arr(int[] arr,int from,int to){
        int tmp_index=arr[from];
        arr[from]=arr[to];
        arr[to]=tmp_index;
    }
    private void print_arr(int[] arr){
        for(int a: arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }




//    public int Divide_quick_sort(int[] target, int left, int right){
//        int low = left + 1;
//        int high = right;
//        int pivot = left;
//
//        //정렬 알고리즘
//        //here
//        System.out.print("pivot: " + pivot + " left:" + left + " right:" + right);
//        System.out.println();
//        System.out.print("low: " + low + " high:" + high);
//        System.out.println();
//        System.out.print("input arr     ");
//        print_arr(target);
//
//
//        while (low < high) {
//            System.out.println("while");
//            for (; low <= right && target[low] < target[pivot]; low++) {}
//            for (; high >= left && target[high] > target[pivot]; high--) {}
//
//            //for 논리로 인해 발생
//            // for low,hugh 증가감후 조건식 비교하기때문에 for 이후에 low>high 상황발생
//            if (low < high) {
//                System.out.print("low: " + low + " high:" + high);
//                System.out.println();
//                //swap
//                swap_arr(target, low, high);
//                System.out.print("swap arr       ");
//                print_arr(target);
//            }
//        }
//        //here to swap pivot
//        swap_arr(target, high, pivot);
//
//        return high;
//    }
    public void Recursion_quick_sort(int[] target, int left, int right) {

        int pivot=left;
        int j=pivot;
        int i=left+1;

        if(left<right){
            for(;i<=right;i++){
                if (target[i] < target[pivot]){
                    j++;
                    swap_arr(target,j,i);
                }
            }
            swap_arr(target,left,j);
            pivot=j;

            Recursion_quick_sort(target,left,pivot-1);
            Recursion_quick_sort(target,pivot+1,right);
        }

    }
}


