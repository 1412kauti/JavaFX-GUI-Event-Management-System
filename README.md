# Java Based Event Management System
### University of Bedfordshire
### Principles of Programming Languages

## Introduction:
The task was to create a Java Base Graphical User Interface for an event management system.

This Project is made by using JavaFX instead of Swing/AWT.

## Setup: (The First 2 steps can be ignoed if already setup)
1. Install Java
    The Java Verison used here is Java 11 which can be downloaded and installed using

https://www.oracle.com/java/technologies/javase-jdk11-downloads.html

Note: The installation should be pointed the Path in System Variables of the Environment Variables of the Operating System

2. Install the IDE of choice, in this case it is IntelliJ 2020.1 Community Edition. This can be downloaded from here:

https://www.jetbrains.com/idea/download/#section=windows

3. Download the JavaFX libraries from
 
 https://gluonhq.com/products/javafx/

in this case,Long Term Support (LTS)

Extract the zip file to a known Location, in this case Documents Folder.

4. Open IntelliJ IDE and Create a New Project 

While choosing the type of Project to be created, choose **JavaFX** only.

5. Now Open Project Structures

**File --> Project Structure --> Libraries**

now add a new library using the **+** icon and point the location the *lib* directory of the JavaFX directory. An example is as folllows:

```
C:\Users\kauti\Documents\javafx-sdk-11.0.2\lib
```

6. Download JFoenix library from

https://github.com/jfoenixadmin/JFoenix

and extract its contents to the same location as JavaFX and add the library to the **Project Structure** as in the above step.
An example directory is as follows:
```
C:\Users\kauti\Documents\Jfeonix
```
7. Go to Preferences **File -> Settings -> Appearance & Behavior -> Path Variables**, and define the name of the variable as **PATH_TO_FX**, and browse to the **lib** folder of the JavaFX SDK to set its value, and click apply.
8. *Edit Configuration* by going to **Run --> Edit Configuration**, change the VM Options as 

```
--module-path ${PATH_TO_FX} 
--add-modules=javafx.base 
--add-modules=javafx.controls 
--add-modules=javafx.fxml 
--add-modules=javafx.graphics 
--add-modules=javafx.media 
--add-modules=javafx.swing 
--add-modules=javafx.web 
--add-opens javafx.base/com.sun.javafx.runtime=ALL-UNNAMED 
--add-opens javafx.controls/com.sun.javafx.scene.control.behavior=ALL-UNNAMED 
--add-opens javafx.controls/com.sun.javafx.scene.control=ALL-UNNAMED --add-opens javafx.base/com.sun.javafx.binding=ALL-UNNAMED 
--add-opens javafx.base/com.sun.javafx.event=ALL-UNNAMED 
--add-opens javafx.graphics/com.sun.javafx.stage=ALL-UNNAMED
```
#### Basics of JavaFX

JavaFX is known as a successor the Java Swing and Java AWT and has been packaged with the OracleJDK till version 8. 

In version 11, JavaFX has been dropped by Oracle and is being maintained by Gluon.

JavaFX has 2 main Classes for its functioning, A **Main** Class and a **Controller** class.

The **Main** Class houses the *main* method and
The **Controller** Class houses all the other sub-classes being used in the Application.

The GUI has 2 major parts, The **Stage** and the **Scene** which are depicted as follows

![](/Screenshots/1.jpg)

The **Stage** is the panel which generally houses the Close button, Minimise Button and the Maximize Button.

The **Scene** is the Area inside the Stage.

The **Controls** constitute all the Buttons, Text Fields, Labels,etc within the Scene.

The Layout of the all controllers on the screen can be initialised and created on the scene using 2 methods. i.e. 
* by adding then in the Main/Controller Class (or)
* by Creating the layouts in an FXML file.

In this case, they have been made in FXML files.

Within the JavaFX Application Main.java, there are 2 classes.
The first class is the *main* method which has the lines
```
launch(args)
```
The *main()* method calls the static *launch()* method with the command line parameters. The *launch()* method is a static method located in the Application class. This method launches the JavaFX runtime and the JavaFX application.

The *launch()* method will detect from which class it is called, So there is no need to explicitly specify which class to launch.

All subclasses of the JavaFXApplication class must implement the abstract *start()* method of the Main class (or be an abstract subclass of Main itself).The *start()* method takes in an argument of a **Stage** named **PrimaryStage**.

The **javafx.application.Application** class provides a framework for managing a JavaFX application. This application must include a class that extends Application, overriding various methods that the JavaFX runtime calls to execute application-specific code.

