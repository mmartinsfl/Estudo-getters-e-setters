package bankEncapsulado;

public class TestaValores {
public static void main(String[] args) {
	Conta conta = new Conta(1337, 202646);
	
	
	
	// conta está inconsistente
	

	System.out.println("Sua agência é = " + conta.getAgencia());
	
	Conta conta2 = new Conta(1337, 1090812);
	Conta conta3 = new Conta(1265, 9862499);
	System.out.println("O total de contas é " + Conta.getTotal());
}
}
