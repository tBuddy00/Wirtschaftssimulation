package prak2;
import java.time.LocalDate;


public class Produktionsauftrag {

	//LocalDate bestellzeit = LocalDate.now();
	
	//Einbindung von der Klasse Bueroraum
	private Bueroraum bueroraum;
	
	private String auftragbez;
	private String kunde;
	private int menge;
	
	public String getAuftragbez() {
		return auftragbez;
	}
	public void setAuftragbez(String auftragbez) {
		this.auftragbez = auftragbez;
	}
	public String getKunde() {
		return kunde;
	}
	public void setKunde(String kunde) {
		this.kunde = kunde;
	}
	public int getMenge() {
		return menge;
	}
	public void setMenge(int menge) {
		this.menge = menge;
	}
	
	public Produktionsauftrag(String kunde, String auftragbez, int menge){
		this.setKunde(kunde);
		this.setAuftragbez(auftragbez);
		this.setMenge(menge);
	}
	public void setKunde(Bueroraum bueroraum) {
		
		
	}
	
	
	}
	
	
	
	
	
	
	

