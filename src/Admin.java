import java.sql.Date;

public class Admin extends Utilizator{

	public Admin(String username, String parola, String rang, int tag) {
		super(username, parola, rang, tag);
		// TODO Auto-generated constructor stub
	}
	
	public void scrieArticol()
	{
	  Articol articol = new Articol();
	  articol.setTitlu("Lectie");
	  articol.setAutor("Marin Matei");
	  Date data = new Date(01,01,2016);
	  articol.setData(data);
	  articol.setTextArticol(" Tot ceea ce trebuie sa contina ");
	  articol.setTag(this.tag);
	  
	}
	public void editeazaArticol(Articol articol)
	{
	  articol.setTextArticol(" Alt text");
	}
	
	public void stergeArticol(Articol articol)
	{
	  // are loc stergerea din baza de date
	}
	
	public void adaugareCompanie()
	{

		  Companie companie  = new Companie();
		  companie.setNume("luxoft");
		  companie.setOras("Bunuresti");
		  companie.setWebsite("www.luxoft.ro");
		  companie.setAdresa("Strada Bravu");
		  companie.setMail("luxoft@gmail.com");
		  
	}
	public void stergeCompanie()
	{
		// se sterge compania din baza de date 
		  
	}
	
	public void asigneazaReprezentantCompaniei(Reprezentant reprezentant, Companie companie)
	{
		companie.addReprezentant(reprezentant);
		
	}
	
	public void stergereReprezentantCompaniei(Reprezentant reprezentant, Companie companie)
	{
		companie.deleteReprezentant(reprezentant);
		
	}
	
	public void asigneazaCompanieUtilizatorului(Companie companie, Utilizator utilizator)
	{
		utilizator.addCompanie(companie);

	}
	public void asigneazaIntalnireUtilizatorului(Intalnire intalnire, Utilizator utilizator)
	{
		utilizator.addIntalnire(intalnire);
	}
	
	public void asigneazaCompanieEvenimentului(Companie companie, Eveniment eveniment)
	{
		eveniment.adaugarePartener(companie);
	}
	public void semnareContract(Contract contract)
	{
		contract.semnareContract();
	}
	
	public void scriereRaport(Intalnire intalnire)
	{
		
		intalnire.setRaport("Azi am fost la compania x");
	}
	
	public void editareRaport(Intalnire intalnire)
	{
		
		intalnire.setRaport("Azi am fost la compania x");
	}
	
	public void stergereRaport(Intalnire intalnire)
	{
		
		intalnire.setRaport("");
	}
	
	public void adaugaEveniment()
	{

		Eveniment eveniment  = new Eveniment();
		Date data = new Date(01,01,2016);
		eveniment.setData(data);
		eveniment.setLocatie("Bunuresti");
		eveniment.setNume("Mind Jam");
		eveniment.setTip("Ingineresc");
		
	}
	
	public void stergereEveniment(Eveniment eveniment)
	{
		// 
	}
	public void adaugaUtulizatorActivitatii(Utilizator utilizator, Activitate activitate)
	{
		activitate.addUtilizator(utilizator);
	}
}