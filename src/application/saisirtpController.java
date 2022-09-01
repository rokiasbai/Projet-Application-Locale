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

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import conn.connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TextField;

//This is for add sailors 
public class saisirtpController implements Initializable, ControlledScreen {
	ScreensController myController;
	
	@FXML
    private JFXTextField id;

    @FXML
    private JFXTextField tp;

    @FXML
    private JFXTextField nom;

    @FXML
    private JFXTextField prenom;

    @FXML
    private TableView<Etudiants> affichertp;

    @FXML
    private TableColumn<Etudiants, Integer> ids;
    @FXML
    private TableColumn<Etudiants, String> noms;
    @FXML
    private TableColumn<Etudiants, String> prenoms;
    @FXML
    private TableColumn<Etudiants, String> tps;
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
    	
    		data1.add( new Etudiants(rs.getInt(1), rs.getString(2), rs.getString(3),null,null,null,rs.getString(7),null,null));
    		
    		
    		
    	}
    	
    } catch (SQLException e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
    }
    	

    	ids.setCellValueFactory(new PropertyValueFactory <Etudiants, Integer>("idétudiants"));
    	noms.setCellValueFactory(new PropertyValueFactory <Etudiants, String>("nometudiant"));
    	prenoms.setCellValueFactory(new PropertyValueFactory <Etudiants, String>("prenometudiant"));
    	tps.setCellValueFactory(new PropertyValueFactory <Etudiants, String>("tp"));
    	affichertp.setItems(data1);
    	
    	
    }
  
    public void saisir(){
       
    	connection connection = new connection(); 
    	Connection conn = connection.getCconnection(); 
    	String sql = "UPDATE étudiants SET tp = '"+tp.getText()+"' WHERE idétudiants = '"+id.getText()+"'";
    	try {
    		Statement statement = conn.createStatement();
			statement.executeUpdate(sql);
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText(null);
			alert.setContentText("Informations validées avec succées!");
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