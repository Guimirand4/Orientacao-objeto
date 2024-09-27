package animal;

public class TestaAnimais {

	public static void main(String[] args) {
		
		//tutor.nome = "chileno";



		//criando um cachorro
		Cachorro dog1 = new Cachorro();
		Cachorro dog2 = new Cachorro();
		dog1.nome = "Rex";
		dog1.raca = "Labrador";
		dog1.latir(1);	
		dog1.comer();
		dog1.info();
		
		
		System.out.println("========================");
		
		
		dog2.nome = "Lulu";
		dog2.raca = "Poodle";
		dog2.latir(1);
		dog2.comer();
		//dog2.dormir();
		dog2.info();
		System.out.println("mordida");
		dog1.morder(dog2);
		dog2.info();
		

		//Cachorro dog3 = new Cachorro("Lili", "maltes", tutor);

	}

}
