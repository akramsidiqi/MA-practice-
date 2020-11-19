package OOPsConcepts;

public class Lion extends Animal implements AllNewAnimals {

	@Override
	void move() {
		System.out.println("All lions move by their feet");

	}

	@Override
	String eat() {
		
		return "Lions eat meat";
	}

	@Override
	int NumOflegs() {
		
		return 4;
	}

	@Override
	public String livingArea() {
		// TODO Auto-generated method stub
		return "Living in Jungels";
	}

	@Override
	public String spiecies() {
		// TODO Auto-generated method stub
		return "All white lions are in danger of destruction";
	}

}
