package br.com.wpattern.abstract_factory.factory;

import org.apache.log4j.Logger;

import br.com.wpattern.abstract_factory.PeasantFactory;
import br.com.wpattern.abstract_factory.exceptions.PeasantException;
import br.com.wpattern.abstract_factory.interfaces.IPeasant;
import br.com.wpattern.abstract_factory.interfaces.IPlayerStatus;
import br.com.wpattern.abstract_factory.peasants.humans.HumanPeasantHigh;
import br.com.wpattern.abstract_factory.peasants.humans.HumanPeasantLow;
import br.com.wpattern.abstract_factory.peasants.humans.HumanPeasantMiddle;

/**
 * Cria instâncias de peasants do tipo humano.
 * 
 * @author Branquinho
 */
public class HumanPeasantFactory extends PeasantFactory {

	private Logger logger = Logger.getLogger(getClass());

	/**
	 * Número do peasant.
	 */
	private static int peasantNumber = 0;

	//=======================================================================================
	// CONSTRUTORES
	//=======================================================================================

	public HumanPeasantFactory(IPlayerStatus playerStatus) {
		super(playerStatus);
	}

	//=======================================================================================
	// MÉTODOS PÚBLICOS (PeasantFactory)
	//=======================================================================================

	@Override
	public IPeasant buildPeasant() {

		if (this.logger.isDebugEnabled()) {
			this.logger.debug("Instantiate a new human peasant.");
		}

		IPlayerStatus playerStatus = getPlayerStatus();

		String peasantName = String.format("Human-%s-%s", playerStatus.getTechnologyLevel(), ++peasantNumber);

		switch (playerStatus.getTechnologyLevel()) {
		case LOW:
			return new HumanPeasantLow(peasantName);

		case MIDDLE:
			return new HumanPeasantMiddle(peasantName);

		case HIGH:
			return new HumanPeasantHigh(peasantName);
		}

		throw new PeasantException("Technology not defined.");

	}

}
