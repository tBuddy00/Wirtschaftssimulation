package prak2;
import java.util.ArrayList;


public class Abteilung {
	
	
	private String abteilung;
	private int abtnummer;
	
	private Fuehrung fuehrung;
	
	
	public String getAbteilung() {
		return abteilung;
	}
	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}
	public int getAbtnummer() {
		return abtnummer;
	}
	public void setAbtnummer(int abtnummer) {
		this.abtnummer = abtnummer;
	}
	
	Abteilung(String abteilung, int abtnummer){
		this.setAbteilung(abteilung);
		this.setAbtnummer(abtnummer);
	
	}
	public void setAbteilung(Fuehrung fuehrung2) {
		
	}
	
	
	
	
	
	
	
}
