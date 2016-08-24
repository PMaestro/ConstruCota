package com.br.construcota.business;

import java.util.List;

import com.br.construcota.entity.Loja;
import com.br.construcota.entity.Produto;
import com.br.construcota.excepiton.LojaExistenteException;
import com.br.construcota.excepiton.LojaInexistenteException;

public interface LojaService {

	public void cadastrarLoja(Loja loja)throws LojaExistenteException;
	public void atualizarLoja(Loja loja)throws LojaInexistenteException;
	public void removerLoja(Long id)throws LojaInexistenteException;
	public List<Loja> findByNome(String nome);
	public List<Loja> findByDonos(String dono);
	public List<Loja> findByProdutos(List<Produto> produtos);
	public List<Loja> findAll();
	
}
