package lab.padroes.java.gof.singleton;

/**
 * Singleton "apressado"
 * @author Juliana
 */

public class SingletonEager {

private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
		
	}
	
}



