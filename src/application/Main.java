package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

 
public class Main extends Application {
    
    public static String mainscreenID = "MainScreen";
    public static String screen1File = "interfacedaccueil.fxml";
    public static String ok1ID = "enseignant";
    public static String ok1File = "interfaceenseignant.fxml";
    public static String ok2ID = "coordinateur";
    public static String ok2File = "interfacecoordinateur.fxml";
    public static String ok3ID = "echecdeconnexion";
    public static String ok3File = "echecdeconnexion.fxml";
    public static String ok4ID = "choix";
    public static String ok4File = "choix.fxml";
    public static String ok5ID = "affichage";
    public static String ok5File = "affichage.fxml";
    public static String ok6ID = "modification";
    public static String ok6File = "modification.fxml";
    public static String ok7ID = "afficherlisteetudiants";
    public static String ok7File = "afficherlisteetudiants.fxml";
    public static String ok8ID = "afficherlistefilieres";
    public static String ok8File = "afficherlistefilieres.fxml";
    public static String ok9ID = "telechargement";
    public static String ok9File = "telechargement.fxml";
    public static String ok10ID = "afficherlistematieres";
    public static String ok10File = "afficherlistematieres.fxml";
    public static String ok11ID = "afficherlistemodules";
    public static String ok11File = "afficherlistemodules.fxml";
    public static String ok12ID = "saisirpresence";
    public static String ok12File = "saisirpresence.fxml";
    public static String ok13ID = "validation";
    public static String ok13File = "validation.fxml";
    public static String ok14ID = "ajouteretudiant";
    public static String ok14File = "ajouteretudiant.fxml";
    public static String ok15ID = "saisirtp";
    public static String ok15File = "saisirtp.fxml";
    public static String ok16ID = "saisirecrit";
    public static String ok16File = "saisirecrit.fxml";
    public static String ok17ID = "supprimeretudiant";
    public static String ok17File = "supprimeretudiant.fxml";
    public static String ok18ID = "informationetudiant";
    public static String ok18File = "informationetudiant.fxml";
    
    @Override
    public void start(Stage primaryStage) {
        
        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(Main.mainscreenID, Main.screen1File);
        mainContainer.loadScreen(Main.ok1ID, Main.ok1File);
        mainContainer.loadScreen(Main.ok2ID, Main.ok2File);
        mainContainer.loadScreen(Main.ok3ID, Main.ok3File);
        mainContainer.loadScreen(Main.ok4ID, Main.ok4File);
        mainContainer.loadScreen(Main.ok5ID, Main.ok5File);
        mainContainer.loadScreen(Main.ok6ID, Main.ok6File);
        mainContainer.loadScreen(Main.ok7ID, Main.ok7File);
        mainContainer.loadScreen(Main.ok8ID, Main.ok8File);
        mainContainer.loadScreen(Main.ok9ID, Main.ok9File);
        mainContainer.loadScreen(Main.ok10ID, Main.ok10File);
        mainContainer.loadScreen(Main.ok11ID, Main.ok11File);
        mainContainer.loadScreen(Main.ok12ID, Main.ok12File);
        mainContainer.loadScreen(Main.ok13ID, Main.ok13File);
        mainContainer.loadScreen(Main.ok14ID, Main.ok14File);
        mainContainer.loadScreen(Main.ok15ID, Main.ok15File);
        mainContainer.loadScreen(Main.ok16ID, Main.ok16File);
        mainContainer.loadScreen(Main.ok17ID, Main.ok17File);
        mainContainer.loadScreen(Main.ok18ID, Main.ok18File);
      
        
        mainContainer.setScreen(Main.mainscreenID);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}