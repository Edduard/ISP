import java.sql.Date;
import java.util.ArrayList;


public class Activitate {
	String nume, tip;
	Date data;
	ArrayList<Utilizator> utilizatoriImplicati = new ArrayList<Utilizator>();
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
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
	public ArrayList<Utilizator> getUtilizatoriImplicati() {
		return utilizatoriImplicati;
	}
	public void addUtilizator(Utilizator utilizator){
		this.utilizatoriImplicati.add(utilizator);
	}
	public void deleteUtilizator(Utilizator utilizator){
		for(int i = 0; i < utilizatoriImplicati.size(); i++)
			if (utilizatoriImplicati.get(i).getUsername().equals(utilizator.getUsername())) utilizatoriImplicati.remove(i);
	}
}
