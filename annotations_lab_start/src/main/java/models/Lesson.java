package models;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import javax.persistence.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


@Entity
@Table(name = "lessons")
public class Lesson {

    private int id;
    private String title;
    private int classroomNo;
    private GregorianCalendar date;
    private Course course;
    private Instructor instructor;

    public Lesson(){

    }

    public Lesson(String title, int classroomNo, GregorianCalendar date, Course course, Instructor instructor) {
        this.title = title;
        this.classroomNo = classroomNo;
        this.date = date;
        this.course = course;
        this.instructor = instructor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "classroom_no")
    public int getClassroomNo() {
        return classroomNo;
    }
    public void setClassroomNo(int classroomNo) {
        this.classroomNo = classroomNo;
    }

    @Column(name = "date_and_time")
    public GregorianCalendar getDate() {
        return date;
    }
    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false)
    public Instructor getInstructor() {
        return instructor;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
