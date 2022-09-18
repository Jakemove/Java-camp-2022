package intro;

public class DizilerRecap {

	public static void main(String[] args) {
    
		
		double[] sayilar = {1.6, 8.5, 97.34, 24.123};
		double toplam = 0; 
		double max = sayilar[0];
		for (int i= 0; i<4; i++) {
			System.out.println(sayilar[i]);
	        toplam= toplam + sayilar[i]	;
		    if (max<sayilar[i]) {
		    	max=sayilar[i];
		    }
		
		}
        System.out.println("Toplam: "+toplam);
        System.out.println("En Büyük sayı: "+max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
