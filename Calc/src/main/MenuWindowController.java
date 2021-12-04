package main;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuWindowController {

	@FXML private Pane titlePane;
    @FXML private ImageView btnMinimize, btnClose;
    @FXML private Label lblResult;
    @FXML private Button Calcbtn,Insbtn,Currenbtn,Agebtn,BMIbtn,Discountbtn;
    
    

    private double x, y;
    private double num1 = 0;
 

    public void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX()-x);
            stage.setY(mouseEvent.getScreenY()-y);
        });

        btnClose.setOnMouseClicked(mouseEvent -> stage.close());
        btnMinimize.setOnMouseClicked(mouseEvent -> stage.setIconified(true));
    }
	
	
    
    
    
    @FXML
    void onCalcClicked(MouseEvent event) throws IOException {
    
    	System.out.println("Calculator Button");
    	 
    	Stage stage1 = (Stage) Calcbtn.getScene().getWindow();
	    // do what you have to do
	    stage1.close();
    	
    	
    	 FXMLLoader fxmlLoader = new FXMLLoader();
         fxmlLoader.setLocation(getClass().getResource("MainWindowInterface.fxml"));
      
         Scene scene = new Scene(fxmlLoader.load());
         Stage stage2 = new Stage();
         stage2.setTitle("Calculator");
         stage2.setScene(scene);
         stage2.show();
    	
        
    }
    
    
    @FXML
    void onBMIClicked(MouseEvent event) throws IOException {
    
    	System.out.println("BMI Button");
   	 
    	Stage stage1 = (Stage) Calcbtn.getScene().getWindow();
	    // do what you have to do
	    stage1.close();
    	
    	
    	 FXMLLoader fxmlLoader = new FXMLLoader();
         fxmlLoader.setLocation(getClass().getResource("BMIWindowInterface.fxml"));
      
         Scene scene = new Scene(fxmlLoader.load());
         Stage stage3 = new Stage();
         stage3.setTitle("BMI");
         stage3.setScene(scene);
         stage3.show();
    	
        
    }
    @FXML
    void onINVSTClicked(MouseEvent event) throws IOException {
    
    	System.out.println("Investment Button");
   	 
    	Stage stage1 = (Stage) Calcbtn.getScene().getWindow();
	    // do what you have to do
	    stage1.close();
    	
    	
    	 FXMLLoader fxmlLoader = new FXMLLoader();
         fxmlLoader.setLocation(getClass().getResource("InvestmentWindowInterface.fxml"));
        
         Scene scene = new Scene(fxmlLoader.load());
         Stage stage4 = new Stage();
         stage4.setTitle("INV");
         stage4.setScene(scene);
         stage4.show();
    	
        
    }
    
    @FXML
    void onAGEClicked(MouseEvent event) throws IOException {
    
    	System.out.println("Age Button");
   	 
    	Stage stage1 = (Stage) Calcbtn.getScene().getWindow();
	    // do what you have to do
	    stage1.close();
  
	    FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("AgeWindowInterface.fxml"));
       
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage5 = new Stage();
        stage5.setTitle("AGE");
        stage5.setScene(scene);
        stage5.show();
   	
        
    }
    
    
    @FXML
    void onDiscClicked(MouseEvent event) throws IOException {
    
    	System.out.println("Discount Button");
   	 
    	Stage stage1 = (Stage) Calcbtn.getScene().getWindow();
	    // do what you have to do
	    stage1.close();
  
	    FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("DiscountWindowInterface.fxml"));
       
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage6 = new Stage();
        stage6.setTitle("Discount");
        stage6.setScene(scene);
        stage6.show();
   	
        
    }
    
    @FXML
    void onCurrencyClicked(MouseEvent event) throws IOException {
    
    	System.out.println("Currency Button");
   	 
    	Stage stage1 = (Stage) Calcbtn.getScene().getWindow();
	    // do what you have to do
	    stage1.close();
  
	    FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("CurrencyWindowInterface.fxml"));
       
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage7 = new Stage();
        stage7.setTitle("Currency");
        stage7.setScene(scene);
        stage7.show();
   	
        
    }
	
	
}
