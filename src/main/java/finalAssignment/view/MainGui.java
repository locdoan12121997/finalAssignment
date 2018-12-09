package finalAssignment.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui extends JFrame{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private JButton exitButton;
    private JButton studentManageButton;
    private JButton lecturerManageButton;
    private JPanel mainPanel;

    public MainGui() {
        setSize(WIDTH, HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
//        studentManageButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JButton getStudentManageButton() {
        return studentManageButton;
    }

    public JButton getLecturerManageButton() {
        return lecturerManageButton;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}
