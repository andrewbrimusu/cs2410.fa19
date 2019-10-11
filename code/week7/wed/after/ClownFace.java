import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ClownFace extends Application {
    public void start(Stage st) {
        StackPane pane = new StackPane();
        Arc lefttop = new Arc(200,200,40,20,30,120);
        lefttop.setType(ArcType.OPEN);
        lefttop.setFill(Color.TRANSPARENT);
        lefttop.setStroke(Color.NAVY);

        pane.getChildren().add(lefttop);
        st.setScene(new Scene(pane));
        st.show();
    }
}
