package entities;

import java.util.ArrayList;
import java.util.List;

public class Filme {
	private String nome;
	private boolean alugado = false;
	private boolean reservado = false;
	private List<Filme> filmesReservados = new ArrayList();
	
	
	public Filme(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isAlugado() {
		return alugado;
	}


	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}


	public boolean isReservado() {
		return reservado;
	}


	public void setReservado(boolean reservado) {
			this.reservado = reservado;
			filmesReservados.add(this);
	}

}
