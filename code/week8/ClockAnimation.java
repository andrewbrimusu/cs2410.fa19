package week8;

import week8.ClockPane;

//5. Show how they did it
// - update to lambda
//GOTO BounceBallControl.java/BallPane.java

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.util.Duration;

public class ClockAnimation extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane(); // Create a clock
        clock.setCurrentTime();




        // Create a scene and place it in the stage
        Scene scene = new Scene(clock, 250, 250);
        primaryStage.setTitle("ClockAnimation"); // Set the stage title
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

/*
Timeline t1 = new Timeline(new KeyFrame(Duration.seconds(1),e -> clock.setCurrentTime()));
        t1.setCycleCount(Timeline.INDEFINITE);
        t1.play();
 */