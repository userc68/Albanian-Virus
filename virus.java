import javax.swing.JOptionPane;
public class java1 {
  public static void main(String[] args) {
    String message = 
      "<html><body style='width: 300px'>" +
      "Hi, I am Albanian virus, but because of poor technology in my country " +
      "unfortunately I am not able to harm your computer. Please be so kind to " +
      "delete one of your important files yourself and then forward me to other " +
      "users. Many thanks for your cooperation! Best regards, Albanian virus." +
      "</body></html>";
    JOptionPane.showConfirmDialog(
      null,
      message,
      "Virus Alert!",
      JOptionPane.YES_NO_CANCEL_OPTION,
      JOptionPane.ERROR_MESSAGE
    );
  }
}
