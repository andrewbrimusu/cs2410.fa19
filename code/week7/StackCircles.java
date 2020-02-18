package week7;

//1. stack up circles
//goto MouseEventDemo.java

/*from w w  w .j  ava 2s  .  co  m*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackCircles extends Application {

    @Override public void start(Stage stage) {
        Group group = new Group();
        Scene scene = new Scene(group);

        StackPane stack = new StackPane();
        stack.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
        stack.getChildren().addAll(new Rectangle(100,100,Color.BLUE));
        stack.getChildren().add(new Circle(100,Color.RED));
        group.getChildren().add(stack);

        stage.setTitle("Welcome to JavaFX!");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}