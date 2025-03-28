import java.util.Scanner;
import java.util.Arrays;
public class ex65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n =  ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        int sum = 0;
        for (int num : a) {
            sum += num;
        }

        double avg = (double) sum/n;

        System.out.println("Sorted array: " + Arrays.toString(a));
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average value: " + avg);
    }
}
