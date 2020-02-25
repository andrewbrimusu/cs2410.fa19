package week8;

//7.
//Discuss Layout, Nodes, methods, lambdas

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;

public class LoanCalculator extends Application {
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btCalculate = new Button("Calculate");

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
        gridPane.add(tfAnnualInterestRate, 1, 0);
        gridPane.add(new Label("Number of Years:"), 0, 1);
        gridPane.add(tfNumberOfYears, 1, 1);
        gridPane.add(new Label("Loan Amount:"), 0, 2);
        gridPane.add(tfLoanAmount, 1, 2);
        gridPane.add(new Label("Monthly Payment:"), 0, 3);
        gridPane.add(tfMonthlyPayment, 1, 3);
        gridPane.add(new Label("Total Payment:"), 0, 4);
        gridPane.add(tfTotalPayment, 1, 4);
        gridPane.add(btCalculate, 1, 5);

        // Set properties for UI
        gridPane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);

        // Process events
        btCalculate.setOnAction(e -> {
            try {
                calculateLoanPayment();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("LoanCalculator"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    private void calculateLoanPayment() throws IOException {
        // Get values from text fields
        double interest =
                Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount =
                Double.parseDouble(tfLoanAmount.getText());

        // Create a loan object. Loan defined in Listing 10.2
        //
        // Loan loan = new Loan(interest, year, loanAmount);

        Socket socketClient = null;
        try {
            socketClient = new Socket("localhost", 5557);
            System.out.println("Client: " + "Connection Established");
        } catch (Exception e) {
            System.err.println(e + "Client couldn't connect");
        }

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

        BufferedWriter writer=
                new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));


        System.out.println("Sending Loan data to server: "+interest + ", " + year + ", " + loanAmount);
        writer.write(interest +"\r\n");
        writer.flush();
        writer.write(year +"\r\n");
        writer.flush();
        writer.write(loanAmount +"\r\n");
        writer.flush();

        String monPayment = reader.readLine().trim();
        String totPayment = reader.readLine().trim();

        System.out.println("Result from server: " + monPayment + ", " + totPayment);



        // Display monthly payment and total payment
        tfMonthlyPayment.setText(monPayment);
        tfTotalPayment.setText(totPayment);

    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}