public class QuickSort {


    public static void quicksort(int x, int y, int[] arr) {

        int start = x;
        int end = y;
        int pivot = arr[(end + start) / 2];
        do {
            while (arr[start] < pivot) {
                start++;
            }
            while (pivot < arr[end]) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        } while (start <= end);

        if (start < y) {
            quicksort(start, y, arr);
        }
        if (x < end) {
            quicksort(x, end, arr);
        }

    }


}
