
public class Capuccino {

	public static void main(String[] args) {
		
		Bebida produto = new Bebida();
		produto.setPreço(1.50);
		System.out.println("Capuccino R$ " + produto.getPreço());
		
		
		Bebida preparo = new Bebida();
		preparo.setDescricao("Capuccino = Água Quente + Café em pó + Leite em Pó + Chocolate em Pó + Filtro");
		System.out.println(preparo.getDescricao());
	}
}
