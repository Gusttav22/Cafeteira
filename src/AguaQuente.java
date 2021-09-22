
public class AguaQuente {

	public static void main(String[] args) {

		Bebida produto = new Bebida();
		produto.setPreço(0.00);
		System.out.println("Água Quente R$ " + produto.getPreço());
		
		
		Bebida preparo = new Bebida();
		preparo.setDescricao("Água Quente = Água do reservatório + Processo para ferver a água");
		System.out.println(preparo.getDescricao());
	}
	}

