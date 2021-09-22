
public class CafeComLeite  extends Bebida{
	
	public static void main(String[] args) {

		Bebida produto = new Bebida();
		produto.setPreço(1.00);
		System.out.println("Café com leite R$ " + produto.getPreço());
		
		
		Bebida preparo = new Bebida();
		preparo.setDescricao("Café com Leite = Água Quente + Pó de café + Leite em Pó + Filtro");
		System.out.println(preparo.getDescricao());
		
	}
	
}
