package Abstrato;

public class Cachorro extends Animal{
	public Cachorro() {
		this.setTipoAnimal(TiposAnimal.MAMIFEROS);
	}
	@Override
	public void falar() {
		System.out.println("AU AU");
		
	}

}
