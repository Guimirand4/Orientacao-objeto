package banco;

public class TestaContas {

	public static void main(String[] args) {
		//criando uma conta
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		c1.banco = "Itau";
		c1.agencia = "0876";
		c1.nrConta = "1234-5";
		c1.titular = "Gui-Miranda";
		c1.depositar(200);
		System.out.println(c1.exibirSaldo());
		
		
		if(c1.sacar(0)) {
			System.out.println("Saque realizado");
		}else {
			System.out.println("NAO FOI POSSIVEL SACAR");
		}
		
		if(c1.transferir(1, c2)) {
			System.out.println("TRANSFERENCIA REALIZADA");
		}else {
			System.out.println("NAO FOI POSSIVEL REALIZAR A TRANSFERENCIA");
		}
		
		System.out.println("SALDO CONTA 1: " + c1.exibirSaldo());
		System.out.println("SALDO CONTA 2: " + c2.exibirSaldo());
		
	}

}
