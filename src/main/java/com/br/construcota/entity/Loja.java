package com.br.construcota.entity;

import java.util.List;

public class Loja {
	
	private Long id;
	private String nome;
	private String logadouro;
	private int visitas;
	private List<Produto> produtos;
	private List<Usuario> donos;

	public Loja() {
		super();
	}

	public Loja(Long id, String nome, String logadouro, int visitas, List<Produto> produtos, List<Usuario> donos) {
		super();
		this.id = id;
		this.nome = nome;
		this.logadouro = logadouro;
		this.visitas = visitas;
		this.produtos = produtos;
		this.donos = donos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogadouro() {
		return logadouro;
	}

	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}

	public int getVisitas() {
		return visitas;
	}

	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Usuario> getDonos() {
		return donos;
	}

	public void setDonos(List<Usuario> donos) {
		this.donos = donos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((donos == null) ? 0 : donos.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((logadouro == null) ? 0 : logadouro.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((produtos == null) ? 0 : produtos.hashCode());
		result = prime * result + visitas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		if (donos == null) {
			if (other.donos != null)
				return false;
		} else if (!donos.equals(other.donos))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (logadouro == null) {
			if (other.logadouro != null)
				return false;
		} else if (!logadouro.equals(other.logadouro))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (produtos == null) {
			if (other.produtos != null)
				return false;
		} else if (!produtos.equals(other.produtos))
			return false;
		if (visitas != other.visitas)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Loja [id=" + id + ", nome=" + nome + ", logadouro=" + logadouro + ", visitas=" + visitas + ", produtos="
				+ produtos + ", donos=" + donos + "]";
	}
	

	

}
