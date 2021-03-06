package finalAssignment.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import finalAssignment.control.LecturerManager;
import finalAssignment.model.Lecturer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class LecturerManageGui extends BaseView {
    private JButton addLecturerButton;
    private JButton viewLecturerButton;
    private JButton searchLecturerButton;
    private JButton deleteLecturerButton;
    private JButton updateLecturerButton;
    private JButton backFromLecturerButton;
    private JPanel mainPanel;

    public LecturerManageGui() {
        addLecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame currentFrame = BaseView.getCurrentFrame();
                currentFrame.getContentPane().removeAll();
                CreateLecturerGui createLecturerGui = new CreateLecturerGui();
                currentFrame.setContentPane(createLecturerGui.getMainPanel());
                currentFrame.setVisible(true);
            }
        });
        viewLecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame currentFrame = BaseView.getCurrentFrame();
                currentFrame.getContentPane().removeAll();
                ViewLecturerGui viewLecturerGui = new ViewLecturerGui();
                currentFrame.setContentPane(viewLecturerGui.getMainPanel());

                LecturerManager lecturerManager = new LecturerManager();
                List<Lecturer> lecturer_list = lecturerManager.view_all_lecturers();

                for (Lecturer lecturer : lecturer_list) {
                    viewLecturerGui.getViewLecturerTextArea().append(lecturer.toString());
                }
                currentFrame.setVisible(true);
            }
        });
        searchLecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame currentFrame = BaseView.getCurrentFrame();
                currentFrame.getContentPane().removeAll();
                GetNameViewLecturer getNameViewLecturer = new GetNameViewLecturer();
                currentFrame.setContentPane(getNameViewLecturer.getMainPanel());
                currentFrame.setVisible(true);
            }
        });
        deleteLecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame currentFrame = BaseView.getCurrentFrame();
                currentFrame.getContentPane().removeAll();
                GetIdDeleteLecturerGui getIdDeleteLecturerGui = new GetIdDeleteLecturerGui();
                currentFrame.setContentPane(getIdDeleteLecturerGui.getMainPanel());
                currentFrame.setVisible(true);
            }
        });

        backFromLecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame currentFrame = BaseView.getCurrentFrame();
                currentFrame.getContentPane().removeAll();
                MainGui mainGui = new MainGui();
                currentFrame.setContentPane(mainGui.getMainPanel());
                currentFrame.setVisible(true);
            }
        });
        updateLecturerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame currentFrame = BaseView.getCurrentFrame();
                currentFrame.getContentPane().removeAll();
                GetIdUpdateLecturerGui getIdUpdateLecturerGui = new GetIdUpdateLecturerGui();
                currentFrame.setContentPane(getIdUpdateLecturerGui.getMainPanel());
                currentFrame.setVisible(true);
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
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
        mainPanel.setLayout(new GridLayoutManager(6, 1, new Insets(0, 0, 0, 0), -1, -1));
        addLecturerButton = new JButton();
        addLecturerButton.setText("1. Add new lecturer");
        mainPanel.add(addLecturerButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        viewLecturerButton = new JButton();
        viewLecturerButton.setText("2. View all lecturers");
        mainPanel.add(viewLecturerButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        searchLecturerButton = new JButton();
        searchLecturerButton.setText("3. Search lecturers");
        mainPanel.add(searchLecturerButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        deleteLecturerButton = new JButton();
        deleteLecturerButton.setText("4. Delete lecturers");
        mainPanel.add(deleteLecturerButton, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        updateLecturerButton = new JButton();
        updateLecturerButton.setText("5. Update lecturer");
        mainPanel.add(updateLecturerButton, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        backFromLecturerButton = new JButton();
        backFromLecturerButton.setText("6. Back to main menu");
        mainPanel.add(backFromLecturerButton, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
