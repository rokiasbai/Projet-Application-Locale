package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;


public class interfacedaccueilController implements Initializable, ControlledScreen {

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

 
    
    //This is the code
    @FXML
  	public void enseignant(ActionEvent event) {
    	myController.setScreen(Main.ok1ID);	
  		
  	}
    
    @FXML
	public void coordonateur(ActionEvent event) {
				
    	myController.setScreen(Main.ok2ID);	
	}
    
    
   
}
