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
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

//This is for add sailors 
public class interfaceenseignantController implements Initializable, ControlledScreen {
	
	public TextField identifiant ; 
	public TextField motdepasse ;
	
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
    private void connexion(ActionEvent event){
       
    	connection connection = new connection(); 
    	Connection conn = connection.getCconnection(); 
   
    	String sql = "SELECT * from enseignants where idenseignants = ? and passwordenseignants =?";
    	
    	try {
    		PreparedStatement pst = conn.prepareStatement(sql);
    		pst.setString(1, identifiant.getText());
    		pst.setString(2, motdepasse.getText());
			ResultSet rs = pst.executeQuery();
			int count= 0;
			
			while (rs.next())
			{
				count=count+1;
			}
			if (count==1) {
				System.out.println("connexion réussie");
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setHeaderText(null);
				alert.setContentText("Connexion réussie!");
				alert.showAndWait();
				myController.setScreen(Main.ok4ID);
			}
			else {
				System.out.println("echec de connexion");
				myController.setScreen(Main.ok3ID);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
   
}