/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ntqn.quizapp;

import com.ntqn.pojo.Category;
import com.ntqn.pojo.Level;
import com.ntqn.pojo.Question;
import com.ntqn.services.CategoryServices;
import com.ntqn.services.LevelServices;
import com.ntqn.utils.JdbcConnector;
import com.ntqn.utils.theme.Theme;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {
    @FXML private ComboBox<Category> cbCates;
     @FXML private ComboBox<Level> cbLevel;
     @FXML private VBox vboxChoices;
    private static final CategoryServices cateServices = new CategoryServices();
    private static final LevelServices levelServices = new LevelServices();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            this.cbCates.setItems(FXCollections.observableList(cateServices.getCates()));
            this.cbLevel.setItems(FXCollections.observableList(levelServices.getLevels()));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }   
    public void addChoice(ActionEvent event){
        HBox h = new HBox();
        h.getStyleClass().add("Main");
        
        RadioButton r = new RadioButton();
        TextField t = new TextField();
        t.getStyleClass().add("Input");
        h.getChildren().addAll(r, t);
        
        this.vboxChoices.getChildren().add(h);
    }
    
    

    
}