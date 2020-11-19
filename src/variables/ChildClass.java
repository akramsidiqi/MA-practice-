package variables;

public class ChildClass extends ParentClass{
	
	void m1 (){
		System.out.println("In child class m1");
	}
   
	void m2() {
		System.out.println("In m2");
		
	}
	
	public static void main(String[] args) {
		ParentClass obj = new ChildClass();
		
		obj.m1();
		
		
		
	}
}
