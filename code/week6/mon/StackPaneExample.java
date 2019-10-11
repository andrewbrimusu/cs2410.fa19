package week5.thu;

//1. demo sphere
//2. goto StackCircles.java

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StackPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        //Drawing a Circle
        Circle circle = new Circle(300, 135, 100);
        circle.setFill(Color.DARKSLATEBLUE);
        circle.setStroke(Color.BLACK);

        //Drawing Sphere
        Sphere sphere = new Sphere(50);

        //Creating a text
        Text text = new Text("Hello how are you");

        //Setting the font of the text
        text.setFont(Font.font(null, FontWeight.BOLD, 15));

        //Setting the color of the text
        text.setFill(Color.CRIMSON);

        //setting the position of the text
        text.setX(20);
        text.setY(50);

        //Creating a Stackpane
        StackPane stackPane = new StackPane();

        //Setting the margin for the circle
        stackPane.setMargin(circle, new Insets(50, 50, 50, 50));

        //Retrieving the observable list of the Stack Pane
        ObservableList list = stackPane.getChildren();

        //Adding all the nodes to the pane
        list.addAll(circle, sphere, text);

        //Creating a scene object
        Scene scene = new Scene(stackPane);

        //Setting title to the Stage
        stage.setTitle("Stack Pane Example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}