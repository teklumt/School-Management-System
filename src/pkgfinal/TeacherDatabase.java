/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;

/**
 *
 * @author Teklu Moges
 *
 */
import java.util.ArrayList;

public class TeacherDatabase {
    private static TeacherDatabase instance;
    private ArrayList<Teachers> teacherList;

    // Private constructor to prevent instantiation from outside
    private TeacherDatabase() {
        teacherList = new ArrayList<>();
    }

    // Public method to get the singleton instance
    public static synchronized TeacherDatabase getInstance() {
        if (instance == null) {
            instance = new TeacherDatabase();
        }
        return instance;
    }

    // Method to add a teacher to the database
    public void addTeacher(Teachers teacher) {
        teacherList.add(teacher);
    }

    // Method to get all teachers from the database
    public ArrayList<Teachers> getAllTeachers() {
        return teacherList;
    }

    // Method to get a specific teacher by ID
    public Teachers getTeacherById(String teacherId) {
        for (Teachers teacher : teacherList) {
            if (teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null; // Teacher not found
    }

    // Method to update a teacher in the database
    public void updateTeacher(Teachers updatedTeacher) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getTeacherId().equals(updatedTeacher.getTeacherId())) {
                teacherList.set(i, updatedTeacher);
                break;
            }
        }
    }

    // Method to delete a teacher from the database
    public void deleteTeacher(String teacherId) {
        for (Teachers teacher : teacherList) {
            if (teacher.getTeacherId().equals(teacherId)) {
                teacherList.remove(teacher);
                break;
            }
        }
    }
    public boolean teacherExists(String teacherId) {
        for (Teachers teacher : teacherList) {
            if (teacher.getTeacherId().equals(teacherId)) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<Teachers> getTeachersByDepartment(String department) {
        ArrayList<Teachers> teachersInDepartment = new ArrayList<>();
        for (Teachers teacher : teacherList) {
            if (teacher.getDepartment().equals(department)) {
                teachersInDepartment.add(teacher);
            }
        }
        return teachersInDepartment;
    }
    
}

