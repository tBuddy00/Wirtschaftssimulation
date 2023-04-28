package prak2;

import java.util.Scanner;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		Arbeitskraft arbeitnehmer1 = new Arbeitskraft("Herr Slave, Dieter", "Konstruktion", 50000, 100999);
		Gebaeude gebaeude1 = new Gebaeude("Dresden", "01037", 4);
		Bueroraum bueroraum = new Bueroraum(310, 3, 10);
		Produktionsauftrag kundenbestellung1 = new Produktionsauftrag("Schmidt GmbH", "Kuchen", 300);
		Fuehrung leitung1 = new Fuehrung("Herr Anfuehrer, Herbert", 100220, "Management");
		//Fuehrung leitung2 = new Fuehrung("Frau Meyer, Caro", 100440, "Management"); // NUR EIN BEISPIEL (falls mehr hinzukommen)
		Abteilung abt1 = new Abteilung("Planung", 12);
		
		Niederlassung ortEinbeck = new Niederlassung("Einbeck", Warenart.BIER, 10);
		Niederlassung ortWien = new Niederlassung("Wien", Warenart.ROSÈ, 15);
		Lager lagerAugsburg = new Lager("Augsburg");
		Lager lagerSalzburg = new Lager("Salzburg");
			
		
		//Begrüßung in das "Spiel"
		System.out.println("Willkommen zur Wirtschaftssimulation\n");
		System.out.println("1: Einbeck");
		System.out.println("2: Wien");
		
//		int wahl = scanner.nextInt(); //definition der Scanner-Variable
//		scanner.nextLine(); // macht den Tastatur-Puffer leer
//			
//		if(wahl == 1) {
//			
//			
//			ortEinbeck.produktionAnfordern();
//			ortEinbeck.produzieren();
//			ortEinbeck.abholen();
//			//EINLAGERN FEHLT 
////			//
////		}else if(wahl == 2) {
////			ortWien.produktionAnfordern();
////			ortWien.produzieren();
////			ortWien.abholen();
////		
//		}else {
//			System.out.println("Ungültig!");
//		}
		
		
		
			
		System.out.println("_______________________________________");
		
		
		
		
		//Hereinlegen von Ware ins Lager -> Bier
		ortEinbeck.produktionAnfordern(); 
		ortEinbeck.produzieren(); //erst produzieren, dann das Ergebnis
		
		//WIEN
		ortWien.produktionAnfordern(); 
		ortWien.produzieren();

		
		//Was macht das?
		int produzierteMengeEinbeck = ortEinbeck.abholen();	
		Warenart produzierteWarenartEinbeck = ortEinbeck.getWarenartProduktion();
		int produzierteMengeWien = ortWien.abholen();
		Warenart produzierteWarenartWien = ortWien.getWarenartProduktion();
		
	
		
		//Ausgabe unseres Warenbestandes als Tabellenformat (ähnlich)
		System.out.println("LKW hat aufgeladen von Ort: " + ortEinbeck.getOrt()+ "\tWare: "+ ortEinbeck.getWarenartProduktion() + "\tMenge: " + produzierteMengeEinbeck);
		
		//WIEN
		//Ausgabe unseres Warenbestandes als Tabellenformat (ähnlich)
		System.out.println("LKW hat aufgeladen von Ort:  " + ortWien.getOrt()+ "\tWare: "+ ortWien.getWarenartProduktion() + "\tMenge: " + produzierteMengeWien);
		
		
		lagerAugsburg.einlagern(produzierteWarenartEinbeck, produzierteMengeEinbeck);
		lagerSalzburg.einlagern(produzierteWarenartWien, produzierteMengeWien);
		
		System.out.println("\nAktueller Bestand im Lager: ");
	
		//Iteration durch unsere Waren, um zu sehen wie viele Waren vorhanden sind -> int
		for(Iterator<Warenart> warenartIterator = lagerAugsburg.getEingelagerteWaren().iterator(); warenartIterator.hasNext();) {
			Warenart warenart = (Warenart) warenartIterator.next();
			System.out.println(Util.convertWarenartToString(warenart) + ": "+ lagerAugsburg.getBestand(warenart));
		}
		//WIEN
		for(Iterator<Warenart> warenartIterator = lagerSalzburg.getEingelagerteWaren().iterator(); warenartIterator.hasNext();) {
			Warenart warenart = (Warenart) warenartIterator.next();
			System.out.println(Util.convertWarenartToString(warenart) + ": "+ lagerSalzburg.getBestand(warenart));
		}
		
		
		
		int preis = 10;
		int erloesEinbeck = lagerAugsburg.verkaufen(produzierteWarenartEinbeck,  produzierteMengeEinbeck, preis);
		int erloeseWien = lagerSalzburg.verkaufen(produzierteWarenartWien, produzierteMengeWien, preis);
		
	
		
		System.out.println("________________________________________ \n");
		System.out.println("Erloes aus Einbeck: "+ erloesEinbeck);
		System.out.println("Erloese aus Wien: "+ erloeseWien);
		System.out.println("________________________________________");
		
		
		System.out.println("\nAktueller Bestand im Lager aus Augsburg: ");
		//erneute Iteration -> nach Verkauf 
		for(Iterator<Warenart> warenartIterator = lagerAugsburg.getEingelagerteWaren().iterator(); warenartIterator.hasNext();) {
			Warenart warenart = (Warenart) warenartIterator.next();
			System.out.print(Util.convertWarenartToString(produzierteWarenartEinbeck) + ": "+ lagerAugsburg.getBestand(produzierteWarenartEinbeck));
		}
		//WIEN
		System.out.println("\nAktueller Bestand im Lager aus Salzburg: ");
		//erneute Iteration -> nach Verkauf 
		for(Iterator<Warenart> warenartIterator = lagerSalzburg.getEingelagerteWaren().iterator(); warenartIterator.hasNext();) {
			Warenart warenart = (Warenart) warenartIterator.next();
			System.out.print(Util.convertWarenartToString(produzierteWarenartWien) + ": "+ lagerSalzburg.getBestand(produzierteWarenartWien));
		}
		
	}

}


//			//Gebäude dem Büro hinzufügen und individuelle Ausgabe
//			gebaeude1.hinzufuegenBuero(bueroraum);
//			gebaeude1.printAusgabe();
//		
//			System.out.println("\n");
//			
//
//			//dem Büro Mitarbeiter hinzufügen und individuelle Ausgabe
//			bueroraum.hinzufuegenArbeiter(arbeitnehmer1);
//			bueroraum.ausgabeArbeiter();
//			
//			System.out.println("\n");
//			
//
//			//dem Büro einen Produktionsauftrag hinzufügen und individuelle Ausgabe
//			bueroraum.hinzufuegenBestellung(kundenbestellung1);
//			bueroraum.ausgabeProduktionsauftrag();
//	
//			System.out.println("\n");
//			
//			//dem Büro eine Stationsleitung hinzufügen und individuelle Ausgabe
//			bueroraum.hinzufuegenLeitung(leitung1);
//			bueroraum.ausgabeLeitung();
//			
////			bueroraum.hinzufuegenLeitung(leitung2); // Gibt die zweite Leitung aus (Beispielhaft um darzustellen wie man mehrere Variablen darstellen kann
////			bueroraum.ausgabeLeitung();
//		
//			System.out.println("\n");
//			
//			leitung1.hinzfuegenAbteilung(abt1);
//			leitung1.ausgabeAbteilung(); //evtl. nicht benötigt 
