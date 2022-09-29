package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetBranchByHospitalId {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Hospital hospital=entityManager.find(Hospital.class, 1);
		if(hospital!=null)
		{
			System.out.println("hospital id:"+hospital.getId());
			System.out.println("hospital name:"+hospital.getName());
			System.out.println("hospital website:"+hospital.getWebsite());
			
			List<Branch> branches=hospital.getBranches();
			if(branches!=null)
			{
			for (Branch branch : branches) {
				System.out.println("branch id:"+branch.getId());
				System.out.println("branch location:"+branch.getLocation());
				System.out.println("branch city:"+branch.getCity());
				System.out.println("branch phone:"+branch.getPhone());
			
			}
		}
		
	}
	}
}
