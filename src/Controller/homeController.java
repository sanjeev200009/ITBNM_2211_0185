package controller;

import view.Homepage;
import view.userlogin;
import view.Admininterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ADMINLOGIN01;

public class homeController {
    private Homepage homeView;

    public homeController(Homepage homeView) {
        this.homeView = homeView;
        this.homeView.setVisible(true);

        // Attach event listeners to the buttons using getter methods
        this.homeView.getStudentButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleStudentButton();
            }
        });

        this.homeView.getAdminButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAdminButton();
            }
        });
    }
    
    

    private void handleStudentButton() {
        homeView.dispose();
        userlogin r = new userlogin();
        r.setTitle("Login as User");
        r.setVisible(true);
    }

    private void handleAdminButton() {
        homeView.dispose();
        ADMINLOGIN01 a = new    ADMINLOGIN01 ();
        a.setTitle("Login as Admin");
        a.setVisible(true);
    }
}

