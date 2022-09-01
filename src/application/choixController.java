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

import conn.connection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

//This is for add sailors 
public class choixController implements Initializable, ControlledScreen {
	
	
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
  	public void affichage(ActionEvent event) {
    	myController.setScreen(Main.ok5ID);	
  		
  	}
    
    @FXML
	public void modification(ActionEvent event) {
				
    	myController.setScreen(Main.ok6ID);	
	}
    @FXML
    public void retour(ActionEvent event) {
    myController.setScreen(Main.ok1ID);	}
    }