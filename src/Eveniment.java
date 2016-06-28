import java.sql.Date;
import java.util.ArrayList;


public class Eveniment {
	String nume, locatie, tip;
	Date data;
	ArrayList<Companie> parteneri = new ArrayList<Companie>();
	ArrayList<Activitate> activitati = new ArrayList<Activitate>();
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getLocatie() {
		return locatie;
	}
	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public ArrayList<Companie> getParteneri() {
		return parteneri;
	}	
	public void adaugarePartener(Companie companie){
		this.parteneri.add(companie);
	}
	public void stergerePartener(Companie companie){
		for(int i = 0; i < parteneri.size(); i++)
			if (parteneri.get(i).getNume().equals(companie.getNume())) parteneri.remove(i);
	}
	public ArrayList<Activitate> getActivitati() {
		return activitati;
	}
	public void stergereActivitate(Activitate activitate){
		for(int i = 0; i < activitati.size(); i++)
			if (activitati.get(i).getNume().equals(activitate.getNume())) activitati.remove(i);
	}
	public void adaugareActivitate(Activitate activitate){
		this.activitati.add(activitate);
	}
	public void addActivitate(Activitate activitate) {
		this.activitati.add(activitate);
	}

	
	
}
