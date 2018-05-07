/*
 * Code by: William Colachicco
 * StudentArray program
 * This Java program takes input of the first and last name of students, as well as ID numbers.
 * It stores the info in an array.
 * There is a button to store the student info.
 * There is a button to display all stored info.
 * There is a button to clear display (does not clear array).
 * There is a field to search by ID.
 * 
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MAIN extends Application 
{

	public static void main(String[] args) 
	{
		dp = new DP();
		 launch(args);   
	}
	
	public static DP dp;
	
	@Override
	    public void start(Stage stage) 
	    {
	        Scene scene = new Scene(new Group());
	         
	        ((Group) scene.getRoot()).getChildren().addAll(dp.dpVBox);

	        //***********************************************************
	        // Prepare the Stage
	        //***********************************************************
	        stage.setScene(scene);
	        stage.setTitle("Transactions");
	        stage.setWidth(700);
	        stage.setHeight(550);
	        stage.show();
	    }
}
