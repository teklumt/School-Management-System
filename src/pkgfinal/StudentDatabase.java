/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;


import java.util.ArrayList;

public class StudentDatabase {
 private static StudentDatabase instance;
    private ArrayList<Student> students;

    private StudentDatabase() {
        students = new ArrayList<>();
        // Add your initialization logic if needed
    }

    public static StudentDatabase getInstance() {
        if (instance == null) {
            instance = new StudentDatabase();
        }
        return instance;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(int schNo) {
        for (Student student : students) {
            if (student.getSchNo() == schNo) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(Student updatedStudent) {
        int index = findStudentIndex(updatedStudent.getSchNo());
        if (index != -1) {
            students.set(index, updatedStudent);
        }
    }

    public void removeStudent(int schNo) {
        int index = findStudentIndex(schNo);
        if (index != -1) {
            students.remove(index);
        }
    }

    private int findStudentIndex(int schNo) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSchNo() == schNo) {
                return i;
            }
        }
        return -1;
    }
    public boolean isStudentExists(int schNo, String name) {
        for (Student student : students) {
            if (student.getSchNo() == schNo || student.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }


    // Other methods as needed

//    public static class Student {
//        private int schNo;
//        private String name;
//        private String fatherName;
//        private String motherName;
//        // Other fields and methods as needed
//
//        private Student(int schNo, String name, String fatherName, String motherName) {
//            this.schNo = schNo;
//            this.name = name;
//            this.fatherName = fatherName;
//            this.motherName = motherName;
//        }
//
//        // Getters and setters
//    }
}
