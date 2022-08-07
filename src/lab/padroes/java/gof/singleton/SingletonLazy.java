package lab.padroes.java.gof.singleton;

/**
 * Singelton "pregui�oso".
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
