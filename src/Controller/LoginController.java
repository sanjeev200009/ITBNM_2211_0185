package controller;

import view.StudentInterface;
import model.DBConnection;
import model.DBSearch;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.Admininterface;
import view.userlogin;
import model.DBSearch;



public class LoginController {
       public static void login(String usName, String pass) { 
    try { 
        String username = null; // initial value of the username 
        String password = null; // initial value of the password 
        ResultSet rs = new DBSearch().searchLogin(usName); 
        //Process the Query 
        while (rs.next()) { 
        username = rs.getString("Student_UserName"); //assign database login name to the variable
        password = rs.getString("Student_PassWord"); //assign database password to the variable 
            } 
        
            if (username != null && password != null) { 
                if (password.equals(pass)) { 
         //System.out.println("Login Successfull"); 
         JOptionPane.showMessageDialog(null, "Login SuccessFully !!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
         userlogin.getFrames()[1].dispose(); 
         new StudentInterface().setVisible(true); 
                } 
                else { 
                    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE); } 
                }
            
            else { 
                JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE); 
            } 
            DBConnection.closeCon(); 
        } catch (SQLException ex) {        
        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }
       
        public static void Adminlogin(String usName, String pass) { 
    try { 
        String username = null; // initial value of the username 
        String password = null; // initial value of the password 
        ResultSet rs = new DBSearch().searchLoginadmin(usName); 
        //Process the Query 
        while (rs.next()) { 
        username = rs.getString("Admin_Id"); //assign database login name to the variable
        password = rs.getString("Admin_password"); //assign database password to the variable 
            } 
            if (username != null && password != null) { 
                if (password.equals(pass)) { 
         //System.out.println("Login Successfull"); 
         JOptionPane.showMessageDialog(null, "Login as admin SuccessFully !!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
         userlogin.getFrames()[1].dispose(); 
         new Admininterface().setVisible(true); 
                } 
                else { 
                    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE); } 
                }
            
            else { 
                JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE); 
            } 
            DBConnection.closeCon(); 
        } catch (SQLException ex) {        
        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }
}