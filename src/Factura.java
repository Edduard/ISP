import java.sql.Date;


public class Factura {
	String codFactura, codCompanie;
	Date data;
	Companie companie;
	double pret;
	boolean achitat;
	
	public String getCodFactura() {
		return codFactura;
	}
	public void setCodFactura(String codFactura) {
		this.codFactura = codFactura;
	}
	public String getCodCompanie() {
		return codCompanie;
	}
	public void setCodCompanie(String codCompanie) {
		this.codCompanie = codCompanie;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Companie getCompanie() {
		return companie;
	}
	public void setCompanie(Companie companie) {
		this.companie = companie;
	}
	public double getPret() {
		return pret;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}
	public boolean isAchitat() {
		return achitat;
	}
	public void setAchitat(boolean achitat) {
		this.achitat = achitat;
	}
	public void achitare(){
		achitat = true;
	}
}
