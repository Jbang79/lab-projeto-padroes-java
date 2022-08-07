package lab.padroes.java.gof.singleton;

/**
 * Singelton "preguiçoso".
 * @author Juliana
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia =new SingletonLazy();

		}
		return instancia;
		
	}
	
}
