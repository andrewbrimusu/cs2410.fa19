package week7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListenersAreFun extends Application {
    public void start(Stage st) {
        FlowPane fp = new FlowPane();
        Label lb = new Label();
        fp.getChildren().add(lb);

        fp.widthProperty().addListener(ov -> {
            lb.setText("The pane is width: " + fp.getWidth());
        });

        Scene sc = new Scene(fp,500,500);
        st.setScene(sc);
        st.show();
    }
}
