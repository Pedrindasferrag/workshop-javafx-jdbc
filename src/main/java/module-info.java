module com.workshop.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.workshop.workshopjavafxjdbc to javafx.fxml;
    exports com.workshop.workshopjavafxjdbc;
}