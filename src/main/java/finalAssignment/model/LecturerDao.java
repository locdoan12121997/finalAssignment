package finalAssignment.model;

import java.util.List;


public class LecturerDao extends AbstractDao {
    public LecturerDao() {
        super();
    }

    public void create(Lecturer lecturer) throws DataAccessLayerException {
        super.save(lecturer);
    }


    public void delete(Lecturer lecturer) throws DataAccessLayerException {
        super.delete(lecturer);
    }

    public Lecturer find(String id) throws DataAccessLayerException {
        return (Lecturer) super.find(Lecturer.class, id);
    }

    public void update(Lecturer lecturer) throws DataAccessLayerException {
        super.update(lecturer);
    }

    public List find_by_name(String name) throws DataAccessLayerException{
        return super.find_by_name(Lecturer.class, name);
    }

    public List findAll() throws DataAccessLayerException{
        return super.findAll(Lecturer.class);
    }

}