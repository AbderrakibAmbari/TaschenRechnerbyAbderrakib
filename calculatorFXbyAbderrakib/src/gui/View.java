package gui;

import business.Model;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class View {
	private Pane pane =new Pane();
	//button
	private Button one=new Button("1");
	private Button two=new Button("2");
	private Button tree=new Button("3");
	private Button four=new Button("4");
	private Button five=new Button("5");
	private Button six=new Button("6");
	private Button seven=new Button("7");
	private Button eight=new Button("8");
	private Button nine=new Button("9");
	private Button plus=new Button("+");
	private Button minus=new Button("-");
	private Button multiplication=new Button("x");
	
	
	
	private Control control;
	private Model model;
	
	public View(Stage primaryStage, Control control,Model model) {
		Scene scene= new Scene(this.pane,700,480);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TaschenRechner by Abderrakib");
		primaryStage.show();
		this.control=control;
		this.model=model;
		this.initialisiereKompo();
	}

	private void initialisiereKompo() {
		one.setLayoutX(20);
		one.setLayoutY(300);
		one.setMaxWidth(100);
		one.setMaxHeight(200);
		two.setLayoutX(0);
		two.setLayoutY(0);
		tree.setLayoutX(0);
		tree.setLayoutY(0);
		four.setLayoutX(20);
		four.setLayoutY(210);
		four.setMaxSize(80, 80);
		five.setLayoutX(0);
		five.setLayoutY(0);
		six.setLayoutX(0);
		six.setLayoutY(0);
		seven.setLayoutX(20);
		seven.setLayoutY(120);
		seven.setMaxSize(80, 80);
		eight.setLayoutX(0);
		eight.setLayoutY(0);
		nine.setLayoutX(0);
		nine.setLayoutY(0);
		plus.setLayoutX(0);
		plus.setLayoutY(0);
		minus.setLayoutX(0);
		minus.setLayoutY(0);
		multiplication.setLayoutX(20);
		multiplication.setLayoutY(390);
		multiplication.setMaxSize(80, 80);
		
		pane.getChildren().addAll(one,four,seven,multiplication);
		
	}
}
