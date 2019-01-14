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
 	

public class Address extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Address Form");
			FlowPane flowpane = new FlowPane();
			flowpane.setAlignment(Pos.TOP_CENTER);
			flowpane.setHgap(10);
			flowpane.setVgap(10);
			flowpane.setPadding(new Insets(25,25,25,25));
			Scene scene=new Scene(flowpane,650,200);
			  scene.getStylesheets().add(
		        		getClass().getResource("Address.css").toExternalForm());
		stage.setScene(scene);
		

		FlowPane innerflowpane1 = new FlowPane();
		innerflowpane1.setAlignment(Pos.CENTER);
		Label lblName = new Label("Name");
		Label lblStreet = new Label("Street");
		Label lblCity= new Label("City");
		TextField txtName = new TextField();
		TextField txtStreet= new TextField();
		TextField txtCity = new TextField();
		HBox  hb1 = new HBox(10); // spacing
		hb1.setAlignment(Pos.TOP_CENTER);
	
		VBox  vb1 = new VBox(0);
			vb1.getChildren().add(lblName);
			vb1.getChildren().add(txtName);
		VBox  vb2 = new VBox(0);
			vb2.getChildren().add(lblStreet);
			vb2.getChildren().add(txtStreet);
		VBox  vb3 = new VBox(0);
			vb3.getChildren().add(lblCity);
			vb3.getChildren().add(txtCity);
		hb1.getChildren().add(vb1);
		hb1.getChildren().add(vb2);
		hb1.getChildren().add(vb3);
		innerflowpane1.getChildren().add(hb1);
		
		
		
		
		
		FlowPane innerflowpane2 = new FlowPane();
		innerflowpane2.setAlignment(Pos.CENTER);
		Label lblState = new Label("State");
		Label lblZip = new Label("Zip");
		TextField txtState = new TextField();
		TextField txtZip = new TextField();
		HBox  hb2 = new HBox(10); // spacing
		hb2.setAlignment(Pos.TOP_CENTER);
		
		
		
		VBox  vb1_2 = new VBox(0);
		vb1_2.getChildren().add(lblState);
		vb1_2.getChildren().add(txtState);
		
		VBox  vb2_2 = new VBox(0);
		vb2_2.getChildren().add(lblZip);
		vb2_2.getChildren().add(txtZip);
		
		
		hb2.getChildren().add(vb1_2);
		hb2.getChildren().add(vb2_2);
		
		innerflowpane2.getChildren().add(hb2);
		
		
		
		
		FlowPane innerflowpane3 = new FlowPane();
		innerflowpane3.setId("innerflowpane3");
		innerflowpane3.setAlignment(Pos.BOTTOM_CENTER);
		innerflowpane3.setPrefHeight(50);
		innerflowpane3.getStyleClass().add("innerflowpane3");
		Button btnSubmit = new Button("Submit");
		btnSubmit.setOnAction(new EventHandler()
				{

					@Override
					public void handle(Event arg0) {
						// TODO Auto-generated method stub
						System.out.println(txtName.getText());
						System.out.println(txtStreet.getText());
						System.out.println(txtCity.getText() + ", " + txtState.getText() + " " + txtZip.getText());
					}
			
				});
		btnSubmit.setPrefSize(100, 20);
		btnSubmit.setId("btnSubmit");
		
		
		innerflowpane3.getChildren().add(btnSubmit);
		
		//add 
		flowpane.getChildren().add(innerflowpane1);
        flowpane.getChildren().add(innerflowpane2);
        flowpane.getChildren().add(innerflowpane3);


      

		stage.show();
	}

}
