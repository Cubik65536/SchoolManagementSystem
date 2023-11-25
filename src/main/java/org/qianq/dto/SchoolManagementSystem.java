package org.qianq.dto;

/**
 * A School Management System
 * @author Qian Qian (2362597)
 */
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENT_NUM = 5;
    private static final int MAX_STUDENT_NUM = 200;
    private static final int MAX_TEACHER_NUM = 20;
    private static final int MAX_COURSE_NUM = 30;

    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;

    /**
     * A NoArgsConstructor that initialize the School Management System
     * with arrays for storing its departments, students, teachers, and courses.
     */
    public SchoolManagementSystem() {
        this.departments = new Department[MAX_DEPARTMENT_NUM];
        this.students = new Student[MAX_STUDENT_NUM];
        this.teachers = new Teacher[MAX_TEACHER_NUM];
        this.courses = new Course[MAX_COURSE_NUM];
    }

    /**
     * Add a department based on its name.
     * @param name The name of the new department.
     */
    public void addDepartment(String name) {

    }

    /**
     * Add a student based on his name and the name of his department.
     * @param lastName The last name of the student.
     * @param firstName The first name of the student.
     * @param department The name of the department of the student.
     */
    public void addStudent(String lastName, String firstName, String department) {

    }

    /**
     * Add a teacher based on his name and the name of his department.
     * @param lastName The last name of the teacher.
     * @param firstName The first name of the teacher.
     * @param department The name of the department of the teacher.
     */
    public void addTeacher(String lastName, String firstName, String department) {

    }

    /**
     * Add a course based on its name, its credit, and the name of its department.
     * @param courseName The name of the course.
     * @param credit The credit given by the course.
     * @param department The name of the department of the course.
     */
    public void addCourse(String courseName, double credit, String department) {

    }
}
