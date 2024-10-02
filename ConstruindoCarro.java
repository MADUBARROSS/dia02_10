package atividadeDia0210;

public class ConstruindoCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("HB20",5678);
		Carro carro2 = new Carro("Mercedes",1234);
		Carro carro3 = new Carro("Fusca");
		
		System.out.println(carro2.getNumChassi());
		System.out.println(carro2.getPlaca());
		
		System.out.println(carro1.getNumChassi());
		System.out.println(carro1.getPlaca());

		System.out.println(carro3.getNumChassi());
		System.out.println(carro3.getPlaca());
	}

}