An application can call Application methods to obtain startup parameters, access host services, arrange to launch itself as a standalone application, interact with the preloader (a small application that's started before the main application to customize the startup experience), and access the user agent (Web browser) style sheet.

The *start()* method takes a single parameter of the type **Stage** . The stage is where all the visual parts of the JavaFX application are displayed. The Stage object is created by default by the JavaFX runtime.

When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.

When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs.

within **try**, The FXML files are linked to the subclass using the Parent Class by importing **javafx.scene.Parent** as
```
Parent root = FXMLLoader.load(getClass().getResource("/application/FXML/Common/StartScreen.fxml"));
```
The FXML file is stored in the variable **root**.
The Scene is now setup with 3 parameters. i.e. root, height of the Scene and the Width of the Scene. as shown below:
```
Scene scene = new Scene(root,300,300);
```
here height and width of the Scene are 300 and 300 respectively.

The Styling of the scene can be done by using Stylesheets(CSS).
```
scene.getStylesheets().add("/application/CSS/StartScreen.css");
```
The **PrimaryStage** uses the **setScene** option taking the parameter of **scene**.

To Disable the resizability of the stage, the option **setResizable** is called, having a boolean parameter **false**. 
```
setResizable(false)
```
Simple creating a JavaFX Stage object will not show it. In order to make the Stage visible, its **show()** method has to be called.In this case:
```
primaryStage.show()
```
Within **catch**, it uses an argument of an **Exception**, the underlying code states that it will call the *printStackTrace()* method and will make sure that Java wont stop the application even though it hits the error.

#### Setting Layouts using Scenebuilder

The FXML files can be hand coded but the process becomes tedious for long workflows, this is where Scenebuilder comes in.

It enables the user to drag-and-drop the controls and also preview the layouts while at it.

FXML files come with many themes in built, by default it is set to **Modena**. But third party themes can also be used. 

In this case, a third party open-source library called **Jfoenix** has been used to mimic the style of Android's material GUI scheme.

All the Controls like Buttons, Labels, ScrollPanes, Vertical Boxes(VBox), Lines,etc can have their sizes, length and position can be defined using Options like

* PrefWidth, PrefHeight of changing the size. 
* Layout X and Layout Y for changing the position on an AnchorPane.

The FXML file can be linked to the Controller Class by changing the parameters in the **Controller tab** on the left. 

The Controls which have some working are assigned **fx:ids** and an **On Action** text-field which assigns a function from the Controller Class.
This is seen in The **Coding tab** on right.

### Assigning Buttons to Open a new Stage

Within the Main Class,

The Control has to be defined as a **private/public** under **@FXML** as seen below:
```
@FXML
public Button SignUp
```
The **Button1** has a class Button. This variable Button1 needs to have the same name as its fx:id.

The functionality of clicking the button is as follows. This sub-class is a part of the Controller class.

```
    public void SignUp(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/application/FXML/Common/SignUp.fxml"));
        Scene scene = new Scene(root1, 300, 300);
        scene.getStylesheets().add("/application/CSS/Style.css");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        Stage stage = (Stage) SignUp.getScene().getWindow();
        stage.close();
    }
```
In the above case, the action is named **SignUp**. The sub-class is very similar to the *start()* method used in the **Main** Class with setting up the Stage, importing the FXML layout, setting up the scene, disabling the Resizability of the Stage and finally displaying the Stage

The difference is that, in the end of this snippet, especially in the last two lines.

This allows to close the existing stage and also open a new Stage which is directed by another FXML file.

### Assigning ImageView to open Images on a Button Click.

ImageView is a frame which can open images within a stage.

Within Scenebuilder, an ImageView Layout can be assigned to open a single image which is preset. But to Open an Image by the press of a button,

Each button has to be assigned to an image, which in turn is assigned to set the image on ImageView, as seen below:
```
    @FXML
    private Button Movie1;
    @FXML
    private ImageView Thumbnail;
```
A Button and an Imageview window are firstly defined
```

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
```
The subclass Movie1 is identical to the previous case where it opens a new stage when the Button Movie1 is pressed, but as soon as the sub-class is defined, an ActionEvent is called for using mouse inputs under an **@Override**. The image to be set in the ImageView Layout named **Thumbnail** by calling a new Image from its respective direcctory within the Project folder.

The image has to be set before the Stage is set or else it will not define it.

There were a few errors when setting up the root by calling the Parent class directly, which is mitigated by assigning the Parent variable to **null**. and the Parent variable is later defined under a try-catch route, where the class will execute even though there as **IOExceptions**.

At the end of the class, The Button Movie1 is assigned to open BookingMovie1.fxml.

While opening this new Stage, it should not close the existing stage, which is why the **.close()** option is excluded.

















