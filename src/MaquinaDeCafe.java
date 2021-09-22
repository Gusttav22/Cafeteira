
public class MaquinaDeCafe extends Bebida {


	public static void main(String[] args) {
		
		System.out.println("Qual bebida voce deseja ?");
		
		System.out.println("1 - Café - R$0,50"); 
		System.out.println("2 - Café Com Leite - R$1,00");
		System.out.println("3 - Capuccino - R$1,50");
		System.out.println("4 - Chá De Limao - R$1,00");
		System.out.println("5 - Àgua Quente - R$ Gratis");
		
		
		
		
		int bebidaEscolhidaPeloCliente = 5;
			
		if(bebidaEscolhidaPeloCliente <= 5) {
			
			Bebida cafe = new Bebida();
		}
	
		System.out.println("Bebida Escolhida  = " + bebidaEscolhidaPeloCliente );
		
		
	
		
		System.out.println("Qual o Nivel de Açucar que voce Deseja ?");
		
		int NivelDeAçucarEscolhido = 4;
		
		if (NivelDeAçucarEscolhido <= 5) {
			System.out.println("Nivel De Açucar Adequado !");
			return;
			
		}else {
			System.out.println("Recomendo um pouco menos, vai ficar muito doçe !");
			
			
		}
		
}
	
}
