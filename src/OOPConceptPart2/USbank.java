package OOPConceptPart2;

public interface USbank {
	
	int min_bal =100;
	public void credit();
	public void debit();
	public void transfermethod();
	// Only Method declaration 
	//No Method body - only method prototype
	//in interface we can declare the variables and variables are by default static in nature.
	//Can not change the value of variable
	//No static method in interface - beacause interfaces are part of Object oriented programming concept, part of objects, objects can not have Static methods
	//No Main Method in Interface
	//Abstract in nature - can not create the object of interface.
	
}
