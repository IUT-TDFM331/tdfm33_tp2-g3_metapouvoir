package fr.unice.cdci;

public class SortAlgorithms {
    static void bubbleSort(Integer[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
    public void reverseSort(Integer[] values){
        //Cette méthode ne fait rien pour l'instant
    }
}

