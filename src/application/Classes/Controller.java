// Class belongs to package "application"
package application.Classes;
//All imported packages for the functioning of the Class
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;


//Public class
public class Controller {
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named SignIn so that it can only be used by this class
    private Button SignIn;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named SignUp so that it can only be used by this class
    private Button SignUp;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named backtoLogin so that it can only be used by this class
    private Button backtoLogin;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Register1 so that it can only be used by this class
    private Button Register1;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Register2 so that it can only be used by this class
    private Button Register2;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named LoginStu so that it can only be used by this class
    private Button LoginStu;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named LoginOrg so that it can only be used by this class
    private Button LoginOrg;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Hyperlink datatype named forget1 so that it can only be used by this class
    private Hyperlink forget1;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Hyperlink datatype named forget2 so that it can only be used by this class
    private Hyperlink forget2;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Submit so that it can only be used by this class
    private Button Submit;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Logout so that it can only be used by this class
    private Button Logout;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    private ImageView Thumbnail;


    //Creating an Action named SignUp taking a parameter for an ActionEvent named event
    public void SignUp(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        //Define Stage
        Stage primaryStage = new Stage();
        //Importing FXML Layout using the Parent Class
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/SignUp.fxml"));
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root1, 300, 300);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) SignUp.getScene().getWindow();
        stage.close();
    }
    //Creating an Action named Register1 taking a parameter for an ActionEvent named event
    public void Register1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        //Define Stage
        Stage primaryStage = new Stage();
        //Importing FXML Layout using the Parent Class
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/Confirmation.fxml"));
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root1, 300, 300);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Register1.getScene().getWindow();
        stage.close();
    }
    //Creating an Action named Register2 taking a parameter for an ActionEvent named event
    public void Register2(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        //Define Stage
        Stage primaryStage = new Stage();
        //Importing FXML Layout using the Parent Class
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/Confirmation.fxml"));
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root1, 300, 300);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Register2.getScene().getWindow();
        stage.close();
    }
    //Creating an Action named backtoLogin taking a parameter for an ActionEvent named event
    public void backtoLogin(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        //Define Stage
        Stage primaryStage = new Stage();
        //Importing FXML Layout using the Parent Class
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/StartScreen.fxml"));
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root1, 300, 300);
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
        //The next 2 lines...
        //Close the previous stage when the defined button "Signup" is clicked
        Stage stage = (Stage) backtoLogin.getScene().getWindow();
        stage.close();
    }
    //Creating an Action named StudentMainScreen taking a parameter for an ActionEvent named event
    public void StudentMainScreen(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        //Define Stage
        Stage primaryStage = new Stage();
        //Importing FXML Layout using the Parent Class
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/StudentMainscreen.fxml"));
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root1, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //The next 2 lines...
        //Close the previous stage when the defined button "Signup" is clicked
        Stage stage = (Stage) LoginStu.getScene().getWindow();
        stage.close();
    }
    //Creating an Action named OrganiserMainscreen taking a parameter for an ActionEvent named event
    public void OrganiserMainScreen(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        //Define Stage
        Stage primaryStage = new Stage();
        //Importing FXML Layout using the Parent Class
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/OrganiserMainscreen.fxml"));
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root1, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //The next 2 lines...
        //Close the previous stage when the defined button "Signup" is clicked
        Stage stage = (Stage) LoginOrg.getScene().getWindow();
        stage.close();
    }
    //Creating an Action named SignIn taking a parameter for an ActionEvent named event
    public void SignIn(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        //Define Stage
        Stage primaryStage = new Stage();
        //Importing FXML Layout using the Parent Class
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/SignIn.fxml"));
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root1, 300, 300);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //The next 2 lines...
        //Close the previous stage when the defined button "Signup" is clicked
        Stage stage = (Stage) SignIn.getScene().getWindow();
        stage.close();
    }
    //Creating an Action named forgotPass1 taking a parameter for an ActionEvent named event
    public void forgotPass1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        //Define Stage
        Stage primaryStage = new Stage();
        //Importing FXML Layout using the Parent Class
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/forgetPass.fxml"));
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root1, 300, 300);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //The next 2 lines...
        //Close the previous stage when the defined button "Signup" is clicked
        Stage stage = (Stage) forget1.getScene().getWindow();
        stage.close();
    }
    //Creating an Action named forgotPass2 taking a parameter for an ActionEvent named event
    public void forgotPass2(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        //Define Stage
        Stage primaryStage = new Stage();
        //Importing FXML Layout using the Parent Class
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/forgetPass.fxml"));
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root1, 300, 300);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //The next 2 lines...
        //Close the previous stage when the defined button "Signup" is clicked
        Stage stage = (Stage) forget2.getScene().getWindow();
        stage.close();
    }
    //Creating an Action named Submit taking a parameter for an ActionEvent named event
    public void Submit(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        //Define Stage
        Stage primaryStage = new Stage();
        //Importing FXML Layout using the Parent Class
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/PasswordRescue.fxml"));
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root1, 300, 300);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //The next 2 lines...
        //Close the previous stage when the defined button "Signup" is clicked
        Stage stage = (Stage) Submit.getScene().getWindow();
        stage.close();
    }
    //Creating an Action named Logout taking a parameter for an ActionEvent named event
    public void Logout(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        //Define Stage
        Stage primaryStage = new Stage();
        //Importing FXML Layout using the Parent Class
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/SignIn.fxml"));
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root1, 300, 300);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //The next 2 lines...
        //Close the previous stage when the defined button "Signup" is clicked
        Stage stage = (Stage) Logout.getScene().getWindow();
        stage.close();
    }
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie1 so that it can only be used by this class
    private Button Movie1;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie2 so that it can only be used by this class
    private Button Movie2;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie3 so that it can only be used by this class
    private Button Movie3;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie4 so that it can only be used by this class
    private Button Movie4;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie5 so that it can only be used by this class
    private Button Movie5;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie6 so that it can only be used by this class
    private Button Movie6;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie7 so that it can only be used by this class
    private Button Movie7;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie8 so that it can only be used by this class
    private Button Movie8;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie9 so that it can only be used by this class
    private Button Movie9;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie10 so that it can only be used by this class
    private Button Movie10;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie11 so that it can only be used by this class
    private Button Movie11;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie12 so that it can only be used by this class
    private Button Movie12;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie13 so that it can only be used by this class
    private Button Movie13;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie14 so that it can only be used by this class
    private Button Movie14;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Movie15 so that it can only be used by this class
    private Button Movie15;

    //Creating an Action named Movie1 taking a parameter for an ActionEvent named event
    public void Movie1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie1.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/1.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie1.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie2 taking a parameter for an ActionEvent named event
    public void Movie2(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie2.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/2.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie2.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie3 taking a parameter for an ActionEvent named event
    public void Movie3(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie3.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/3.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie3.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie4 taking a parameter for an ActionEvent named event
    public void Movie4(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie4.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/4.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie4.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie5 taking a parameter for an ActionEvent named event
    public void Movie5(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie5.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/5.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie5.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie6 taking a parameter for an ActionEvent named event
    public void Movie6(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie6.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/6.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie6.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie7 taking a parameter for an ActionEvent named event
    public void Movie7(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie7.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/7.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie7.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie8 taking a parameter for an ActionEvent named event
    public void Movie8(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie8.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/8.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie8.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie9 taking a parameter for an ActionEvent named event
    public void Movie9(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie9.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/9.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie9.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie10 taking a parameter for an ActionEvent named event
    public void Movie10(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie10.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/10.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie10.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie11 taking a parameter for an ActionEvent named event
    public void Movie11(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie11.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/11.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie11.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie12 taking a parameter for an ActionEvent named event
    public void Movie12(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie12.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/12.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie12.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie13 taking a parameter for an ActionEvent named event
    public void Movie13(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie13.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/13.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie13.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie14 taking a parameter for an ActionEvent named event
    public void Movie14(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie14.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/14.jpeg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie14.getScene().getWindow();
            }
        });
    }

    //Creating an Action named Movie15 taking a parameter for an ActionEvent named event
    public void Movie15(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Movie15.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/15.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Movie15.getScene().getWindow();
            }
        });
    }


    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event1 so that it can only be used by this class
    private Button Event1;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event2 so that it can only be used by this class
    private Button Event2;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event3 so that it can only be used by this class
    private Button Event3;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event4 so that it can only be used by this class
    private Button Event4;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event5 so that it can only be used by this class
    private Button Event5;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event6 so that it can only be used by this class
    private Button Event6;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event7 so that it can only be used by this class
    private Button Event7;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event8 so that it can only be used by this class
    private Button Event8;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event9 so that it can only be used by this class
    private Button Event9;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event10 so that it can only be used by this class
    private Button Event10;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event11 so that it can only be used by this class
    private Button Event11;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event12 so that it can only be used by this class
    private Button Event12;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event13 so that it can only be used by this class
    private Button Event13;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event14 so that it can only be used by this class
    private Button Event14;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Event15 so that it can only be used by this class
    private Button Event15;

    public void Event1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event1.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/1.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event1.getScene().getWindow();
            }
        });
    }

    public void Event2(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event2.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/2.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event2.getScene().getWindow();
            }
        });
    }

    public void Event3(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event3.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/3.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event3.getScene().getWindow();
            }
        });
    }

    public void Event4(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event4.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/4.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event4.getScene().getWindow();
            }
        });
    }

    public void Event5(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event5.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/5.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event5.getScene().getWindow();
            }
        });
    }

    public void Event6(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event6.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/6.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event6.getScene().getWindow();
            }
        });
    }

    public void Event7(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event7.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/7.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event7.getScene().getWindow();
            }
        });
    }

    public void Event8(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event8.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/8.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event8.getScene().getWindow();
            }
        });
    }

    public void Event9(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event9.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/9.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event9.getScene().getWindow();
            }
        });
    }

    public void Event10(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event10.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/10.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event10.getScene().getWindow();
            }
        });
    }

    public void Event11(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event11.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/11.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event11.getScene().getWindow();
            }
        });
    }

    public void Event12(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event12.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/12.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event12.getScene().getWindow();
            }
        });
    }

    public void Event13(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event13.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/13.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event13.getScene().getWindow();
            }
        });
    }

    public void Event14(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event14.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/14.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event14.getScene().getWindow();
            }
        });
    }
    public void Event15(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Event15.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/15.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Event15.getScene().getWindow();
            }
        });
    }

    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play1 so that it can only be used by this class
    private Button Play1;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play2 so that it can only be used by this class
    private Button Play2;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play3 so that it can only be used by this class
    private Button Play3;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play4 so that it can only be used by this class
    private Button Play4;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play5 so that it can only be used by this class
    private Button Play5;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play6 so that it can only be used by this class
    private Button Play6;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play7 so that it can only be used by this class
    private Button Play7;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play8 so that it can only be used by this class
    private Button Play8;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play9 so that it can only be used by this class
    private Button Play9;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play10 so that it can only be used by this class
    private Button Play10;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play11 so that it can only be used by this class
    private Button Play11;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play12 so that it can only be used by this class
    private Button Play12;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play13 so that it can only be used by this class
    private Button Play13;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play14 so that it can only be used by this class
    private Button Play14;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Play15 so that it can only be used by this class
    private Button Play15;

    public void Play1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play1.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/1.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play1.getScene().getWindow();
            }
        });
    }

    public void Play2(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play2.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/2.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play2.getScene().getWindow();
            }
        });
    }

    public void Play3(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play3.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/3.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play3.getScene().getWindow();
            }
        });
    }

    public void Play4(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play4.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/4.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play4.getScene().getWindow();
            }
        });
    }

    public void Play5(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play5.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/5.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play5.getScene().getWindow();
            }
        });
    }

    public void Play6(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play6.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/6.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play6.getScene().getWindow();
            }
        });
    }

    public void Play7(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play7.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/7.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play7.getScene().getWindow();
            }
        });
    }

    public void Play8(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play8.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/8.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play8.getScene().getWindow();
            }
        });
    }

    public void Play9(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play9.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/9.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play9.getScene().getWindow();
            }
        });
    }

    public void Play10(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play10.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/10.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play10.getScene().getWindow();
            }
        });
    }

    public void Play11(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play11.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/15.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play11.getScene().getWindow();
            }
        });
    }

    public void Play12(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play12.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/12.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play12.getScene().getWindow();
            }
        });
    }

    public void Play13(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play13.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/13.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play13.getScene().getWindow();
            }
        });
    }

    public void Play14(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play14.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/14.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play14.getScene().getWindow();
            }
        });
    }
    public void Play15(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Play15.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/15.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Play15.getScene().getWindow();
            }
        });
    }

    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport1 so that it can only be used by this class
    private Button Sport1;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport2 so that it can only be used by this class
    private Button Sport2;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport3 so that it can only be used by this class
    private Button Sport3;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport4 so that it can only be used by this class
    private Button Sport4;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport5 so that it can only be used by this class
    private Button Sport5;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport6 so that it can only be used by this class
    private Button Sport6;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport7 so that it can only be used by this class
    private Button Sport7;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport8 so that it can only be used by this class
    private Button Sport8;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport9 so that it can only be used by this class
    private Button Sport9;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport10 so that it can only be used by this class
    private Button Sport10;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport11 so that it can only be used by this class
    private Button Sport11;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport12 so that it can only be used by this class
    private Button Sport12;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport13 so that it can only be used by this class
    private Button Sport13;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport14 so that it can only be used by this class
    private Button Sport14;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Sport15 so that it can only be used by this class
    private Button Sport15;

    public void Sport1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport1.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/1.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport1.getScene().getWindow();
            }
        });
    }

    public void Sport2(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport2.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/2.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport2.getScene().getWindow();
            }
        });
    }

    public void Sport3(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport3.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/3.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport3.getScene().getWindow();
            }
        });
    }

    public void Sport4(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport4.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/4.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport4.getScene().getWindow();
            }
        });
    }

    public void Sport5(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport5.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/5.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport5.getScene().getWindow();
            }
        });
    }

    public void Sport6(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport6.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/6.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport6.getScene().getWindow();
            }
        });
    }

    public void Sport7(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport7.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/7.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport7.getScene().getWindow();
            }
        });
    }

    public void Sport8(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport8.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/8.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport8.getScene().getWindow();
            }
        });
    }

    public void Sport9(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport9.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/9.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport9.getScene().getWindow();
            }
        });
    }

    public void Sport10(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport10.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/10.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport10.getScene().getWindow();
            }
        });
    }

    public void Sport11(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport11.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/11.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport11.getScene().getWindow();
            }
        });
    }

    public void Sport12(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport12.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/12.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport12.getScene().getWindow();
            }
        });
    }

    public void Sport13(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport13.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/13.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport13.getScene().getWindow();
            }
        });
    }

    public void Sport14(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport14.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/14.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport14.getScene().getWindow();
            }
        });
    }
    public void Sport15(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Sport15.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/15.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Sport15.getScene().getWindow();
            }
        });
    }
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity1 so that it can only be used by this class
    private Button Activity1;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity2 so that it can only be used by this class
    private Button Activity2;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity3 so that it can only be used by this class
    private Button Activity3;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity4 so that it can only be used by this class
    private Button Activity4;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity5 so that it can only be used by this class
    private Button Activity5;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity6 so that it can only be used by this class
    private Button Activity6;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity7 so that it can only be used by this class
    private Button Activity7;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity8 so that it can only be used by this class
    private Button Activity8;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity9 so that it can only be used by this class
    private Button Activity9;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity10 so that it can only be used by this class
    private Button Activity10;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity11 so that it can only be used by this class
    private Button Activity11;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity12 so that it can only be used by this class
    private Button Activity12;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity13 so that it can only be used by this class
    private Button Activity13;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity14 so that it can only be used by this class
    private Button Activity14;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Activity15 so that it can only be used by this class
    private Button Activity15;

    public void Activity1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity1.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/1.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity1.getScene().getWindow();
            }
        });
    }

    public void Activity2(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity2.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/2.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity2.getScene().getWindow();
            }
        });
    }

    public void Activity3(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity3.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/3.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity3.getScene().getWindow();
            }
        });
    }

    public void Activity4(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity4.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/4.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity4.getScene().getWindow();
            }
        });
    }

    public void Activity5(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity5.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/5.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity5.getScene().getWindow();
            }
        });
    }

    public void Activity6(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity6.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/6.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity6.getScene().getWindow();
            }
        });
    }

    public void Activity7(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity7.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/7.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity7.getScene().getWindow();
            }
        });
    }

    public void Activity8(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity8.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/8.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity8.getScene().getWindow();
            }
        });
    }

    public void Activity9(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity9.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/9.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity9.getScene().getWindow();
            }
        });
    }

    public void Activity10(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity10.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/10.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity10.getScene().getWindow();
            }
        });
    }

    public void Activity11(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity11.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/11.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity11.getScene().getWindow();
            }
        });
    }

    public void Activity12(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity12.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/12.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity12.getScene().getWindow();
            }
        });
    }

    public void Activity13(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity13.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/13.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity13.getScene().getWindow();
            }
        });
    }
    public void Activity14(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity14.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/14.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity14.getScene().getWindow();
            }
        });
    }
    public void Activity15(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Activity15.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/15.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Activity15.getScene().getWindow();
            }
        });
    }
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument1 so that it can only be used by this class
    private Button Monument1;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument2 so that it can only be used by this class
    private Button Monument2;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument3 so that it can only be used by this class
    private Button Monument3;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument4 so that it can only be used by this class
    private Button Monument4;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument5 so that it can only be used by this class
    private Button Monument5;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument6 so that it can only be used by this class
    private Button Monument6;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument7 so that it can only be used by this class
    private Button Monument7;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument8 so that it can only be used by this class
    private Button Monument8;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument9 so that it can only be used by this class
    private Button Monument9;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument10 so that it can only be used by this class
    private Button Monument10;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument11 so that it can only be used by this class
    private Button Monument11;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument12 so that it can only be used by this class
    private Button Monument12;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument13 so that it can only be used by this class
    private Button Monument13;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument14 so that it can only be used by this class
    private Button Monument14;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Monument15 so that it can only be used by this class
    private Button Monument15;

    public void Monument1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument1.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/1.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument1.getScene().getWindow();
            }
        });
    }

    public void Monument2(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument2.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/2.jpeg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument2.getScene().getWindow();
            }
        });
    }

    public void Monument3(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument3.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/3.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument3.getScene().getWindow();
            }
        });
    }

    public void Monument4(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument4.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/4.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument4.getScene().getWindow();
            }
        });
    }

    public void Monument5(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument5.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/5.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument5.getScene().getWindow();
            }
        });
    }

    public void Monument6(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument6.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/6.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument6.getScene().getWindow();
            }
        });
    }

    public void Monument7(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument7.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/7.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument7.getScene().getWindow();
            }
        });
    }

    public void Monument8(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument8.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/8.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument8.getScene().getWindow();
            }
        });
    }

    public void Monument9(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument9.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/9.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument9.getScene().getWindow();
            }
        });
    }

    public void Monument10(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument10.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/10.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument10.getScene().getWindow();
            }
        });
    }

    public void Monument11(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument11.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/11.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument11.getScene().getWindow();
            }
        });
    }

    public void Monument12(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument12.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/12.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument12.getScene().getWindow();
            }
        });
    }

    public void Monument13(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument13.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/13.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument13.getScene().getWindow();
            }
        });
    }

    public void Monument14(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument14.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/14.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument14.getScene().getWindow();
            }
        });
    }
    public void Monument15(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        Monument15.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/15.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 600, 400);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Monument15.getScene().getWindow();
            }
        });
    }
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named PastEvent1 so that it can only be used by this class
    private Button PastEvent1;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named PastEvent1 so that it can only be used by this class
    private Button PastEvent2;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named PastEvent1 so that it can only be used by this class
    private Button PastEvent3;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named PastEvent1 so that it can only be used by this class
    private Button PastEvent4;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    //Set an image to the ImageView Widget before setting up the Scene
    private ImageView Thumbnail2;


    public void PastEvent1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        PastEvent1.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail2.setImage(new Image("file:src/images/Student/PastEvents/1.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/PastEvents/PastEvent1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 300, 180);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) PastEvent1.getScene().getWindow();
            }
        });
    }
    public void PastEvent2(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        PastEvent2.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail2.setImage(new Image("file:src/images/Student/PastEvents/2.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/PastEvents/PastEvent2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 300, 180);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) PastEvent2.getScene().getWindow();
            }
        });
    }
    public void PastEvent3(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        PastEvent3.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail2.setImage(new Image("file:src/images/Student/PastEvents/3.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/PastEvents/PastEvent3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 300, 180);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) PastEvent3.getScene().getWindow();
            }
        });
    }
    public void PastEvent4(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        PastEvent4.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail2.setImage(new Image("file:src/images/Student/PastEvents/4.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/PastEvents/PastEvent4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 300, 180);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) PastEvent4.getScene().getWindow();
            }
        });
    }
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named FutureEvent1 so that it can only be used by this class
    private Button FutureEvent1;

    public void FutureEvent1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        FutureEvent1.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail2.setImage(new Image("file:src/images/Student/FutureEvents/1.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/FutureEvents/FutureEvent1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 300, 200);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) PastEvent4.getScene().getWindow();
            }
        });
    }

    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named PrevEvent1 so that it can only be used by this class
    private Button PrevEvent1;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named PrevEvent2 so that it can only be used by this class
    private Button PrevEvent2;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named PrevEvent3 so that it can only be used by this class
    private Button PrevEvent3;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named PrevEvent4 so that it can only be used by this class
    private Button PrevEvent4;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    //Set an image to the ImageView Widget before setting up the Scene
    private ImageView Thumbnail3;

    public void PrevEvent1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        PrevEvent1.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail3.setImage(new Image("file:src/images/Organiser/Past/1.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Organiser/PrevEvents/PrevEvent1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 300, 180);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) PrevEvent1.getScene().getWindow();
            }
        });
    }
    public void PrevEvent2(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        PrevEvent2.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail3.setImage(new Image("file:src/images/Organiser/Past/2.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Organiser/PrevEvents/PrevEvent2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 300, 180);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) PrevEvent2.getScene().getWindow();
            }
        });
    }
    public void PrevEvent3(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        PrevEvent3.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail3.setImage(new Image("file:src/images/Organiser/Past/3.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Organiser/PrevEvents/PrevEvent3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 300, 180);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) PrevEvent3.getScene().getWindow();
            }
        });
    }
    public void PrevEvent4(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        PrevEvent4.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail3.setImage(new Image("file:src/images/Organiser/Past/4.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Organiser/PrevEvents/PrevEvent4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 300, 180);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) PrevEvent4.getScene().getWindow();
            }
        });
    }
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named UpcomingEvent1 so that it can only be used by this class
    private Button UpcomingEvent1;


    public void UpcomingEvent1(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        UpcomingEvent1.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
                //Set an image to the ImageView Widget before setting up the Scene
                Thumbnail3.setImage(new Image("file:src/images/Organiser/Upcoming/1.jpg"));
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Organiser/UpcomingEvents/UpcomingEvent1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 300, 220);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) UpcomingEvent1.getScene().getWindow();
            }
        });
    }
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named QR1 so that it can only be used by this class
    private Button QR1;

    public void QR1(ActionEvent event)throws Exception {
        QR1.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/FutureEvents/QR/QR1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root,300,300);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) QR1.getScene().getWindow();
            }
        });
    }
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named ChangeUsername so that it can only be used by this class
    private Button ChangeUsername;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named ChangePassword so that it can only be used by this class
    private Button ChangePassword;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named ChangeLocation so that it can only be used by this class
    private Button ChangeLocation;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named ChangeEmail so that it can only be used by this class
    private Button ChangeEmail;
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named ChangeLanguage so that it can only be used by this class
    private Button ChangeLanguage;



    public void ChangeUsername(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        ChangeUsername.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/ChangeUsername.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 300, 220);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) ChangeUsername.getScene().getWindow();
            }
        });
    }
    public void ChangeEmail(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        ChangeEmail.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/ChangeEmail.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 250, 250);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) ChangeEmail.getScene().getWindow();
            }
        });
    }
    public void ChangePassword(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        ChangePassword.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/ChangePassword.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 250, 250);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) ChangePassword.getScene().getWindow();
            }
        });
    }


    public void ChangeLocation(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        ChangeLocation.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/ChangeLocation.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 250, 250);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open a new Stage when the corresponding button is Clicked
        Stage stage = (Stage) ChangeLocation.getScene().getWindow();
            }
        });
    }
    public void ChangeLanguage(ActionEvent event) throws Exception {
        //Add Mouse Click event to an EventHandler
        ChangeLanguage.setOnAction(new EventHandler<ActionEvent>() {
            //Overriding the Parent class, in this case "handle"
            @Override
            //Defining a new sub-class for a mouse click
            public void handle(ActionEvent event) {
        //Define Stage
        Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/ChangeLanguage.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
        //Define scene with 3 parameters which take the layout from the previously defined FXML Layout, the length and the width of the default scene when launched respectively
        Scene scene = new Scene(root2, 250, 250);
        //Add a Stylesheet to the the Scene (The Stage is unaffected by the Stylesheet and uses the default based on the Operating System)
        scene.getStylesheets().add("/application/CSS/Style.css");
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
        //Open a new Stage when the corresponding button is Clicked
        Stage stage = (Stage) ChangeLanguage.getScene().getWindow();
            }
        });
    }
    //The @FXML annotation is used to tag nonpublic controller member fields and handler methods for use by FXML markup
    @FXML
    // defining a Button datatype named Close so that it can only be used by this class
    public Button Close;

    public void handleCloseButtonAction(ActionEvent event){
        //Open the new Stage when the Button is clicked without closing the previous Stage
        Stage stage = (Stage) Close.getScene().getWindow();
        stage.close();
    }
}


