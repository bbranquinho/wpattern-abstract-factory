package br.com.wpattern.abstract_factory.interfaces;

/**
 * Ações de um peasant.
 * 
 * @author Branquinho
 */
public interface IPeasant {

	/**
	 * Determina que o peasant deve coletar os recursos do local que está posicionado.
	 */
	void collectResources();

	/**
	 * Ação do peasant se movimentar até o ponto (x, y).
	 * 
	 * @param x
	 * 		Posição do eixo x.
	 * @param y
	 * 		Posição do eixo y.
	 */
	void moveTo(int x, int y);

	/**
	 * O peasant se mata, deixando de fazer parte do jogo.
	 */
	void suicide();

}
