package br.com.prsr.challengecrud.services.exceptions;

public class DatabaseException extends RuntimeException {
	public DatabaseException(String mensagem) {
		super(mensagem);
	}
}
