import java.util.Scanner;
public class ex66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size m*n:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat1 = new int[m][n];
        int[][] mat2 = new int[m][n];
        int[][] sum = new int[n][n];
        System.out.println("Enter first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Sum of two matrices:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
