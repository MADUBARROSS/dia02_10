package atividadeDia0210;

public class ConstruindoConsulta {

	public static void main(String[] args) {
		
		Consulta consulta1 = new Consulta();
		Consulta consulta2 = new Consulta("isabella", "Gabriel", 13/07/2009);
		Consulta consulta3 = new Consulta("Madu", "Maria", 18/01/2007);
		
		System.out.println(consulta2.getNomePcnt());
		System.out.println(consulta2.getNomeDents());
		System.out.println(consulta2.getData());
		System.out.println(consulta3.getNomePcnt());
		System.out.println(consulta3.getNomeDents());
		System.out.println(consulta3.getData());

	}

}
