package banco;

public class ContaCorrente {			
	public double saldo;
	public String titular;
	public double chequeEspecial;
	public String agencia;
	public String nrConta;
	public String banco;


	public ContaCorrente(){
		this.saldo = 0;
		this.chequeEspecial = 1000;
	}

	public ContaCorrente(double chequeEspecial){
		this.chequeEspecial = chequeEspecial;
	}
	
	public ContaCorrente(boolean chequeEspecial) {
		if(chequeEspecial) {
			this.chequeEspecial = 1000;
		}
	}
	
	public ContaCorrente(double saldo, double chequeEspecial, String agencia, String nrConta, String banco) {
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
		this.agencia = agencia;
		this.nrConta = nrConta;
		this.banco = banco;
	}
	
	public ContaCorrente(double saldo, double chequeEspecial, String agencia, String nrConta, String banco, String cliente) {
		this(saldo, chequeEspecial, agencia, nrConta, banco);
		this.titular = cliente;
	}

	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	
	//R$200,00
	public String exibirSaldo() {
		String saldoFormat;
		return saldoFormat = String.format("R$ %7.2f", this.saldo);
	}
	
	private boolean verificarSaldo(double valor) {
		return valor <= (this.saldo + this.chequeEspecial); 			
	}
	
	public boolean sacar(double valorSaque) {
		if(verificarSaldo(valorSaque)) {
			this.saldo -= valorSaque;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, ContaCorrente conta) {
		if(verificarSaldo(valor)) {
			this.saldo -= valor;
			conta.saldo += valor;
			return true;
		}
		return false;
	}

}
