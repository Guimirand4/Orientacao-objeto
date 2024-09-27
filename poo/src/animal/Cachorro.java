package animal;

public class Cachorro {
//atributos (estado)
	public String nome;
	public String raca;
	private boolean fome;
	


	//construtores
	public Cachorro(){
		this.fome = true;
	}
	

	public Cachorro(String nome, String raca){
		this();
		this.nome = nome;
		this.raca = raca;
	}


	
	//metodos (comportamento)
		public void latir(int latidos) {
		System.out.println(this.nome + " latindo:");
		for(int i =0; i< latidos; i ++) {
			System.out.println("Au Au");
		}
		
	}
		public void info() {
			System.out.println("Nome do cachorro: " + this.nome + "\nRaça do cachorro: " + this.raca);
			System.out.println(fome == true ? "Estou com fome" : "Não estou com fome");
		}
		
		public void comer() {
			if(fome) {
				fome = false;
			}
		}
		
		public void dormir() {
			System.out.println("zzzzzzzz");
			fome = true;
		}
		
		private void chorar() {
			System.out.println("uim uim");
		}
		
		public void morder(Cachorro dog) {
			dog.chorar();
			dog.fome = true;
		}
	}

