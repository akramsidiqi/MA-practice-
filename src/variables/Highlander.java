package variables;




public class Highlander {
	
	// these are the blue prints variables 
	String name;
	int year;
	int price;
	String model;
	String doors;
	String make;
	String color;
	 int speed = 250;
	
	// to asign valur to our variables we create constrcutor 
	
	// what is constructor ?
	
	// constructor is a block of code to initialize the new created object
	// how to create a constructor?
	// the constructor is created from the name of the class 
	
	public Highlander(String carName, int carYear, int carPrice, String carModel, String cardoor, String carMake,
			String carColor) {
		
		name = carName;
		year = carYear;
		price = carPrice;
		model = carModel;
		doors = carModel;
		make = carMake;
		color = carColor;
		
		
	}
	
	public int speed() {
		return speed;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Highlander myNewCar = new Highlander("Highlander 202", 2020, 40, "XLE", "4 doors", "Toyota", "White");
		
		System.out.println(myNewCar.name);
		System.out.println(myNewCar.year);
		System.out.println(myNewCar.price);
		System.out.println(myNewCar.model);
		System.out.println(myNewCar.doors);
		System.out.println(myNewCar.make);
		System.out.println(myNewCar.color);
		System.out.println(myNewCar.speed());
		
		
		
		
		
		
		
		
		
		
		
	}

}
