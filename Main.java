package intro;

public class Main {

	public static void main(String[] args) {
	System.out.println("Hello World!");
	
	//değişken isimlendirilmeleri java'da camelCase yazılır.
	
	String ortaMetin = "İlginizi Çekebilir";
	
	
	System.out.println(ortaMetin);
	
	//integer
	
	double dolarDun=18.15;
	double dolarBugun= 18.15;
	

	String okYonu;
	 okYonu = "down.svg";
	if (dolarBugun<dolarDun) {
		System.out.println(okYonu);
		
	} else if(dolarBugun>dolarDun) {
		 okYonu = "up.svg";
		System.out.println(okYonu);
		

	}
	else {
		System.out.println("equel.svg");
	}
	//array
	String[] krediler = {"hızlı", "emekli", "mutlu"};
	
	
	for (int i = 0; i < krediler.length; i++)
	{
		System.out.println(krediler[i]);
		
	}
	
	
	
	
	
	
	
	
	
	
	

	}

}


