import java.util.ArrayList;

public class Utilizator {
	
	private String username;
	private String parola;
	private String nume;
	private String prenume;
	private ArrayList<Companie> companiiAsignate = new ArrayList<Companie>();
	private ArrayList<Utilizator> prieteni = new ArrayList<Utilizator>();
	private ArrayList<Intalnire> intalniri = new ArrayList<Intalnire>();
	String rang;
	 int tag;
	
	
	public Utilizator(String username, String parola, String rang, int tag)
	{
	this.username = username;
	this.parola = parola;
	this.rang = rang;
	this.tag = tag;
	}
	
	
	public String getUsername() {
		return username;
	}


	public String getNume()
	{ 
		return nume;
	}
	
	public void setNume(String nume)
	{
	 this.nume = nume;
	}

	public String getPrenume()
	{ 
		return prenume;
	}
	
	public void setPrenume(String prenume)
	{
	 this.prenume = prenume;
	}
	
	public  ArrayList<Utilizator> getPrieteni()
	{  
		return prieteni;
		
	}
	
	public void addPrieten(Utilizator prieten)
	{
		prieteni.add(prieten);
	}
	public void stergerePrieten(Utilizator prieten)
	{
		for(int i = 0; i < prieteni.size(); i++)
			if (prieteni.get(i).getUsername().equals(prieten.getUsername())) prieteni.remove(i);
	}
	public  ArrayList<Companie> getCompani()
	{  
		return companiiAsignate;
		
	}
	
	public void addCompanie(Companie companie)
	{
		companiiAsignate.add(companie);
	}
	public void stergerePrieten(Companie companie)
	{
		for(int i = 0; i < companiiAsignate.size(); i++)
			if (companiiAsignate.get(i).getNume().equals(companie.getNume())) companiiAsignate.remove(i);
	}
	public  ArrayList<Intalnire> getIntalnire()
	{  
		return intalniri;
		
	}
	
	public void addIntalnire(Intalnire intalnire)
	{   
		intalniri.add(intalnire);
	}
	public void stergereIntalnire(Intalnire intalnire)
	{
		for(int i = 0; i < intalniri.size(); i++)
			if (intalniri.get(i).getId() == (intalnire.getId())) intalniri.remove(i);
	}
	
	
	
	public String getRang() {
		return rang;
	}


	public void setRang(String rang) {
		this.rang = rang;
	}


	public int getTag() {
		return tag;
	}


	public void setTag(int tag) {
		this.tag = tag;
	}


	public void scrieRaport(Intalnire intalnire)
	{
	  // Preia textul din frontend si il stocheaza in baza de date
	}
}