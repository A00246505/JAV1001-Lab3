/*
	Name - Anmol Singh
	Student Number - A00246505
	This Progam is written to generate Die Class with 3 different constructors, Roll method is created to generate random value to immitate rolling action.
	Die Class can be used to create Die objects which have its own number of sides and type and can be rolled to get randomly generated value from 1 to number of sides of the Die. 
*/

import java.util.Random; //importing Random Class

public class Die{ //creating Die Class

	//creating global private variables
	private
		String Type;
		int numSides;
		int currentSideUp;
		Random random = new Random();

	public Die(){ //1st Constructor
		Type = "d6"; //default type
		numSides = 6;//default num. of sides
		Roll(); //Generating random currentSideUp Value
	}
	
	public Die(int NumSides){ //2nd Constructor
		Type = "d" + NumSides;//Type is derived from input argument NumSides
		numSides = NumSides; //num. of sides of the Die is set to input argument NumSides
		Roll(); //Generating random currentSideUp Value
	}
	
	public Die(int NumSides, String type){
		Type = type; //Type of the Die is set to input argument type
		numSides = NumSides; //num. of sides of the Die is set to input argument NumSides
		Roll(); //Generating random currentSideUp Value
	}
	
	public void Roll(){ //Roll Method
		currentSideUp = random.nextInt(numSides+1); //generates random value and stores it in currentSideUp variable
		if(currentSideUp == 0){ //if random number generated is zero roll again. Die doesn't have 0 numbered side so value generated cannot be 0
			Roll(); //Generating random currentSideUp Value
		}
	}
	
	public int getValue(){ //getValue Method
		return currentSideUp; //returns currentSideUp of the Die
	}
	
	public String getType(){ //getType Method
		return Type; //returns type of the Die
	}
	
	public void setCurrentSide(int setValue){ //setCurrentSide Method
		currentSideUp = setValue; //sets currentSideUp of the Die
	}
}