package Controller;

import Model.ADDNewStudent;
import javax.swing.JOptionPane;

public class UpdateStudentController {

    public static void updateStudent(int rowIndex, String studentName, String studentAddress, 
                                     String studentGender, String studentReligion, 
                                     String studentContactNumber, String admissionDate) {
        try {
            ADDNewStudent addNewStudent = new ADDNewStudent();
            addNewStudent.updateStudent(rowIndex, studentName, studentAddress, 
                                        studentGender, studentReligion, 
                                        studentContactNumber, admissionDate);
            JOptionPane.showMessageDialog(null, "Student Record has been updated", "Successful", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error updating student record: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // You can log the exception details for debugging
        }
    }
}
