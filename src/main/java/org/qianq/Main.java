package org.qianq;

import org.qianq.dto.SchoolManagementSystem;

/**
 * Final Project - Vanier College 420-201-RE (Fall 2023)
 * @author Qian Qian (2362597)
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();

        // 1. Add new departments
        // a) Add a new department successfully.
        schoolManagementSystem.addDepartment("Electrical Engineering and Computer Science");
        schoolManagementSystem.addDepartment("Materials Science and Engineering");
        schoolManagementSystem.addDepartment("Mechanical Engineering");
        schoolManagementSystem.addDepartment("Mathematics");
        schoolManagementSystem.addDepartment("Physics");
        // b) Add a new department failed
        schoolManagementSystem.addDepartment("Humanities + Engineering/Science");

        System.out.println();

        // 2. Display departments
        System.out.println("Displaying all departments:");
        System.out.println("-------------------");
        schoolManagementSystem.displayDepartment();

        System.out.println();

        // 3. Add new students
        // a) Add a new student successfully
        schoolManagementSystem.addStudent("Qian", "Qian", "D001");
        schoolManagementSystem.addStudent("Erik", "Chen", "D001");
        schoolManagementSystem.addStudent("Mike", "Williams", "D001");
        schoolManagementSystem.addStudent("Thomas", "Kennedy", "D001");
        schoolManagementSystem.addStudent("Nigel", "Harrison", "D001");
        schoolManagementSystem.addStudent("Edward", "Russell", "D001");
        // b) Add a new student failed
        boolean addNewStudentFailedTest = false;
        if (addNewStudentFailedTest) {
            for (int i = 0; i < 195; i++) {
                schoolManagementSystem.addStudent(String.valueOf(i), String.valueOf(i), "D001");
            }
            // Should Fail once
        }

        System.out.println();

        // 4. Display students
        System.out.println("Displaying all students:");
        System.out.println("-------------------");
        schoolManagementSystem.displayStudents();

        System.out.println();

        // 5. Add a new teacher
        // a) Add a new teacher successfully
        schoolManagementSystem.addTeacher("Yi", "Wang", "D001");
        // b) Add a new teacher failed
        boolean addNewTeacherFailedTest = false;
        if (addNewTeacherFailedTest) {
            for (int i = 0; i < 20; i++) {
                schoolManagementSystem.addTeacher(String.valueOf(i), String.valueOf(i), "D001");
            }
            // Should Fail once
        }

        System.out.println();

        // 6. Display teachers
        System.out.println("Displaying all teachers:");
        System.out.println("-------------------");
        schoolManagementSystem.displayTeachers();

        System.out.println();

        // 7. Add a new course
        // a) Add a new course successfully
        schoolManagementSystem.addCourse("Intro to Programming", 3.0, "D001");
        schoolManagementSystem.addCourse("English", 3.0, "D001");
        schoolManagementSystem.addCourse("French", 3.0, "D001");
        schoolManagementSystem.addCourse("Humanities", 3.0, "D001");
        schoolManagementSystem.addCourse("Physics", 3.0, "D001");
        schoolManagementSystem.addCourse("Chemistry", 3.0, "D001");
        // b) Add a new course failed
        boolean addNewCourseFailedTest = false;
        if (addNewCourseFailedTest) {
            for (int i = 0; i < 25; i++) {
                schoolManagementSystem.addCourse(String.valueOf(i), 3.0, "D001");
            }
            // Should Fail once
        }

        System.out.println();

        // 8. Modify the teacher of a course
        // a) Modify the teacher of a course successfully
        schoolManagementSystem.assignTeacherToCourse("T001", "C001");
        // b) Modify the teacher of a course failed, courseId not found
        schoolManagementSystem.assignTeacherToCourse("T001", "C000");
        // c) Modify the teacher of a course failed, teacherId not found
        schoolManagementSystem.assignTeacherToCourse("T000", "C001");

        System.out.println();
        System.out.println();

        // 9. Student register course
        // a) Student register course successfully.
        schoolManagementSystem.registerCourseForStudent("S001", "C001");
        System.out.println();
        // f) Student register course failed, student has registered that course.
        schoolManagementSystem.registerCourseForStudent("S001", "C001");
        System.out.println();
        // b) Student register course failed, studentId not found.
        schoolManagementSystem.registerCourseForStudent("S000", "C001");
        System.out.println();
        // c) Student register course failed, courseId not found.
        schoolManagementSystem.registerCourseForStudent("S001", "C000");
        System.out.println();
        // d) Student register course failed, student has registered max courses.
        schoolManagementSystem.registerCourseForStudent("S001", "C002");
        schoolManagementSystem.registerCourseForStudent("S001", "C003");
        schoolManagementSystem.registerCourseForStudent("S001", "C004");
        schoolManagementSystem.registerCourseForStudent("S001", "C005");
        schoolManagementSystem.registerCourseForStudent("S001", "C006"); // Fail Here
        System.out.println();
        // e) Student register course failed, course is fully registered.
        schoolManagementSystem.registerCourseForStudent("S002", "C001");
        schoolManagementSystem.registerCourseForStudent("S003", "C001");
        schoolManagementSystem.registerCourseForStudent("S004", "C001");
        schoolManagementSystem.registerCourseForStudent("S005", "C001");
        schoolManagementSystem.registerCourseForStudent("S006", "C001"); // Fail Here
        System.out.println();
    }
}
