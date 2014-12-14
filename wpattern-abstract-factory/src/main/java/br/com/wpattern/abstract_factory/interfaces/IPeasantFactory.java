package br.com.wpattern.abstract_factory.interfaces;

/**
 * Factory usada para criar peasants.
 * 
 * @author Branquinho
 */
public interface IPeasantFactory {

	/**
	 * Cria a instância de um peasant.
	 * 
	 * @return
	 * 		Instância de peasant criado de acordo com as dados do jogador.
	 */
	IPeasant buildPeasant();

}
