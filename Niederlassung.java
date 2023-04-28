package prak2;

public class Niederlassung {

	
	
	private String ort;
	private Warenart warenartProduktion;
	private int arbeitende;
	private boolean produktionAngefordert;
	private int produzierteMenge = 0; // = 0 dient dazu, dass wir nie in den negativen Bereich gelangen
	private int faktorArbeiterZuMenge = 10; //Pro Mitarbeiter können 10 bzw. n Stück hergestellt werden
	
	public String getOrt() {
		return ort;
	}
	
	public void setOrt(String ort) {
		this.ort = ort;
	}
	//FÜR EINBECK
	public Warenart getWarenartProduktion() {
		return warenartProduktion;
	}
	public void setWarenartProduktion(Warenart warenartProduktion) {
		this.warenartProduktion = warenartProduktion;
	}
	
	public int getArbeitende() {
		return arbeitende;
	}
	
	public void setArbeitende(int arbeitende) {
		this.arbeitende = arbeitende;
	}
	
	public boolean istProduktionAngefordert() {
		return produktionAngefordert;
	}
	
	public void setProduktionAngefordert(boolean produktionAngefordert) {
		this.produktionAngefordert = produktionAngefordert;
	}
	
	public int getProduzierteMenge() {
		return produzierteMenge;
	}
	
	public int getFaktorArbeiterZuMenge() {
		return faktorArbeiterZuMenge;
	}

	public void setFaktorArbeiterZuMenge(int faktorArbeiterZuMenge) {
		this.faktorArbeiterZuMenge = faktorArbeiterZuMenge;
	}
	
	
	// FÜR ORT EINBECK
	public Niederlassung(String ort, Warenart warenartProduktion, int arbeitende){
		this.setOrt(ort);
		this.setWarenartProduktion(warenartProduktion);
		this.setArbeitende(arbeitende);
	}

	public void produzieren() {
		int zufaelligeSchwankungInProzent = (int)Math.round(Math.random() * 60.0)-30;
		//Prozentuale Prüfung auf Auslastung
		if(this.produktionAngefordert) {
			this.produzierteMenge = this.arbeitende * this.faktorArbeiterZuMenge * (100 - zufaelligeSchwankungInProzent);
		
		}else {
			this.produzierteMenge = 0;
		}
	}
	public void produktionAnfordern() {
		
		this.produktionAngefordert = true;
	
	
	}	
	
	
	
	
	public int abholen() {
		int mengeAuslieferung = this.produzierteMenge;
		this.produzierteMenge = 0;
		this.produktionAngefordert = false;
		
		return mengeAuslieferung;
	}
	
	public void mitarbeiterEinstellen(int neuEinstellungen) {
		this.arbeitende += neuEinstellungen;
	}
	
	public void mitarbeiterKündigen(int entlassungen) {
		this.arbeitende -= entlassungen;
	}
}

