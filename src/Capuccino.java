
public class Capuccino {

	public static void main(String[] args) {
		
		Bebida produto = new Bebida();
		produto.setPre�o(1.50);
		System.out.println("Capuccino R$ " + produto.getPre�o());
		
		
		Bebida preparo = new Bebida();
		preparo.setDescricao("Capuccino = �gua Quente + Caf� em p� + Leite em P� + Chocolate em P� + Filtro");
		System.out.println(preparo.getDescricao());
	}
}
