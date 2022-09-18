package intro;

public class MiniProjeSayıAsalMı {

	public static void main(String[] args) {
	
		int number =-5;
		boolean isPrima = true;
		
		if ( number < 1 ) {
			isPrima=false;
		}
		
		
		
		if( number == 1 ) {
			isPrima = false;
		}
		
		for (int i=2; i<number; i++) {
			if (number%i==0) {
			isPrima = false;	
			}
		}
        if(isPrima == true ) {
        	System.out.println("Numara asaldır: "+number);
        }
        else {
        	System.out.println("Numara asal değildir: "+number);
        }
	}

}
