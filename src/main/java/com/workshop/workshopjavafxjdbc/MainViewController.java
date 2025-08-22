package com.workshop.workshopjavafxjdbc;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSeller(){
        System.out.println("Menu Item Seller");
    }
    @FXML
    public void onMenuItemDepartment(){
        System.out.println("Menu Item Department");
    }
    @FXML
    public void onMenuItemAbout(){
        System.out.println("Menu Item About");
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
