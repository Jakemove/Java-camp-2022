package intro;

public class Conditions {

	public static void main(String[] args) {
		int sayi1,sayi2,sayi3;
		sayi1 =6;
		sayi2= 9;
		sayi3=-5;
		int enBuyuk = sayi1;
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		} if(enBuyuk<sayi3) {
            enBuyuk= sayi3;
		}
		System.out.println("En büyük sayı: "+enBuyuk);
		
	}

}
