
public class AguaQuente {

	public static void main(String[] args) {

		Bebida produto = new Bebida();
		produto.setPre�o(0.00);
		System.out.println("�gua Quente R$ " + produto.getPre�o());
		
		
		Bebida preparo = new Bebida();
		preparo.setDescricao("�gua Quente = �gua do reservat�rio + Processo para ferver a �gua");
		System.out.println(preparo.getDescricao());
	}
	}

