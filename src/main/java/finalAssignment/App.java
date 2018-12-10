package finalAssignment;

import finalAssignment.view.BaseView;
import finalAssignment.view.MainGui;
import org.apache.log4j.Logger;

import finalAssignment.model.*;

import javax.swing.*;

public class App
{
    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args)
    {

        final int WIDTH = 200;
        final int HEIGHT = 250;
        HibernateFactory.closeFactory();
        JFrame frame = new JFrame("App");
        frame.setContentPane(new MainGui().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        BaseView.setCurrentFrame(frame);
        HibernateFactory.closeFactory();
    }
}