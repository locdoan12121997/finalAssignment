package finalAssignment.control;

import finalAssignment.model.Student;

import java.util.regex.Pattern;

public class StudentValidator {
    public void validateStudent(Student student){
        validateStudentId(student.getStudentId());
        validateStudentPhone(student.getPhone());
        validateDob(student.getDob());
        validateEmail(student.getEmail());

    }

    private void validateEmail(String email) {
        String regex = "(^(\\w+)([.-]?\\w+)*@\\w+([-]?\\w+)?\\.(\\w+([-]?\\w+)?)(\\.\\w+([-]?\\w+)?)*$)?";
        if (!Pattern.matches(regex, email)){
            throw new InvalidInputException("Email should have format *@*.*");
        }
    }

    private void validateStudentId(String studentId) {
        String regex = "[Gg][TtCc]\\d{5}";
        if (!Pattern.matches(regex, studentId)){
            throw new InvalidInputException("Student should have id format like GTxxxxx or GCxxxxx ");
        }
    }

    private void validateStudentPhone(String phone) {
        String regex = "(^\\d{4}[ -]?\\d{3}[ -]?\\d{3}$)?";
        if (!Pattern.matches(regex, phone)){
            throw new InvalidInputException("Phone number should have 10 digits");
        }
    }

    private void validateDob(String dob) {
        String regex = "(^((0?[1-9])|([12][0-9])|(3[01]))[/.-]((0?[1-9]|(1[0-2]))[/.-][12]\\d{3})$)?";
        if (!Pattern.matches(regex, dob)){
            throw new InvalidInputException("Birthday should have format 31-12-1997");
        }
    }
}
