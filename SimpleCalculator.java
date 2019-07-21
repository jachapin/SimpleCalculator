/**
 * @author Jeff Chapin
 */

/* 
 * A simple calculator
 * 
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {

	private TextField tfNumber1 = new TextField();
	private TextField tfNumber2 = new TextField();
	private TextField tfResult = new TextField();
	private Button btAdd = new Button("Add");
	private Button btSubtract = new Button("Subtract");
	private Button btMultiply = new Button("Multiply");
	private Button btDivide = new Button("Divide");

	public void start(Stage primaryStage) {
		// Create a BorderPane
		BorderPane pane = new BorderPane();

		// Create top HBox
		HBox hBox1 = new HBox();
		hBox1.setSpacing(10);

		// Add Labels and TextFields to hBox1
		hBox1.getChildren().add(new Label("Number 1: "));
		hBox1.getChildren().add(tfNumber1);
		hBox1.getChildren().add(new Label("Number 2: "));
		hBox1.getChildren().add(tfNumber2);
		hBox1.getChildren().add(new Label("Result: "));
		hBox1.getChildren().add(tfResult);

		// Create bottom HBox
		HBox hBox2 = new HBox();
		hBox2.setSpacing(100);

		// Add Buttons to hBox2
		hBox2.getChildren().add(btAdd);
		hBox2.getChildren().add(btSubtract);
		hBox2.getChildren().add(btMultiply);
		hBox2.getChildren().add(btDivide);

		// Add hBox1 and hBox2 to the BorderPane
		pane.setTop(hBox1);
		pane.setBottom(hBox2);
		hBox2.setAlignment(Pos.BOTTOM_CENTER);

		// Events
		btAdd.setOnAction(e -> add());
		btSubtract.setOnAction(e -> subtract());
		btMultiply.setOnAction(e -> multiply());
		btDivide.setOnAction(e -> divide());

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 680, 60);
		primaryStage.setTitle("Simple Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	/** Calculation methods */
	private void add() {
		// Get values from tfNumber1 and tfNumber2
		double number1 = Double.parseDouble(tfNumber1.getText());
		double number2 = Double.parseDouble(tfNumber2.getText());
		double result;

		// Add the numbers
		result = number1 + number2;

		// Place result in tfResult
		tfResult.setText(result + "");
	}

	private void subtract() {
		// Get values from tfNumber1 and tfNumber2
		double number1 = Double.parseDouble(tfNumber1.getText());
		double number2 = Double.parseDouble(tfNumber2.getText());
		double result;

		// Subtract number1 from number2
		result = number1 - number2;

		// Place result in tfResult
		tfResult.setText(result + "");
	}

	private void multiply() {
		// Get values from tfNumber1 and tfNumber2
		double number1 = Double.parseDouble(tfNumber1.getText());
		double number2 = Double.parseDouble(tfNumber2.getText());
		double result;

		// Multiply the numbers
		result = number1 * number2;

		// Place result in tfResult
		tfResult.setText(result + "");
	}

	private void divide() {
		// Get values from tfNumber1 and tfNumber2
		double number1 = Double.parseDouble(tfNumber1.getText());
		double number2 = Double.parseDouble(tfNumber2.getText());
		double result;

		// Divide number1 by number2
		if (number2 != 0) {
			result = number1 / number2;
		} else
			result = 0;

		// Place result in tfResult
		tfResult.setText(result + "");
	}

	/** Main method */
	public static void main(String[] args) {
		launch(args);
	}

}
