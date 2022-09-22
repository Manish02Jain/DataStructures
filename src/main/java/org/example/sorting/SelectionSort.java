package org.example.sorting;

public class SelectionSort {

    public void sort(int[] unsortedArray) {
        // 1, 3, 6, 10, 3 2 5 ->
        int n = unsortedArray.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (unsortedArray[minIndex] > unsortedArray[j]) {
                    minIndex = j;
                }
            }
            int t = unsortedArray[minIndex];
            unsortedArray[minIndex] = unsortedArray[i];
            unsortedArray[i] = t;
        }
        for (int j : unsortedArray) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {1, 5, 2, 7, 8, 2, 4, 5, 1, -1, 0};
        selectionSort.sort(array);
//        selection sort:
//        select next higher element and put it in place.
//        scan all the elements and find smalest element and swap it with first element.
//        complexity is (n)2
    }
}
