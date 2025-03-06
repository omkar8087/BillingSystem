package BillingSystem;

import javax.swing.*;
import java.awt.event.*;

public class MainFrame {
    public static void main(String[] args) {
        new Components(" ");
    }

}

class MainFrameLayout {
    static JFrame MainFrame = new JFrame();
    static JFrame CustFrame = new JFrame();

    MainFrameLayout() {
        MainFrame.setSize(500, 500);
        MainFrame.setLayout(null);
        MainFrame.setVisible(true);
    }

    static void CloseMainFrame() {
        MainFrame.dispose();
    }

    void CreateButtons(JButton jButton, int x, int y, int w, int h) {
        jButton.setBounds(x, y, w, h);
        MainFrame.add(jButton);
    }

}

class Components extends MainFrameLayout {
    JButton CustAdd = new JButton("CustAdd");
    JButton GetBill = new JButton("GetBill");

    Components(String str) {

        CreateButtons(CustAdd, 100, 300, 100, 30);
        CreateFileBusinessLogic(CustAdd, 1);

        CreateButtons(GetBill, 100, 350, 100, 30);

    }

    void CreateFileBusinessLogic(JButton jButton, int btnId) {
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (btnId) {
                    case 1:
                        new CustFrame();
                        break;

                    case 2:
                        break;
                }

            }
        });
    }
}
