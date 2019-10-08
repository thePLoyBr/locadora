package Views;

import entities.Cliente;
import entities.Filme;

public class Start {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Felipe");
		Cliente c2 = new Cliente("Aline");
		Filme f1 = new Filme("Batman");
		Filme f2 = new Filme("Senhor dos Anéis");
		Filme f3 = new Filme("Até o último homem");
		Filme f4 = new Filme("Matrix");
		
		
		c1.alugar(f1);
		c1.alugar(f2);
		c1.devolver(f1);
		c2.alugar(f3);
		System.out.println("___________");
		c2.alugar(f1);
		
		
		
		c1.reservar(f4);
		c1.reservar(f4);
		
		
		
	}
	

}
