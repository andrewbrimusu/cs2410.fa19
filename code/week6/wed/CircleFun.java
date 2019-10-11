import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleFun extends Application {
    public void start(Stage st) {
        Pane fp = new Pane();
        Circle c1 = new Circle();
        fp.getChildren().add(c1);
        Label l1 = new Label();
        fp.getChildren().add(l1);
        Button b1 = new Button("Change Color");
        fp.getChildren().add(b1);
        c1.radiusProperty().bind(fp.widthProperty().divide(4));
        c1.centerXProperty().bind(fp.widthProperty().divide(2));
        c1.centerYProperty().bind(fp.heightProperty().divide(2));

        c1.radiusProperty().addListener(ov -> {
            l1.setText("The circle radius is: " + c1.getRadius());
        });

        b1.setOnAction(e -> {
            c1.setFill(new Color(Math.random(),Math.random(),Math.random()));
        });


        Scene sc = new Scene(fp, 500, 500);
        st.setScene(sc);
        st.show();
    }
}
