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
public class supprimeretudiantController implements Initializable, ControlledScreen {
	
	
ScreensController myController;
@FXML
private JFXTextField ids;

@FXML
private JFXTextField noms;

@FXML
private JFXTextField prenoms;
    
@FXML
private TableView<Etudiants> supprimer;

@FXML
private TableColumn<Etudiants, String> id;
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
		String sql = "SELECT * FROM étudiants";
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
	

	id.setCellValueFactory(new PropertyValueFactory <Etudiants, String>("idétudiants"));
	nom.setCellValueFactory(new PropertyValueFactory <Etudiants, String>("nometudiant"));
	prenom.setCellValueFactory(new PropertyValueFactory <Etudiants, String>("prenometudiant"));
	
	supprimer.setItems(data1);
	
	
}
public void supprimer() {
	  
	connection connection = new connection(); 
	Connection conn = connection.getCconnection(); 

	String sql = "DELETE FROM étudiants WHERE idétudiants = ? ";
	
	try {
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, ids.getText());
			
		
		pst.executeUpdate();
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setContentText("Etudiant supprimé avec succées!");
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





