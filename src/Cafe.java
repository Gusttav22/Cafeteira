
public class Cafe extends Bebida{
	

	public static void main(String[] args) {
		
		
		Bebida produto = new Bebida();
		produto.setPreço(0.50);
		System.out.println("Café R$ " + produto.getPreço());
		
		
		Bebida preparo = new Bebida();
		preparo.setDescricao("Café = Água Quente + Pó de café + Filtro");
		System.out.println(preparo.getDescricao());
		
	
		
		
	}
		
 }
	
