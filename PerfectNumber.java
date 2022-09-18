package intro;

public class PerfectNumber {

	public static void main(String[] args) {
		int number =14;  
		int toplam = 0;
			
			for (int i = 1 ; i<number; i++  ) {
				if (number%i==0) {
					toplam= toplam + i;
					
				}
			}
			if(toplam == number) {
				
				System.out.println(" Sayısı Mükemmel Bir Sayıdır.");
			}
			else {
				
				System.out.println(" Sayısı Mükemmel Bir Sayı Değildir.");
			}
			
	}

}
