
public class ChaDeLimao {

	public static void main(String[] args) {
		
		Bebida produto = new Bebida();
		produto.setPreço(1.00);
		System.out.println("Chá de limão R$ " + produto.getPreço());
		
		
		Bebida preparo = new Bebida();
		preparo.setDescricao("Chá de Limão = Água Quente + Chá em pó + Filtro");
		System.out.println(preparo.getDescricao());
	}
}
