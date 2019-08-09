package main;

import bubble_sort.bubble_sort;
import insert_sort.insert_sort;
import merge_sort.merge_sort;
import selection_sort.selection_sort;

import java.util.*;


public class main {
    public static void main(String[] args) {
        System.out.println();
        //입력받기

        int cnt=10;
        int bound=100;

        selection_sort<Integer> select=new selection_sort<Integer>();
        select.run(cnt,bound);

        bubble_sort<Integer> bubble=new bubble_sort<Integer>();
        bubble.run(cnt,bound);

        insert_sort<Integer> insert=new insert_sort<Integer>();
        insert.run(cnt,bound);


        merge_sort merge =new merge_sort();
        merge.run(cnt,bound);





    }
}
