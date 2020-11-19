package abstraction;


// this is an abstract class and abstract class is always used with a "abstract" keyword

public abstract class Animal {
	
	// these are abstract methods, they are created with keyword abstract and without body 
	//look at the below example
	
	// why abstract methods don't have body?
	//because they are implemented in other classes and the body will be used according to the need of the 
	// the implementing class 
	
	public abstract void move ();
	public abstract void eat ();
	public abstract void hund();
	
	public void animalsInfo() {
		System.out.println("All animals have eye");
	}
	
	

}
