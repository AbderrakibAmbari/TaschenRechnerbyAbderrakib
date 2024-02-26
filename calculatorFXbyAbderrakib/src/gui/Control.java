package gui;

import business.Model;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Control {
	private View view;
	private Model model;
	int number=0;
	
	public Control(Stage primaryStage) {
		this.view=new View(primaryStage, this, model);
		
	}
	void  schreibe(Button button) {
		String t=this.view.eingabe.getText();
		this.view.eingabe.setText("");
		
		if(button.getText().equals("=")) {
			
		}
		else if(button.getText().equals("+")) {
			number+=Integer.parseInt(t);
			this.view.allAbgabe.setText(""+number);
			
			
		}
		else if(button.getText().equals("-")) {
			
		}
		else if(button.getText().equals("x")) {
			
		}
		else {
			this.view.eingabe.setText(t+button.getText());
			
		
		}
	}
	 
}
