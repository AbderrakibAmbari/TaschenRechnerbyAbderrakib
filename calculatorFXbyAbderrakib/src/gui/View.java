package gui;

import java.awt.Color;

import business.Model;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class View {
	private Pane pane =new Pane();
	//button
	 Button zero=new Button("0");
	 Button one=new Button("1");
	 Button two=new Button("2");
	 Button tree=new Button("3");
	 Button four=new Button("4");
	 Button five=new Button("5");
	 Button six=new Button("6");
	 Button seven=new Button("7");
	 Button eight=new Button("8");
	 Button nine=new Button("9");
	 Button plus=new Button("+");
	 Button minus=new Button("-");
	 Button multiplication=new Button("x");
	 Button equal =new Button("=");
	//private TextArea abgabe=new TextArea();
	//private TextField abgabe = new TextField();
	 Label allAbgabe=new Label("");
	 Label eingabe = new Label("");
	
	
	
	private Control control;
	private Model model;
	
	public View(Stage primaryStage, Control control,Model model) {
		Scene scene= new Scene(this.pane,500,480);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TaschenRechner by Abderrakib");
		primaryStage.show();
		this.control=control;
		this.model=model;
		this.initialisiereKompo();
		this.buttoneingabe(zero);
		this.buttoneingabe(one);
		this.buttoneingabe(two);
		
		this.buttoneingabe(tree);
		this.buttoneingabe(four);
		this.buttoneingabe(five);
		this.buttoneingabe(six);
		this.buttoneingabe(seven);
		this.buttoneingabe(eight);
		this.buttoneingabe(nine);
		this.buttoneingabe(plus);
		this.buttoneingabe(minus);
		this.buttoneingabe(multiplication);
	}

	

	private void initialisiereKompo() {
		zero.setLayoutX(140);
		zero.setLayoutY(390);
		zero.setMinSize(70,70);
		
		one.setLayoutX(20);
		one.setLayoutY(300);
		one.setMinSize(70,70);
		
		two.setLayoutX(140);
		two.setLayoutY(300);
		two.setMinSize(70,70);
		
		tree.setLayoutX(260);
		tree.setLayoutY(300);
		tree.setMinSize(70,70);
		
		four.setLayoutX(20);
		four.setLayoutY(210);
		four.setMinSize(70,70);
		
		five.setLayoutX(140);
		five.setLayoutY(210);
		five.setMinSize(70,70);
		
		six.setLayoutX(260);
		six.setLayoutY(210);
		six.setMinSize(70,70);
		
		seven.setLayoutX(20);
		seven.setLayoutY(120);
		seven.setMinSize(70,70);
		
		eight.setLayoutX(140);
		eight.setLayoutY(120);
		eight.setMinSize(70,70);
		
		nine.setLayoutX(260);
		nine.setLayoutY(120);
		nine.setMinSize(70,70);
		
		plus.setLayoutX(380);
		plus.setLayoutY(120);
		plus.setMinSize(70,70);
		
		minus.setLayoutX(380);
		minus.setLayoutY(210);
		minus.setMinSize(70,70);
		
		multiplication.setLayoutX(20);
		multiplication.setLayoutY(390);
		multiplication.setMinSize(70,70);
		
		equal.setLayoutX(380);
		equal.setLayoutY(300);
		equal.setMinSize(70,160);
		
		pane.getChildren().addAll(zero,one,two,tree,four,five,six,seven,eight,nine,plus,minus,multiplication,equal);
		
		eingabe.setLayoutX(20);
		eingabe.setLayoutY(40);
		eingabe.setMaxSize(430,90);
		
		
		allAbgabe.setLayoutX(20);
		allAbgabe.setLayoutY(10);
		allAbgabe.setMaxSize(430,90);
		pane.getChildren().addAll(eingabe,allAbgabe);
	
	}
	private void buttoneingabe(Button button) {
		button.setOnAction(e-> schreibe( button));
		
	}

	void schreibe(Button button) {
		this.control.schreibe(button);
		
	}




	
}
