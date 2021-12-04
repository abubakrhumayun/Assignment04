package main;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AgeWindowController {

	@FXML
	TextField borndate = new TextField();

	@FXML
	Label date1 = new Label("");
	@FXML
	Label agefinal = new Label("");

	@FXML
	private Button AgeBTN;
	
	
	@FXML
	private Button MENU;

	public void OnClickAge(ActionEvent event) throws IOException, ParseException {

		String agedate = borndate.getText();

	
		String s = borndate.getText();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date d = sdf.parse(s);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		LocalDate l1 = LocalDate.of(year, month, date);
		LocalDate now1 = LocalDate.now();
		Period diff1 = Period.between(l1, now1);
		System.out.println("Age:" + diff1.getYears() + "years");
		date1.setText(String.valueOf(now1.getYear())+"/"+String.valueOf(now1.getMonthValue())+"/"+String.valueOf(now1.getDayOfMonth()));
		String aggg=String.valueOf(diff1.getYears());
		System.out.println(aggg);
		agefinal.setText("You are "+aggg+" years old.");

		
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
