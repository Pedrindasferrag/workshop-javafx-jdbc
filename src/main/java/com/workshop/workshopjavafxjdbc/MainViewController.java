package com.workshop.workshopjavafxjdbc;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import util.Alerts;

import java.io.IOException;
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
        loadView("About.fxml");
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private synchronized void loadView(String absoluteName){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = loader.load();

            Scene mainScene = Main.getMainScene();
            VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVbox.getChildren().get(0);
            mainVbox.getChildren().clear();
            mainVbox.getChildren().add(mainMenu);
            mainVbox.getChildren().addAll(newVBox.getChildren());
        }catch (IOException e){
            Alerts.showAlert("IO Exception", "Error Loading View", e.getMessage(), Alert.AlertType.ERROR);
        }

    }
}
