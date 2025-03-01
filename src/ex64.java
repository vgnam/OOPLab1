import java.util.Scanner;
public class ex64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, year;
        while (true) {
            System.out.print("Enter month: ");
            month = sc.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
                continue;
            }
            System.out.print("Enter year: ");
            year = sc.nextInt();
            if (year < 0){
                System.out.println("Invalid year. Please enter a valid year.");
                continue;
            }
            break;
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month == 2 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("29 days");
        } else {
            System.out.println("28 days");
        }
    }
}
