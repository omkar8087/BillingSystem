package BillingSystem;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;

public class BillFrame {

    JFrame BillFrame = new JFrame("Restaurant Items Billing");

    JLabel titleLabel = new JLabel("Restaurant Items Billing", JLabel.CENTER);

    JTextField mobileField = new JTextField();
    JTextField fetchTextField = new JTextField();
    JTextField Product = new JTextField();
    JTextField ProductNo = new JTextField();
    JTextField ProductPrice = new JTextField();
    JTextField ProductTotal = new JTextField();

    JButton fetchDetailsButton = new JButton("Fetch Details");
    JButton generateBillButton = new JButton("Generate Bill");

    public static void main(String[] args) {
        new BillComponents("");
    }

    BillFrame() {
        BillFrame.setSize(800, 600);
        BillFrame.setLayout(null);
        BillFrame.setVisible(true);
    }

    void CloseBillFrame() {
        BillFrame.dispose();
    }

    void CreateTitleLabel(JLabel titleLabel) {
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBounds(200, 10, 400, 30);
        BillFrame.add(titleLabel);
    }

    void CreateButtons(JButton jButton, int x, int y, int w, int h) {
        jButton.setBounds(x, y, w, h);
        BillFrame.add(jButton);
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
        BillFrame.add(textField);
    }

}

class BillComponents extends BillFrame {
    BillComponents(String str) {
        CreateTextField(mobileField, "Mobile no.", 150, 50, 200, 30);
        CreateTextField(fetchTextField, "Get Details", 550, 50, 200, 30);
        CreateTextField(Product, "Product", 150, 100, 200, 30);
        CreateTextField(ProductNo, "ProductNo", 420, 100, 50, 30);
        CreateTextField(ProductPrice, "ProductPrice", 530, 100, 80, 30);
        CreateTextField(ProductTotal, "ProductTotal", 670, 100, 80, 30);

        CreateButtons(fetchDetailsButton, 370, 50, 150, 30);
        CreateButtons(generateBillButton, 300, 420, 200, 40);

    }
}
