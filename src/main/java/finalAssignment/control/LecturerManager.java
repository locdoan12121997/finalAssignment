package finalAssignment.control;

import finalAssignment.model.Lecturer;
import finalAssignment.model.LecturerDao;

import java.util.List;
import java.util.Scanner;

public class LecturerManager extends BaseState{
    public void init_state(){
        System.out.println("=======================");
        System.out.println("1.\tAdd new lecturer");
        System.out.println("2.\tView all lecturers");
        System.out.println("3.\tSearch lecturers");
        System.out.println("4.\tDelete lecturers");
        System.out.println("5.\tUpdate lecturer");
        System.out.println("6.\tBack to main menu");
        int n = input_choice();
        process_choice(n);
    }

    protected void process_choice(int n){
        switch(n) {
            case 1 :
                create_lecturer();
                init_state();
                break;

            case 2 :
                view_all_lecturers();
                init_state();
                break;

            case 3 :
                find_lecturer();
                init_state();
                break;

            case 4 :
                delete_lecturer();
                init_state();
                break;

            case 5 :
                update_lecturer();
                init_state();
                break;

            case 6 :
                MainState ms = new MainState();
                ms.init_state();
                break;

            default :
                System.out.println("Wrong choice, choose again, from 1-3\n");
                init_state();
        }
    }

    private void update_lecturer() {
        String lecturer_id = input_string();
        LecturerDao lecturer_dao = new LecturerDao();
        Lecturer lecturer = lecturer_dao.find(lecturer_id);
        int update_choice = input_choice();
        String update_string = input_string();
        lecturer = modify_info(lecturer, update_choice, update_string);
        lecturer_dao.update(lecturer);
    }

    private Lecturer modify_info(Lecturer lecturer, int update_choice, String update_string) {
        switch(update_choice) {
            case 1 :
                lecturer.setName(update_string);
                System.out.println("Lecturer name updated");
                break;

            case 2 :
                lecturer.setDob(update_string);
                System.out.println("Lecturer dob updated");
                break;

            case 3 :
                lecturer.setEmail(update_string);
                System.out.println("Lecturer email updated");
                break;

            case 4 :
                lecturer.setPhone(update_string);
                System.out.println("Lecturer phone updated");
                break;

            case 5 :
                lecturer.setAddress(update_string);
                System.out.println("Lecturer address updated");
                break;

            case 6 :
                lecturer.setDepartment(update_string);
                System.out.println("Lecturer department updated");
                break;

            case 7 :
                System.out.println("Not update anything, exit");
                break;

            default :
                System.out.println("Wrong choice, choose again, from 1-3\n");
                init_state();
        }
        return lecturer;
    }

    private void delete_lecturer() {
        String lecturer_id = input_string();
        LecturerDao lecturer_dao = new LecturerDao();
        Lecturer lecturer = lecturer_dao.find(lecturer_id);
        lecturer_dao.delete(lecturer);
    }

    private String input_string() {
        Scanner input = new Scanner(System.in);
        String lecturer_id = input.nextLine();
        return lecturer_id;
    }

    private void find_lecturer() {
        String name = input_string();
        LecturerDao lecturer_dao = new LecturerDao();
        List<Lecturer> result = lecturer_dao.find_by_name(name);
        print_lecturer_list(result);
    }

    private void view_all_lecturers() {
        LecturerDao lecturer_dao = new LecturerDao();
        List<Lecturer> result = lecturer_dao.findAll();
        print_lecturer_list(result);
    }

    private void print_lecturer_list(List<Lecturer> list) {
        for (Lecturer lecturer:list){
            System.out.println(lecturer);
        }
    }

    private void create_lecturer() {
        Lecturer new_lecturer = input_new_lecturer();
        LecturerDao stu_dao = new LecturerDao();
        stu_dao.create(new_lecturer);
    }

    private Lecturer input_new_lecturer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input lecturer id: ");
        String lecturer_id = input.nextLine();
        System.out.println("Input lecturer name: ");
        String lecturer_name = input.nextLine();
        System.out.println("Input lecturer birthday with format dd-mm-yyyy: ");
        String lecturer_dob = input.nextLine();
        System.out.println("Input lecturer email: ");
        String lecturer_email = input.nextLine();
        System.out.println("Input lecturer phone number: ");
        String lecturer_phone = input.nextLine();
        System.out.println("Input lecturer address: ");
        String lecturer_address = input.nextLine();
        System.out.println("Input lecturer department: ");
        String lecturer_batch = input.nextLine();
        Lecturer lecturer = new Lecturer(lecturer_id, lecturer_name, lecturer_dob, lecturer_email, lecturer_phone, lecturer_address, lecturer_batch);
        return lecturer;
    }
}
