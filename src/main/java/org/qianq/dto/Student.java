package org.qianq.dto;

import lombok.Getter;

/**
 * Student of the school.
 *
 * @author Qian Qian (2362597)
 */
@Getter
public class Student {
    private static final int MAX_COURSE_NUM = 5;
    private static int nextId = 1;

    private String id;
    private String lastName;
    private String firstName;
    private Department department;
    private Course[] courses;
    private int courseNum;

    /**
     * Constructor. Initialize the id based on the nextId and
     * last name, first name, and department with arguments.
     * @param lastName   The first name of the student.
     * @param firstName  The last name of the student.
     * @param department The department of the student.
     */
    public Student(String lastName, String firstName, Department department) {
        this.id = String.format("S%03d", nextId++);
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.courses = new Course[MAX_COURSE_NUM];
        this.courseNum = 0;
    }

    /**
     * Register a course for this student.
     * @param course The course to be registered.
     * @return True if the course is registered successfully, false otherwise.
     */
    public boolean registerCourse(Course course) {
        if (courseNum < MAX_COURSE_NUM) {
            for (int i = 0; i < courseNum; i++) {
                if (course == courses[i]) { // Using == here because the same course registered will be the exact same object and can be compared by ==.
                    System.out.println("Student " + this.id + " has already registered course "  + course.getId()
                            + ", register course " + course.getId() + " for student " + this.id + " failed.");
                    return false;
                }
            }
            courses[courseNum++] = course;
            return true;
        } else {
            System.out.println("Student " + this.id + " has registered " + MAX_COURSE_NUM
                    + " courses, register course for student " + this.id + " failed.");
            return false;
        }
    }

    /**
     * Returns a string that represents this student.
     * @return The string that represents this student.
     */
    @Override
    public String toString() {
        String studentString = "Student{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", department=" + department +
                ", courseNum=" + courseNum +
                ", courses=[";

        for (Course course : courses) {
            if (course != null) {
                studentString += course.getCourseName() + ", ";
            }
        }

        return studentString + "]}";
    }
}
