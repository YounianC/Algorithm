/**
 * Created by Administrator on 2016/9/17.
 */
public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {5, 51, 6, 1, 3, 9, 7, 10, 15, 11, 2, 8, 4, 32, 16, 45, 13, 22,};
        for (int i : arr)
            System.out.print(i + "-");
        System.out.println("");
        Sort(arr, 0, arr.length - 1);
        for (int i : arr)
            System.out.print(i + "-");
    }

    public static void Sort(int arr[], int start, int end) {
        int base = arr[start];
        int i = start;
        int j = end;

        while (i != j) {

            while (arr[j] >= base && i < j)
                j--;
            if (i < j)
                arr[i] = arr[j];


            while (arr[i] <= base && i < j)
                i++;
            if (i < j)
                arr[j] = arr[i];
        }
        arr[i] = base;

        for (int e : arr)
            System.out.print(e + " ");
        System.out.println("");


        if (start < i)
            Sort(arr, start, i - 1);
        if (i < end)
            Sort(arr, i + 1, end);
    }
}
