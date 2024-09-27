package Abstrato;

public abstract class Animal {
	private TiposAnimal tipoAnimal;

	public TiposAnimal getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(TiposAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	public abstract void falar();

	@Override
	public String toString() {
		return "Animal [tipoAnimal=" + tipoAnimal + "]";
	}
	
	
}
