import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class placeholder {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener Placeholder Example");
        JTextField textField = new JTextField("Enter username...", 20);
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
                    textField.setText("Enter username...");
                    textField.setForeground(Color.GRAY);
                }
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
