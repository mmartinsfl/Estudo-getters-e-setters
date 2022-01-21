package bankEncapsulado;

public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		// conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente matheus = new Cliente();
		//conta.titular = matheus;
		matheus.setNome("Matheus Martins");
		
		conta.setTitular(matheus);
	}

}
