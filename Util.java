package prak2;

//enum können wir nicht direkt wiedergeben, Konvertierung in String notwendig
public class Util {


	public static String convertWarenartToString(Warenart warenart) {
		return switch(warenart) {

		//der Pfeil deutet auf den im Speicher hinterlegten Ort für BIER
		case BIER -> {
			yield "Bier";
		}
		case WEIN -> {
			yield "Wein";
		}
		case KORN -> {
			yield "Korn";
		}
		case GLAS -> {
			yield "Glas";
		}
		case TUCH -> {
			yield "Tuch";
		}
		case GOLD -> {
			yield "Gold";		
		}
		case ROTWEIN -> {
			yield "Rotwein";
		}
		case ROSÈ -> {
			yield "Rosè";
		}
		case WEISSWEIN -> {
			yield "Weißwein";
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + warenart);	
		};

	}


}