package OOPsConcepts;

public class Bird extends Animal implements AllNewAnimals{
	
// we have to implement methods of animal class
	@Override
	void move() {
	
		System.out.println("All birds move mostly by flying");
		
	}

	@Override
	String eat() {
		
		
		return "all birds eat beats";
	}

	@Override
	int NumOflegs() {
		
		return 2;
	}

	@Override
	public String livingArea() {
		// TODO Auto-generated method stub
		return "Fishes mostly are living in oceans";
	}

	@Override
	public String spiecies() {
		// TODO Auto-generated method stub
		return "Some species of fishes don't exist";
	}
	
	
	
	

}
