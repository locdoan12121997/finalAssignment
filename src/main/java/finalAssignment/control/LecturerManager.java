package finalAssignment.control;

import finalAssignment.model.Lecturer;
import finalAssignment.model.LecturerDao;

import java.util.List;

public class LecturerManager extends BaseState{
    public void update_lecturer(Lecturer Lecturer) {
        LecturerDao lecturer_dao = new LecturerDao();
        lecturer_dao.update(Lecturer);
    }


    public void delete_lecturer(String lecturer_id) {
        LecturerDao lecturer_dao = new LecturerDao();
        Lecturer lecturer = lecturer_dao.find(lecturer_id);
        lecturer_dao.delete(lecturer);
    }


    public List<Lecturer> find_lecturer(String name) {
        LecturerDao lecturer_dao = new LecturerDao();
        List<Lecturer> result = lecturer_dao.find_by_name(name);
        return result;
    }

    public List<Lecturer> view_all_lecturers() {
        LecturerDao lecturer_dao = new LecturerDao();
        List<Lecturer> result = lecturer_dao.findAll();
        return result;
    }


    public void create_lecturer(Lecturer Lecturer) {
        LecturerDao lecturer_dao = new LecturerDao();
        lecturer_dao.create(Lecturer);
    }
}
