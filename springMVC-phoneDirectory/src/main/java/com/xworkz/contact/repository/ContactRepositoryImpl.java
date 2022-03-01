package com.xworkz.contact.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.contact.entity.ContactEntity;

@Component
public class ContactRepositoryImpl implements ContactRepository{
	@Autowired
	 private EntityManagerFactory entityManagerFactory;

	public ContactRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		super();
		this.entityManagerFactory = entityManagerFactory;
	}
	@Override
	public void save(ContactEntity entity) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e){
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			if(entityManager!=null) {
				System.out.println("Data saved");
			}else {
				System.out.println("Data not saved");
			}
		}
	}

}
