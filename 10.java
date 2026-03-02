import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLine();

        Arrays.sort(arr);

        System.out.println("Sorted Strings:");
        for (String s : arr)
            System.out.println(s);
    }
}
