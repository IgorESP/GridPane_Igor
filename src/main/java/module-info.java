module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;

    opens com.igoresparza to javafx.fxml;
    exports com.igoresparza;
}