package oneToOneController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import oneToOneUniDto.Address;
import oneToOneUniDto.Branch;

public class OneToOneController {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch b=new Branch();
		b.setName("Qsp");
		b.setPhone(46344);
		
		Address s=new Address();
		
		s.setArea("Basavanagudi");
		s.setPin(4634);
		s.setState("karnataka");
		
		b.setAddress(s);
		
		entityTransaction.begin();
		
		entityManager.persist(b);
		entityManager.persist(s);
		
		entityTransaction.commit();
	}
}
