
public class Bebida {
	
	private double pre�o;
	private String descricao;
	private int nivelDeA�ucar;


	
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getNivelDeA�ucar() {
		
		return nivelDeA�ucar;
	}
	public void setNivelDeA�ucar(int nivelDeA�ucar) {
		
		this.nivelDeA�ucar = nivelDeA�ucar;
	}
	
	public String fazendoOProduto() {
		return "Preparando a receita";
	}
	
}
