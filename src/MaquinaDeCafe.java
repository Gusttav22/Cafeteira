
public class MaquinaDeCafe extends Bebida {


	public static void main(String[] args) {
		
		System.out.println("Qual bebida voce deseja ?");
		
		System.out.println("1 - Caf� - R$0,50"); 
		System.out.println("2 - Caf� Com Leite - R$1,00");
		System.out.println("3 - Capuccino - R$1,50");
		System.out.println("4 - Ch� De Limao - R$1,00");
		System.out.println("5 - �gua Quente - R$ Gratis");
		
		
		
		
		int bebidaEscolhidaPeloCliente = 5;
			
		if(bebidaEscolhidaPeloCliente <= 5) {
			
			Bebida cafe = new Bebida();
		}
	
		System.out.println("Bebida Escolhida  = " + bebidaEscolhidaPeloCliente );
		
		
	
		
		System.out.println("Qual o Nivel de A�ucar que voce Deseja ?");
		
		int NivelDeA�ucarEscolhido = 4;
		
		if (NivelDeA�ucarEscolhido <= 5) {
			System.out.println("Nivel De A�ucar Adequado !");
			return;
			
		}else {
			System.out.println("Recomendo um pouco menos, vai ficar muito do�e !");
			
			
		}
		
}
	
}
