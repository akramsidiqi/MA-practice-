package abstraction;

public class Cat extends Animal {

	@Override
	public void move() {
		
		System.out.println(" cat runs with feet");

	}

	@Override
	public void eat() {
		
System.out.println( "cat eats meat");
	}

	@Override
	public void hund() {
		System.out.println("cat hunts mice");

	}

}
