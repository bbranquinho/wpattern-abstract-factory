package br.com.wpattern.abstract_factory.peasants.humans;

import org.apache.log4j.Logger;

import br.com.wpattern.abstract_factory.interfaces.IPeasant;

/**
 * Peasant da raça humano do tipo High.
 * 
 * @author Branquinho
 */
public class HumanPeasantHigh implements IPeasant {

	private Logger logger = Logger.getLogger(getClass());

	/**
	 * Nome do peasant.
	 */
	private String peasantName;

	//=======================================================================================
	// CONSTRUTORES
	//=======================================================================================

	public HumanPeasantHigh(String peasantName) {
		this.peasantName = peasantName;
	}

	//=======================================================================================
	// MÉTODOS PÚBLICOS (IPeasant)
	//=======================================================================================

	@Override
	public void collectResources() {
		if (this.logger.isInfoEnabled()) {
			this.logger.info(String.format("Peasant [%s] collecting resources.", this.peasantName));
		}
	}

	@Override
	public void moveTo(int x, int y) {
		if (this.logger.isInfoEnabled()) {
			this.logger.info(String.format("Peasant [%s] moving to [%s, %s].", this.peasantName, x, y));
		}
	}

	@Override
	public void suicide() {
		if (this.logger.isInfoEnabled()) {
			this.logger.info(String.format("Suicide of the peasant [%s].", this.peasantName));
		}
	}

}
