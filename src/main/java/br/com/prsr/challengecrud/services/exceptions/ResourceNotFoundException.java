package br.com.prsr.challengecrud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String mensagem) {
		super(mensagem);
	}
}
