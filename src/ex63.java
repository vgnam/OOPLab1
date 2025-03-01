import java.util.Scanner;
public class ex63 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("n = ");
        int n = keyboard.nextInt();
        keyboard.close();

        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n-i; ++k){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
