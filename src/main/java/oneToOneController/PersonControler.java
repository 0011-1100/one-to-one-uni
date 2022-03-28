package oneToOneController;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import oneToOneUniDto.Pan;
import oneToOneUniDto.Person;

public class PersonControler {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person p = new Person();
		
		
		p.setName("Arjunarao");
		p.setGender("male");
		p.setPhone(34443);

		Pan pan = new Pan();

		pan.setConutry("India");
		pan.setDate(LocalDateTime.now());
		pan.setPanNumber("Idsjj7444");

		pan.setPerson(p);

		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(p);
		entityTransaction.commit();

	}

}
