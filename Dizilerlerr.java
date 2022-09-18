package intro;

public class Dizilerlerr {

	public static void main(String[] args) {
		
		String[] ogrenci = new String[4];
		ogrenci[0]="Ali";
		ogrenci[1]="Mehmet";
	    ogrenci[2]="Recep";
		ogrenci[3]="Halil";
		for(int i = 0; i<4; i++ ) {
			System.out.println(ogrenci[i]);
		}
		System.out.println("---------------------------");
		for(int i = 0; i <ogrenci.length; i++) {
			System.out.println(ogrenci[i]);
		}
		for(String ogr: ogrenci) {
			System.out.println(ogr);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
