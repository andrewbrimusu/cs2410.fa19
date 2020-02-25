package week6.thu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;

public class ClownFace extends Application {
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Arc nose = new Arc(300,250,50,75,0,360);
        nose.setFill(Color.RED);
        pane.getChildren().add(nose);

        Arc lEye = new Arc(200,100,70,50,0,-180);
        lEye.setFill(Color.GREEN);
        pane.getChildren().add(lEye);

        Arc rEye = new Arc(400,100,70,50,0,-180);
        rEye.setFill(Color.GREEN);
        pane.getChildren().add(rEye);

        Arc bMouth = new Arc(300,350,200,200,180,180);
        bMouth.setFill(Color.PURPLE);
        pane.getChildren().add(bMouth);

        Arc tMouth = new Arc(300,350,200,50,180,180);
        tMouth.setFill(Color.WHITE);
        pane.getChildren().add(tMouth);

        Scene scene = new Scene(pane,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
