package main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class InvestmentWindowController {

	public static double getInterest(double rate, int time, double principal) {
		double multiplier = Math.pow(1.0 + rate / 100.0, time) - 1.0;
		return multiplier * principal;
	}
	 public static double  calculate(int p, int t, double r, int n) {
	        double amount = p * Math.pow(1 + (r / n), n * t);
	        double cinterest = amount - p;
	        System.out.println("Compound Interest after " + t + " years: "+cinterest);
	        System.out.println("Amount after " + t + " years: "+amount);
			return amount;
	    }
	 @FXML
		private Button MENU;

	@FXML
	TextField inp1 = new TextField();
	@FXML
	TextField inp2 = new TextField();
	@FXML
	TextField inp3 = new TextField();
	@FXML
	TextField inp4 = new TextField();
	@FXML
	Label myLabel = new Label();
	@FXML
	private Button CalcBTN;
	
public void OnClickCalc(MouseEvent event) throws IOException {
		
		int total=Integer.parseInt(inp1.getText());
		double interestrate=Double.parseDouble(inp2.getText());
		int years=Integer.parseInt(inp3.getText());
		int months=Integer.parseInt(inp4.getText());
		
		
		double yearlycmp=calculate(total, years, interestrate/100, 12);
		
		
		double finaltt=getInterest(interestrate,months,yearlycmp);
		myLabel.setText(String.valueOf(yearlycmp));
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
