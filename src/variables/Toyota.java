package variables;

public class Toyota {
	
	
	String name;
	int year;
	String color;
	String model;
	
	// constructor: is a block of code which initialize newly created object
	
	// how to create constructor 
	// we create constructor from name of our class with a parenthese and curly braces 
	
	Toyota (String carName, int carYear, String carColor, String carModel){
		
		name = carName;
		year = carYear;
		color = carColor;
		model = carModel;
		
	}
	
	int speed () {
		return 100;
	}
	
	
	
	
	

	public static void main(String[] args) {

		Toyota myCar = new Toyota("Camery", 2020, "white", "CLE");
		
		System.out.println(myCar.name);
		System.out.println(myCar.year);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
	}
	

}
