import java.util.Arrays;
import java.util.List;

class Test {
    static void testLC30() {
        Utils.print(LC30.f("barfoothefoobarman", new String[]{"foo", "bar"}));
    }

    static void testLC31() {
        int[] arr1 = {1, 2, 3};
        LC31.f(arr1);
        Utils.print(arr1);
        System.out.println();

        int[] arr2 = {3, 2, 1};
        LC31.f(arr2);
        Utils.print(arr2);
        System.out.println();

        int[] arr3 = {1, 1, 5};
        LC31.f(arr3);
        Utils.print(arr3);
        System.out.println();
    }

    static void testLC40() {
        System.out.println("Target: " + 8);
        List<List<Integer>> answer = LC40.f(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        Utils.printLists(answer);

        System.out.println("Target: " + 5);
        answer = LC40.f(new int[]{2, 5, 2, 1, 2}, 5);
        Utils.printLists(answer);
    }

    static void testLC41() {
        Utils.print(LC41.f(new int[]{1, 2, 0}));

        Utils.print(LC41.f(new int[]{3, 4, -1, 1}));

        Utils.print(LC41.f(new int[]{7, 8, 9, 11, 12}));
    }
}
