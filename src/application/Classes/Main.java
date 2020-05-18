// Class belongs to package "application"
package application.Classes;
//All imported packages for the functioning of the Class
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        try
        {
            //Importing FXML Layout using the Parent Class
            Parent root = FXMLLoader.load(getClass().getResource("/application/FXML/Common/StartScreen.fxml"));
            //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
            Scene scene = new Scene(root,300,300);
            //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
            scene.getStylesheets().add("/application/CSS/StartScreen.css");
            //Connect the Scene to the Stage
            primaryStage.setScene(scene);
            //The next 3 lines...
            //Disabling Maximize Window of the Stage
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
            //Disabling the Resizability of the the Stage
            primaryStage.setResizable(false);
            //Display the Stage on the User's Display when this Class is called
            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
