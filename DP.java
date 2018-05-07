/*
 * Code by: William Colachicco
 * This is the DP class of the StudentArray program.
 * This Java program takes input of the first and last name of students, as well as ID numbers.
 * It stores the info in an array.
 * There is a button to store the student info.
 * There is a button to display all stored info.
 * There is a button to clear display (does not clear array).
 * There is a field to search by ID.
 * 
 */

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DP 
{
	ArrayList <Student> list; 
	String buffer;
	
	Button storeButton;
	Button allButton;
	Button clearButton;
	Button searchButton;
	
	TextField FirstName;
	TextField LastName;
	TextField Id;
	TextField SearchId;
	
	TextArea txtArea;
	
	HBox dpTxtHBox;
	HBox dpBtnHBox;
	VBox dpTxtVBox;
	VBox dpVBox;
	HBox idSearchHBox;
	
	public DP()
	{
		list = new ArrayList<Student>();
		
		// Create TextFields
		FirstName = new TextField();
		LastName = new TextField();
		Id = new TextField();
		SearchId = new TextField();
		FirstName.setText("First Name");
		LastName.setText("Last Name");
		Id.setText("ID");
		SearchId.setText("Search by ID");
		
		// Add the TextFields to the dpTxtVBox
		dpTxtVBox = new VBox();
		dpTxtVBox.setPadding(new Insets(10,10,10,10));
		dpTxtVBox.setSpacing(5);
	    dpTxtVBox.getChildren().addAll(FirstName, LastName, Id);
		
		// Create TextArea
		txtArea = new TextArea();
		txtArea.setPrefSize(350, 80);
		txtArea.setTranslateY(10);
		 
	    // Create the dpTxtHBox
		dpTxtHBox = new HBox();
		dpTxtHBox.setPadding(new Insets(10,10,10,10));
		dpTxtHBox.setSpacing(5);
	    dpTxtHBox.getChildren().addAll(dpTxtVBox, txtArea);

	    // Create Buttons
	    storeButton = new Button("Store Data");
	    storeButton.setTranslateX(10);
		storeButton.setOnAction((ActionEvent e) -> {
			StoreData();				
		 });

		 allButton = new Button("Display All");
		 allButton.setTranslateX(10);
		 allButton.setOnAction((ActionEvent e) -> {
				AllData();				
		 });
			 
		// Clear Button
		    clearButton = new Button("Clear Display");
		    clearButton.setTranslateX(10);
		    clearButton.setOnAction((ActionEvent e) -> {
		    	ClearData();
		    });
		    
		 // Search Button
		    searchButton = new Button("Search by ID");
		    searchButton.setTranslateX(10);
		    searchButton.setOnAction((ActionEvent e) -> {
		    	SearchById();
		    });
		
			
		 // Create the dpBtnHBox
		dpBtnHBox = new HBox();
		dpBtnHBox.setPadding(new Insets(10,10,10,10));
		dpBtnHBox.setSpacing(5);
	    dpBtnHBox.getChildren().addAll(storeButton, allButton, clearButton);
	    
	    // Create new HBox for the ID Search
	    idSearchHBox = new HBox();
	    idSearchHBox.setPadding(new Insets(10,10,10,10));
	    idSearchHBox.setSpacing(5);
	    idSearchHBox.getChildren().addAll(searchButton, SearchId);

	    // Create the dpVBox
		dpVBox = new VBox();
		dpVBox.setMaxWidth(700);
		dpVBox.setPadding(new Insets(10,10,10,10));
		dpVBox.setSpacing(5);
	    dpVBox.getChildren().addAll(dpTxtHBox, dpBtnHBox, idSearchHBox);
	    
		
	} // End Constructor
		 
	
	public void StoreData()
	{
		list.add( new Student(FirstName.getText(), LastName.getText(),  Integer.parseInt( Id.getText()) ));		
		buffer = "";
		for (int i = 0; i < list.size(); i++)
		{
			buffer += list.get(i).FirstName + " " + list.get(i).LastName + " " + list.get(i).Id + "\n";
			txtArea.setText(buffer);
		}
	}
	 
	public void AllData()
	{
		buffer = "";
		txtArea.setText("");
		for (int i = 0; i < list.size(); i++)
		{
			buffer += list.get(i).FirstName + " " + list.get(i).LastName + " " + list.get(i).Id + "\n";
		}
		txtArea.setText(buffer);
	}
	
	public void ClearData() {
		txtArea.setText("");
	}
	
	public void SearchById() {
		
		Integer searchField = 0;
		
		searchField = Integer.parseInt( SearchId.getText() );
		
		buffer = "";
		txtArea.setText("");
		
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).Id == searchField) {
				buffer += list.get(i).FirstName + " " + list.get(i).LastName + " " + list.get(i).Id + "\n";
			}
		}
		txtArea.setText(buffer);
	}
}
