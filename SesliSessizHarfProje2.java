package intro;

public class SesliSessizHarfProje2 {

	public static void main(String[] args) {
	String harf = "i";
	
	switch (harf) {
	case "a":
	case "ı":
	case "u":
	case "o":
		System.out.println("Kalın sesli harf girdiniz.");
		break;
	case "e":
	case"i": 
	case "ü":
	case "ö":
		System.out.println("İnce sesli harf girdiniz.");
		break;
		default: 
			System.out.println("Sesli harf girmediniz.");
	
	}
	}
}
