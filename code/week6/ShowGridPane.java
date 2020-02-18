package week6;

//1. Add items to GridPane, compare to FlowPane
//2. Demo changing width
//3. goto GridPaneExperiments.java

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws Exception{
        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        Label finalMsg = new Label();

        // Place nodes in the pane
        Label firstNam = new Label("First Name: ");
        Label mi = new Label("MI: ");
        Label lastNam = new Label("Last Name: ");
        TextField firstFld = new TextField();
        TextField secondFld = new TextField();
        TextField miFld = new TextField();

        pane.add(firstNam, 0, 0);
        pane.add(firstFld, 1, 0);
        pane.add(mi, 0, 1);
        pane.add(miFld, 1, 1);
        pane.add(lastNam, 0, 2);
        pane.add(secondFld, 1, 2);

        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);

        btAdd.setOnAction(e -> {
            finalMsg.setText("Welcome " + firstFld.getText() + " " + miFld.getText() + " " + secondFld.getText() + "!");
            pane.add(finalMsg,0,4);
        });
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowGridPane"); // Set the stage title
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