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
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		System.out.println(titularDaConta);
		System.out.println(matheus);
		System.out.println(conta.getTitular());
		
	}

}
