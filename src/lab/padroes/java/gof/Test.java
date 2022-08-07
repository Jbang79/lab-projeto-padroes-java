package lab.padroes.java.gof;

import lab.padroes.java.gof.facade.Facade;
import lab.padroes.java.gof.singleton.SingletonEager;
import lab.padroes.java.gof.singleton.SingletonLazy;
import lab.padroes.java.gof.singleton.SingletonLazyHolder;
import lab.padroes.java.gof.strategy.Comportamento;
import lab.padroes.java.gof.strategy.ComportamentoAgressivo;
import lab.padroes.java.gof.strategy.ComportamentoDefensivo;
import lab.padroes.java.gof.strategy.ComportamentoNormal;
import lab.padroes.java.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {

		// Testes relacionados ao Design Pattern Singleton:

		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		// Testes relacionados ao Design Pattern Strategy:

		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Testes relacionados ao Design Pattern Facade:
		
		Facade facade = new Facade();
		facade.migrarCliente("Juliana","09812570");

	}

}
