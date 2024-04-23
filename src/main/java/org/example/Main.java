package org.example;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
            ArrayList<Integer> list1 = new ArrayList<>();
            for(int j = 0; j < k; j++) {
                int l = sc.nextInt();
                list1.add(l);
            }
            list.add(list1);
        }
        int numOfSelections = sc.nextInt();
        for(int i = 0; i < numOfSelections; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (x >= 0 && x < list.size() && y >= 0 && y < list.get(x).size()) {
                System.out.println(list.get(x).get(y));
            } else {
                System.out.println("ERROR");
            }
        }
    }


}
