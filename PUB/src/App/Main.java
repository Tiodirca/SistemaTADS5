package App;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_restaurante");
		@SuppressWarnings("unused")
		EntityManager manager = factory.createEntityManager();

	}
	
}
