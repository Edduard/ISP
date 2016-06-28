import java.util.ArrayList;

public class SuperAdmin extends Admin {
	
	ArrayList<Utilizator> utilizatori= new ArrayList<Utilizator>();
	
	public SuperAdmin(String username, String parola, String rang, int tag) {
		super(username, parola, rang, tag);
		// TODO Auto-generated constructor stub
	}
  public void adaugaUtilizator(Utilizator u)
  {
	  this.utilizatori.add(u);
  }
  
  
  public void stergereUtilizator(Utilizator utilizator)
  {
	for(int i = 0; i < utilizatori.size(); i++)
		if (utilizatori.get(i).getUsername().equals(utilizator.getUsername())) utilizatori.remove(i);
  }
  
  public ArrayList<Utilizator> getUtilizatori() {
	return utilizatori;
}
public void modificaRangul(Utilizator utilizator, String rang)
  {
	  utilizator.setRang(rang);
  }
	
}