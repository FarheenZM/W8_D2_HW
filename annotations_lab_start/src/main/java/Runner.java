import db.DBCourse;
import db.DBHelper;
import db.DBInstructor;
import models.*;

import java.util.GregorianCalendar;
import java.util.List;

public class Runner {

    public static void main(String[] args) {


        Course course1 = new Course("Engineering", Level.BENG);
        Course course2 = new Course("Science", Level.BSC);
        Course course3 = new Course("Commerce", Level.BCOM);
        Course course4 = new Course("Home Science", Level.BA);

        DBHelper.save(course1);
        DBHelper.save(course2);
        DBHelper.save(course3);
        DBHelper.save(course4);

        Instructor instructor1 = new Instructor("Sam");
        Instructor instructor2 = new Instructor("Smith");

        DBHelper.save(instructor1);
        DBHelper.save(instructor2);

        Lesson lesson1 = new Lesson("S/w engineering", 01, new GregorianCalendar(2018,06,03, 11,00,00), course1, instructor1);
        Lesson lesson2 = new Lesson("Information tech", 02, new GregorianCalendar(2018, 06, 04, 10,00,00), course2, instructor2 );
        Lesson lesson3 = new Lesson("History", 03, new GregorianCalendar(2018, 06, 04, 11,15,00), course4, instructor1);
        Lesson lesson4 = new Lesson("Tally", 04, new GregorianCalendar(2018, 06, 05, 10,30,00), course3, instructor2);
        Lesson lesson5 = new Lesson("Arts", 05, new GregorianCalendar(2018, 06, 05, 11,00,00), course4, instructor1);

        DBHelper.save(lesson1);
        DBHelper.save(lesson2);
        DBHelper.save(lesson3);
        DBHelper.save(lesson4);
        DBHelper.save(lesson5);

        Student student1 = new Student("Eti", "Chandel", 22, 101, course2);
        Student student2 = new Student("Aryan", "Khan", 20, 102, course2);
        Student student3 = new Student("Jay", "Kapoor", 21, 103, course3);
        Student student4 = new Student("Riya", "Jain", 22, 104, course1);
        Student student5 = new Student("Tia", "Sharma", 23, 105, course4);

        DBHelper.save(student1);
        DBHelper.save(student2);
        DBHelper.save(student3);
        DBHelper.save(student4);
        DBHelper.save(student5);

        student5.setAge(24);
        DBHelper.update(student5);

        List<Course> allCourses = DBHelper.getAll(Course.class);

//        DBHelper.delete(course3);
//        List<Course> coursesAfterDelete = DBHelper.getAll(Course.class);

        Student foundStudent = DBHelper.find(Student.class, student2.getId());


        List<Student> allStudents = DBCourse.getAllStudents(course2);
        List<Lesson> allLessons = DBCourse.getAllLessons(course4);

        List<Lesson> allLessonsForAnInstructor = DBInstructor.getAllLessonsForAnInstructor(instructor1);

    }
}
