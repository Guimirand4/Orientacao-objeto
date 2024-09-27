package heranca;

public class Contador extends Funcionario{
	 private String numCrc;
	 
	 public Contador() {
		 System.out.println("Passou pelo Contador");
	 }

	public String getNumCrc() {
		return numCrc;
	}

	public void setNumCrc(String numCrc) {
		this.numCrc = numCrc;
	}
	 
	 
	 
}
