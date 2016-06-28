import java.sql.Date;


public class Articol {
	String titlu, textArticol;
	Date data;
	String autor;
	int tag;
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public String getTextArticol() {
		return textArticol;
	}
	public void setTextArticol(String textArticol) {
		this.textArticol = textArticol;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}

	
}
