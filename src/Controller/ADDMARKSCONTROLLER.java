/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ADDmarks;


import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ADDMARKSCONTROLLER {
    
    public static void MARKS(int Kumar, int Vimal, int AJAY, int Murali, int Ajnathan, int Nilu, int Sajeevn, int Azar, int Mufees, int sanjeev) {
        
        if (Kumar < 0 || Vimal < 0 || AJAY < 0 || Murali < 0 || Ajnathan < 0 || Nilu < 0 || Sajeevn < 0 || Azar < 0 || Mufees < 0 || sanjeev < 0) {
            JOptionPane.showMessageDialog(null, "Marks cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
        
        new ADDmarks().MARKS(Kumar, Vimal, AJAY, Murali, Ajnathan, Nilu, Sajeevn, Azar, Mufees, sanjeev);
        JOptionPane.showMessageDialog(null, "New Marks Record has been inserted", "Successful", JOptionPane.INFORMATION_MESSAGE);
    }}
    
    
    public static void insertStudentRecord(String studentName, String studentFaculty, String studentSub, String studentResult) {
        
        if (studentName == null || studentName.trim().isEmpty() ||
            studentFaculty == null || studentFaculty.trim().isEmpty() ||
            studentSub == null || studentSub.trim().isEmpty() ||
            studentResult == null || studentResult.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        new ADDmarks().insertStudentData(studentName, studentFaculty, studentSub, studentResult);
        JOptionPane.showMessageDialog(null, "New Student Record has been inserted", "Successful", JOptionPane.INFORMATION_MESSAGE);
    }
    
      public static void ADMIN(String ADID, String ADPASSWORD, String ADROLL) {
          
          if (ADID == null || ADID.trim().isEmpty() ||
            ADPASSWORD == null || ADPASSWORD.trim().isEmpty() ||
            ADROLL == null || ADROLL.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
          
        new ADDmarks().ADMIN( ADID, ADPASSWORD, ADROLL);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successful", JOptionPane.INFORMATION_MESSAGE);
    }
      
       
    public static void TEACHER(String TEACHER_NAME, String TEACHER_ID, String TEACHER_ROLL, String TEACHER_FACULTY, String GENDER, String DESCRIPTION) {
        if (TEACHER_NAME == null || TEACHER_NAME.trim().isEmpty() ||
            TEACHER_ID == null || TEACHER_ID.trim().isEmpty() ||
            TEACHER_ROLL == null || TEACHER_ROLL.trim().isEmpty() ||
            TEACHER_FACULTY == null || TEACHER_FACULTY.trim().isEmpty() ||
            GENDER == null || GENDER.trim().isEmpty() ||
            DESCRIPTION == null || DESCRIPTION.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        new ADDmarks().TEACHER(TEACHER_NAME, TEACHER_ID, TEACHER_ROLL, TEACHER_FACULTY, GENDER, DESCRIPTION);
        JOptionPane.showMessageDialog(null, "New Teacher Record has been inserted", "Successful", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void STUDNET(String studentName, String studentAddress, String studentGender,String studentReligion, String studentContactNumber, String admissionDate) {
        if (studentName == null || studentName.trim().isEmpty() ||
            studentAddress == null || studentAddress.trim().isEmpty() ||
            studentGender == null || studentGender.trim().isEmpty() ||
            studentReligion == null || studentReligion.trim().isEmpty() ||
            studentContactNumber == null || studentContactNumber.trim().isEmpty() ||
            admissionDate == null || admissionDate.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
      
        new ADDmarks(). ADDSTUDENT(studentName, studentAddress, studentGender, studentReligion,  studentContactNumber, admissionDate);
        JOptionPane.showMessageDialog(null, "STUDEN TDETAILS  has been inserted", "Successful", JOptionPane.INFORMATION_MESSAGE);
    }
   
     
    public static void QUIZ(String NAME, String qu1, String qu2, String qu3, String qu4, String qu5) {
        
        if (NAME == null || NAME.trim().isEmpty() ||
            qu1 == null || qu1.trim().isEmpty() ||
            qu2 == null || qu2.trim().isEmpty() ||
            qu3 == null || qu3.trim().isEmpty() ||
            qu4 == null || qu4.trim().isEmpty() ||
            qu5 == null || qu5.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        new ADDmarks().ADDQUIZE ( NAME,  qu1,  qu2, qu3,  qu4,  qu5);
        JOptionPane.showMessageDialog(null, "YOUR RESPONSE has been inserted", "Successful", JOptionPane.INFORMATION_MESSAGE);
    }
   
     
 

}
