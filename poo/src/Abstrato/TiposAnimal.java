package Abstrato;

public enum TiposAnimal {
	PEIXES("Peixe", 1),
	REPTEIS("Repteis", 2), 
	ANFIBIOS("Anfibios", 3),
	AVES("Aves", 4),
	MAMIFEROS("Mamiferos", 5);
	
	TiposAnimal(String descricao, int ordem) {
		this.descricao = descricao;
		this.ordem = ordem;
	}
	
	String descricao;
	int ordem;
	
}
