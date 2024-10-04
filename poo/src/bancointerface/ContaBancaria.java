package bancointerface;

public class ContaBancaria implements OperacoesBancarias{
	public double saldo;

	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	
	
	
}
