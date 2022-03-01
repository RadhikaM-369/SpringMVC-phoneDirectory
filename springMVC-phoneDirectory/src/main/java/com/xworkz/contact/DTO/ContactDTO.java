package com.xworkz.contact.DTO;

public class ContactDTO {
	private String name;
	private long mobile;
	private String address;
	private String landmark;
	private long landlineNo;
	private String city;
	private int pincode;

	public ContactDTO(String name, long mobile, String address, String landmark, long landlineNo, String city,
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public long getLandlineNo() {
		return landlineNo;
	}

	public void setLandlineNo(long landlineNo) {
		this.landlineNo = landlineNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
}
