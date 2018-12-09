package finalAssignment.model;

import java.util.List;


public class StudentDao extends AbstractDao {
    public StudentDao() {
        super();
    }

    public void create(Student student) throws DataAccessLayerException {
        super.save(student);
    }


    public void delete(Student student) throws DataAccessLayerException {
        super.delete(student);
    }

    public Student find(String id) throws DataAccessLayerException {
        return (Student) super.find(Student.class, id);
    }

    public void update(Student student) throws DataAccessLayerException {
        super.update(student);
    }

    public List find_by_name(String name) throws DataAccessLayerException{
        return super.find_by_name(Student.class, name);
    }

    public List findAll() throws DataAccessLayerException{
        return super.findAll(Student.class);
    }

}