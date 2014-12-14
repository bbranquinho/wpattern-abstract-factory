package br.com.wpattern.abstract_factory.test;
import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.wpattern.abstract_factory.PeasantFactory;
import br.com.wpattern.abstract_factory.enumerations.RaceEnum;
import br.com.wpattern.abstract_factory.interfaces.IPeasant;
import br.com.wpattern.abstract_factory.interfaces.IPeasantFactory;
import br.com.wpattern.abstract_factory.interfaces.IPlayerStatus;
import br.com.wpattern.abstract_factory.test.stubs.Player01;

public class AbstractFactoryTest {

	private static Logger logger = Logger.getLogger(AbstractFactoryTest.class);

	// Cria um novo jogador.
	private static IPlayerStatus playerStatus01 = new Player01(RaceEnum.HUMAN);

	@Test
	public void TestAbstractFactory() {

		if (logger.isInfoEnabled()) {
			logger.info("Starting a game.");
		}

		// Recupera a instância do factory de peasants.
		IPeasantFactory peasantFactory = PeasantFactory.buildInstance(playerStatus01);

		// Cria o primeiro peasant.
		IPeasant peasant01 = peasantFactory.buildPeasant();

		peasant01.moveTo(10, 1);
		peasant01.moveTo(3, 5);

		// Cria o segundo peasant.
		IPeasant peasant02 = peasantFactory.buildPeasant();

		peasant02.collectResources();

		// Atualiza o nível de tecnológia.
		playerStatus01.UpgradeTechnologyLevel();

		// Cria o terceiro peasant.
		IPeasant peasant03 = peasantFactory.buildPeasant();

		peasant03.collectResources();
		peasant03.moveTo(2, 2);

		// Atualiza o nível de tecnológia.
		playerStatus01.UpgradeTechnologyLevel();

		peasant01.moveTo(20, 20);

		// Cria o quarto peasant.
		IPeasant peasant04 = peasantFactory.buildPeasant();

		peasant04.collectResources();

		// Mata todos os peasants.
		peasant01.suicide();
		peasant02.suicide();
		peasant03.suicide();
		peasant04.suicide();

	}

}
