/*
 * Code by: William Colachicco
 * This is the Student class of the StudentArray program.
 * This Java program takes input of the first and last name of students, as well as ID numbers.
 * It stores the info in an array.
 * There is a button to store the student info.
 * There is a button to display all stored info.
 * There is a button to clear display (does not clear array).
 * There is a field to search by ID.
 * 
 */

public class Student 
{
	String FirstName;
	String LastName;
	int Id;
	
	public Student()
	{
	}
	
	public Student(String FirstName, String LastName, int Id)
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Id = Id;
	}
}
