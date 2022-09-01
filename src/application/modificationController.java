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
public class modificationController implements Initializable, ControlledScreen {
	
	
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
	public void saisirpresence(ActionEvent event) {
	myController.setScreen(Main.ok12ID);	}
@FXML
public void saisirtp(ActionEvent event) {
myController.setScreen(Main.ok15ID);	}
@FXML
public void ajouteretudiant(ActionEvent event) {
myController.setScreen(Main.ok14ID);	}
@FXML
public void supprimeretudiant(ActionEvent event) {
myController.setScreen(Main.ok17ID);	}
@FXML
public void saisirnoteecrit(ActionEvent event) {
myController.setScreen(Main.ok16ID);	}
@FXML
public void retour(ActionEvent event) {
myController.setScreen(Main.ok4ID);	}}

