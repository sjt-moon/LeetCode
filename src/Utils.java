import java.util.Arrays;
import java.util.List;

class Utils {
    static void printLists(List<List<Integer>> lists) {
        lists.forEach(list -> {
            print(list);
            System.out.println();
        });
    }

    static void print(List<Integer> list) {
        list.forEach(e -> beautifulPrint(e));
        System.out.println();
    }

    static void print(int[] arr) {
        Arrays.stream(arr).forEach(e -> beautifulPrint(e));
        System.out.println();
    }

    static void print(int x) {
        beautifulPrint(x);
        System.out.println();
    }

    private static void beautifulPrint(Object obj) {
        System.out.print(obj + ",");
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    static void reverse(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            swap(arr, i++, j--);
        }
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
}
