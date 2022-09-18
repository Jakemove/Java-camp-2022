package intro;

public class Swich {

	public static void main(String[] args) {

		String grade;
		grade = "F";
		switch (grade) {
		case "A":
		System.out.println("Tebrikler geçtiniz");
		break;
		case"B":
			System.out.println("Nayayi yicen knk çalış");
			break;
		case"F":
			System.out.println("Nanayı yedun");
			default:
				System.out.println("Kanka yok öyle bir şey. Düzgün not gir.");
				break;
		}
	}

}
