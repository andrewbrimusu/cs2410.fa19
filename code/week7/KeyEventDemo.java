package week7;

// 2. Review 603 KeyEvent methods and constraints
// review switch to move text up/down/left/right
// review default to add text
// - add ability for shift
// - add ability to delete
// review lambda use
// GOTO ControlCircleWithMouseAndKey.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        Pane pane = new Pane();
        Text text = new Text(20, 20, "A");

        pane.getChildren().add(text);
        text.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN: text.setY(text.getY() + 10); break;
                case UP:  text.setY(text.getY() - 10); break;
                case LEFT: text.setX(text.getX() - 10); break;
                case RIGHT: text.setX(text.getX() + 10); break;
                default:
                    //text.setText(text.getText()+e.getText());

                    if(e.getCode() == KeyCode.SHIFT || e.isShiftDown()) {
                        System.out.println("shift");
                        if(e.getText().equals("1")) {
                            text.setText(text.getText()+"!");
                        }
                        else {
                            text.setText(text.getText()+e.getText().toUpperCase());
                        }
                    }
                    else if(e.getCode() == KeyCode.BACK_SPACE) {
                        String str = text.getText();
                        System.out.println("str");
                        text.setText(str.substring(0,str.length()-1));
                    }
                    else if (Character.isLetterOrDigit(e.getText().charAt(0)))
                        text.setText(text.getText()+e.getText());
                    else
                        text.setText(text.getText()+e.getText());

            }
        });

        // Create a scene and place the pane in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("KeyEventDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        text.requestFocus(); // text is focused to receive key input
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

