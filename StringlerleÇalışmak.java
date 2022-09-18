package intro;

public class StringlerleÇalışmak {

	public static void main(String[] args) {
	String mesaj ="Güzel kız";
	
	System.out.println(mesaj);
	System.out.println("Eleman sayısı: "+ mesaj.length());
	System.out.println(mesaj.concat(". Adı Merve"));
	System.out.println("5.Elemanı: "+mesaj.charAt(4));
	System.out.println(mesaj.startsWith("G"));
	System.out.println(mesaj.endsWith("z"));
	
	char[] tutulan = new char[7];
	mesaj.getChars(0, 7, tutulan, 0);
	System.out.println(tutulan);
	System.out.println(mesaj.indexOf("k"));
	System.out.println(mesaj.lastIndexOf("G"));
	////////////
	String yeni= mesaj.replace("G","g");
	System.out.println(yeni);
	System.out.println(yeni.substring(3));
	System.out.println(yeni.substring(7,9));
	
	for(String kelime : yeni.split("ü")) {
		System.out.println(kelime);
	}
	System.out.println(mesaj.toLowerCase());
	System.out.println(mesaj.toUpperCase());
	System.out.println(yeni.trim());
	//Stringinin başındaki ve sonundaki boşlukları siler süpürür.
	}

}
