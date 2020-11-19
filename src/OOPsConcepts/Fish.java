package OOPsConcepts;

public class Fish extends Animal {

	@Override
	void move() {
	System.out.println("All fishes move by swimming");

	}

	@Override
	String eat() {
		// TODO Auto-generated method stub
		return "sea food";
	}

	@Override
	int NumOflegs() {
		// TODO Auto-generated method stub
		return 0;
	}

}
