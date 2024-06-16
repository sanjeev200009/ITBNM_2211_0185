
package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author user
 */
public class ADDmarks {
    
    Statement stmt;

    public void MARKS(int Kumar, int Vimal, int AJAY, int Murali, int Ajnathan, int Nilu, int Sajeevn, int Azar, int Mufees, int sanjeev) {
    try {
        stmt = model.DBConnection.getStatementConnection();
        String query = "INSERT INTO marks (Kumar, Vimal,AJAY,Murali, Ajnathan, Nilu, Sajeevn, Azar, Mufees, sanjeev) " +
                       "VALUES ('" + Kumar + "', '" + Vimal + "', '" + AJAY + "', '" + Murali + "', '" + Ajnathan + "', '" + Nilu + "', '" + Sajeevn + "', '" + Azar + "', '" + Mufees + "', '" + sanjeev + "')";
        stmt.executeUpdate(query);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    public void insertStudentData(String studentName, String studentFaculty, String studentSub, String studentResult) {
        try {
            stmt = model.DBConnection.getStatementConnection();
            String query = "INSERT INTO result(STUDENT_NAME, STUDENT_FACALTY, STUDENT_SUB, STUDENT_RESULT) " +
                           "VALUES ('" + studentName + "', '" + studentFaculty + "', '" + studentSub + "', '" + studentResult + "')";
            stmt.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  
    

    public void ADMIN(String  ADID , String ADPASSWORD, String ADROLL) {
     try{
       stmt = model.DBConnection.getStatementConnection();
       stmt.executeUpdate("INSERT INTO admin VALUES('"+ADID+"','"+ADPASSWORD+"', '"+ADROLL+"')");
 } catch(Exception e){
 e.printStackTrace();
 }
 }  
    
    public void TEACHER (String TEACHER_NAME, String TEACHER_ID, String TEACHER_ROLL, String TEACHER_FACULTY, String GENDER, String DESCRIPTION) {
     try{
       stmt = model.DBConnection.getStatementConnection();
       stmt.executeUpdate("INSERT INTO theacher VALUES('"+TEACHER_NAME+"','"+TEACHER_ID+"', '"+TEACHER_ROLL+"','"+TEACHER_FACULTY+"','"+GENDER+"','"+DESCRIPTION+"')");
 } catch(Exception e){
 e.printStackTrace();
 }
 }  
    
     public void ADDSTUDENTINFO (String STUNAME	, String STUID, String 	STUROLL, String STUFAC, String STUGE, String DES) {
     try{
       stmt = model.DBConnection.getStatementConnection();
       stmt.executeUpdate("INSERT INTO student VALUES('"+STUNAME+"','"+STUID+"', '"+STUROLL+"','"+STUFAC+"','"+STUGE+"','"+DES+"')");
 } catch(Exception e){
 e.printStackTrace();
 }
 }  
     

    public void ADDSTUDENT (String studentName, String studentAddress, String studentGender,String studentReligion, String studentContactNumber, String admissionDate) {
     try{
       stmt = model.DBConnection.getStatementConnection();
       stmt.executeUpdate("INSERT INTO addnewstudent VALUES('"+studentName+"','"+studentAddress+"', '"+studentGender+"','"+ studentReligion+"','"+studentContactNumber+"','"+admissionDate+"')");
 } catch(Exception e){
 e.printStackTrace();
 }
 }   
     
    
     public void ADDQUIZE (String Name, String Q1, String Q2,String Q3, String Q4, String Q5) {
     try{
       stmt = model.DBConnection.getStatementConnection();
       stmt.executeUpdate("INSERT quize VALUES('"+Name+"','"+Q1+"', '"+Q2+"','"+ Q3+"','"+Q4+"','"+Q5+"')");
 } catch(Exception e){
 e.printStackTrace();
 }
 }   
     
 public void DELETESTUDENT(String studentName) {
    try {
        stmt = model.DBConnection.getStatementConnection();
        stmt.executeUpdate("DELETE FROM addnewstudent WHERE STUDENT_NAME = '" + studentName + "'");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
 
 public void UPDATESTUDENT(String studentName, String studentAddress, String studentGender, String studentReligion, String studentContactNumber, String admissionDate) {
    try {
        Connection conn = model.DBConnection.getConnection();  // Get the connection
        String query = "UPDATE addnewstudent SET STUDENT_ADRESS = ?, STUDENT_GENDER = ?, STUDENT_RELIGION = ?, STUDENT_CONTACT_NUMBER = ?, ADDMISSION_DATE = ? WHERE STUDENT_NAME = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, studentAddress);
        pstmt.setString(2, studentGender);
        pstmt.setString(3, studentReligion);
        pstmt.setString(4, studentContactNumber);
        pstmt.setString(5, admissionDate);
        pstmt.setString(6, studentName);
        pstmt.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}





