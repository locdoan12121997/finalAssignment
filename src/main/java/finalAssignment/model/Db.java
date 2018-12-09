package finalAssignment.model;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

import java.util.List;

public abstract class Db {
//    private Session session;
//    private Transaction tx;
//
//    public SessionFactory init(String configureUrl) {
//        final StandardServiceRegistry registry =
//                new StandardServiceRegistryBuilder()
//                        .configure("hibernate_cfg.xml")
//                        .build();
//
//
//        try {
//            SessionFactory sessionFactory = new MetadataSources(registry)
//                    .buildMetadata()
//                    .buildSessionFactory();
//        }
//        catch (Exception e) {
//            StandardServiceRegistryBuilder.destroy(registry);
////            logger.error("cannot create sessionFactory", e);
//            System.exit(1);
//        }
//        return sessionFactory;
//    }
//    public AbstractDao() {
//        HibernateFactory.buildIfNeeded();
//    }
//
//    protected void saveOrUpdate(Object obj) {
//        try {
//            startOperation();
//            session.saveOrUpdate(obj);
//            tx.commit();
//        } catch (HibernateException e) {
//            handleException(e);
//        } finally {
//            HibernateFactory.close(session);
//        }
//    }
//
//    protected void delete(Object obj) {
//        try {
//            startOperation();
//            session.delete(obj);
//            tx.commit();
//        } catch (HibernateException e) {
//            handleException(e);
//        } finally {
//            HibernateFactory.close(session);
//        }
//    }
//
//    protected Object find(Class clazz, Long id) {
//        Object obj = null;
//        try {
//            startOperation();
//            obj = session.load(clazz, id);
//            tx.commit();
//        } catch (HibernateException e) {
//            handleException(e);
//        } finally {
//            HibernateFactory.close(session);
//        }
//        return obj;
//    }
//
//    protected List findAll(Class clazz) {
//        List objects = null;
//        try {
//            startOperation();
//            Query query = session.createQuery("from " + clazz.getName());
//            objects = query.list();
//            tx.commit();
//        } catch (HibernateException e) {
//            handleException(e);
//        } finally {
//            HibernateFactory.close(session);
//        }
//        return objects;
//    }
//
//    protected void handleException(HibernateException e) throws DataAccessLayerException {
//        HibernateFactory.rollback(tx);
//        throw new DataAccessLayerException(e);
//    }
//
//    protected void startOperation() throws HibernateException {
//        session = HibernateFactory.openSession();
//        tx = session.beginTransaction();
//    }
}
