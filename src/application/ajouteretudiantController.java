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
public class ajouteretudiantController implements Initializable, ControlledScreen {
	
	
ScreensController myController;
@FXML
private JFXTextField ids;

@FXML
private JFXTextField noms;

@FXML
private JFXTextField prenoms;
    
@FXML
private TableView<Etudiants> afficherpresence;

@FXML
private TableColumn<Etudiants, Integer> id;
@FXML
private TableColumn<Etudiants, String> nom;
@FXML
private TableColumn<Etudiants, String> prenom;


public ObservableList<Etudiants> data1 = FXCollections.observableArrayList();
/**
 * Initializes the controller class.
 */
public void refresh() {
	
	data1.clear();
	connection connection = new connection(); 
	Connection conn = connection.getCconnection(); 
	
	try {
		String sql = "SELECT * FROM �tudiants";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
	
	while (rs.next())
	{
	
		data1.add( new Etudiants(rs.getInt(1), rs.getString(2), rs.getString(3),null,null,null,null,null,null));
		
		
		
	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	

	id.setCellValueFactory(new PropertyValueFactory <Etudiants, Integer>("id�tudiants"));
	nom.setCellValueFactory(new PropertyValueFactory <Etudiants, String>("nometudiant"));
	prenom.setCellValueFactory(new PropertyValueFactory <Etudiants, String>("prenometudiant"));
	
	afficherpresence.setItems(data1);
	
	
}
public void ajouter() {
	  
	connection connection = new connection(); 
	Connection conn = connection.getCconnection(); 

	String sql = "INSERT INTO �tudiants (id�tudiants, nometudiant, prenometudiant, fili�re_Nom_fili�re, semestre_Nom_semestre, presence) VALUES (?, ?, ?, ?, ?, ?)";
	
	try {
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, ids.getText());
		pst.setString(2, noms.getText());
		pst.setString(3, prenoms.getText());
		pst.setString(4, null);
		pst.setString(5, null);
		pst.setString(6, null);

		
		
		pst.executeUpdate();
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setContentText("Etudiant ajout� avec succ�s !");
		alert.showAndWait();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	refresh();

}

@Override
public void initialize(URL url, ResourceBundle rb) {
	
	
	refresh();
	
}
public void setScreenParent(ScreensController screenParent){
    myController = screenParent;

}    
@FXML
public void retour(ActionEvent event) {
myController.setScreen(Main.ok6ID);	}

	
}





