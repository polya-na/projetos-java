package bootcamp.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
	private LocalDate data_inicio;
	private LocalDate data_fim;
	private List<Conteudo> conteudos = new ArrayList<>();
	private List<Desenvolvedor> desenvolvedores = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getInicio() {
		return data_inicio;
	}

	public void setInicio(LocalDate data_inicio) {
		this.data_inicio = data_inicio;
	}

	public LocalDate getFim() {
		return data_fim;
	}

	public void setFim(LocalDate data_fim) {
		this.data_fim = data_fim;
	}

	public List<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(List<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	public List<Desenvolvedor> getDevs() {
		return desenvolvedores;
	}

	public void setDevs(List<Desenvolvedor> desenvolvedores) {
		this.desenvolvedores = desenvolvedores;
	}
}
