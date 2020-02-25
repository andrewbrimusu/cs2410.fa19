package week7;

//1. Discuss Dragged
//Review Book page 602 show Methods
//Review page 589 Mouse Event Registration methods
// - add to pane setOnMouseClicked(), setOnMousePressed(), setOnMouseReleased()
// - show dragged output
//Review Lambdas
//GOTO KeyEventDemo.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {

    private int numEvents=0;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        Pane pane = new Pane();
        Text text = new Text(20, 20, "Programming is fun");
        pane.getChildren().addAll(text);
        text.setOnMouseDragged(e -> {
            numEvents++;
            System.out.println("hello" + numEvents);
            text.setX(e.getX());
            text.setY(e.getY());
            text.setX(text.getX());
            text.setY(text.getY());
        });


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 300, 100);
        primaryStage.setTitle("MouseEventDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

