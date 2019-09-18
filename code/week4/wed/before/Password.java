package week4.tue;

//1. asdf is the password
//2. bindings used to detect password
//goto RolePlayer.java

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;

import javafx.scene.text.Text;

import javafx.stage.Stage;
/*w  ww.  j a  v a 2 s . co m*/
public class Password extends Application {
    private final static String MY_PASS = "asdf";
    private final static BooleanProperty accessGranted = new SimpleBooleanProperty(false);
    @Override
    public void start(Stage primaryStage) {
        User user = new User();
        Group root = new Group();
        Scene scene = new Scene(root, 320, 100);
        primaryStage.setScene(scene);

        Text userName = new Text();
        userName.textProperty().bind(user.userNameProperty());

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        user.passwordProperty().bind(passwordField.textProperty());

        // user hits the enter key
        passwordField.setOnAction(actionEvent -> {
            if (accessGranted.get()) {
                System.out.println("granted access:"+ user.getUserName());
                System.out.println("password:"+ user.getPassword());
                Platform.exit();
            } else {
                primaryStage.setTitle("no access");
            }
        });

        passwordField.textProperty().addListener((obs, ov, nv) -> {
            boolean granted = passwordField.getText().equals(MY_PASS);
            accessGranted.set(granted);
            if (granted) {
                primaryStage.setTitle("");
            }
        });
        VBox formLayout = new VBox(4);
        formLayout.getChildren().addAll(userName, passwordField);
        formLayout.setLayoutX(12);
        formLayout.setLayoutY(12);

        root.getChildren().addAll(formLayout);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
class User {
    private final ReadOnlyStringWrapper userName;
    private StringProperty password;
    public User() {
        userName = new ReadOnlyStringWrapper(this, "userName", "ABC");
        password = new SimpleStringProperty(this, "password", "");
    }

    public final String getUserName() {
        return userName.get();
    }
    public ReadOnlyStringProperty userNameProperty() {
        return userName.getReadOnlyProperty();
    }

    public final String getPassword() {
        return password.get();
    }
    public StringProperty passwordProperty() {
        return password;
    }
}