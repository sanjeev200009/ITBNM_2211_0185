package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class ADDNewStudent {

    private Statement stmt;

   public void addStudent(String studentName, String studentAddress, String studentGender,
                           String studentReligion, String studentContactNumber, String admissionDate) {
        try {
            // Get Statement object from DBConnection
            stmt = model.DBConnection.getStatementConnection();

            if (stmt != null) {
                String query = "INSERT INTO addnewstudent (STUDENT_NAME, STUDENT_ADRESS, STUDENT_GENDER, STUDENT_RELIGION, STUDENT_CONTACT_NUMBER,ADDMISSION_DATE) " +
                               "VALUES ('" + studentName + "', '" + studentAddress + "', '" + studentGender + "', '" + studentReligion + "', '" + studentContactNumber + "', '" + admissionDate + "')";

                stmt.executeUpdate(query);
            } else {
                System.err.println("Failed to get database connection.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
public void updateStudent(int rowIndex,String studentName, String studentAddress, String studentGender, 
                          String studentReligion, String studentContactNumber, String admissionDate) {
    PreparedStatement pstmt = null;
    Connection conn = null;
    
    try {
        conn = model.DBConnection.getConnection(); // Assuming getConnection() returns a Connection object
        
        if (conn != null) {
            String query = "UPDATE addnewstudent SET STUDENT_NAME = ?, STUDENT_ADRESS = ?, " +
                           "STUDENT_GENDER = ?, STUDENT_RELIGION = ?, " +
                           "STUDENT_CONTACT_NUMBER = ?, ADDMISSION_DATE = ? " +
                           "WHERE ROW_INDEX = ?";
            
            pstmt = conn.prepareStatement(query);
            
            // Bind parameters
            pstmt.setString(1, studentName);
            pstmt.setString(2, studentAddress);
            pstmt.setString(3, studentGender);
            pstmt.setString(4, studentReligion);
            pstmt.setString(5, studentContactNumber);
            pstmt.setString(6, admissionDate);
            // Assuming rowIndex is the identifier for the row to update
            pstmt.setInt(7, rowIndex); 

            // Execute the update
            int rowsUpdated = pstmt.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);
        } else {
            System.err.println("Failed to get database connection.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
  public void deleteRecord(String id_nameToDelete) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        try {
            conn = DBConnection.getConnection();
            String sql = "DELETE FROM addnewstudent WHERE STUDENT_NAME = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id_nameToDelete);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("No record found with the given name.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
    }

}
