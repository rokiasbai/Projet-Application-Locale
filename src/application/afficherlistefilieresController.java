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

import Creation_pdf.Pdfetudiants;
import Creation_pdf.Pdffiliere;
import conn.connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

//This is for add sailors 
public class afficherlistefilieresController implements Initializable, ControlledScreen {
	
	
ScreensController myController;
    
@FXML
private TableView<Fili�re> afficherlistefilieres;

@FXML
private TableColumn<Fili�re, String> filiere;


public ObservableList<Fili�re> data1 = FXCollections.observableArrayList();
/**
 * Initializes the controller class.
 */
@Override
public void initialize(URL url, ResourceBundle rb) {
	connection connection = new connection(); 
	Connection conn = connection.getCconnection(); 

	String sql = "SELECT * FROM fili�re";
		
		try {
    		PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
		
		while (rs.next())
		{
			data1.add(new Fili�re(rs.getString(1)));
		
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	filiere.setCellValueFactory(new PropertyValueFactory <Fili�re, String>("Nom_fili�re"));
	 
	afficherlistefilieres.setItems(data1);
	
	
}
public void setScreenParent(ScreensController screenParent){
    myController = screenParent;

}    
@FXML
public void retour(ActionEvent event) {
myController.setScreen(Main.ok5ID);	}
@FXML
public void imprimer(ActionEvent event) {
	Alert alert = new Alert(AlertType.INFORMATION);
	alert.setHeaderText(null);
	alert.setContentText("T�l�chargement effectu� avec succ�s !"
			+ " Le consulter directement sur votre bureau.");
	alert.showAndWait();
	Pdffiliere.generate();
	
}

}
    	



