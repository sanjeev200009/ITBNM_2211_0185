package main;

import controller.homeController;
import view.Homepage;

public class Main {

    public static void main(String[] args) {
        // Initialize the view
        Homepage homeView = new Homepage();
        homeController HomeController = new homeController(homeView);
    }
}
