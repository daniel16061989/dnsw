package br.com.soft.rpg.dao.excecoes;

public class RpgGenericException extends Exception {

	private static final long serialVersionUID = 1L;

	public RpgGenericException() {
		super();
	}

	public RpgGenericException(String message, Throwable cause) {
		super(message, cause);
	}

	public RpgGenericException(String message) {
		super(message);
	}

	public RpgGenericException(Throwable cause) {
		super(cause);
	}

}
