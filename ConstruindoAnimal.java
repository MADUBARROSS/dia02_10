package atividadeDia0210;

public class ConstruindoAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal("cinza", 100);
		Animal animal2 = new Animal("marrom", 60);
		Animal animal3 = new Animal("rosa", 90);
		
		System.out.println(animal1.getCor());
		System.out.println(animal1.getTamanho());
		
		System.out.println(animal2.getCor());
		System.out.println(animal2.getTamanho());
		
		System.out.println(animal3.getCor());
		System.out.println(animal3.getTamanho());
		

	}

}
