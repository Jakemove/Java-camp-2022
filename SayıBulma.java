package intro;

public class SayıBulma {

	public static void main(String[] args) {
	int[] sayilar = {5, 11, 16, 21, 4, 9};
    boolean buldukMu = false;
	int aranan = 9;
	for (int sayi: sayilar) {
		if(sayi==aranan) {
			buldukMu = true;
		}
	}
		if (buldukMu==true) {
			System.out.println("Sayı bulundu. Bulunan sayı: "+ aranan);
		}
		else {
			System.out.println("Sayı bulunamadı. Bulunamayan sayı: "+ aranan);
		}
	}

}
