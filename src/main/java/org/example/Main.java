package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] sequence = new int[2 * N];
        int left = N - 1, right = N;

        for (int i = 0; i < N; i++) {
            int operation = scanner.nextInt();

            if (operation == 1 || operation == 2){
                int disk = scanner.nextInt();
                if (operation == 1) {
                    sequence[left--] = disk;
                } else {
                    sequence[right++] = disk;
                }
            }
            else{
                if (operation == 3) {
                    System.out.print(sequence[++left] + " ");
                }
                else {
                    System.out.print(sequence[--right] + " ");
                }
            }
        }
    }
}