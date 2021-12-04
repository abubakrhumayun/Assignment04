package main;

import java.io.IOException;
import java.text.ParseException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CurrencyWindowController {

	String BaseCurrency = "";

	@FXML
	TextField amount = new TextField();
	@FXML
	Label USDLabel = new Label();
	@FXML
	Label SARLabel = new Label();
	@FXML
	Label JPYLabel = new Label();
	@FXML
	Label GBPLabel = new Label();
	@FXML
	Label INRLabel = new Label();
	@FXML
	Label PKRLabel = new Label();
	@FXML
	Label exchangerateday=new Label();
	@FXML
	Label selection=new Label();
	
	@FXML
	private Button MENU;
	
	
	public void OnClickUSD(ActionEvent event) throws IOException {
		BaseCurrency = "USD";
		System.out.println("Currency set is :" + BaseCurrency);

	}

	public void OnClickPKR(ActionEvent event) throws IOException {
		BaseCurrency = "PKR";
		System.out.println("Currency set is :" + BaseCurrency);
	}

	public void OnClickJPY(ActionEvent event) throws IOException {
		BaseCurrency = "JPY";
		System.out.println("Currency set is :" + BaseCurrency);

	}

	public void OnClickGBP(ActionEvent event) throws IOException {
		BaseCurrency = "GBP";
		System.out.println("Currency set is :" + BaseCurrency);

	}

	public void OnClickSAR(ActionEvent event) throws IOException {
		BaseCurrency = "SAR";
		System.out.println("Currency set is :" + BaseCurrency);

	}

	public void OnClickINR(ActionEvent event) throws IOException {
		BaseCurrency = "INR";
		System.out.println("Currency set is :" + BaseCurrency);

	}

	public void OnClickCalc(ActionEvent event) throws IOException {
		exchangerateday.setText("2/12/2021");
		selection.setText(BaseCurrency);

		double amount1 = Double.parseDouble(amount.getText());

		if (BaseCurrency.equals("USD")) {

			USDLabel.setText("USD: " + Double.toString(amount1));
			GBPLabel.setText("GBP: " + Double.toString(amount1 * 0.75));
			SARLabel.setText("SAR: " + Double.toString(amount1 * 3.75));
			JPYLabel.setText("JPY: " + Double.toString(amount1 * 113.06));
			PKRLabel.setText("PKR: " + Double.toString(amount1 * 175.20));
			INRLabel.setText("INR: " + Double.toString(amount1 * 75.00));

		}

		if (BaseCurrency.equals("PKR")) {

			USDLabel.setText("USD: " + Double.toString(amount1 * 0.0057));
			GBPLabel.setText("GBP: " + Double.toString(amount1 * 0.0043));
			SARLabel.setText("SAR: " + Double.toString(amount1 * 0.0021));
			JPYLabel.setText("JPY: " + Double.toString(amount1 * 0.65));
			PKRLabel.setText("PKR: " + Double.toString(amount1));
			INRLabel.setText("INR: " + Double.toString(amount1 * 0.43));

		}
		if (BaseCurrency.equals("GBP")) {

			USDLabel.setText("USD: " + Double.toString(amount1 * 1.33));
			GBPLabel.setText("GBP: " + Double.toString(amount1));
			SARLabel.setText("SAR: " + Double.toString(amount1 * 4.98));
			JPYLabel.setText("JPY: " + Double.toString(amount1 * 150.23));
			PKRLabel.setText("PKR: " + Double.toString(amount1 * 232.76));
			INRLabel.setText("INR: " + Double.toString(amount1 * 99.62));

		}
		if (BaseCurrency.equals("JPY")) {

			USDLabel.setText("USD: " + Double.toString(amount1 * 0.0088));
			GBPLabel.setText("GBP: " + Double.toString(amount1*0.0067));
			SARLabel.setText("SAR: " + Double.toString(amount1 *0.033));
			JPYLabel.setText("JPY: " + Double.toString(amount1 ));
			PKRLabel.setText("PKR: " + Double.toString(amount1 * 1.55));
			INRLabel.setText("INR: " + Double.toString(amount1 * 0.66));

		}
		if (BaseCurrency.equals("INR")) {

			USDLabel.setText("USD: " + Double.toString(amount1 * 0.013));
			GBPLabel.setText("GBP: " + Double.toString(amount1*0.010));
			SARLabel.setText("SAR: " + Double.toString(amount1 *0.050));
			JPYLabel.setText("JPY: " + Double.toString(amount1*1.51 ));
			PKRLabel.setText("PKR: " + Double.toString(amount1 *2.34));
			INRLabel.setText("INR: " + Double.toString(amount1 ));

		}

		
		if (BaseCurrency.equals("SAR")) {

			USDLabel.setText("USD: " + Double.toString(amount1 * 0.27));
			GBPLabel.setText("GBP: " + Double.toString(amount1*0.20));
			SARLabel.setText("SAR: " + Double.toString(amount1 ));
			JPYLabel.setText("JPY: " + Double.toString(amount1*30.14 ));
			PKRLabel.setText("PKR: " + Double.toString(amount1 *46.70));
			INRLabel.setText("INR: " + Double.toString(amount1* 19.99));

		}
		
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

	// System.out.println("Currency set is :"+BaseCurrency);

}
