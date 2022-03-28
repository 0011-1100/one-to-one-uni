package oneToOneController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import oneToOneUniDto.Pan;
import oneToOneUniDto.Person;

public class TestGetPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Pan pan=entityManager.find(Pan.class, 1);
		Person person = pan.getPerson();
		
		System.out.println("pan details");
		System.out.println("************************************************************");
		System.out.println("pan no : "+pan.getPanNumber());
		System.out.println("id : "+pan.getId());
		System.out.println("contry : "+pan.getConutry());
		
		System.out.println("Person details");
		System.out.println("************************************************************");
		System.out.println("Gender : "+person.getGender());
		System.out.println("id : "+person.getId());
		System.out.println("name : "+person.getName());
		System.out.println("phone : "+person.getPhone());
		System.out.println("************************************************************");
	}

}
