package finalAssignment.view;

import javax.swing.*;

public class BaseView {

    private static JFrame currentFrame;

    public static JFrame getCurrentFrame() {
        return currentFrame;
    }

    public static void setCurrentFrame(JFrame currentFrame) {
        BaseView.currentFrame = currentFrame;
    }
}
