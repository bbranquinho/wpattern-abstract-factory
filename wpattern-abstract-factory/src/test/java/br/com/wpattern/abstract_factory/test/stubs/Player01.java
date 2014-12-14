package br.com.wpattern.abstract_factory.test.stubs;

import org.apache.log4j.Logger;

import br.com.wpattern.abstract_factory.enumerations.RaceEnum;
import br.com.wpattern.abstract_factory.enumerations.TechnologyLevelEnum;
import br.com.wpattern.abstract_factory.interfaces.IPlayerStatus;

/**
 * Exemplo de dados de um jogador.
 * 
 * @author Branquinho
 */
public class Player01 implements IPlayerStatus {

	private Logger logger = Logger.getLogger(getClass());

	/**
	 * Raça usada pelo jogador.
	 */
	private final RaceEnum race;

	/**
	 * Nível tecnológico.
	 */
	private TechnologyLevelEnum technologyLevel;

	//=======================================================================================
	// CONSTRUTORES
	//=======================================================================================

	public Player01(RaceEnum race) {
		this.race = race;
		this.technologyLevel = TechnologyLevelEnum.LOW;

		if (this.logger.isDebugEnabled()) {
			this.logger.debug("Instantiate a new player.");
		}
	}

	//=======================================================================================
	// MÉTODOS PÚBLICOS (IPlayerStatus)
	//=======================================================================================

	@Override
	public RaceEnum getRace() {
		return this.race;
	}

	@Override
	public TechnologyLevelEnum getTechnologyLevel() {
		return this.technologyLevel;
	}

	@Override
	public void UpgradeTechnologyLevel() {

		TechnologyLevelEnum newTechnologyLevel;

		switch (this.technologyLevel) {
		case LOW:
			newTechnologyLevel = TechnologyLevelEnum.MIDDLE;
			break;

		case MIDDLE:
			newTechnologyLevel = TechnologyLevelEnum.HIGH;
			break;

		default:
			this.logger.warn(String.format("Impossible upgrade the technology level [%s].", this.technologyLevel));
			return;
		}

		if (this.logger.isInfoEnabled()) {
			this.logger.info(String.format("Upgrade technology level from [%s] to [%s].", this.technologyLevel, newTechnologyLevel));
		}

		this.technologyLevel = newTechnologyLevel;

	}

}
