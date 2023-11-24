package org.qianq.dto;

/**
 * Departments of the school.
 * @author Qian Qian (2362597)
 */
public class Department {
    private static int nextId = 1;

    private String id;
    private String departmentName;

    /**
     * Constructor. Initialize the id with nextId and the name of the department with the argument.
     * @param departmentName The name of the department.
     */
    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }

    /**
     * Returns a string that represents this department.
     * @return The string that represents this department.
     */
    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
