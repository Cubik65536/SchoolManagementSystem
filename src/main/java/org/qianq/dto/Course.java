package org.qianq.dto;

import java.util.Arrays;

/**
 * Course of the school.
 * @author Qian Qian (2362597)
 */
public class Course {
    private static final int MAX_STUDENT_NUM = 5;
    private static int nextId = 1;

    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    /**
     * Constructor. Initialize the id with nextId and
     * credit, department, and course name with arguments.
     * @param credit The credit of this course.
     * @param department The department this course belongs to.
     * @param courseName The name of this course.
     */
    public Course(double credit, Department department, String courseName) {
        this.credit = credit;
        this.id = String.format("C%03d", nextId++);
        this.department = department;
        this.courseName = courseName;
    }

    /**
     * Returns a string that represents this course.
     * @return The string that represents this course.
     */
    @Override
    public String toString() {
        return "Course{" +
                "credit=" + credit +
                ", id='" + id + '\'' +
                ", students=" + Arrays.toString(students) +
                ", department=" + department +
                ", studentNum=" + studentNum +
                ", teacher=" + teacher +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
