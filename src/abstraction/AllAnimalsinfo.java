package abstraction;

public class AllAnimalsinfo {

	public static void main(String[] args) {
		
		// this is object of fish class with a reference name of animal class 
     Animal fishes = new Fish();
     
     fishes.move();
     fishes.eat();
     fishes.hund();
     fishes.animalsInfo();
     
     System.out.println("========================\n");
     
     // this is object of cat class with a reference name of animal class 
     
     Animal cats = new Cat ();
     
     cats.move();
     cats.eat();
     cats.hund();
     cats.animalsInfo();
     
     System.out.println("========================\n");
     
     // this is object of eagle class with a reference name of Animal 
     
     Animal eagles = new Eagle ();
     
     eagles.move();
     eagles.eat();
     eagles.hund();
     eagles.animalsInfo();
		
	}

}
