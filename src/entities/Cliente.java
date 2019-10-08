package entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Endereco{
	private String nome;
	private List<Filme> filmesAlugados = new ArrayList<Filme>();
	
	public Cliente(String logradouro, String numero, String bairro, String nome) {
		super(logradouro, numero, bairro);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	public void alugar(Filme filme) {
		if (filme.isAlugado() == false) {
			filmesAlugados.add(filme);
			filme.setAlugado(true);
			System.out.println("Filme alugado com sucesso");
			
		} else {
			System.out.println("Operação Inválida: Filme já está alugado para outro cliente");
		}
	}


	public void devolver(Filme filme) {
		filmesAlugados.remove(filme);
	}
	
	public void reservar(Filme filme) {
		if (filme.isReservado()) {
			System.out.println("Operação inválida: Filme já está reservado para outro cliente");
		} else {
			filme.setReservado(true);
			System.out.println("Filme reservado com sucesso para cliente: " + this.nome);
		}
	}
	
	public void listarFilmesAlugados() {
		for(Filme f : filmesAlugados) {
			System.out.println(f.getNome());
		}
	}








}
