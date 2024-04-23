package org.example;
public class Main {

    public static int unableToEat(int[] students, int[] samsas) {
        int unableToEatCount = 0;
        int currentStudentIndex = 0;
        for (int samsa : samsas) {
            if (currentStudentIndex >= students.length) {
                break;
            }
            int studentPreference = students[currentStudentIndex];
            if (studentPreference == samsa) {
                currentStudentIndex++;
            } else {
                unableToEatCount++;
            }
        }
        return unableToEatCount;
    }

    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0};
        int[] samsas = {0, 1, 0, 1};
        System.out.println(unableToEat(students, samsas));
    }
}