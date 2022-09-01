package application;

import java.io.Console;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;

import conn.connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

//This is for add sailors 
public class affichageController implements Initializable, ControlledScreen {
	
	
ScreensController myController;


    
/**
 * Initializes the controller class.
 */
@Override
public void initialize(URL url, ResourceBundle rb) {
    // TODO
}    

public void setScreenParent(ScreensController screenParent){
    myController = screenParent;
}

@FXML
	public void afficherlisteetudiants(ActionEvent event) {
	myController.setScreen(Main.ok7ID);	}
@FXML
public void afficherlistefilieres(ActionEvent event) {
myController.setScreen(Main.ok8ID);	}
@FXML
public void afficherlistematieres(ActionEvent event) {
myController.setScreen(Main.ok10ID);	}
@FXML
public void afficherlistemodules(ActionEvent event) {
myController.setScreen(Main.ok11ID);	}

@FXML
	public void retour(ActionEvent event) {
	myController.setScreen(Main.ok4ID);	}}