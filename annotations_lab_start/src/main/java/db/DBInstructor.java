package db;

import com.sun.xml.internal.ws.handler.HandlerException;
import models.Course;
import models.Instructor;
import models.Lesson;
import models.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBInstructor {

    private static Session session;

    public static List<Lesson> getAllLessonsForAnInstructor(Instructor instructor){
        session = HibernateUtil.getSessionFactory().openSession();

        List<Lesson> results = null;

        try{
            Criteria cr = session.createCriteria(Lesson.class);
            cr.add(Restrictions.eq("instructor", instructor));
            results = cr.list();
        }catch (HandlerException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return results;
    }

}
