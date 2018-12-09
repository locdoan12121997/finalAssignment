package finalAssignment.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import finalAssignment.control.LecturerManager;
import finalAssignment.model.Lecturer;
import finalAssignment.model.LecturerDao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateLecturerGui {
    private JPanel mainPanel;
    private JLabel lecturerIdLabel;
    private JTextField lecturerIdTextField;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JTextField birthdayTextField;
    private JTextField emailTextField;
    private JTextField phoneTextField;
    private JTextField addressTextField;
    private JTextField departmentTextField;
    private JLabel departmentLabel;
    private JLabel addressLabel;
    private JLabel phoneLabel;
    private JLabel emailLabel;
    private JLabel birthdayLabel;
    private JButton updateButton;

    public UpdateLecturerGui() {
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame currentFrame = BaseView.getCurrentFrame();

                LecturerDao lecturerDao = new LecturerDao();
                Lecturer lecturer = lecturerDao.find(lecturerIdTextField.getText());
                lecturer.setName(nameTextField.getText());
                lecturer.setDob(birthdayTextField.getText());
                lecturer.setEmail(emailTextField.getText());
                lecturer.setPhone(phoneTextField.getText());
                lecturer.setAddress(addressTextField.getText());
                lecturer.setDepartment(departmentTextField.getText());

                LecturerManager lecturerManager = new LecturerManager();
                lecturerManager.update_lecturer(lecturer);

                currentFrame.getContentPane().removeAll();
                LecturerManageGui lecturerManageGui = new LecturerManageGui();
                currentFrame.setContentPane(lecturerManageGui.getMainPanel());
                JOptionPane.showMessageDialog(null, "Info updated");
                currentFrame.setVisible(true);
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void fillInformationIntoTextfield(Lecturer lecturer) {
        lecturerIdTextField.setText(lecturer.getLecturerId());
        nameTextField.setText(lecturer.getName());
        birthdayTextField.setText(lecturer.getDob());
        emailTextField.setText(lecturer.getEmail());
        phoneTextField.setText(lecturer.getPhone());
        addressTextField.setText(lecturer.getAddress());
        departmentTextField.setText(lecturer.getDepartment());
        lecturerIdTextField.setEditable(false);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(8, 2, new Insets(0, 0, 0, 0), -1, -1));
        lecturerIdLabel = new JLabel();
        lecturerIdLabel.setText("Lecturer id");
        mainPanel.add(lecturerIdLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lecturerIdTextField = new JTextField();
        lecturerIdTextField.setText("");
        mainPanel.add(lecturerIdTextField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        nameLabel = new JLabel();
        nameLabel.setText("Name");
        mainPanel.add(nameLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nameTextField = new JTextField();
        nameTextField.setText("");
        mainPanel.add(nameTextField, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        birthdayLabel = new JLabel();
        birthdayLabel.setText("Birthday");
        mainPanel.add(birthdayLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        birthdayTextField = new JTextField();
        birthdayTextField.setText("");
        mainPanel.add(birthdayTextField, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        emailLabel = new JLabel();
        emailLabel.setText("Email");
        mainPanel.add(emailLabel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        emailTextField = new JTextField();
        emailTextField.setText("");
        mainPanel.add(emailTextField, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        phoneLabel = new JLabel();
        phoneLabel.setText("Phone");
        mainPanel.add(phoneLabel, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        phoneTextField = new JTextField();
        phoneTextField.setText("");
        mainPanel.add(phoneTextField, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        addressLabel = new JLabel();
        addressLabel.setText("Address");
        mainPanel.add(addressLabel, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        addressTextField = new JTextField();
        addressTextField.setText("");
        mainPanel.add(addressTextField, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        departmentLabel = new JLabel();
        departmentLabel.setText("Department");
        mainPanel.add(departmentLabel, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        departmentTextField = new JTextField();
        departmentTextField.setText("");
        mainPanel.add(departmentTextField, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        updateButton = new JButton();
        updateButton.setText("Update");
        mainPanel.add(updateButton, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}