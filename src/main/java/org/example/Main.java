package org.example;
public class Main {

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int leftChildIdx = 2 * i + 1;
        int rightChildIdx = 2 * i + 2;

        // If left child is larger than root
        if (leftChildIdx < n && arr[leftChildIdx] > arr[largest]) {
            largest = leftChildIdx;
        }
        if (rightChildIdx < n && arr[rightChildIdx] > arr[largest]) {
            largest = rightChildIdx;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        System.out.println("Max heap:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}