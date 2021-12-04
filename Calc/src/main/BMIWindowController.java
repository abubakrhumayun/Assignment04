package main;

import java.io.IOException;
import java.text.ParseException;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BMIWindowController {

	@FXML
	private Pane titlePane;
	@FXML
	private ImageView btnMinimize, btnClose;
	@FXML
	private Label lblResult=new Label();
	@FXML
	private Button CalcBTN;

	private double x, y;
	private double num1 = 0;

	@FXML
	TextField inp1 = new TextField();
	@FXML
	TextField inp2 = new TextField();
	@FXML
	Label myLabel = new Label("Start");
	
	@FXML
	private Button MENU;

	public void init(Stage stage) {
		titlePane.setOnMousePressed(mouseEvent -> {
			x = mouseEvent.getSceneX();
			y = mouseEvent.getSceneY();
		});
		titlePane.setOnMouseDragged(mouseEvent -> {
			stage.setX(mouseEvent.getScreenX() - x);
			stage.setY(mouseEvent.getScreenY() - y);
		});

		btnClose.setOnMouseClicked(mouseEvent -> stage.close());
		btnMinimize.setOnMouseClicked(mouseEvent -> stage.setIconified(true));
	}

	public void OnClickCalc(ActionEvent event) throws IOException {
		
		double Height=Double.parseDouble(inp1.getText());
		double Weight=Double.parseDouble(inp2.getText());
		double BMI = Weight;
		BMI/=Height;
		BMI/=Height;
	    System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
	    
	    
	    String total2 = String.valueOf(BMI);
	    lblResult.setText(total2);
	}
	
	
public void OnClickMenu(ActionEvent event) throws IOException, ParseException {

	Stage stage1 = (Stage) MENU.getScene().getWindow();
    // do what you have to do
    stage1.close();
	
	
	 FXMLLoader fxmlLoader = new FXMLLoader();
     fxmlLoader.setLocation(getClass().getResource("MenuFXML.fxml"));
  
     Scene scene = new Scene(fxmlLoader.load());
     Stage stage2 = new Stage();
     stage2.setTitle("Calculator");
     stage2.setScene(scene);
     stage2.show();

		
	}

}
