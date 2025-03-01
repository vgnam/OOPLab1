import javax.swing.JOptionPane;
public class ex225 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog("Enter First Number");
        strNum2 = JOptionPane.showInputDialog("Enter Second Number");
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double product = num1 * num2;
        double difference = num1 - num2;
        if (num2 == 0){
            JOptionPane.showMessageDialog(null, "The sum is " + sum + ". The difference is " + difference
            + ". The product is " + product + ". Quotient undefined.");
        }
        else{
            double quotient = num1 / num2;
            JOptionPane.showMessageDialog(null, "The sum is " + sum + ". The difference is " + difference
            + ". The product is " + product + ". The quotient is " + quotient + ".");
        }
    }
}