package br.com.wpattern.abstract_factory.exceptions;

/**
 * Exceção quando existe algum problema na criação de Peasants.
 * 
 * @author Branquinho
 */
public class PeasantException extends RuntimeException {

	private static final long serialVersionUID = -8909405073078995693L;

	//=======================================================================================
	// CONSTRUTORES
	//=======================================================================================

	/**
	 * Cria uma exceção runtime.
	 */
	public PeasantException() {
		super();
	}

	/**
	 * Cria uma exceção runtime com uma mensagem de erro.
	 * 
	 * @param message
	 * 			Mensagem de erro.
	 */
	public PeasantException(String message) {
		super(message);
	}

	/**
	 * Cria uma exceção runtime com a causa do erro.
	 * 
	 * @param cause
	 * 			Causa de ter ocorrido o erro.
	 */
	public PeasantException(Throwable cause) {
		super(cause);
	}

	/**
	 * Cria uma exceção runtime com a mensagen e a causa do erro.
	 * 
	 * @param message
	 * 			Mensagem de erro.
	 * @param cause
	 * 			Causa de ter ocorrido o erro.
	 */
	public PeasantException(String message, Throwable cause) {
		super(message, cause);
	}

}
