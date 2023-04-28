package prak2;
import java.util.ArrayList;


public class Gebaeude {

	private ArrayList<Bueroraum> geschaeftseinheit1 = new ArrayList<Bueroraum>();
	
	
	
	private String ort;
	private String plz;
	private int wohneinheiten;
	
	public Gebaeude(String ort, String plz, int wohneinheiten){
		this.setOrt(ort);
		this.setPlz(plz);
		this.setWohneinheiten(wohneinheiten);
	}
	//hinzufügen eines Buerorraums
	public void hinzufuegenBuero(Bueroraum bueroraum) {
		if(geschaeftseinheit1 != null ) {
			geschaeftseinheit1.add(bueroraum);
			bueroraum.setRaum(this);
			
			
		}
	}
	
	public String getOrt() {
		return ort;
	}
	
	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public int getWohneinheiten() {
		return wohneinheiten;
	}

	public void setWohneinheiten(int wohneinheiten) {
		this.wohneinheiten = wohneinheiten;
	}

	
	//Definition einer eigenen print-Funktion
	public void printAusgabe() {
		for(int i = 0; i < geschaeftseinheit1.size(); i++) {
			System.out.println("Das Buero ist auf der Etage " + geschaeftseinheit1.get(i).getEtage() + " und im Raum " + geschaeftseinheit1.get(i).getRaum() + ", zu dem hat es folgende Kapazitaeten: " + geschaeftseinheit1.get(i).getKapazitaet());
			}
		
		
		
	}
	
	
	
}
