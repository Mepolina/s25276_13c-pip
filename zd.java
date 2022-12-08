import java.util.Arrays;

public class zd {
    public static void main(String args[])
    {
        int[] arr = { 3, -2, 23, 9, 81, -42, 234 };
        System.out.println("original : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        Arrays.sort(arr);
        System.out.println("\n sorted : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
