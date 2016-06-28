import java.sql.Date;


public class Contract {

	private int numarContract;
	private String CUI, reprezentant, suma, beneficii;
	boolean semnat;
	Date date;
	
	
	public void semnareContract(){
		semnat = true;
	}
	public String getSuma() {
		return suma;
	}
	public void setSuma(String suma) {
		this.suma = suma;
	}
	public String getBeneficii() {
		return beneficii;
	}
	public void setBeneficii(String beneficii) {
		this.beneficii = beneficii;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	Contract(){
	}
	public void setNumarContract(int numarContract){
		this.numarContract = numarContract;
	}
	public int getNumarContract(){
		return this.numarContract;
	}
	public void setCUI(String CUI){
		this.CUI = CUI;
	}
	public String getCUI(){
		return this.CUI;
	}
	public void setReprezentant(String reprezentant){
		this.reprezentant = reprezentant;
	}
	public String getReprezentant(){
		return this.reprezentant;
	}
	
	
}
