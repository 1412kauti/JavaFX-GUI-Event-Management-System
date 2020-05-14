package application.Classes;
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



public class Controller {
    @FXML
    private Button SignIn;
    @FXML
    private Button SignUp;
    @FXML
    private Button backtoLogin;
    @FXML
    private Button Register1;
    @FXML
    private Button Register2;
    @FXML
    private Button LoginStu;
    @FXML
    private Button LoginOrg;
    @FXML
    private Hyperlink forget1;
    @FXML
    private Hyperlink forget2;
    @FXML
    private Button Submit;
    @FXML
    private Button Logout;
    @FXML
    private ImageView Thumbnail;



    public void SignUp(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/SignUp.fxml"));
        Scene scene = new Scene(root1, 300, 300);
        scene.getStylesheets().add("/application/CSS/Style.css");
                                primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) SignUp.getScene().getWindow();
        stage.close();
    }

    public void Register1(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/Confirmation.fxml"));
        Scene scene = new Scene(root1, 300, 300);
        scene.getStylesheets().add("/application/CSS/Style.css");
                    primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) Register1.getScene().getWindow();
        stage.close();
    }

    public void Register2(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/Confirmation.fxml"));
        Scene scene = new Scene(root1, 300, 300);
        scene.getStylesheets().add("/application/CSS/Style.css");
                    primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) Register2.getScene().getWindow();
        stage.close();
    }

    public void backtoLogin(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/StartScreen.fxml"));
        Scene scene = new Scene(root1, 300, 300);
        scene.getStylesheets().add("/application/CSS/StartScreen.css");
                    primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) backtoLogin.getScene().getWindow();
        stage.close();
    }

    public void StudentMainScreen(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/StudentMainscreen.fxml"));
        Scene scene = new Scene(root1, 600, 400);
        scene.getStylesheets().add("/application/CSS/Style.css");
                    primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) LoginStu.getScene().getWindow();
        stage.close();
    }

    public void OrganiserMainScreen(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/OrganiserMainscreen.fxml"));
        Scene scene = new Scene(root1, 600, 400);
        scene.getStylesheets().add("/application/CSS/Style.css");
                    primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) LoginOrg.getScene().getWindow();
        stage.close();
    }

    public void SignIn(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/SignIn.fxml"));
        Scene scene = new Scene(root1, 300, 300);
        scene.getStylesheets().add("/application/CSS/Style.css");
                    primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) SignIn.getScene().getWindow();
        stage.close();
    }

    public void forgotPass1(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/forgetPass.fxml"));
        Scene scene = new Scene(root1, 300, 300);
        scene.getStylesheets().add("/application/CSS/Style.css");
                    primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) forget1.getScene().getWindow();
        stage.close();
    }

    public void forgotPass2(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/forgetPass.fxml"));
        Scene scene = new Scene(root1, 300, 300);
        scene.getStylesheets().add("/application/CSS/Style.css");
                    primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) forget2.getScene().getWindow();
        stage.close();
    }

    public void Submit(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/PasswordRescue.fxml"));
        Scene scene = new Scene(root1, 300, 300);
        scene.getStylesheets().add("/application/CSS/Style.css");
                    primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) Submit.getScene().getWindow();
        stage.close();
    }
    public void Logout(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/SignIn.fxml"));
        Scene scene = new Scene(root1, 300, 300);
        scene.getStylesheets().add("/application/CSS/Style.css");
                    primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) Logout.getScene().getWindow();
        stage.close();
    }




    @FXML
    private Button Movie1;
    @FXML
    private Button Movie2;
    @FXML
    private Button Movie3;
    @FXML
    private Button Movie4;
    @FXML
    private Button Movie5;
    @FXML
    private Button Movie6;
    @FXML
    private Button Movie7;
    @FXML
    private Button Movie8;
    @FXML
    private Button Movie9;
    @FXML
    private Button Movie10;
    @FXML
    private Button Movie11;
    @FXML
    private Button Movie12;
    @FXML
    private Button Movie13;
    @FXML
    private Button Movie14;
    @FXML
    private Button Movie15;

    public void Movie1(ActionEvent event) throws Exception {
        Movie1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/1.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie1.getScene().getWindow();
            }
        });
    }

    public void Movie2(ActionEvent event) throws Exception {
        Movie2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/2.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie2.getScene().getWindow();
            }
        });
    }

    public void Movie3(ActionEvent event) throws Exception {
        Movie3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/3.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie3.getScene().getWindow();
            }
        });
    }

    public void Movie4(ActionEvent event) throws Exception {
        Movie4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/4.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie4.getScene().getWindow();
            }
        });
    }

    public void Movie5(ActionEvent event) throws Exception {
        Movie5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/5.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie5.getScene().getWindow();
            }
        });
    }

    public void Movie6(ActionEvent event) throws Exception {
        Movie6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/6.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie6.getScene().getWindow();
            }
        });
    }

    public void Movie7(ActionEvent event) throws Exception {
        Movie7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/7.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie7.getScene().getWindow();
            }
        });
    }

    public void Movie8(ActionEvent event) throws Exception {
        Movie8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/8.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie8.getScene().getWindow();
            }
        });
    }

    public void Movie9(ActionEvent event) throws Exception {
        Movie9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/9.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie9.getScene().getWindow();
            }
        });
    }

    public void Movie10(ActionEvent event) throws Exception {
        Movie10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/10.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie10.getScene().getWindow();
            }
        });
    }

    public void Movie11(ActionEvent event) throws Exception {
        Movie11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/11.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie11.getScene().getWindow();
            }
        });
    }

    public void Movie12(ActionEvent event) throws Exception {
        Movie12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/12.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie12.getScene().getWindow();
            }
        });
    }

    public void Movie13(ActionEvent event) throws Exception {
        Movie13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/13.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie13.getScene().getWindow();
            }
        });
    }

    public void Movie14(ActionEvent event) throws Exception {
        Movie14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/14.jpeg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie14.getScene().getWindow();
            }
        });
    }

    public void Movie15(ActionEvent event) throws Exception {
        Movie15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Movies/15.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Movies/BookingMovie15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Movie15.getScene().getWindow();
            }
        });
    }


    @FXML
    private Button Event1;
    @FXML
    private Button Event2;
    @FXML
    private Button Event3;
    @FXML
    private Button Event4;
    @FXML
    private Button Event5;
    @FXML
    private Button Event6;
    @FXML
    private Button Event7;
    @FXML
    private Button Event8;
    @FXML
    private Button Event9;
    @FXML
    private Button Event10;
    @FXML
    private Button Event11;
    @FXML
    private Button Event12;
    @FXML
    private Button Event13;
    @FXML
    private Button Event14;
    @FXML
    private Button Event15;

    public void Event1(ActionEvent event) throws Exception {
        Event1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/1.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event1.getScene().getWindow();
            }
        });
    }

    public void Event2(ActionEvent event) throws Exception {
        Event2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/2.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event2.getScene().getWindow();
            }
        });
    }

    public void Event3(ActionEvent event) throws Exception {
        Event3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/3.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event3.getScene().getWindow();
            }
        });
    }

    public void Event4(ActionEvent event) throws Exception {
        Event4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/4.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event4.getScene().getWindow();
            }
        });
    }

    public void Event5(ActionEvent event) throws Exception {
        Event5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/5.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event5.getScene().getWindow();
            }
        });
    }

    public void Event6(ActionEvent event) throws Exception {
        Event6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/6.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event6.getScene().getWindow();
            }
        });
    }

    public void Event7(ActionEvent event) throws Exception {
        Event7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/7.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event7.getScene().getWindow();
            }
        });
    }

    public void Event8(ActionEvent event) throws Exception {
        Event8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/8.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event8.getScene().getWindow();
            }
        });
    }

    public void Event9(ActionEvent event) throws Exception {
        Event9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/9.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event9.getScene().getWindow();
            }
        });
    }

    public void Event10(ActionEvent event) throws Exception {
        Event10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/10.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event10.getScene().getWindow();
            }
        });
    }

    public void Event11(ActionEvent event) throws Exception {
        Event11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/11.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event11.getScene().getWindow();
            }
        });
    }

    public void Event12(ActionEvent event) throws Exception {
        Event12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/12.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event12.getScene().getWindow();
            }
        });
    }

    public void Event13(ActionEvent event) throws Exception {
        Event13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/13.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event13.getScene().getWindow();
            }
        });
    }

    public void Event14(ActionEvent event) throws Exception {
        Event14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/14.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event14.getScene().getWindow();
            }
        });
    }
    public void Event15(ActionEvent event) throws Exception {
        Event15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Events/15.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Events/BookingEvent15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Event15.getScene().getWindow();
            }
        });
    }

    @FXML
    private Button Play1;
    @FXML
    private Button Play2;
    @FXML
    private Button Play3;
    @FXML
    private Button Play4;
    @FXML
    private Button Play5;
    @FXML
    private Button Play6;
    @FXML
    private Button Play7;
    @FXML
    private Button Play8;
    @FXML
    private Button Play9;
    @FXML
    private Button Play10;
    @FXML
    private Button Play11;
    @FXML
    private Button Play12;
    @FXML
    private Button Play13;
    @FXML
    private Button Play14;
    @FXML
    private Button Play15;

    public void Play1(ActionEvent event) throws Exception {
        Play1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/1.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play1.getScene().getWindow();
            }
        });
    }

    public void Play2(ActionEvent event) throws Exception {
        Play2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/2.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play2.getScene().getWindow();
            }
        });
    }

    public void Play3(ActionEvent event) throws Exception {
        Play3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/3.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play3.getScene().getWindow();
            }
        });
    }

    public void Play4(ActionEvent event) throws Exception {
        Play4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/4.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play4.getScene().getWindow();
            }
        });
    }

    public void Play5(ActionEvent event) throws Exception {
        Play5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/5.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play5.getScene().getWindow();
            }
        });
    }

    public void Play6(ActionEvent event) throws Exception {
        Play6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/6.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play6.getScene().getWindow();
            }
        });
    }

    public void Play7(ActionEvent event) throws Exception {
        Play7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/7.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play7.getScene().getWindow();
            }
        });
    }

    public void Play8(ActionEvent event) throws Exception {
        Play8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/8.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play8.getScene().getWindow();
            }
        });
    }

    public void Play9(ActionEvent event) throws Exception {
        Play9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/9.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play9.getScene().getWindow();
            }
        });
    }

    public void Play10(ActionEvent event) throws Exception {
        Play10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/10.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play10.getScene().getWindow();
            }
        });
    }

    public void Play11(ActionEvent event) throws Exception {
        Play11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/15.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play11.getScene().getWindow();
            }
        });
    }

    public void Play12(ActionEvent event) throws Exception {
        Play12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/12.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play12.getScene().getWindow();
            }
        });
    }

    public void Play13(ActionEvent event) throws Exception {
        Play13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/13.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play13.getScene().getWindow();
            }
        });
    }

    public void Play14(ActionEvent event) throws Exception {
        Play14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/14.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play14.getScene().getWindow();
            }
        });
    }
    public void Play15(ActionEvent event) throws Exception {
        Play15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Plays/15.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Plays/BookingPlay15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Play15.getScene().getWindow();
            }
        });
    }

    @FXML
    private Button Sport1;
    @FXML
    private Button Sport2;
    @FXML
    private Button Sport3;
    @FXML
    private Button Sport4;
    @FXML
    private Button Sport5;
    @FXML
    private Button Sport6;
    @FXML
    private Button Sport7;
    @FXML
    private Button Sport8;
    @FXML
    private Button Sport9;
    @FXML
    private Button Sport10;
    @FXML
    private Button Sport11;
    @FXML
    private Button Sport12;
    @FXML
    private Button Sport13;
    @FXML
    private Button Sport14;
    @FXML
    private Button Sport15;

    public void Sport1(ActionEvent event) throws Exception {
        Sport1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/1.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport1.getScene().getWindow();
            }
        });
    }

    public void Sport2(ActionEvent event) throws Exception {
        Sport2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/2.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport2.getScene().getWindow();
            }
        });
    }

    public void Sport3(ActionEvent event) throws Exception {
        Sport3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/3.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport3.getScene().getWindow();
            }
        });
    }

    public void Sport4(ActionEvent event) throws Exception {
        Sport4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/4.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport4.getScene().getWindow();
            }
        });
    }

    public void Sport5(ActionEvent event) throws Exception {
        Sport5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/5.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport5.getScene().getWindow();
            }
        });
    }

    public void Sport6(ActionEvent event) throws Exception {
        Sport6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/6.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport6.getScene().getWindow();
            }
        });
    }

    public void Sport7(ActionEvent event) throws Exception {
        Sport7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/7.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport7.getScene().getWindow();
            }
        });
    }

    public void Sport8(ActionEvent event) throws Exception {
        Sport8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/8.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport8.getScene().getWindow();
            }
        });
    }

    public void Sport9(ActionEvent event) throws Exception {
        Sport9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/9.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport9.getScene().getWindow();
            }
        });
    }

    public void Sport10(ActionEvent event) throws Exception {
        Sport10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/10.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport10.getScene().getWindow();
            }
        });
    }

    public void Sport11(ActionEvent event) throws Exception {
        Sport11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/11.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport11.getScene().getWindow();
            }
        });
    }

    public void Sport12(ActionEvent event) throws Exception {
        Sport12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/12.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport12.getScene().getWindow();
            }
        });
    }

    public void Sport13(ActionEvent event) throws Exception {
        Sport13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/13.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport13.getScene().getWindow();
            }
        });
    }

    public void Sport14(ActionEvent event) throws Exception {
        Sport14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/14.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport14.getScene().getWindow();
            }
        });
    }
    public void Sport15(ActionEvent event) throws Exception {
        Sport15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Sports/15.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Sports/BookingSport15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Sport15.getScene().getWindow();
            }
        });
    }
    @FXML
    private Button Activity1;
    @FXML
    private Button Activity2;
    @FXML
    private Button Activity3;
    @FXML
    private Button Activity4;
    @FXML
    private Button Activity5;
    @FXML
    private Button Activity6;
    @FXML
    private Button Activity7;
    @FXML
    private Button Activity8;
    @FXML
    private Button Activity9;
    @FXML
    private Button Activity10;
    @FXML
    private Button Activity11;
    @FXML
    private Button Activity12;
    @FXML
    private Button Activity13;
    @FXML
    private Button Activity14;
    @FXML
    private Button Activity15;

    public void Activity1(ActionEvent event) throws Exception {
        Activity1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/1.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity1.getScene().getWindow();
            }
        });
    }

    public void Activity2(ActionEvent event) throws Exception {
        Activity2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/2.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity2.getScene().getWindow();
            }
        });
    }

    public void Activity3(ActionEvent event) throws Exception {
        Activity3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/3.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity3.getScene().getWindow();
            }
        });
    }

    public void Activity4(ActionEvent event) throws Exception {
        Activity4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/4.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity4.getScene().getWindow();
            }
        });
    }

    public void Activity5(ActionEvent event) throws Exception {
        Activity5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/5.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity5.getScene().getWindow();
            }
        });
    }

    public void Activity6(ActionEvent event) throws Exception {
        Activity6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/6.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity6.getScene().getWindow();
            }
        });
    }

    public void Activity7(ActionEvent event) throws Exception {
        Activity7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/7.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity7.getScene().getWindow();
            }
        });
    }

    public void Activity8(ActionEvent event) throws Exception {
        Activity8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/8.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity8.getScene().getWindow();
            }
        });
    }

    public void Activity9(ActionEvent event) throws Exception {
        Activity9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/9.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity9.getScene().getWindow();
            }
        });
    }

    public void Activity10(ActionEvent event) throws Exception {
        Activity10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/10.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity10.getScene().getWindow();
            }
        });
    }

    public void Activity11(ActionEvent event) throws Exception {
        Activity11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/11.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity11.getScene().getWindow();
            }
        });
    }

    public void Activity12(ActionEvent event) throws Exception {
        Activity12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/12.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity12.getScene().getWindow();
            }
        });
    }

    public void Activity13(ActionEvent event) throws Exception {
        Activity13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/13.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity13.getScene().getWindow();
            }
        });
    }
    public void Activity14(ActionEvent event) throws Exception {
        Activity14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/14.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity14.getScene().getWindow();
            }
        });
    }
    public void Activity15(ActionEvent event) throws Exception {
        Activity15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Activities/15.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Activities/BookingActivity15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Activity15.getScene().getWindow();
            }
        });
    }
    @FXML
    private Button Monument1;
    @FXML
    private Button Monument2;
    @FXML
    private Button Monument3;
    @FXML
    private Button Monument4;
    @FXML
    private Button Monument5;
    @FXML
    private Button Monument6;
    @FXML
    private Button Monument7;
    @FXML
    private Button Monument8;
    @FXML
    private Button Monument9;
    @FXML
    private Button Monument10;
    @FXML
    private Button Monument11;
    @FXML
    private Button Monument12;
    @FXML
    private Button Monument13;
    @FXML
    private Button Monument14;
    @FXML
    private Button Monument15;

    public void Monument1(ActionEvent event) throws Exception {
        Monument1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/1.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument1.getScene().getWindow();
            }
        });
    }

    public void Monument2(ActionEvent event) throws Exception {
        Monument2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/2.jpeg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument2.getScene().getWindow();
            }
        });
    }

    public void Monument3(ActionEvent event) throws Exception {
        Monument3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/3.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument3.getScene().getWindow();
            }
        });
    }

    public void Monument4(ActionEvent event) throws Exception {
        Monument4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/4.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument4.getScene().getWindow();
            }
        });
    }

    public void Monument5(ActionEvent event) throws Exception {
        Monument5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/5.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument5.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument5.getScene().getWindow();
            }
        });
    }

    public void Monument6(ActionEvent event) throws Exception {
        Monument6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/6.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument6.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument6.getScene().getWindow();
            }
        });
    }

    public void Monument7(ActionEvent event) throws Exception {
        Monument7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/7.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument7.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument7.getScene().getWindow();
            }
        });
    }

    public void Monument8(ActionEvent event) throws Exception {
        Monument8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/8.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument8.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument8.getScene().getWindow();
            }
        });
    }

    public void Monument9(ActionEvent event) throws Exception {
        Monument9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/9.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument9.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument9.getScene().getWindow();
            }
        });
    }

    public void Monument10(ActionEvent event) throws Exception {
        Monument10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/10.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument10.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument10.getScene().getWindow();
            }
        });
    }

    public void Monument11(ActionEvent event) throws Exception {
        Monument11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/11.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument11.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument11.getScene().getWindow();
            }
        });
    }

    public void Monument12(ActionEvent event) throws Exception {
        Monument12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/12.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument12.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument12.getScene().getWindow();
            }
        });
    }

    public void Monument13(ActionEvent event) throws Exception {
        Monument13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/13.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument13.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument13.getScene().getWindow();
            }
        });
    }

    public void Monument14(ActionEvent event) throws Exception {
        Monument14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/14.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument14.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument14.getScene().getWindow();
            }
        });
    }
    public void Monument15(ActionEvent event) throws Exception {
        Monument15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail.setImage(new Image("file:src/images/Student/Events/Monuments/15.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/Booking/Monuments/BookingMonument15.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 600, 400);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) Monument15.getScene().getWindow();
            }
        });
    }
    @FXML
    private Button PastEvent1;
    @FXML
    private Button PastEvent2;
    @FXML
    private Button PastEvent3;
    @FXML
    private Button PastEvent4;
    @FXML
    private ImageView Thumbnail2;

    public void PastEvent1(ActionEvent event) throws Exception {
        PastEvent1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail2.setImage(new Image("file:src/images/Student/PastEvents/1.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/PastEvents/PastEvent1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 300, 180);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) PastEvent1.getScene().getWindow();
            }
        });
    }
    public void PastEvent2(ActionEvent event) throws Exception {
        PastEvent2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail2.setImage(new Image("file:src/images/Student/PastEvents/2.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/PastEvents/PastEvent2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 300, 180);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) PastEvent2.getScene().getWindow();
            }
        });
    }
    public void PastEvent3(ActionEvent event) throws Exception {
        PastEvent3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail2.setImage(new Image("file:src/images/Student/PastEvents/3.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/PastEvents/PastEvent3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 300, 180);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) PastEvent3.getScene().getWindow();
            }
        });
    }
    public void PastEvent4(ActionEvent event) throws Exception {
        PastEvent4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail2.setImage(new Image("file:src/images/Student/PastEvents/4.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/PastEvents/PastEvent4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 300, 180);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) PastEvent4.getScene().getWindow();
            }
        });
    }
    @FXML
    private Button FutureEvent1;

    public void FutureEvent1(ActionEvent event) throws Exception {
        FutureEvent1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail2.setImage(new Image("file:src/images/Student/FutureEvents/1.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/FutureEvents/FutureEvent1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 300, 200);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) PastEvent4.getScene().getWindow();
            }
        });
    }

    @FXML
    private Button PrevEvent1;
    @FXML
    private Button PrevEvent2;
    @FXML
    private Button PrevEvent3;
    @FXML
    private Button PrevEvent4;
    @FXML
    private ImageView Thumbnail3;

    public void PrevEvent1(ActionEvent event) throws Exception {
        PrevEvent1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail3.setImage(new Image("file:src/images/Organiser/Past/1.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Organiser/PrevEvents/PrevEvent1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 300, 180);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) PrevEvent1.getScene().getWindow();
            }
        });
    }
    public void PrevEvent2(ActionEvent event) throws Exception {
        PrevEvent2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail3.setImage(new Image("file:src/images/Organiser/Past/2.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Organiser/PrevEvents/PrevEvent2.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 300, 180);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) PrevEvent2.getScene().getWindow();
            }
        });
    }
    public void PrevEvent3(ActionEvent event) throws Exception {
        PrevEvent3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail3.setImage(new Image("file:src/images/Organiser/Past/3.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Organiser/PrevEvents/PrevEvent3.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 300, 180);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) PrevEvent3.getScene().getWindow();
            }
        });
    }
    public void PrevEvent4(ActionEvent event) throws Exception {
        PrevEvent4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail3.setImage(new Image("file:src/images/Organiser/Past/4.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Organiser/PrevEvents/PrevEvent4.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 300, 180);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) PrevEvent4.getScene().getWindow();
            }
        });
    }
    @FXML
    private Button UpcomingEvent1;


    public void UpcomingEvent1(ActionEvent event) throws Exception {
        UpcomingEvent1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Thumbnail3.setImage(new Image("file:src/images/Organiser/Upcoming/1.jpg"));
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Organiser/UpcomingEvents/UpcomingEvent1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 300, 220);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) UpcomingEvent1.getScene().getWindow();
            }
        });
    }
    @FXML
    private Button QR1;

    public void QR1(ActionEvent event)throws Exception {
        QR1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage primaryStage = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/application/FXML/Student/MyEscapades/FutureEvents/QR/QR1.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root,300,300);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) QR1.getScene().getWindow();
            }
        });
    }
    @FXML
    private Button ChangeUsername;
    @FXML
    private Button ChangePassword;
    @FXML
    private Button ChangeLocation;
    @FXML
    private Button ChangeEmail;
    @FXML
    private Button ChangeLanguage;



    public void ChangeUsername(ActionEvent event) throws Exception {
        ChangeUsername.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/ChangeUsername.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 300, 220);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) ChangeUsername.getScene().getWindow();
            }
        });
    }
    public void ChangeEmail(ActionEvent event) throws Exception {
        ChangeEmail.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/ChangeEmail.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 250, 250);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) ChangeEmail.getScene().getWindow();
            }
        });
    }
    public void ChangePassword(ActionEvent event) throws Exception {
        ChangePassword.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/ChangePassword.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 250, 250);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) ChangePassword.getScene().getWindow();
            }
        });
    }


    public void ChangeLocation(ActionEvent event) throws Exception {
        ChangeLocation.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/ChangeLocation.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 250, 250);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) ChangeLocation.getScene().getWindow();
            }
        });
    }
    public void ChangeLanguage(ActionEvent event) throws Exception {
        ChangeLanguage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage primaryStage = new Stage();
                Parent root2 = null;
                try {
                    root2 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/ChangeLanguage.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(root2, 250, 250);
                scene.getStylesheets().add("/application/CSS/Style.css");
                            primaryStage.setScene(scene);
            primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue)
                    primaryStage.setMaximized(false);
            });
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage = (Stage) ChangeLanguage.getScene().getWindow();
            }
        });
    }
    @FXML
    public Button Close;

    @FXML
    public void handleCloseButtonAction(ActionEvent event){
        Stage stage = (Stage) Close.getScene().getWindow();
        stage.close();
    }
}


