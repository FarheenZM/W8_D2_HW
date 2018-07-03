package models;


import javax.persistence.*;

@Entity
@Table(name = "students")

public class Student {

    private int id;
    private String first_name;
    private String last_name;
    private int age;
    private int enrolment_no;
    private Course course;

    public Student(){

    }

    public Student(String first_name, String last_name, int age, int enrolment_no, Course course) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.enrolment_no = enrolment_no;
        this.course = course;
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

    @Column(name = "first_name")
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Column(name = "last_name")
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "enrolment_no")
    public int getEnrolment_no() {
        return enrolment_no;
    }
    public void setEnrolment_no(int enrolment_no) {
        this.enrolment_no = enrolment_no;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }


}
