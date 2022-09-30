import java.util.*;

public class Reverse {
    public static int[] reverseArr(int[] arr) {
        // TODO:
        int n = arr.length;
        if (n == 0 || n == 1) return arr;

        // 길이 1짜리 head와 나머지길이 tail로 나누고 순서 뒤집어서 붙임
        int[] newArr = new int[n];
        int[] head = Arrays.copyOfRange(arr, 0, 1);
        int[] tail = Arrays.copyOfRange(arr, 1, n);
        System.out.println("n = " + n + " / " +"tail = " + Arrays.toString(tail));
        System.arraycopy(reverseArr(tail), 0, newArr, 0, n - 1);
        System.arraycopy(head, 0, newArr, n - 1, 1);
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(reverseArr(arr)));

    }
}