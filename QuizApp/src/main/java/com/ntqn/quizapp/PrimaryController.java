package com.ntqn.quizapp;

import com.ntqn.utils.MyAlert;
import com.ntqn.utils.MyStage;
import com.ntqn.utils.theme.DarkThemeFactory;
import com.ntqn.utils.theme.Theme;
import com.ntqn.utils.theme.ThemeManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class PrimaryController implements Initializable{
    @FXML private ComboBox<Theme> cbThemes;
   
    public void changeTheme(ActionEvent event){
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(Theme.values()));
    }
    public void handleQuizManagement(ActionEvent event) throws IOException{
       MyStage.getInstance().showStage("questions.fxml");
    }
    
    public void handlePractice(ActionEvent event) {
         MyAlert.getInstance().ShowMsg("Comming soon...");
    }

    

}
