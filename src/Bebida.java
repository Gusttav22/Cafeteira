
public class Bebida {
	
	private double preço;
	private String descricao;
	private int nivelDeAçucar;


	
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getNivelDeAçucar() {
		
		return nivelDeAçucar;
	}
	public void setNivelDeAçucar(int nivelDeAçucar) {
		
		this.nivelDeAçucar = nivelDeAçucar;
	}
	
	public String fazendoOProduto() {
		return "Preparando a receita";
	}
	
}
