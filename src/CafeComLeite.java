
public class CafeComLeite  extends Bebida{
	
	public static void main(String[] args) {

		Bebida produto = new Bebida();
		produto.setPre�o(1.00);
		System.out.println("Caf� com leite R$ " + produto.getPre�o());
		
		
		Bebida preparo = new Bebida();
		preparo.setDescricao("Caf� com Leite = �gua Quente + P� de caf� + Leite em P� + Filtro");
		System.out.println(preparo.getDescricao());
		
	}
	
}
