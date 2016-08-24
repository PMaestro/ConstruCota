package com.br.construcota.business;

import java.util.Date;
import java.util.List;

import com.br.construcota.entity.Usuario;
import com.br.construcota.excepiton.UsuarioExistenteException;
import com.br.construcota.excepiton.usuarioInexistenteException;

public interface UsuarioService {

	public void cadastrarUsuario(Usuario usuario)throws UsuarioExistenteException;
	public void atualizarUsuario(Usuario usuario)throws usuarioInexistenteException;
	public void removerUsuario(Long id)throws usuarioInexistenteException;
	public Usuario findByCpf(String cpf)throws usuarioInexistenteException;
	public List<Usuario> findByDataNascimento(Date nascimento);
	public List<Usuario> findByNome(String nome);
	public List<Usuario> findAll();
	
}
