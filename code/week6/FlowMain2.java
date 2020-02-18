package week6;

//1. add more Buttons
//2. change ORIENTATION
//3. goto ShowGridPane.java

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
//from w w  w. j a  v  a 2 s.  c om

public class FlowMain2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FlowPane example");

        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setVgap(4);
        flowPane.setHgap(4);
        flowPane.setPrefWrapLength(210);
        flowPane.setOrientation(Orientation.VERTICAL);

        Button btn = new Button();

        for (int i = 0; i < 8; i++) {

            btn = new Button("Button");
            btn.setPrefSize(100, 50);
            flowPane.getChildren().add(btn);

        }

        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
