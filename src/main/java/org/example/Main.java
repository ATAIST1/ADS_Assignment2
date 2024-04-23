package org.example;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        ArrayList<Integer> sequence = new ArrayList<>();
        for (String num : numbers) {
            sequence.add(Integer.parseInt(num));
        }
        reverseSequence(sequence, 0, sequence.size() - 1);
        for (int i = 0; i < sequence.size(); i++) {
            System.out.print(sequence.get(i) + " ");
        }
    }
    public static void reverseSequence(ArrayList<Integer> sequence, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = sequence.get(start);
        sequence.set(start, sequence.get(end));
        sequence.set(end, temp);
        reverseSequence(sequence, start + 1, end - 1);
    }
}