import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Name {
    private JTextField Result;
    private JTextField NameInp;
    private JButton Submit;
    private JPanel NameView;
    private JButton Clear;

    public Name() {
        Submit.addActionListener(new SubmitBtnClicked());
        Clear.addActionListener(new ClearBtnClicked());
    }

    private class SubmitBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           if (NameInp.getText().equals("")) {
               Result.setText("Please Enter a name. Blank is not allowed");
           }
           else
               Result.setText("Your Name is "+NameInp.getText().toUpperCase());
        }
    }
    private  class ClearBtnClicked implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
          Result.setText("");
          NameInp.setText("");
      }


}
    public static void main(String[] args) {
        JFrame frame = new JFrame("Name");
        frame.setContentPane(new Name().NameView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

