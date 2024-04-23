package org.example;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            int l = sc.nextInt();
            list.add(l);
        }
        int Q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i< Q; i++) {
            String operation = sc.nextLine();
            if(operation.equals("Insert")) {
                int x = sc.nextInt();
                int value = sc.nextInt();
                list.add(x, value);
                sc.nextLine();
            }
            else if(operation.equals("Delete")) {
                int x = sc.nextInt();
                list.remove(x);
                sc.nextLine();
            }
        }
        System.out.println(list);
    }


}
