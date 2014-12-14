package br.com.wpattern.abstract_factory.factory;

import org.apache.log4j.Logger;

import br.com.wpattern.abstract_factory.PeasantFactory;
import br.com.wpattern.abstract_factory.exceptions.PeasantException;
import br.com.wpattern.abstract_factory.interfaces.IPeasant;
import br.com.wpattern.abstract_factory.interfaces.IPlayerStatus;
import br.com.wpattern.abstract_factory.peasants.orcs.OrcPeasantHigh;
import br.com.wpattern.abstract_factory.peasants.orcs.OrcPeasantLow;
import br.com.wpattern.abstract_factory.peasants.orcs.OrcPeasantMiddle;

/**
 * Cria instâncias de peasants do tipo orc.
 * 
 * @author Branquinho
 */
public class OrcPeasantFactory extends PeasantFactory {

	private Logger logger = Logger.getLogger(getClass());

	/**
	 * Número do peasant.
	 */
	private static int peasantNumber = 0;

	//=======================================================================================
	// CONSTRUTORES
	//=======================================================================================

	public OrcPeasantFactory(IPlayerStatus playerStatus) {
		super(playerStatus);
	}

	//=======================================================================================
	// MÉTODOS PÚBLICOS (IPeasantFactory)
	//=======================================================================================

	@Override
	public IPeasant buildPeasant() {

		if (this.logger.isDebugEnabled()) {
			this.logger.debug("Instantiate a new orc peasant.");
		}

		IPlayerStatus playerStatus = getPlayerStatus();

		String peasantName = String.format("Human-%s-%s", playerStatus.getTechnologyLevel(), ++peasantNumber);

		switch (playerStatus.getTechnologyLevel()) {
		case LOW:
			return new OrcPeasantLow(peasantName);

		case MIDDLE:
			return new OrcPeasantMiddle(peasantName);

		case HIGH:
			return new OrcPeasantHigh(peasantName);
		}

		throw new PeasantException("Technology not defined.");

	}

}
