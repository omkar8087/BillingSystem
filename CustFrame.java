package BillingSystem;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CustFrame {
    static JFrame CustFrame = new JFrame();
    private JTextField textField = new JTextField();

    private JTextArea textArea = new JTextArea();

    CustFrame() {
        CustFrame.setSize(500, 500);
        CustFrame.setLayout(null);
        CustFrame.setVisible(true);
        // MainFrameLayout.CloseMainFrame();

    }

    void CloseCustFrame() {
        CustFrame.dispose();

    }

    void CreateButtons(JButton jButton, int x, int y, int w, int h) {
        jButton.setBounds(x, y, w, h);
        CustFrame.add(jButton);
    }

    void CreateTextField(String str) {
        textField.setText(str);
        textField.setBounds(100, 150, 300, 30);
        CustFrame.add(textField);
    }

}

class Components extends CustFrame {
    JButton Save = new JButton("Save File");

    Components(String str) {
        CreateTextField(str);
        CreateButtons(Save, 100, 200, 200, 30);
    }
}
