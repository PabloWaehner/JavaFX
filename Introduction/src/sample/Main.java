package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application { //the Application class manages the lifecycle of a JavaFX application

    @Override //start has to be overwritten because it is an abstract method in the application class
    //A Stage is a JavaFX container that extends the window class (essentially it's a main window)
    public void start(Stage primaryStage) throws Exception{
        //this loads the UI from the sample.fxml file, and assigns it to a variable of type Parent with the name root
        //the GridPane node will be the root of the scene graph and that's what's returned from the FXMLLoader.load()
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        ///////////////////////////////////
        //this is like doing what's inside the sample.fxml file, but in code
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//        Label greeting =  new Label("Welcome to JavaFX");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
//        root.getChildren().add(greeting);
        //////////////////////////////////

        primaryStage.setTitle("Hello World");
        //we're setting the stage as scene. When we construct the scene we have to pass in the root of the scene graph that will back the scene
        //We're also setting the width and height of the scene which in turn will become the width and height of the main window.
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args); //this method launches the JavaFX application. Then the init method runs, and the start method runs after it
    }
}
