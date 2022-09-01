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
public class afficherlisteetudiantsController implements Initializable, ControlledScreen {
	
	
ScreensController myController;
    
@FXML
private TableView<Etudiants> afficherlisteetudiants;

@FXML
private TableColumn<Etudiants, Integer> id;

@FXML
private TableColumn<Etudiants, String> nom;
@FXML
private TableColumn<Etudiants, String> prenom;
@FXML
private TableColumn<Etudiants, String> filiere;

@FXML
private JFXTextField choisirfiliere;
 

public ObservableList<Etudiants> data1 = FXCollections.observableArrayList();
/**
 * Initializes the controller class.
 */
@Override
public void initialize(URL url, ResourceBundle rb) {}
public void setScreenParent(ScreensController screenParent){
    myController = screenParent;
}

@FXML
private void afficherlisteetudiants(ActionEvent event) {
	
	connection connection = new connection(); 
	Connection conn = connection.getCconnection(); 

	String sql = "SELECT * FROM �tudiants where fili�re_Nom_fili�re = '"+choisirfiliere.getText()+"'";
		
		try {
    		PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
		
		while (rs.next())
		{
			data1.add(new Etudiants(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),null,null,null,null,null));
		
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	id.setCellValueFactory(new PropertyValueFactory <Etudiants, Integer>("id�tudiants"));
	nom.setCellValueFactory(new PropertyValueFactory <Etudiants, String>("nometudiant"));
	prenom.setCellValueFactory(new PropertyValueFactory <Etudiants, String>("prenometudiant"));
	filiere.setCellValueFactory(new PropertyValueFactory <Etudiants, String>("fili�re_Nom_fili�re"));
	 
	afficherlisteetudiants.setItems(data1);
	
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
	
		Pdfetudiants.generate(choisirfiliere.getText());
	
}
}
    	



