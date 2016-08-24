package com.br.construcota.business;

import java.util.List;

import com.br.construcota.entity.Loja;
import com.br.construcota.entity.Produto;
import com.br.construcota.excepiton.ProdutoExistenteException;
import com.br.construcota.excepiton.ProdutoInexistenteException;

public interface ProdutoService {

	public void cadastrarProduto(Produto produto)throws ProdutoExistenteException;
	public void atualizarProduto(Produto produto)throws ProdutoInexistenteException;
	public void removerProduto(Produto produto)throws ProdutoInexistenteException;
	public List<Produto> findByNome(String nome);
	public List<Produto> findByValor(float valor);
	public List<Produto> findByLoja(Loja loja);
	public List<Produto> findAll();
	
}
