package OOPsConcepts;

public abstract class Animal {
	
	// abstract methods
	
	abstract void move();
	abstract String eat();
	abstract int NumOflegs();

	
	// this is a concret method
	public void animalData() {
		
		System.out.println("All the animals eat and drink");
	}

}
