package application.Classes;

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
            Parent root = FXMLLoader.load(getClass().getResource("/application/FXML/Common/StartScreen.fxml"));
            Scene scene = new Scene(root,300,300);
            scene.getStylesheets().add("/application/CSS/StartScreen.css");
            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
            primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
