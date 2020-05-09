# Java Based Event Management System
## University of Bedfordshire
### Principles of Programming Languages

#### Introduction:
The task was to create a Java Base Graphical User Interface for an event management system.

This Project is made by using JavaFX instead of Swing/AWT.

#### Setup: (The First 2 steps can be ignoed if already setup)
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

![] /Screenshots/1.jpg




