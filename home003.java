package home003;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class home003 {
    public static void main(String[] args) {
        // ex01();
        ex02();
        ex03();
    }

    public static void ex02() {

    // 2.Пусть дан произвольный список целых чисел, удалить из него четные числа
        Random newran = new Random();
        int n = 10;
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            mylist.add(newran.nextInt(21));
        }
        System.out.println(mylist);
        Iterator<Integer> col = mylist.iterator();       
        while (col.hasNext()) {                    
            if (col.next() %2 == 0) col.remove();       
        }
        System.out.println(mylist);
    }

    public static void ex03() {
        // 3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
        System.out.println();
        Random newran = new Random();
        int n = 10;
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            mylist.add(newran.nextInt(21));
        }
        System.out.println(mylist);

        System.out.printf("Min: %d\n", Collections.max(mylist));
        System.out.printf("Max: %d\n", Collections.min(mylist));
        int sum = 0;
        for (Integer elem : mylist) {
            sum += elem;
        }
        System.out.println(sum);
        double av = (double)sum / n;    // и застряла в неожиданном месте: не вышел перевод int в double )))
        System.out.printf("Average: %d", av); 
    }
}
