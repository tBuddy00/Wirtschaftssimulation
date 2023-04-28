package prak2;
import java.util.ArrayList;

public class Bueroraum {
	
	private ArrayList<Arbeitskraft> arbeitnehmer1 = new ArrayList<Arbeitskraft>();
	private ArrayList<Produktionsauftrag> bestellung1  = new ArrayList<Produktionsauftrag>();
	private ArrayList<Fuehrung> leitung = new ArrayList<Fuehrung>();
	
	
	private int raum;
	private int etage;
	private int kapazitaet;
	
	private Gebaeude gebaeude; //Verbindung mit der Übergeordneten Klasse Gebaeude
	
	public Bueroraum(int raum, int etage, int kapazitaet){
		this.setRaum(raum);
		this.setEtage(etage);
		this.setKapazitaet(kapazitaet);		
	}

	//Hinzufügen aller Unterklassen
	public void hinzufuegenArbeiter(Arbeitskraft arbeitnehmer) {
		if(arbeitnehmer1 != null) {
			arbeitnehmer1.add(arbeitnehmer); //Liste.add
			arbeitnehmer.setName(this); //Variable.setMETHODE();
		}
	}
	
	public void hinzufuegenBestellung(Produktionsauftrag bestellung) {
		if(bestellung1 != null) {
			bestellung1.add(bestellung); 
			bestellung.setKunde(this);
		
		}
	}

	public void hinzufuegenLeitung(Fuehrung anfuehrer) {
		if(leitung != null) {
			leitung.add(anfuehrer);
			anfuehrer.setName(this);
		}
	
	}
	
		
	
	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public int getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}

	public int getRaum() {
		return raum;
	}
	
	public void setRaum(int raum) {
		this.raum = raum;
	}
	public void setRaum(Gebaeude gebaeude2) {
		
		
		//Ausgabe aller Klassen
		
	}
	public void ausgabeProduktionsauftrag() {
		for(int i = 0; i < bestellung1.size(); i++) {
			System.out.println("Dein Kunde: " + bestellung1.get(i).getKunde() + " hat uns den Auftrag " + bestellung1.get(i).getAuftragbez() + " zukommen lassen.\n" + "Diese beinhaltet die Menge " + bestellung1.get(i).getMenge());
		}
	}
	
	public void ausgabeArbeiter() {
		for(int i = 0; i < arbeitnehmer1.size(); i++) {
			System.out.println("Name: "+ arbeitnehmer1.get(i).getName() + "\nAbteilung: " + arbeitnehmer1.get(i).getAbteilung() + "\nPersonalnummer: " + arbeitnehmer1.get(i).getPersonalnummer() + "\nGehalt: "+ arbeitnehmer1.get(i).getGehalt());
		}
	}
	public void ausgabeLeitung() {
		for(int i = 0; i < leitung.size(); i++) {
			System.out.println("Stationsleiter: " + leitung.get(i).getName() + "\nPersonalnummer: " + leitung.get(i).getPersonalnummer() + "\nKompetenz: " + leitung.get(i).getKompetenz());
		}
	}
	
	
	
	
}
