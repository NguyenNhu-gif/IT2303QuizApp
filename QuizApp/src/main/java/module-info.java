module com.ntqn.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;
    requires java.sql;
    
    opens com.ntqn.quizapp to javafx.fxml;
    exports com.ntqn.quizapp;
   
}
