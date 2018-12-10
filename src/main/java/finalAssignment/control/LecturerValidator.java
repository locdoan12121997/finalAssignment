package finalAssignment.control;

import finalAssignment.model.Lecturer;

import java.util.regex.Pattern;

public class LecturerValidator {
    public void validateLecturer(Lecturer lecturer){
        validateLecturerId(lecturer.getLecturerId());
        validateLecturerPhone(lecturer.getPhone());
        validateDob(lecturer.getDob());
        validateEmail(lecturer.getEmail());

    }

    private void validateEmail(String email) {
        String regex = "(^(\\w+)([.-]?\\w+)*@\\w+([-]?\\w+)?\\.(\\w+([-]?\\w+)?)(\\.\\w+([-]?\\w+)?)*$)?";
        if (!Pattern.matches(regex, email)){
            throw new InvalidInputException("Email should have format *@*.*");
        }
    }

    private void validateLecturerId(String lecturerId) {
        String regex = "\\d{8}";
        if (!Pattern.matches(regex, lecturerId)){
            throw new InvalidInputException("Lecturer should have id format of 8 digits ");
        }
    }

    private void validateLecturerPhone(String phone) {
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
