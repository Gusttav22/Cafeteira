
public class ChaDeLimao {

	public static void main(String[] args) {
		
		Bebida produto = new Bebida();
		produto.setPre�o(1.00);
		System.out.println("Ch� de lim�o R$ " + produto.getPre�o());
		
		
		Bebida preparo = new Bebida();
		preparo.setDescricao("Ch� de Lim�o = �gua Quente + Ch� em p� + Filtro");
		System.out.println(preparo.getDescricao());
	}
}
