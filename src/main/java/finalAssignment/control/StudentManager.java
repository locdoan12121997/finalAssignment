package finalAssignment.control;

import finalAssignment.model.Student;
import finalAssignment.model.StudentDao;

import java.util.List;

public class StudentManager{

    public void update_student(Student student) {
        StudentDao student_dao = new StudentDao();
        StudentValidator studentValidator = new StudentValidator();
        studentValidator.validateStudent(student);
        student_dao.update(student);
    }


    public void delete_student(String student_id) {
        StudentDao student_dao = new StudentDao();
        Student student = student_dao.find(student_id);
        student_dao.delete(student);
    }


    public List<Student> find_student(String name) {
        StudentDao student_dao = new StudentDao();
        List<Student> result = student_dao.find_by_name(name);
        return result;
    }

    public List<Student> view_all_students() {
        StudentDao student_dao = new StudentDao();
        List<Student> result = student_dao.findAll();
        return result;
    }


    public void create_student(Student student) {
        StudentDao stu_dao = new StudentDao();
        StudentValidator studentValidator = new StudentValidator();
        studentValidator.validateStudent(student);
        stu_dao.create(student);
    }


}
