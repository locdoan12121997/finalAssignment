package finalAssignment.control;

import finalAssignment.model.Student;

import java.util.Scanner;

public class MainState {
    public void init_state(){
        System.out.println("=======================");
        System.out.println("1.\tManage Students");
        System.out.println("2.\tManage Lecturers");
        System.out.println("3.\tExit");
        int n = input_choice();
        process_choice(n);
    }

    protected void process_choice(int n){
        switch(n) {
            case 1 :
                StudentManager sm = new StudentManager();
                sm.init_state();
                break; // optional

            case 2 :
                LecturerManager lm = new LecturerManager();
                lm.init_state();
                break; // optional

            case 3 :
                System.out.println("Program exited.\n");
                break; // optional

            // You can have any number of case statements.
            default : // Optional
                System.out.println("Wrong choice, choose again, from 1-3\n");
                init_state();
        }
    }
}
