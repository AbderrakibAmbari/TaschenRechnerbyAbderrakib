package gui;

import business.Model;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class View {
	private Pane pane =new Pane();
	
	private Control control;
	private Model model;
	
	public View(Stage primaryStage, Control control,Model model) {
		Scene scene= new Scene(this.pane,700,480);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TaschenRechner by Abderrakib");
		primaryStage.show();
		this.control=control;
		this.model=model;
		
	}
}
