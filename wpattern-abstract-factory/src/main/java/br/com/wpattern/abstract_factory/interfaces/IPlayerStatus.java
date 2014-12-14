package br.com.wpattern.abstract_factory.interfaces;

import br.com.wpattern.abstract_factory.enumerations.RaceEnum;
import br.com.wpattern.abstract_factory.enumerations.TechnologyLevelEnum;

/**
 * Dados de um jogador.
 * 
 * @author Branquinho
 */
public interface IPlayerStatus {

	/**
	 * Tipo de raça usada pelo jgoador.
	 * 
	 * @return
	 * 		Tipo da raça.
	 */
	RaceEnum getRace();

	/**
	 * Nível de desenvolvimento tecnológico atual do jogador.
	 * 
	 * @return
	 * 		Nível de desenvolvimento tecnológico.
	 */
	TechnologyLevelEnum getTechnologyLevel();

	/**
	 * Evoluir o nível de tecnológia do jogador.
	 */
	void UpgradeTechnologyLevel();

}
