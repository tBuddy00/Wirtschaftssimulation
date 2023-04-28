package prak2;

import java.util.HashMap;
import java.util.Set;

public class Lager {

	private HashMap<Warenart, Integer> lagerbestand = new HashMap<Warenart, Integer>();
	
	private String ort;
	
	public String getOrt() {
		return ort;
}
	public void setOrt(String ort) {
		this.ort = ort;
}


	public Lager(String ort) {
		this.setOrt(ort);
	}
	

	public void einlagern(Warenart warenart, int mengeEinlagern) { //Die Ware welche übergeben wird; Die Menge die übergeben wird
		if(lagerbestand.containsKey(warenart)) { // Prüfung ob die Warenart existiert	
			int bisherigerBestand = lagerbestand.get(warenart).intValue(); // Aufstellung der bisher vorhandenen Daten
			int neuerBestand = bisherigerBestand + mengeEinlagern; //Addition des bisherigen Bestandes zu der Menge die eingelagert wird
			lagerbestand.put(warenart, neuerBestand); // Sollte bisher was vorhanden sein, so addiere bisheriger Bestand + menge Einlagern = neuerBestand
		
		}else {
			lagerbestand.put(warenart, mengeEinlagern); //Sofern nicht vorhanden war, lege es lediglich ins Lager
		}
	}

	
	
	public int verkaufen(Warenart warenart, int mengeVerkaufen, int preis) { //Die Ware welche verkauft wird, in welcher Menge, zu welchem Preis
		if(lagerbestand.containsKey(warenart)) { //prüfen ob diese Ware im Lager liegt 
			if(lagerbestand.get(warenart) >= mengeVerkaufen) { //Sollte der Lagerbestand >= Menge sein die wir verkaufen wollen (Prüfung ob genug davon da ist)
				int bisherigerBestand = lagerbestand.get(warenart).intValue(); //Einfache Auflistung auf vorhanden sein der Ware
				int neuerBestand = lagerbestand.get(warenart) - mengeVerkaufen; //rechnerische Ermittlung der neuen Warenanzahl
				lagerbestand.put(warenart, neuerBestand); //neuer Lagerbestand wird in das Lager gelegt
				return mengeVerkaufen * preis;
				
			}else if(lagerbestand.get(warenart) > 0){
				int bisherigerBestand = lagerbestand.get(warenart).intValue();
				lagerbestand.remove(warenart);
				
				return bisherigerBestand * preis;
	
			}
			
		}
		return 0;
	}
	

	
	
	//return ein Set mit allen Waren, Menge > 0 im Lager
	public Set<Warenart> getEingelagerteWaren(){
		return lagerbestand.keySet();
	}
	

		
	//Prüfung darauf, ob überhaupt jene Ware im Lager ist
	public int getBestand(Warenart warenart) {
		if(lagerbestand.containsKey(warenart)) {
			return lagerbestand.get(warenart).intValue();
		}else {
			return -1;
		}
	
	}

}