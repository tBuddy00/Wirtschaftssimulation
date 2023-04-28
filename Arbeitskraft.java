package prak2;


public class Arbeitskraft {

	

	private Abteilung abteilung2;
	private String abteilung;
	private String name;
	private int personalnummer;
	private int gehalt;
	
	// Verweis auf die Elternklassen
	private Bueroraum bueroraum;
	private Fuehrung leitung;
	
	
	public Arbeitskraft(String name, String abteilung, int personalnummer, int gehalt) {
		this.setAbteilung(abteilung);
		this.setName(name);
		this.setPersonalnummer(personalnummer);
		this.setGehalt(gehalt);
		
	}
	
	
	
	
	
	public void erhoehungGehalt(int erhoehung) {
		this.gehalt = gehalt + erhoehung;
		System.out.println("Dein Gehalt wurde auf "+this.gehalt + " EUR erhoeht.");
	}
	public void versetzeinabteilung(String versetzung) {
		this.abteilung = versetzung;
	}
	public void ausweis() {
		System.out.println("Name: "+this.name + "\nAbteilung: "+this.abteilung + "\nPersonalnummer: "+this.gehalt);
	}

	public String getAbteilung() {
		return abteilung;
	}

	public String getName() {
		return name;
	}

	public int getPersonalnummer() {
		return personalnummer;
	}

	public int getGehalt() {
		return gehalt;
	}
	
	
	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPersonalnummer(int personalnummer) {
		this.personalnummer = personalnummer;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	public void setName(Bueroraum bueroraum2) {
		
		
	}
	
	
	
	
	
	
}