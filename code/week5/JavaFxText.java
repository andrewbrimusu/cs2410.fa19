package week5;

/**
 * 1. Demo Glow, Lighting, Reflection
 * 2. goto TextExample.java
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class JavaFxText extends Application
{
    /**
     * Start demonstration of JavaFX text capabilities.
     *
     * @param stage Stage for JavaFX application.
     * @throws Exception Exception in JavaFX application.
     */
    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Simplistic Example of JavaFX 2.0 Text Capabilities");
        Group rootGroup = new Group();
        Scene scene =
                new Scene(rootGroup, 800, 400, Color.BEIGE);

        Text text1 = new Text(25, 25, "(2007) JavaFX based on F3");
        text1.setFill(Color.CHOCOLATE);
        text1.setFont(Font.font(java.awt.Font.SERIF, 25));
        rootGroup.getChildren().add(text1);
        text1.setRotate(45);

        Text text2 = new Text(25, 50, "(2010) JavaFX Script Deprecated");
        text2.setFill(Color.DARKBLUE);
        text2.setFont(Font.font(java.awt.Font.SANS_SERIF, 30));
        rootGroup.getChildren().add(text2);

        Text text3 = new Text(25, 75, "(2011) JavaFX to be Open Sourced!");
        text3.setFill(Color.TEAL);
        text3.setFont(Font.font(java.awt.Font.MONOSPACED, 35));
        rootGroup.getChildren().add(text3);

        Text text4 = new Text(25, 125, "(2011) JavaFX to be Standardized");
        text4.setFill(Color.CRIMSON);
        text4.setFont(Font.font(java.awt.Font.DIALOG, 40));
        Effect glow = new Glow(1.0);
        text4.setEffect(glow);
        rootGroup.getChildren().add(text4);

        Text text5 = new Text(25, 175, "(Now) Time for JavaFX 2.0!");
        text5.setFill(Color.DARKVIOLET);
        text5.setFont(Font.font(java.awt.Font.SERIF, FontWeight.EXTRA_BOLD, 45));
        Light.Distant light = new Light.Distant();
        light.setAzimuth(-135.0);
        Lighting lighting = new Lighting();
        lighting.setLight(light);
        lighting.setSurfaceScale(9.0);
        text5.setEffect(lighting);
        rootGroup.getChildren().add(text5);

        Text text6 = new Text(25, 225, "JavaFX News at JavaOne!");
        text6.setFill(Color.DARKGREEN);
        text6.setBlendMode(BlendMode.COLOR_BURN);
        text6.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 45));
        Reflection reflection = new Reflection();
        reflection.setFraction(1.0);
        text6.setEffect(reflection);
        rootGroup.getChildren().add(text6);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * Main JavaFX application launching method.
     *
     * @param arguments Command-line arguments: none expected.
     */
    public static void main(String[] arguments)
    {
        Application.launch(arguments);
    }
}
