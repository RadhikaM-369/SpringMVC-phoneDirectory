package com.xworkz.contact.service;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.contact.entity.ContactEntity;
import com.xworkz.contact.repository.ContactRepository;

@Component
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repo;

	public ContactServiceImpl(ContactRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(ContactEntity contactEntity) {
		boolean valid = false;
		try {			
		if(contactEntity.getName()==null ||contactEntity.getName().isEmpty()==true 
			||contactEntity.getName().length()<3 ||contactEntity.getName().length()>20 ) {
			valid=false;
			System.out.println("Invalid Name");
		}else {
			valid=true;
			System.out.println("Valid Name");
		}
		if(contactEntity.getAddress()==null|| contactEntity.getAddress().isEmpty()==true 
				||contactEntity.getAddress().length()<3 ||contactEntity.getAddress().length()>20 ) {
			valid=false;
			System.out.println("Invalid Address");
		}else {
			valid=true;
			System.out.println("Valid Address");
		}
		if(contactEntity.getLandlineNo()==0) {
			valid=false;
			System.out.println("Invalid LandlineNo");
		}else {
			valid=true;
			System.out.println("Valid LandlineNo");
		}
		if(contactEntity.getCity()==null ||contactEntity.getCity().isEmpty()==true 
			|| contactEntity.getCity().length()<3 || contactEntity.getCity().length()>20 ) {
			valid=false;
			System.out.println("Invalid City");
		}else {
			valid=true;
			System.out.println("Valid City");
		}
		if(contactEntity.getLandmark()==null ||contactEntity.getLandmark().isEmpty()==true
			|| contactEntity.getLandmark().length()<3 || contactEntity.getLandmark().length()>20) {
			valid=false;
			System.out.println("Invalid Landmark");
		}else {
			valid=true;
			System.out.println("Valid Landmark");
		}
		if(contactEntity.getPincode()==0) {
			valid=false;
			System.out.println("Invalid Pincode");
		}else {
			valid=true;
			System.out.println("Valid Pincode");
		}
	} catch (PersistenceException e) {
		e.printStackTrace();
	} finally {
	}
	if (valid = true) {
		repo.save(contactEntity);
	} else {
		System.out.println("Invalid properties, cannot save data");
	}
		return valid;
	}

}
