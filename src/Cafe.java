
public class Cafe extends Bebida{
	

	public static void main(String[] args) {
		
		
		Bebida produto = new Bebida();
		produto.setPre�o(0.50);
		System.out.println("Caf� R$ " + produto.getPre�o());
		
		
		Bebida preparo = new Bebida();
		preparo.setDescricao("Caf� = �gua Quente + P� de caf� + Filtro");
		System.out.println(preparo.getDescricao());
		
	
		
		
	}
		
 }
	
