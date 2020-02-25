package week8;

//7.
//Discuss Layout, Nodes, methods, lambdas

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.beans.EventHandler;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OClient extends Application {

    GridPane gridPane = null;
    Socket socketClient = null;
    BufferedReader reader = null;
    BufferedWriter writer = null;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws Exception{
        // Create UI
        gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        Button t = null;
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++) {
                t = new Button("-");
                t.setOnAction(e -> {
                    ((Button)e.getSource()).setText("O");

                    try {
                        sendMoveReceiveMove(e);
                    } catch (Exception ex) {
                    }
                });
                gridPane.add(t, j, i);
            }
        gridPane.add(new Label("Click a square, then wait..."),3,3);


        // Set properties for UI
        // Process events

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("TicTacToe O Player"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        connect();
        //receiveFirstMove();
    }

    private void receiveFirstMove() throws Exception {
        int orow = Integer.parseInt(reader.readLine().trim());
        int ocol = Integer.parseInt(reader.readLine().trim());

        gridPane.add(new Button("O"),ocol,orow);

    }

    private void connect() throws Exception {
        try {
            socketClient = new Socket("localhost",5558);
            System.out.println("Server: " + "Connection Established");
        } catch (Exception ex) {
            System.err.println(ex + "Client couldn't connect");
        }

        reader = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

        writer = new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));


    }
    private void sendMoveReceiveMove(ActionEvent ae) throws IOException {
        Button t = (Button)ae.getSource();
        //t.setText("O");

        int row = gridPane.getRowIndex(t);
        int col = gridPane.getColumnIndex(t);

        writer.write(row+"\r\n");
        writer.write(col+"\r\n");
        writer.flush();

        int xrow = Integer.parseInt(reader.readLine().trim());
        int xcol = Integer.parseInt(reader.readLine().trim());

        gridPane.add(new Button("X"),xcol,xrow);


    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}