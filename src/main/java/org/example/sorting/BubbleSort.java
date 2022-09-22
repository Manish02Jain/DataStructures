package org.example.sorting;

public class BubbleSort {

    public void sort(int[] unsortedArray) {
        // 1, 3, 6, 10, 3 2 5 ->
        int n = unsortedArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 2; j >= i; j--) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    swap(j, j + 1, unsortedArray);
                }
            }
        }
    }

    public void swap(int i, int j, int[] unsortedArray) {
        int t = unsortedArray[j];
        unsortedArray[j] = unsortedArray[i];
        unsortedArray[i] = t;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1, 5, 2, 7, 8, 2, 4, 5, 1, -1, 0};

        bubbleSort.sort(array);

        for (int j : array) {
            System.out.print(j + " ");
        }
//        scan from right to left and compare and swap if numbers are out of order
//        that way smallest number will bubble out in index.
//        selection sort is better than bubble sort
//        complexity is (n)2
    }
}
