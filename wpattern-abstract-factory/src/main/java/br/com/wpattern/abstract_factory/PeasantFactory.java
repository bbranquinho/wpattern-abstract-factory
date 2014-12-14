package br.com.wpattern.abstract_factory;

import br.com.wpattern.abstract_factory.exceptions.PeasantException;
import br.com.wpattern.abstract_factory.factory.HumanPeasantFactory;
import br.com.wpattern.abstract_factory.factory.OrcPeasantFactory;
import br.com.wpattern.abstract_factory.interfaces.IPeasantFactory;
import br.com.wpattern.abstract_factory.interfaces.IPlayerStatus;

/**
 * Cria instâncias de um peasant baseado em dados do jogodor.
 * 
 * @author Branquinho
 */
public abstract class PeasantFactory implements IPeasantFactory {

	private final IPlayerStatus playerStatus;

	//=======================================================================================
	// CONSTRUCTORES
	//=======================================================================================

	protected PeasantFactory(IPlayerStatus playerStatus) {
		this.playerStatus = playerStatus;
	}

	//=======================================================================================
	// MÉTODOS PÚBLICOS
	//=======================================================================================

	/**
	 * Cria uma instância de um "Peasant Factory" baseado em características do jogador.
	 * 
	 * @param playerStatus
	 * 		Dados do jogador.
	 * 
	 * @return
	 * 		Instância de um peasant.
	 */
	public static IPeasantFactory buildInstance(IPlayerStatus playerStatus) {

		switch (playerStatus.getRace()) {
		case HUMAN:
			return new HumanPeasantFactory(playerStatus);

		case ORC:
			return new OrcPeasantFactory(playerStatus);
		}

		throw new PeasantException("Race type not defined.");

	}

	/**
	 * Dados de um jogador.
	 * 
	 * @return
	 * 		Dados de um jogador.
	 */
	public IPlayerStatus getPlayerStatus() {
		return this.playerStatus;
	}

}
