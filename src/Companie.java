import java.util.ArrayList;


public class Companie {
	String nume, oras, website, adresa, mail, statusColaborare;
	ArrayList<Reprezentant> reprezentanti = new ArrayList<Reprezentant>();
	
	
	public ArrayList<Reprezentant> getReprezentanti() {
		return reprezentanti;
	}

	public void addReprezentant(Reprezentant reprezentant) {
		this.reprezentanti.add(reprezentant);
	}
	public void deleteReprezentant(Reprezentant reprezentant){
		this.reprezentanti.remove(reprezentant);
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getOras() {
		return oras;
	}

	public void setOras(String oras) {
		this.oras = oras;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getStatusColaborare() {
		return statusColaborare;
	}

	public void setStatusColaborare(String statusColaborare) {
		this.statusColaborare = statusColaborare;
	}
	
}
