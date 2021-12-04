package main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DiscountWindowController {

	@FXML
	TextField inp1 = new TextField();
	@FXML
	TextField inp2 = new TextField();
	@FXML
	Label myLabel = new Label();
	
	@FXML
	private Button CalcBTN;
	
	@FXML
	private Button MENU;

	public void OnClickCalc(ActionEvent event) throws IOException {

		int price = Integer.parseInt(inp1.getText());
		int discount = Integer.parseInt(inp2.getText());
		int markedprice,dis,amount,s;
		markedprice=price;
		 
        dis=discount;  		
	
	System.out.println("markedprice= "+markedprice);
 
	System.out.println("discount rate="+dis);
         
        s=100-dis;
 
	amount= (s*markedprice)/100;
	
	myLabel.setText(String.valueOf(amount));
		
		
		

	}
	

public void OnClickMenu(ActionEvent event) throws IOException {
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
