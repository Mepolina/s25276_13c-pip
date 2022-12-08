import java.util.Arrays;

public class ost {

    public static boolean areEqual(int arr1[], int arr2[]) {
        int a = arr1.length;
        int m = arr2.length;

        if (a != m)
            return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < a; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }
    public static void main(String[] args)
    {
        int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };

        if (areEqual(arr1, arr2))
            System.out.println("Tak");
        else
            System.out.println("Nie");
    }
}
