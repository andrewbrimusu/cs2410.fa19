package week6;

//1. add 3 buttons
//2. play with orientation
//3. goto FlowMain.java

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class FlowPaneExperiments extends Application  {


    @Override
    public void start(Stage primaryStage) throws Exception {
        //primaryStage.setTitle("HBox Experiment 1");

        Button button1 = new Button("Button Number 1");
        Button button2 = new Button("Button Number 2");
        Button button3 = new Button("Button Number 3");

        Label lab1 = new Label("test");
        FlowPane flowpane = new FlowPane();
        flowpane.setOrientation(Orientation.VERTICAL);
        flowpane.getChildren().add(button1);
        flowpane.getChildren().add(button2);
        flowpane.getChildren().add(button3);

        Scene scene = new Scene(flowpane, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
