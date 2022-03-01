package com.xworkz.contact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "contact_info")
public class ContactEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	@Column(name = "contact_name")
	private String name;
	@Column(name = "mobileNo")
	private long mobile;
	@Column(name = "Address")
	private String address;
	@Column(name = "Landmark")
	private String landmark;
	@Column(name = "LandlineNo")
	private long landlineNo;
	@Column(name = "City")
	private String city;
	@Column(name = "PINCODE")
	private int pincode;

	public ContactEntity(String name, long mobile, String address, String landmark, long landlineNo, String city,
			int pincode) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.landmark = landmark;
		this.landlineNo = landlineNo;
		this.city = city;
		this.pincode = pincode;
	}

}
