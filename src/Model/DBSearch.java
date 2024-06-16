package model;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class DBSearch {
            Statement stmt;
           ResultSet rs;
      public ResultSet searchLogin(String usName) {
       try {
           stmt = DBConnection.getStatementConnection();
           String name = usName;
//Execute the Query
         rs = stmt.executeQuery("SELECT * FROM users where Student_UserName='"+ name + "'");
       } catch (Exception e) {
      e.printStackTrace();
       }
       return rs;
  }
      
        
      public ResultSet searchLoginadmin(String usName) {
       try {
           stmt = DBConnection.getStatementConnection();
           String name = usName;
//Execute the Query
         rs = stmt.executeQuery("SELECT * FROM admin where Admin_Id='"+ name + "'");
       } catch (Exception e) {
      e.printStackTrace();
       }
       return rs;
  }
      
             public ResultSet searchmarks(){
        try{
        stmt = DBConnection.getStatementConnection();
        rs = stmt.executeQuery("SELECT * FROM marks");
 }
        catch(Exception e){

       }
        return rs;
  }
             
             
             public ResultSet searchstudent(){
        try{
        stmt = DBConnection.getStatementConnection();
        rs = stmt.executeQuery("SELECT * FROM addnewstudent");
 }
        catch(Exception e){

       }
        return rs;
  }
             
             
    
      
}
