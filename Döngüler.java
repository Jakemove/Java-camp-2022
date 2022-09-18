package intro;

public class Döngüler {

	public static void main(String[] args) {
	
		//For
		for (int i = 1; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti kanka");
		int i = 1;
		//While
		while(i<10) {
			System.out.println(i);
			i=i+2;
		}		
//Do-While
	int j =5;
		do {
		System.out.println(j);
        j=j+2;	
		}while(j<22);
	    System.out.println("Do-While döngüsü bitti kanka");
	}

}
