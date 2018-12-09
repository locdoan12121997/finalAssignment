package finalAssignment;

import finalAssignment.view.MainGui;
import org.apache.log4j.Logger;

import finalAssignment.model.*;
import finalAssignment.control.*;

import javax.swing.*;

public class App
{
    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args)
    {
//        MainState ms = new MainState();
//        ms.init_state();
//        HibernateFactory.closeFactory();
//        JFrame frame = new JFrame("App");
////        System.out.println(new MainGui().getMainPanel());
//        frame.setContentPane(new MainGui().getMainPanel());
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
        MainGui mainGui = new MainGui();
//        mainGui.showMainFrameWindow();
    }
}