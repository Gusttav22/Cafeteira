
public class Bebida {
	
	private double prešo;
	private String descricao;
	private int nivelDeAšucar;


	
	public double getPrešo() {
		return prešo;
	}
	public void setPrešo(double prešo) {
		this.prešo = prešo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getNivelDeAšucar() {
		
		return nivelDeAšucar;
	}
	public void setNivelDeAšucar(int nivelDeAšucar) {
		
		this.nivelDeAšucar = nivelDeAšucar;
	}
	
	public String fazendoOProduto() {
		return "Preparando a receita";
	}
	
}
