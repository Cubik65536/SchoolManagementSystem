package org.qianq.dto;

import lombok.Getter;

/**
 * Course of the school.
 * @author Qian Qian (2362597)
 */
@Getter
public class Course {
    private static final int MAX_STUDENT_NUM = 5;
    private static int nextId = 1;

    private String id;
    private String courseName;
    private double credit;
    private Department department;
    private Teacher teacher;
    private Student[] students;
    private int studentNum;

    /**
     * Constructor. Initialize the id based on the nextId and
     * credit, department, and course name with arguments.
     * @param courseName The name of this course.
     * @param credit The credit of this course.
     * @param department The department this course belongs to.
     */
    public Course(String courseName, double credit, Department department) {
        this.id = String.format("C%03d", nextId++);
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.teacher = null;
        this.students = new Student[MAX_STUDENT_NUM];
        this.studentNum = 0;
    }

    /**
     * Set the teacher for this course.
     * @param teacher The teacher for this course.
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * Check if the course has been fully registered.
     * @return True if the course has been fully registered, false otherwise.
     */
    public boolean isFull() {
        return studentNum == MAX_STUDENT_NUM;
    }

    /**
     * Add a student to this course.
     * @param student The student to be added.
     * @return True if the student is added successfully, false otherwise.
     */
    public void addStudent(Student student) {
        students[studentNum++] = student;
    }

    /**
     * Returns a string that represents this course.
     * @return The string that represents this course.
     */
    @Override
    public String toString() {
        String courseString = "Course{" +
                "id='" + id + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credit=" + credit;

        if (teacher != null) {
            courseString += ", teacher=" + teacher.getLastName() + ' ' + teacher.getFirstName();
        } else {
            courseString += ", teacher=null";
        }


        courseString += ", department=" + department + ", students=[";

        for (Student student : students) {
            if (student != null) {
                courseString += student.getFirstName() + ' ' + student.getLastName() + ", ";
            }
        }

        return courseString + "]}";
    }
}
