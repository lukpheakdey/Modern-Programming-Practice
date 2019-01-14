package JavaFx_Form;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.paint.*;

public class stringUtility extends Application {

	public stringUtility() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}
	
    static String removeDuplicates(String input){
    
    	if (input.length() ==1){
    		return input;
    	}
    	else if( input.substring(1).contains(input.substring(0,1))){
    		return removeDuplicates(input.substring(1));
    	}
    	else{
    		return input.substring(0,1) + removeDuplicates(input.substring(1));
    	}
    }
    
    
    
    static int countLetters(String input){
    	if (input.isEmpty()){
    		return 0;
    	}
    	else{
    		return 1 +  countLetters(input.substring(0, input.length()-1));
    	}
    }
    
    static String reverse(String input){
    	if (input.isEmpty()){
    		return "";
    	}
    	else{
    		return input.substring(input.length()-1) +  reverse(input.substring(0, input.length()-1));
    	}
    }


	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		stage.setTitle("String Utility");
			GridPane gridpane = new GridPane();
			gridpane.setAlignment(Pos.TOP_CENTER);
			gridpane.setHgap(50);
			gridpane.setVgap(10);
			gridpane.setPadding(new Insets(25, 25, 25, 25) );
		Scene scene = new Scene(gridpane, 500,200);
		stage.setScene(scene);
		
		
		HBox hbox= new HBox(10);
		hbox.setAlignment(Pos.CENTER);
		
		TextField txtInput = new TextField();
		TextField txtOutput = new TextField();
		
		
		VBox vb1=  new VBox(15);
		 Button btnCountText = new Button("Count Letters");
		 btnCountText.setOnAction(new EventHandler(){
			@Override
			public void handle(Event arg0) {
				// TODO Auto-generated method stub
				txtOutput.setText(String.valueOf(countLetters(txtInput.getText())));
			}
		 }
		 );
		 
		 btnCountText.setPrefSize( 150, 25);
		 Button btnReverse = new Button("Reverse Letters");
		 btnReverse.setOnAction(new EventHandler(){
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				txtOutput.setText(String.valueOf(reverse(txtInput.getText())));
			}
		 });
		 
		 btnReverse.setPrefSize( 150, 25);
		 Button btnRemoveDuplicte = new Button("Remove Duplicates");
		 btnRemoveDuplicte.setOnAction(new EventHandler(){
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				txtOutput.setText(String.valueOf(removeDuplicates(txtInput.getText())));
			}}
		 );
		 
		btnRemoveDuplicte.setPrefSize( 150, 25);
		vb1.getChildren().add(btnCountText);
		vb1.getChildren().add(btnReverse);
		vb1.getChildren().add(btnRemoveDuplicte);
		
		VBox vb2=  new VBox(10);
		vb2.setAlignment(Pos.CENTER);
		
		VBox inner_vb2_1=  new VBox(0);
		Label lblInput = new Label("Input:");

		lblInput.setFont(new Font("Calibri", 12)); 
		
        txtInput.setPrefSize( 200, 18);
        
        inner_vb2_1.getChildren().add(lblInput);
        inner_vb2_1.getChildren().add(txtInput);
        
        
        VBox inner_vb2_2=  new VBox(0);
		Label lblOutput = new Label("Output:");
		
		lblOutput.setFont(new Font("Calibri", 12)); 
		
        txtOutput.setPrefSize( 200, 18);
        
        inner_vb2_2.getChildren().add(lblOutput);
        inner_vb2_2.getChildren().add(txtOutput);
		
        vb2.getChildren().add(inner_vb2_1);
        vb2.getChildren().add(inner_vb2_2);
		
		
		hbox.getChildren().add(vb1);
		hbox.getChildren().add(vb2);
		
		gridpane.getChildren().add(hbox);
		
		stage.show();
	}
}
