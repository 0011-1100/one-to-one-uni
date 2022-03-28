package oneToOneController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import oneToOneUniDto.Address;
import oneToOneUniDto.Branch;

public class TestGetBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Branch branch = entityManager.find(Branch.class, 1);
		Address address=branch.getAddress();
		System.out.println("*************************************************************");
		System.out.println("Branch id : "+branch.getId());
		System.out.println("Branch name : "+branch.getName());
		System.out.println("Branch phone : "+branch.getPhone());
		System.out.println("*************************************************************");
		System.out.println("Address of Branch.............");
		System.out.println("*************************************************************");
		System.out.println("Area : "+address.getArea());
		System.out.println("pin : "+address.getPin());
		System.out.println("State : "+address.getState());
		System.out.println("*************************************************************");
		
	}

}
