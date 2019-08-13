package basic_01;

import java.util.Scanner;

public class n_1924 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int month=scanner.nextInt();
        int day=scanner.nextInt();

        int end_day[]={0,31,28,31,30,31,30,31,31,30,31,30,31};  //13
        String week[]={"SUN","MON","TUE","WED","THU","FRI","SAT"};

        for(int a=0;a<month;a++){day+=end_day[a];}
        System.out.println(week[day%7]);
    }
}
