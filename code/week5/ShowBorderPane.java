package week5;

//1. Add items to GridPane, compare to FlowPane
//2. Demo changing width
//3. Demo Adding FlowPane to CenterPane
//4. Demo Adding nodes to FlowPane, then adding to CenterPane
//3. goto ShowHBoxVBox.java

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a border pane
        BorderPane pane = new BorderPane();
        //FlowPane fp1 = new FlowPane();
        //fp1.getChildren().add(new Button("OK"));

        // Place nodes in the pane
        pane.setTop(new CustomPane("Top"));
        //pane.setTop(fp1);
        pane.setRight(new CustomPane("Right"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setLeft(new CustomPane("Left"));
        pane.setCenter(new CustomPane("Center"));

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowBorderPane"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

// Define a custom pane to hold a label in the center of the pane
class CustomPane extends StackPane {
    public CustomPane(String title) {
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: red");
        setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    }
}