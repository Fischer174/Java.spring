module base.example.base2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens base.example.base2 to javafx.fxml;
    exports base.example.base2;
}