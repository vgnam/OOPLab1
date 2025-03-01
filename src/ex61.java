import javax.swing.JOptionPane;
public class ex61 {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want change to first class ticket?", null, JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "You have chosen: "
                        + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
    }
}
