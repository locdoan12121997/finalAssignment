package finalAssignment.control;

import java.util.Scanner;

public abstract class BaseState {

    public void init_state(){}

    protected int input_choice() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        return n;
    }

    protected void process_choice(int n){}


}
