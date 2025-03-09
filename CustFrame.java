package BillingSystem;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.crypto.KeyAgreement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CustFrame {
    static JFrame CustFrame = new JFrame();
    static JTextField textField1 = new JTextField("Enter your name...", 20);
    static JTextField textField2 = new JTextField("Enter your mobile no ...", 20);

    static JTextArea textArea = new JTextArea();

    public static void main(String[] args) {
        new CustComponents("");
    }

    CustFrame() {
        CustFrame.setSize(500, 500);
        CustFrame.setLayout(null);
        CustFrame.setVisible(true);

    }

    void CloseCustFrame() {
        CustFrame.dispose();

    }

    void CreateButtons(JButton jButton, int x, int y, int w, int h) {
        jButton.setBounds(x, y, w, h);
        CustFrame.add(jButton);
    }

    void CreateTextField(JTextField textField, String str, int x, int y, int w, int h) {
        textField.setForeground(Color.GRAY);

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (textField.getForeground() == Color.GRAY) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(str);
                    textField.setForeground(Color.GRAY);
                }
            }
        });

        textField.setText(str);
        textField.setBounds(x, y, w, h);
        CustFrame.add(textField);
    }

    void CreateTextArea(String str) {

        textArea.setForeground(Color.GRAY);

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (textArea.getForeground() == Color.GRAY) {
                    textArea.setText("");
                    textArea.setForeground(Color.BLACK);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (textArea.getText().isEmpty()) {
                    textArea.setText(str);
                    textArea.setForeground(Color.GRAY);
                }
            }
        });
        textArea.setText(str);

        textArea.setBounds(100, 250, 300, 140);

        CustFrame.add(textArea);
    }

}

class CustComponents extends CustFrame {
    JButton Save = new JButton("Add Coustomer");

    CustComponents(String str) {
        CreateTextField(textField1, "Enter your name..", 100, 150, 300, 30);
        CreateTextField(textField2, "Enter your mobile no..", 100, 200, 300, 30);
        CreateTextArea("Enter your Address...");

        // CreateTextField(str);s

        CreateButtons(Save, 100, 400, 200, 30);
    }
}
