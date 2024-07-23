package testeBiblioteca;


import teste.Cadastros;



public class CadastroLocacao {

	public static void main(String[] args) {
		Veiculo veiculo1 = new Veiculo( 001,"Honda Civic", 500.00);
		
		
		Veiculo veiculo2 = new Veiculo(002, "Chevrolet onix",180.00);
		
		Veiculo veiculo3 = new Veiculo(003, "Fiat Palio", 100.00);
		
		Cadastros<Veiculo> listaVeiculo = new Cadastros<Veiculo>();
		
		
		listaVeiculo.adicionar(veiculo1);
		listaVeiculo.adicionar(veiculo2);
		listaVeiculo.adicionar(veiculo3);
		
	

       
}

		
		
		
		
		

	
	    
		
	}








