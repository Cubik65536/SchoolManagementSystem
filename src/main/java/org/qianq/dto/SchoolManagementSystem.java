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
    private int departmentCount;
    private Student[] students;
    private int studentCount;
    private Teacher[] teachers;
    private int teacherCount;
    private Course[] courses;
    private int courseCount;

    /**
     * A NoArgsConstructor that initialize the School Management System
     * with arrays for storing its departments, students, teachers, and courses.
     */
    public SchoolManagementSystem() {
        this.departments = new Department[MAX_DEPARTMENT_NUM];
        departmentCount = 0;
        this.students = new Student[MAX_STUDENT_NUM];
        studentCount = 0;
        this.teachers = new Teacher[MAX_TEACHER_NUM];
        teacherCount = 0;
        this.courses = new Course[MAX_COURSE_NUM];
        courseCount = 0;
    }

    /**
     * Add a department based on its name.
     * @param name The name of the new department.
     */
    public void addDepartment(String name) {
        if (departmentCount < MAX_DEPARTMENT_NUM) {
            departments[departmentCount] = new Department(name);
            System.out.println("Add department " + departments[departmentCount] + " successfully.");
            departmentCount++;
        } else {
            System.out.println("Max department reached, add a new department failed.");
        }
    }

    /**
     * Add a student based on his name and the name of his department.
     * @param lastName The last name of the student.
     * @param firstName The first name of the student.
     * @param departmentId The ID of the department of the student.
     */
    public void addStudent(String lastName, String firstName, String departmentId) {
        Department department = findDepartment(departmentId);
        if (studentCount < MAX_STUDENT_NUM) {
            students[studentCount] = new Student(lastName, firstName, department);
            System.out.println("Student " + students[studentCount] + " added successfully.");
            studentCount++;
        } else {
            System.out.println("Max student reached, add a new student failed.");
        }
    }

    /**
     * Add a teacher based on his name and the name of his department.
     * @param lastName The last name of the teacher.
     * @param firstName The first name of the teacher.
     * @param departmentId The ID of the department of the teacher.
     */
    public void addTeacher(String lastName, String firstName, String departmentId) {
        Department department = findDepartment(departmentId);
        if (teacherCount < MAX_TEACHER_NUM) {
            teachers[teacherCount] = new Teacher(lastName, firstName, department);
            System.out.println("Teacher " + teachers[teacherCount] + " added successfully.");
            teacherCount++;
        } else {
            System.out.println("Max teacher reached, add a new teacher failed.");
        }
    }

    /**
     * Add a course based on its name, its credit, and the name of its department.
     * @param courseName The name of the course.
     * @param credit The credit given by the course.
     * @param departmentId The ID of the department of the course.
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        Department department = findDepartment(departmentId);
        if (courseCount < MAX_COURSE_NUM) {
            courses[courseCount] = new Course(courseName, credit, department);
            System.out.println("Course " + courses[courseCount] + " added successfully.");
            courseCount++;
        } else {
            System.out.println("Max course reached, add a new course failed.");
        }
    }

    /**
     * Display all departments in a school.
     * Only departments that are not null will be displayed.
     */
    public void displayDepartment() {
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    /**
     * Display all students in a school.
     * Only students that are not null will be displayed.
     * The name of the courses and the name of the department are only displayed if there is any.
     */
    public void displayStudents() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    /**
     * Display all teachers in a school.
     * Only teachers that are not null will be displayed.
     * The name of the courses and the name of the department are only displayed if there is any.
     */
    public void displayTeachers() {
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
    }

    /**
     * Display all courses in a school.
     * Only courses that are not null will be displayed.
     * The name of the teacher, the students, and the department are only displayed if there is any.
     */
    public void displayCourses() {
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }

    /**
     * Search a department in the departments based on a departmentId.
     * If the departmentId does not match with any department, return null.
     * @param departmentId The department's ID.
     * @return The department with corresponding ID, null if nothing is corresponding.
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department != null) {
                if (department.getId().equals(departmentId)) {
                    return department;
                }
            }
        }

        return null;
    }

    /**
     * Search a student in the students based on a studentId.
     * If the studentId does not match with any student, return null.
     * @param studentId The student's ID.
     * @return The student with corresponding ID, null if nothing is corresponding.
     */
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student != null) {
                if (student.getId().equals(studentId)) {
                    return student;
                }
            }
        }

        return null;
    }

    /**
     * Search a teacher in the teachers based on a teacherId.
     * If the teacherId does not match with any teacher, return null.
     * @param teacherId The teacher's ID.
     * @return The teacher with corresponding ID, null if nothing is corresponding.
     */
    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                if (teacher.getId().equals(teacherId)) {
                    return teacher;
                }
            }
        }

        return null;
    }

    /**
     * Search a course in the courses based on a courseId.
     * If the courseId does not match with any course, return null.
     * @param courseId The course's ID.
     * @return The course with corresponding ID, null if nothing is corresponding.
     */
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course != null) {
                if (course.getId().equals(courseId)) {
                    return course;
                }
            }
        }

        return null;
    }

    /**
     * Assign a teacher to a specific course (based on teacherId and courseId).
     * If no corresponding teacher or course is found, a message will be printed.
     * @param teacherId The teacher's ID to assign to the course.
     * @param courseId The course's ID.
     */
    public void assignTeacherToCourse(String teacherId, String courseId) {
        Teacher teacher = findTeacher(teacherId);
        Course course = findCourse(courseId);

        if (teacher == null) {
            System.out.println("Cannot find any teacher match with teacherId " + teacherId +
                    ", modify teacher for course " + courseId + " failed.");
            return;
        }
        if (course == null) {
            System.out.println("Cannot find any course match with courseId " + courseId +
                    ", modify teacher for course " + courseId + " failed.");
            return;
        }

        course.setTeacher(teacher);
        System.out.println(course + " teacher info updated successfully.");
    }

    /**
     * Register a student to a course (based on studentId and courseId).
     * If no corresponding student or course is found, a message will be printed.
     * If the student has already registered to a max amount (5) of courses, a message will be printed.
     * If there's already a max amount (5) of student registered to the course, a message will be printed.
     * If the student already registered to the corresponding course, a message will be printed.
     * @param studentId The ID of the student registered to the course.
     * @param courseId The course's ID.
     */
    public void registerCourseForStudent(String studentId, String courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);

        if (student == null) {
            System.out.println("Cannot find any student match with studentId " + studentId +
                    ", register course for student " + studentId + " failed.");
            return;
        }
        if (course == null) {
            System.out.println("Cannot find any course match with courseId " + courseId +
                    ", register course for student " + studentId + " failed.");
            return;
        }

        if (!student.registerCourse(course) || !course.addStudent(student)) {
            // If any of these process failed, return so no success message will be printed.
            return;
        }

        System.out.println("Student register course successfully");
        System.out.println("Latest student info: " + student);
        System.out.println("Latest course info: " + course);
    }
}
