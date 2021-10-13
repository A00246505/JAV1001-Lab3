/*
	Name - Anmol Singh
	Student Number - A00246505
	This Program creates Die objects from Die class and tests its methods
*/

public class DiceGame{ //DiceGame Class
	public static void main(String[] args){ //main method
		int numSides; //defining variable
		String type; //defining variable
		
		System.out.println("Creating Default d6 die....");
		Die die_1 = new Die(); //creates default die
		
		numSides = 8;
		System.out.println("Creating d" + numSides + " die....");
		Die die_2 = new Die(numSides); //creates die with defined no. of sides
		
		numSides = 15;
		type = "Pikachu"; //My Own Type of Die
		System.out.println("Creating " + type + " die....");
		Die die_3 = new Die(numSides, type); //creates die with defined no. of sides and type
		
		System.out.println(die_1.getType() + " reads : " + die_1.getValue()); //getType and getValue gets Type and currentSideUp of the Die respectively
		System.out.println(die_2.getType() + " reads : " + die_2.getValue()); //getType and getValue gets Type and currentSideUp of the Die respectively
		System.out.println(die_3.getType() + " reads : " + die_3.getValue()); //getType and getValue gets Type and currentSideUp of the Die respectively
		
		System.out.println("Testing Roll Method........");
		
		die_1.Roll(); //Rolling die_1 to get a new value
		die_2.Roll(); //Rolling die_2 to get a new value
		die_3.Roll(); //Rolling die_3 to get a new value
		
		System.out.println(die_1.getType() + " reads : " + die_1.getValue()); //getType and getValue gets Type and currentSideUp of the Die respectively
		System.out.println(die_2.getType() + " reads : " + die_2.getValue()); //getType and getValue gets Type and currentSideUp of the Die respectively
		System.out.println(die_3.getType() + " reads : " + die_3.getValue()); //getType and getValue gets Type and currentSideUp of the Die respectively
		
		System.out.println("");
		///////////
		
		System.out.println("Cheating and setting d8 to 8....");
		int maxSide = 8; //defining int variable as setCurrentSide method accepts int argument
		die_2.setCurrentSide(maxSide);
		System.out.println(die_2.getType() + " is set to " + die_2.getValue()); //getType and getValue gets Type and currentSideUp of the Die respectively
		
		System.out.println("");
		///////////
		/* BONUS */
		System.out.println("-----");
		System.out.println("BONUS");
		System.out.println("-----");
		System.out.println("");

		System.out.println("Creating 5 d6....");
		Die[] Die_Array = new Die[5]; //Creating Die Array which will have 5 Die objects
		for(int i = 0; i < 5 ; i++){
			Die_Array[i] = new Die(); //defining all Die objects as a default Die(Type "d6" with 6 sides)
		}
		
		boolean Yahtzee = false; //boolean variable to end the while loop with 
		int count = 0; //int variable to keep count of number of tries
		
		System.out.println("Lets Rolllll.....");
		do{ //rolls all Die objects of the Array and computes them for 5 of a kind case
			for(int i = 0; i < 5 ; i++){
				Die_Array[i].Roll();
			}
			
			/*
			Computes currentSideUp value of each Die object in the array,
			if the current objects value equals the next objects value then compute further until the last object
			and make Yahtzee variable true if all the values match
			else increase the counter
			*/
			if(Die_Array[0].getValue() == Die_Array[1].getValue()){
				if(Die_Array[1].getValue() == Die_Array[2].getValue()){
					if(Die_Array[2].getValue() == Die_Array[3].getValue()){
						if(Die_Array[3].getValue() == Die_Array[4].getValue()){
							Yahtzee = true;
						}else{
							count++;
						}
					}else{
						count++;
					}
				}else{
					count++;
				}
			}else{
				count++;
			}
		}while(!Yahtzee); //Exits the loop of Yahtzee is true
		
		System.out.println("YAHTZEE!! It took " + count + " tries");
	}
}