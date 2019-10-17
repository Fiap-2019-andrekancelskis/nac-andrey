package com.andreymasiero.gerenciamento_empresas.entities;

/**
 * 
 * Classe que determina os atributos que compõem um usuário.
 *
 */
public class Usuario {
	private String email;
	private String senha;

	/**
	 * Construtor da classe usuário.
	 * 
	 * @param String
	 * @param String
	 */
	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Retorna a senha do usuário
	 * 
	 * @return String
	 */
	public String getSenha() {
		return senha;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * Retorna o email do usuário
	 * 
	 * @return String
	 */
	public String getEmail() {
		return email;
	}
}
