package week5.tue;

//1. demo for loop adding buttons to pane
//2. add images to a pane
//3. discuss anonymous classes
//4. goto FlowMain2.java

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
/*from  w w  w  .ja va2  s .  c o m*/
public class FlowMain extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("HTML");
        stage.setWidth(500);
        stage.setHeight(500);
        Scene scene = new Scene(new Group());

        FlowPane flow = new FlowPane();
        flow.setVgap(8);
        flow.setHgap(4);
        flow.setPrefWrapLength(300); // preferred width = 300
        flow.getChildren().add(new Button("asdf"));
        scene.setRoot(flow);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
