package variables;

public class Practice {

	public static void main(String[] args) {
		
	int [] name = {1,2,3,4,5,6};
	String [] nouns = {"Ah", "Mah", "Kal", "Maq"};
	
	nouns [2] = "Mannnn!";
	
	System.out.println(nouns.length);
	
	for (String j: nouns) {
		System.out.println(j);
	}
	
//	for (int j = 0; j <nouns.length; j++) {
//		
//		System.out.print(nouns[j] );
//	}
//	
//	
	
	for (int i = 0; i < name.length; i++) {
		
		
		System.out.println(name[i]);
	}
	}

}
