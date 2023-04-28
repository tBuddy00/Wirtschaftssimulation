package prak2;
import java.util.ArrayList;

public class Fuehrung {
	
	ArrayList<Arbeitskraft> arbeitskraefte = new ArrayList<Arbeitskraft>();
	ArrayList<Abteilung> zuweisungAbteilung = new ArrayList<Abteilung>();

	private String name;
	private int personalnummer;
	private String kompetenz;
	
	//Verweis auf die Elternklasse
	private Bueroraum bueroraum;
	

	public String getName() {
		return name;
	}
	public int getPersonalnummer() {
		return personalnummer;
	}
	public String getKompetenz() {
		return kompetenz;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPersonalnummer(int personalnummer) {
		this.personalnummer = personalnummer;
	}
	
	public void setKompetenz(String kompetenz) {
		this.kompetenz = kompetenz;
	}
	

	public Fuehrung(String name, int personalnummer, String kompetenz){
		this.setName(name);
		this.setPersonalnummer(personalnummer);
		this.setKompetenz(kompetenz);
	}
	
	public void hinzfuegenAbteilung(Abteilung abteilung) {
		if(zuweisungAbteilung != null) {
			zuweisungAbteilung.add(abteilung);
			abteilung.setAbteilung(this);
		}
	}
	//Ausgabe der Abteilung
	
	public void ausgabeAbteilung() {
		for(int i = 0; i < zuweisungAbteilung.size(); i++) {
			System.out.println("Abteilung: " + zuweisungAbteilung.get(i).getAbteilung() + "\nAbteilungsnummer: "+ zuweisungAbteilung.get(i).getAbtnummer());
		}
	}
	
	public void setName(Bueroraum bueroraum) {
		
	}
	
	
		
}			
	
	
			

