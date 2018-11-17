package br.unifacisa.webServiceNutrisim.exceptions;

public class alreadyExistsException extends Exception{

	private static final long serialVersionUID = 1L;

	public alreadyExistsException(String msg) {
		super(msg);
	}
}
