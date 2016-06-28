import java.util.ArrayList;


public class Brosura {
	String descriere, dateContract;
	ArrayList<String> tipuriPachete = new ArrayList<String>();
	public String getDescriere() {
		return descriere;
	}
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
	public String getDateContract() {
		return dateContract;
	}
	public void setDateContract(String dateContract) {
		this.dateContract = dateContract;
	}
	public ArrayList<String> getTipuriPachete() {
		return tipuriPachete;
	}
	public void adaugaTipPachete(String tipPachet){
		this.tipuriPachete.add(tipPachet);
	}
	public void stergeTipPachete(String tipPachet){
		for(int i = 0; i < tipuriPachete.size(); i++)
			if (tipuriPachete.get(i).equals(tipPachet)) tipuriPachete.remove(i);
	}
	
}
