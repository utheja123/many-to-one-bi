package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreateBranch {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.setName("appolo");
		hospital.setWebsite("www.appolo.com");
		
		Branch branch1=new Branch();
		branch1.setLocation("ap");
		branch1.setCity("tirupati");
		branch1.setPhone(987456);
		branch1.setHospital(hospital);
		
		Branch branch2=new Branch();
		branch2.setLocation("bangalore");
		branch2.setCity("yaswanthpur");
		branch2.setPhone(698423);
		branch2.setHospital(hospital);
		List<Branch> branches=new ArrayList<Branch>();
		branches.add(branch1);
		branches.add(branch2);
		hospital.setBranches(branches);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();
		
	}

}
