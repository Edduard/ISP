import java.sql.Date;


public class Reprezentant extends Utilizator{
	public Reprezentant(String username, String parola, String rang, int tag) {
		super(username, parola, rang, tag);
		// TODO Auto-generated constructor stub
	}
	String pozitie, email, telefon;

	public String getPozitie() {
		return pozitie;
	}

	public void setPozitie(String pozitie) {
		this.pozitie = pozitie;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public void scrieArticol(){
		Date data = new Date(01,01,2016);
		Articol art = new Articol();
		  art.setTitlu("Lectie");
		  art.setAutor("Marin Preda");
		  art.setData(data);
		  art.setTextArticol(" Tot ceea ce trebuie sa contina ");
	}	
}
