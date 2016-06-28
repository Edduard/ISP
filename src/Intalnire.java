import java.sql.Date;
import java.util.ArrayList;


public class Intalnire {
	int id;
	
	String locatie, raport;
	Date data;
	ArrayList<Utilizator> participanti = new ArrayList<Utilizator>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocatie() {
		return locatie;
	}
	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}
	public String getRaport() {
		return raport;
	}
	public void setRaport(String raport) {
		this.raport = raport;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public ArrayList<Utilizator> getParticipanti() {
		return participanti;
	}
	public void setParticipanti(ArrayList<Utilizator> participanti) {
		this.participanti = participanti;
	}
	public void addParticipant(Utilizator participant){
		participanti.add(participant);
	}
}
