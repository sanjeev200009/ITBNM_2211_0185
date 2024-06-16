package Controller;

import Model.ADDNewStudent;
import javax.swing.JOptionPane;

public class ADDNewStudentController {

    public static void addStudent(String studentName, String studentAddress, String studentGender, 
                                  String studentReligion, String studentContactNumber, String admissionDate) {
        new ADDNewStudent().addStudent(studentName, studentAddress, studentGender, studentReligion, studentContactNumber, admissionDate);
        JOptionPane.showMessageDialog(null, "New Student Record has been inserted", "Successful", JOptionPane.INFORMATION_MESSAGE);
    }
}
