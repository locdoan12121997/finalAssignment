package finalAssignment.control;

import finalAssignment.model.Student;
import finalAssignment.view.MainGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MainState {
    private MainGui mainGui;
    private JButton exitButton;
    private JButton studentManageButton;
    private JButton lecturerManageButton;

    public MainState() {
        initComponents();
        initListeners();
    }

    private void initListeners() {
        studentManageButton.addActionListener(new StudentManageButtonListener());
    }

    private void initComponents() {
        mainGui = new MainGui();
        exitButton = mainGui.getExitButton();
        studentManageButton = mainGui.getStudentManageButton();
        lecturerManageButton = mainGui.getLecturerManageButton();

    }

//    public void showMainFrameWindow() {
//        mainGui.setVisible(true);
//    }

    private class StudentManageButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "My Goodness, this is so concise");
        }
    }
}
