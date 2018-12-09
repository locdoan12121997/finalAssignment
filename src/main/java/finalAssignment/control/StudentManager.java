package finalAssignment.control;

import finalAssignment.model.Student;
import finalAssignment.model.StudentDao;

import javax.management.Query;
import java.util.List;
import java.util.Scanner;

public class StudentManager extends BaseState{
    public void init_state(){
        System.out.println("=======================");
        System.out.println("1.\tAdd new student");
        System.out.println("2.\tView all students");
        System.out.println("3.\tSearch students");
        System.out.println("4.\tDelete students");
        System.out.println("5.\tUpdate student");
        System.out.println("6.\tBack to main menu");
        int n = input_choice();
        process_choice(n);
    }

    protected void process_choice(int n){
        switch(n) {
            case 1 :
                create_student();
                init_state();
                break;

            case 2 :
                view_all_students();
                init_state();
                break;

            case 3 :
                find_student();
                init_state();
                break;

            case 4 :
                delete_student();
                init_state();
                break;

            case 5 :
                update_student();
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

    private void update_student() {
        String student_id = input_string();
        StudentDao student_dao = new StudentDao();
        Student student = student_dao.find(student_id);
        int update_choice = input_choice();
        String update_string = input_string();
        student = modify_info(student, update_choice, update_string);
        student_dao.update(student);
    }

    private Student modify_info(Student student, int update_choice, String update_string) {
        switch(update_choice) {
            case 1 :
                student.setName(update_string);
                System.out.println("Student name updated");
                break;

            case 2 :
                student.setDob(update_string);
                System.out.println("Student dob updated");
                break;

            case 3 :
                student.setEmail(update_string);
                System.out.println("Student email updated");
                break;

            case 4 :
                student.setPhone(update_string);
                System.out.println("Student phone updated");
                break;

            case 5 :
                student.setAddress(update_string);
                System.out.println("Student address updated");
                break;

            case 6 :
                student.setBatch(update_string);
                System.out.println("Student batch updated");
                break;

            case 7 :
                System.out.println("Not update anything, exit");
                break;

            default :
                System.out.println("Wrong choice, choose again, from 1-3\n");
                init_state();
        }
        return student;
    }

    private void delete_student() {
        String student_id = input_string();
        StudentDao student_dao = new StudentDao();
        Student student = student_dao.find(student_id);
        student_dao.delete(student);
    }

    private String input_string() {
        Scanner input = new Scanner(System.in);
        String student_id = input.nextLine();
        return student_id;
    }

    private void find_student() {
        String name = input_string();
        StudentDao student_dao = new StudentDao();
        List<Student> result = student_dao.find_by_name(name);
        print_student_list(result);
    }

    private void view_all_students() {
        StudentDao student_dao = new StudentDao();
        List<Student> result = student_dao.findAll();
        print_student_list(result);
    }

    private void print_student_list(List<Student> list) {
        for (Student student:list){
            System.out.println(student);
        }
    }

    private void create_student() {
        Student new_stu = input_new_student();
        StudentDao stu_dao = new StudentDao();
        stu_dao.create(new_stu);
    }

    private Student input_new_student() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input student id: ");
        String student_id = input.nextLine();
        System.out.println("Input student name: ");
        String student_name = input.nextLine();
        System.out.println("Input student birthday with format dd-mm-yyyy: ");
        String student_dob = input.nextLine();
        System.out.println("Input student email: ");
        String student_email = input.nextLine();
        System.out.println("Input student phone number: ");
        String student_phone = input.nextLine();
        System.out.println("Input student address: ");
        String student_address = input.nextLine();
        System.out.println("Input student batch: ");
        String student_batch = input.nextLine();
        Student student = new Student(student_id, student_name, student_dob, student_email, student_phone, student_address, student_batch);
        return student;
    }
}
